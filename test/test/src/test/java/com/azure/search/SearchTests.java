package com.azure.search;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.search.generated.SearchManager;
import com.azure.resourcemanager.search.generated.models.HostingMode;
import com.azure.resourcemanager.search.generated.models.SearchService;
import com.azure.resourcemanager.search.generated.models.Sku;
import com.azure.resourcemanager.search.generated.models.SkuName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class SearchTests extends Base {

    @Test
    public void testSearch() {
        String serviceName = randomString("ss", 10);

        SearchManager searchManager = SearchManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        SearchService searchService = searchManager.services()
                .define(serviceName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withSku(new Sku().withName(SkuName.FREE))
                .create();

        searchService.refresh();
        Assertions.assertEquals(SkuName.FREE, searchService.sku().name());

        Assertions.assertEquals(HostingMode.DEFAULT, searchService.hostingMode());

        searchService.update()
                .withTags(Map.of("tag1", "value1"))
                .apply();

        searchService = searchManager.services().listByResourceGroup(rgName).iterator().next();
        Assertions.assertEquals("value1", searchService.tags().get("tag1"));

        searchManager.services().delete(rgName, serviceName);
        Assertions.assertThrows(ManagementException.class, () -> searchManager.services().getByResourceGroup(rgName, serviceName));
    }
}
