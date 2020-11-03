package com.azure.iothub;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.iothub.generated.IotHubManager;
import com.azure.resourcemanager.iothub.generated.models.IotHubDescription;
import com.azure.resourcemanager.iothub.generated.models.IotHubSku;
import com.azure.resourcemanager.iothub.generated.models.IotHubSkuInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class IotHubTests extends Base {

    @Test
    @Disabled("The api version '2020-08-01' is not supported yet.")
    public void testIotHub() {
        String iotHubName = randomString("iot", 15);

        IotHubManager iotHubManager = IotHubManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        // create iothub resource
        IotHubDescription iotHubDescription = iotHubManager.iotHubResources().define(iotHubName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withSku(new IotHubSkuInfo()
                        .withName(IotHubSku.B1)
                        .withCapacity(1l))
                .create();

        Assertions.assertNotNull(iotHubDescription);
        Assertions.assertNotNull(iotHubDescription.sku());
        Assertions.assertEquals(IotHubSku.B1, iotHubDescription.sku().name());
        Assertions.assertEquals(1l, iotHubDescription.sku().capacity());
        Assertions.assertEquals(0, iotHubDescription.tags().size());

        // list iothub resources
        boolean foundIotHub = false;
        for (IotHubDescription resource : iotHubManager.iotHubResources().list()) {
            if (iotHubName.equals(resource.name())) {
                foundIotHub = true;
                break;
            }
        }
        Assertions.assertTrue(foundIotHub);

        // update iothub resource
        Map<String, String> tags = new HashMap<>();
        tags.put("key1", "value1");
        iotHubDescription.update()
                .withTags(tags)
                .apply();

        // get iothub resource
        IotHubDescription updatedIotHubDescription = iotHubManager.iotHubResources()
                .getByResourceGroup(rgName, iotHubName);
        Assertions.assertNotNull(updatedIotHubDescription);
        Assertions.assertTrue(updatedIotHubDescription.tags().containsKey("key1"));
        Assertions.assertEquals("value1", updatedIotHubDescription.tags().get("key1"));

        // delete iothub resource
        iotHubManager.iotHubResources().delete(rgName, iotHubName);

        // validate delete
        try {
            iotHubManager.iotHubResources().getByResourceGroup(rgName, iotHubName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
