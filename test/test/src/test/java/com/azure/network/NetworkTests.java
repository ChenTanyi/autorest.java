package com.azure.network;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class NetworkTests extends Base {

    @Test
    public void testNetworkSecurityGroup() {
        String nsgName = randomString("nic", 15);

        NetworkManager networkManager = NetworkManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        // create nsg
        NetworkSecurityGroup networkSecurityGroup = networkManager.networkSecurityGroups().define(nsgName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .create();

        Assertions.assertNotNull(networkSecurityGroup);
        Assertions.assertFalse(networkSecurityGroup.defaultSecurityRules().isEmpty());
        Assertions.assertNull(networkSecurityGroup.tags());

        // list nsg
        boolean foundNsg = false;
        for (NetworkSecurityGroup resource : networkManager.networkSecurityGroups().list()) {
            if (nsgName.equals(resource.name())) {
                foundNsg = true;
                break;
            }
        }
        Assertions.assertTrue(foundNsg);

        // update nsg
        Map<String, String> tags = new HashMap<>();
        tags.put("key1", "value1");
        networkSecurityGroup.update()
                .withTags(tags)
                .apply();

        // get nsg
        NetworkSecurityGroup updatedNsg = networkManager.networkSecurityGroups().getByResourceGroup(rgName, nsgName);
        Assertions.assertNotNull(updatedNsg);
        Assertions.assertNotNull(updatedNsg.tags());
        Assertions.assertTrue(updatedNsg.tags().containsKey("key1"));
        Assertions.assertEquals("value1", updatedNsg.tags().get("key1"));

        // delete nsg
        networkManager.networkSecurityGroups().delete(rgName, nsgName);

        // validate delete
        try {
            networkManager.networkSecurityGroups().getByResourceGroup(rgName, nsgName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
