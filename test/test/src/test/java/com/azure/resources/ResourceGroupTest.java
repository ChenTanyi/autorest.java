package com.azure.resources;

import com.azure.Base;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.models.ResourceGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

public class ResourceGroupTest extends Base {
    @Test
    public void canCRUDResourceGroup() {
        final Region region = Region.US_EAST;
        ResourceManager manager = ResourceManager.configure().withHttpClient(client).authenticate(credential, profile);

        ResourceGroup rg = manager.resourceGroups().define(rgName)
                .withRegion(region)
                .create();
        Assertions.assertEquals(region.toString(), rg.location());

        rg = manager.resourceGroups().get(rgName);
        Assertions.assertEquals(region.toString(), rg.location());

        AtomicBoolean found = new AtomicBoolean(false);
        manager.resourceGroups().list().forEach(
                rg1 -> {
                    if (rg1.name().equals(rgName)) {
                        found.set(true);
                        Assertions.assertEquals(region.toString(), rg1.location());
                    }
                }
        );
        Assertions.assertTrue(found.get());

        manager.resourceGroups().delete(rgName);
        try {
            manager.resourceGroups().get(rgName);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}