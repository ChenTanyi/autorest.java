package com.azure.monitor;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.models.ActionGroupResource;
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
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

        ActionGroupResource actionGroup = monitorManager.actionGroups().define(agName)
                .withRegion("global")
                .withExistingResourceGroup(rgName)
                .withGroupShortName(agName)
                .withEnabled(true)
                .withAzureAppPushReceivers(Collections.singletonList(
                        new AzureAppPushReceiver().withName("AzureAppAction").withEmailAddress("azurepush@outlook.com")))
                .create();
        Assertions.assertEquals(1, actionGroup.azureAppPushReceivers().size());

        // TODO refresh method missing

        actionGroup = monitorManager.actionGroups().getByResourceGroup(rgName, agName);
        Assertions.assertEquals(true, actionGroup.enabled());
        Assertions.assertEquals("azurepush@outlook.com", actionGroup.azureAppPushReceivers().iterator().next().emailAddress());

        // withEnable appears not working in PATCH
        actionGroup.update()
                .withTags(Map.of("tag1", "value1"))
                .apply();
        Assertions.assertEquals(1, actionGroup.tags().size());

        monitorManager.actionGroups().delete(rgName, agName);
        Assertions.assertThrows(ManagementException.class, () -> monitorManager.actionGroups().getByResourceGroup(rgName, agName));
    }
}
