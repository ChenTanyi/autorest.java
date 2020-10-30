package com.azure.eventhubs;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.eventhubs.generated.EventHubsManager;
import com.azure.resourcemanager.eventhubs.generated.models.CheckNameAvailabilityParameter;
import com.azure.resourcemanager.eventhubs.generated.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.eventhubs.generated.models.EHNamespace;
import com.azure.resourcemanager.eventhubs.generated.models.Sku;
import com.azure.resourcemanager.eventhubs.generated.models.SkuName;
import com.azure.resourcemanager.eventhubs.generated.models.SkuTier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class EventHubsTests extends Base {

    @Test
    public void testEventHubNameSpace() {
        String nameSpaceName = randomString("ns", 15);
        Region region = Region.US_WEST;

        EventHubsManager eventHubsManager = EventHubsManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        // check name availability
        CheckNameAvailabilityParameter parameter = new CheckNameAvailabilityParameter().withName(nameSpaceName);
        CheckNameAvailabilityResult result = eventHubsManager.namespaces().checkNameAvailability(parameter);

        Assertions.assertTrue(result.nameAvailable());

        // create namespace
        EHNamespace namespace = eventHubsManager.namespaces().define(nameSpaceName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withSku(new Sku()
                        .withName(SkuName.STANDARD)
                        .withTier(SkuTier.STANDARD)
                        .withCapacity(1))
                .withIsAutoInflateEnabled(true)
                .withMaximumThroughputUnits(20)
                .create();

        Assertions.assertNotNull(namespace);
        Assertions.assertEquals(SkuName.STANDARD, namespace.sku().name());
        Assertions.assertEquals(20, namespace.maximumThroughputUnits());
        Assertions.assertEquals(0, namespace.tags().size());

        // update namespace
        Map<String, String> tags = new HashMap<>();
        tags.put("key1", "value1");

        namespace.update()
                .withMaximumThroughputUnits(30)
                .withTags(tags)
                .apply();

        // list namespaces
        boolean foundNamespace = false;
        for (EHNamespace ehNamespace : eventHubsManager.namespaces().list()) {
            if (nameSpaceName.equals(ehNamespace.name())) {
                foundNamespace = true;
                break;
            }
        }
        Assertions.assertTrue(foundNamespace);

        // get namespace
        EHNamespace updatedNamespace = eventHubsManager.namespaces().getByResourceGroup(rgName, nameSpaceName);

        Assertions.assertNotNull(updatedNamespace);
        Assertions.assertEquals(30, updatedNamespace.maximumThroughputUnits());
        Assertions.assertNotNull(updatedNamespace.tags());
        Assertions.assertTrue(updatedNamespace.tags().containsKey("key1"));
        Assertions.assertEquals("value1", updatedNamespace.tags().get("key1"));

        // delete namespace
        eventHubsManager.namespaces().delete(rgName, nameSpaceName);

        // validate if delete success
        try {
            eventHubsManager.namespaces().getByResourceGroup(rgName, nameSpaceName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
