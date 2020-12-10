package com.azure.monitor;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.models.ActionGroupResource;
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
import com.azure.resourcemanager.monitor.generated.models.MetricDefinition;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.azure.resourcemanager.storage.generated.models.StorageAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

public class MonitorTests extends Base {

    @Test
    public void testActionGroup() {
        String agName = randomString("ag", 10);

        MonitorManager monitorManager = MonitorManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        ActionGroupResource actionGroup = monitorManager.actionGroups()
                .define(agName)
                .withRegion("global")
                .withExistingResourceGroup(rgName)
                .withGroupShortName(agName)
                .withEnabled(true)
                .withAzureAppPushReceivers(Collections.singletonList(
                        new AzureAppPushReceiver().withName("AzureAppAction").withEmailAddress("azurepush@outlook.com")))
                .create();
        Assertions.assertEquals(1, actionGroup.azureAppPushReceivers().size());

        actionGroup.refresh();
        Assertions.assertEquals(true, actionGroup.enabled());

        actionGroup = monitorManager.actionGroups().getByResourceGroup(rgName, agName);
        Assertions.assertEquals("azurepush@outlook.com", actionGroup.azureAppPushReceivers().iterator().next().emailAddress());

        // withEnable appears not working in PATCH
        actionGroup.update()
                .withTags(Map.of("tag1", "value1"))
                .apply();
        Assertions.assertEquals(1, actionGroup.tags().size());

        monitorManager.actionGroups().deleteByResourceGroup(rgName, agName);
        Assertions.assertThrows(ManagementException.class, () -> monitorManager.actionGroups().getByResourceGroup(rgName, agName));
    }

    @Test
    public void testMetric() {
        String saName = randomString("sa", 10);

        MonitorManager monitorManager = MonitorManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        StorageManager storageManager = StorageManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        StorageAccount storageAccount = storageManager.storageAccounts()
                .define(saName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withSku(new Sku().withName(SkuName.STANDARD_LRS))
                .withKind(Kind.STORAGE_V2)
                .withEnableHttpsTrafficOnly(true)
                .create();

        PagedIterable<MetricDefinition> metricDefinitions = monitorManager.metricDefinitions().list(storageAccount.id());

        MetricDefinition metricDefinition = metricDefinitions.iterator().next();
        Assertions.assertNotNull(metricDefinition.metricAvailabilities());
        Assertions.assertNotNull(metricDefinition.namespace());
        Assertions.assertNotNull(metricDefinition.supportedAggregationTypes());
    }
}
