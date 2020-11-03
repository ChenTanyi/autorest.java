package com.azure.hdinsight;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.hdinsight.generated.HDInsightManager;
import com.azure.resourcemanager.hdinsight.generated.models.Cluster;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterCreateProperties;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterDefinition;
import com.azure.resourcemanager.hdinsight.generated.models.ComputeProfile;
import com.azure.resourcemanager.hdinsight.generated.models.HardwareProfile;
import com.azure.resourcemanager.hdinsight.generated.models.LinuxOperatingSystemProfile;
import com.azure.resourcemanager.hdinsight.generated.models.OSType;
import com.azure.resourcemanager.hdinsight.generated.models.Operation;
import com.azure.resourcemanager.hdinsight.generated.models.OsProfile;
import com.azure.resourcemanager.hdinsight.generated.models.Role;
import com.azure.resourcemanager.hdinsight.generated.models.StorageProfile;
import com.azure.resourcemanager.hdinsight.generated.models.Tier;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.azure.resourcemanager.storage.generated.models.StorageAccount;
import com.azure.resourcemanager.storage.generated.models.StorageAccountKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class HDInsightTests extends Base {

    @Test
    public void testCluster() {
        String saName = randomString("sa", 15);
        String clusterName = randomString("cls", 15);
        String username = "testuser";
        String password = "Pa5$" + randomString("", 16);

        StorageManager storageManager = StorageManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        HDInsightManager hdInsightManager = HDInsightManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        StorageAccount storageAccount = storageManager.storageAccounts().define(saName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withSku(new Sku().withName(SkuName.STANDARD_LRS))
                .withKind(Kind.STORAGE)
                .create();

        StorageAccountKey storageAccountKey = storageManager.storageAccounts().listKeys(rgName, saName).keys().get(0);

        Cluster cluster = hdInsightManager.clusters().define(clusterName)
                .withExistingResourceGroup(rgName)
                .withRegion(Region.US_WEST)
                .withProperties(new ClusterCreateProperties()
                        .withClusterVersion("3.6")
                        .withOsType(OSType.LINUX)
                        .withTier(Tier.STANDARD)
                        .withClusterDefinition(new ClusterDefinition()
                                .withKind("Spark")
                                .withConfigurations(ImmutableMap.of(
                                        "gateway", ImmutableMap.of(
                                                "restAuthCredential.isEnabled", "true",
                                                "restAuthCredential.username", username,
                                                "restAuthCredential.password", password
                                        )
                                )))
                        .withComputeProfile(new ComputeProfile()
                                .withRoles(ImmutableList.of(
                                        new Role()
                                                .withName("headnode")
                                                .withTargetInstanceCount(2)
                                                .withHardwareProfile(new HardwareProfile()
                                                        .withVmSize("STANDARD_A4_V2"))
                                                .withOsProfile(new OsProfile()
                                                        .withLinuxOperatingSystemProfile(new LinuxOperatingSystemProfile()
                                                                .withUsername(username)
                                                                .withPassword(password))),
                                        new Role()
                                                .withName("workernode")
                                                .withTargetInstanceCount(3)
                                                .withHardwareProfile(new HardwareProfile()
                                                        .withVmSize("STANDARD_A4_V2"))
                                                .withOsProfile(new OsProfile()
                                                        .withLinuxOperatingSystemProfile(new LinuxOperatingSystemProfile()
                                                                .withUsername(username)
                                                                .withPassword(password)))
                                )))
                        .withStorageProfile(new StorageProfile()
                                .withStorageaccounts(ImmutableList.of(
                                        new com.azure.resourcemanager.hdinsight.generated.models.StorageAccount()
                                                .withName(storageAccount.name() + ".blob.core.windows.net")
                                                .withKey(storageAccountKey.value())
                                                .withContainer(clusterName.toLowerCase())
                                                .withIsDefault(true)
                                )))
                )
                .create();

        Assertions.assertNotNull(cluster);
        Assertions.assertEquals(OSType.LINUX, cluster.properties().osType());
        Assertions.assertEquals("Spark", cluster.properties().clusterDefinition().kind());
        Assertions.assertEquals(0, cluster.tags().size());

        // list clusters
        boolean foundCluster = false;
        for (Cluster resource : hdInsightManager.clusters().list()) {
            if (clusterName.equals(resource.name())) {
                foundCluster = true;
                break;
            }
        }
        Assertions.assertTrue(foundCluster);

        // update cluster
        Map<String, String> tags = new HashMap<>();
        tags.put("key1", "value1");
        cluster.update()
                .withTags(tags)
                .apply();

        // get cluster
        Cluster updatedCluster = hdInsightManager.clusters().getByResourceGroup(rgName, clusterName);
        Assertions.assertNotNull(updatedCluster);
        Assertions.assertTrue(updatedCluster.tags().containsKey("key1"));
        Assertions.assertEquals("value1", updatedCluster.tags().get("key1"));

        // delete cluster
        hdInsightManager.clusters().delete(rgName, clusterName);

        // validate delete
        try {
            hdInsightManager.clusters().getByResourceGroup(rgName, clusterName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }

    @Test
    public void testListOperations() {
        HDInsightManager hdInsightManager = HDInsightManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        int operationCount = 0;
        for (Operation operation : hdInsightManager.operations().list()) {
            Assertions.assertNotNull(operation);
            Assertions.assertNotNull(operation.name());
            ++operationCount;
        }
        Assertions.assertTrue(operationCount > 0);
    }
}
