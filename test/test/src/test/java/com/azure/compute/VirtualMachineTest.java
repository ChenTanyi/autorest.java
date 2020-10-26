package com.azure.compute;

import com.azure.Base;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DataDisk;
import com.azure.resourcemanager.compute.generated.models.Disk;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOption;
import com.azure.resourcemanager.compute.generated.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.ImageReference;
import com.azure.resourcemanager.compute.generated.models.ManagedDiskParameters;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceReference;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachine;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSizeTypes;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.VirtualNetwork;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

public class VirtualMachineTest extends Base {
    @Test
    public void canCRUDVM() {
        Region region = Region.US_EAST;
        String networkName = randomString("net", 16);
        String virtualMachineName = randomString("vm", 16);
        String networkInterfaceName = randomString("ni", 16);
        String publicIpName = randomString("pip", 16);
        String username = "testUser";
        String password = "Pa5$" + randomString("", 16);
        String addressSpace = "10.5.100.0/24";
        String diskName = randomString("disk", 16);
        int diskSize = 16;

        NetworkManager networkManager = NetworkManager.configure().withHttpClient(client).authenticate(credential, profile);
        ComputeManager computeManager = ComputeManager.configure().withHttpClient(client).authenticate(credential, profile);

        resourceManager.resourceGroups().define(rgName)
                .withRegion(region)
                .create();

        VirtualNetwork network = networkManager.virtualNetworks().define(networkName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withAddressSpace(new AddressSpace().withAddressPrefixes(Collections.singletonList(addressSpace)))
                .withSubnets(Collections.singletonList(
                        new SubnetInner()
                            .withName("subnet1")
                            .withAddressPrefix(addressSpace)
                ))
                .create();
        Assertions.assertEquals(addressSpace, network.addressSpace().addressPrefixes().get(0));
        Assertions.assertEquals(addressSpace, network.subnets().get(0).addressPrefix());

        PublicIpAddress publicIpAddress = networkManager.publicIpAddresses().define(publicIpName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .create();
        Assertions.assertEquals(region, publicIpAddress.region());

        NetworkInterface networkInterface = networkManager.networkInterfaces().define(networkInterfaceName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withIpConfigurations(Collections.singletonList(
                        new NetworkInterfaceIpConfigurationInner()
                            .withName("primary")
                            .withPrimary(true)
                            .withSubnet(network.subnets().get(0).innerModel())
                            .withPublicIpAddress(publicIpAddress.innerModel())
                ))
                .create();
        Assertions.assertEquals(publicIpAddress.id(), networkInterface.ipConfigurations().get(0).publicIpAddress().id());
        Assertions.assertEquals(network.subnets().get(0).id(), networkInterface.ipConfigurations().get(0).subnet().id());

        // create
        VirtualMachine vm = computeManager.virtualMachines().define(virtualMachineName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_A1_V2))
                .withStorageProfile(new StorageProfile().withImageReference(
                        new ImageReference()
                            .withPublisher("Canonical")
                            .withOffer("UbuntuServer")
                            .withSku("16.04.0-LTS")
                            .withVersion("latest")
                ))
                .withOsProfile(
                        new OSProfile()
                            .withComputerName(virtualMachineName)
                            .withAdminUsername(username)
                            .withAdminPassword(password)
                )
                .withNetworkProfile(
                        new NetworkProfile()
                            .withNetworkInterfaces(Collections.singletonList(
                                    (NetworkInterfaceReference) new NetworkInterfaceReference()
                                        .withPrimary(true)
                                        .withId(networkInterface.id())
                            ))
                )
                .create();
        Assertions.assertEquals(VirtualMachineSizeTypes.STANDARD_A1_V2, vm.hardwareProfile().vmSize());
        Assertions.assertEquals(networkInterface.id(), vm.networkProfile().networkInterfaces().get(0).id());

        Disk disk = computeManager.disks().define(diskName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withDiskSizeGB(diskSize)
                .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
                .create();
        Assertions.assertEquals(diskSize, disk.diskSizeGB());

        // update
        vm.update()
                .withStorageProfile(vm.storageProfile().withDataDisks(Collections.singletonList(
                        new DataDisk()
                                .withCreateOption(DiskCreateOptionTypes.ATTACH)
                                .withManagedDisk((ManagedDiskParameters) new ManagedDiskParameters().withId(disk.id()))
                )))
                .apply();
        Assertions.assertEquals(disk.id(), vm.storageProfile().dataDisks().get(0).managedDisk().id());

        // get
        Assertions.assertEquals(vm.id(), computeManager.virtualMachines().getByResourceGroup(rgName, virtualMachineName).id());

        // list
        AtomicBoolean found = new AtomicBoolean(false);
        computeManager.virtualMachines().listByResourceGroup(rgName).forEach(
                vm1 -> {
                    if (vm1.name().equals(virtualMachineName)) {
                        found.set(true);
                    }
                }
        );
        Assertions.assertTrue(found.get());

        // delete
        computeManager.virtualMachines().delete(rgName, virtualMachineName);
        try {
            computeManager.virtualMachines().getByResourceGroup(rgName, virtualMachineName);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
