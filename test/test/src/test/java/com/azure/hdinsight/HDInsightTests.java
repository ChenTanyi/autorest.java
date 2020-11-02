package com.azure.hdinsight;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.resourcemanager.hdinsight.generated.HDInsightManager;
import com.azure.resourcemanager.hdinsight.generated.models.Cluster;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterCreateProperties;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterDefinition;
import com.azure.resourcemanager.hdinsight.generated.models.ComputeProfile;
import com.azure.resourcemanager.hdinsight.generated.models.HardwareProfile;
import com.azure.resourcemanager.hdinsight.generated.models.LinuxOperatingSystemProfile;
import com.azure.resourcemanager.hdinsight.generated.models.OSType;
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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class HDInsightTests extends Base {

    @Test
    @Disabled("Get 504 error: The gateway did not receive a response from 'Microsoft.HDInsight' within the specified time period.")
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
                                                        .withVmSize("Standard_D2a_v4"))
                                                .withOsProfile(new OsProfile()
                                                        .withLinuxOperatingSystemProfile(new LinuxOperatingSystemProfile()
                                                                .withUsername(username)
                                                                .withPassword(password))),
                                        new Role()
                                                .withName("workernode")
                                                .withTargetInstanceCount(3)
                                                .withHardwareProfile(new HardwareProfile()
                                                        .withVmSize("Standard_D2a_v4"))
                                                .withOsProfile(new OsProfile()
                                                        .withLinuxOperatingSystemProfile(new LinuxOperatingSystemProfile()
                                                                .withUsername(username)
                                                                .withPassword(password)))
                                )))
                        .withStorageProfile(new StorageProfile()
                                .withStorageaccounts(ImmutableList.of(
                                        new com.azure.resourcemanager.hdinsight.generated.models.StorageAccount()
                                                .withName(storageAccount.primaryEndpoints().blob())
                                                .withKey(storageAccountKey.value())
                                                .withContainer(clusterName.toLowerCase())
                                                .withIsDefault(true)
                                )))
                )
                .create();

        Assertions.assertNotNull(cluster);
    }
}
