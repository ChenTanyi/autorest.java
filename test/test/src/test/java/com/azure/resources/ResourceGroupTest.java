package com.azure.resources;

import com.azure.Base;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.models.ResourceGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResourceGroupTest extends Base {
    @Test
    public void canCRUDResourceGroup() {
        ResourceManager manager = ResourceManager.configure().withHttpClient(client).authenticate(credential, profile);

        ResourceGroup rg = manager.resourceGroups().define(rgName)
                .withRegion(region)
                .create();
        Assertions.assertEquals(region, rg.region());

        rg = manager.resourceGroups().get(rgName);
        Assertions.assertEquals(region, rg.region());

        Assertions.assertTrue(manager.resourceGroups().list().stream().anyMatch(rg1 -> rg1.name().equals(rgName)));

        manager.resourceGroups().delete(rgName);
        try {
            manager.resourceGroups().get(rgName);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}