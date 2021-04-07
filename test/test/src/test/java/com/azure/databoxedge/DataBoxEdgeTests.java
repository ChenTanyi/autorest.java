package com.azure.databoxedge;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDevice;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class DataBoxEdgeTests extends Base {

    @Test
    public void testDataBox() {
        String deviceName = randomString("dev", 15);

        DataBoxEdgeManager dataBoxEdgeManager = DataBoxEdgeManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        // create device
        DataBoxEdgeDevice device = dataBoxEdgeManager.devices().define(deviceName)
                .withRegion(Region.US_EAST)
                .withExistingResourceGroup(rgName)
                .withDataBoxEdgeDeviceStatus(DataBoxEdgeDeviceStatus.OFFLINE)
                .withDescription("Test only for Java SDK.")
                .withFriendlyName("fluentDevice")
                .create();

        Assertions.assertNotNull(device);
        Assertions.assertEquals("fluentDevice", device.friendlyName());
        Assertions.assertTrue(device.tags().size() == 0);

        // list devices
        boolean foundDevice = false;
        for (DataBoxEdgeDevice dataBoxEdgeDevice : dataBoxEdgeManager.devices().list()) {
            if (deviceName.equals(dataBoxEdgeDevice.name())) {
                foundDevice = true;
                break;
            }
        }
        Assertions.assertTrue(foundDevice);

        // update device
        Map<String, String> tags = new HashMap<>();
        tags.put("key1", "value1");
        device.update()
                .withTags(tags)
                .apply();

        // get device
        DataBoxEdgeDevice updatedDevice = dataBoxEdgeManager.devices().getByResourceGroup(rgName, deviceName);
        Assertions.assertNotNull(updatedDevice);
        Assertions.assertTrue(device.tags().containsKey("key1"));
        Assertions.assertEquals("value1", updatedDevice.tags().get("key1"));

        DataBoxEdgeDevice getDevice = dataBoxEdgeManager.devices().getByResourceGroup(deviceName, rgName);

        // delete device
        dataBoxEdgeManager.devices().deleteByResourceGroup(deviceName, rgName);

        // validate delete
        try {
            dataBoxEdgeManager.devices().getByResourceGroup(rgName, deviceName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
