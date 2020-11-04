package com.azure.mediaservices;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.models.MediaService;
import com.azure.resourcemanager.mediaservices.generated.models.StorageAccount;
import com.azure.resourcemanager.mediaservices.generated.models.StorageAccountType;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MediaServicesTests extends Base {

    @Test
    public void testMediaServicesAccount() {
        String saName = randomString("sa", 15);
        String accountName = randomString("msacc", 15);

        StorageManager storageManager = StorageManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        com.azure.resourcemanager.storage.generated.models.StorageAccount storageAccount = storageManager
                .storageAccounts()
                .define(saName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withSku(new Sku().withName(SkuName.STANDARD_LRS))
                .withKind(Kind.STORAGE)
                .create();

        MediaservicesManager mediaservicesManager = MediaservicesManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        // create media service
        MediaService mediaService = mediaservicesManager.mediaservices().define(accountName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withStorageAccounts(ImmutableList.of(
                        new StorageAccount()
                                .withType(StorageAccountType.PRIMARY)
                                .withId(storageAccount.id())))
                .create();

        Assertions.assertNotNull(mediaService);
        Assertions.assertNotNull(mediaService.mediaServiceId());
        Assertions.assertFalse(mediaService.storageAccounts().isEmpty());
        Assertions.assertEquals(1, mediaService.storageAccounts().size());
        Assertions.assertTrue(mediaService.tags().isEmpty());

        // list media service
        boolean foundMediaService = false;
        for (MediaService resource : mediaservicesManager.mediaservices().list()) {
            if (accountName.equals(mediaService.name())) {
                foundMediaService = true;
                break;
            }
        }
        Assertions.assertTrue(foundMediaService);

        // update media service
        Map<String, String> tags = new HashMap<>();
        tags.put("key1", "value1");
        mediaService.update()
                .withTags(tags)
                .apply();

        // get media service
        MediaService updatedMediaService = mediaservicesManager.mediaservices().getByResourceGroup(rgName, accountName);
        Assertions.assertNotNull(updatedMediaService);
        Assertions.assertTrue(updatedMediaService.tags().containsKey("key1"));
        Assertions.assertEquals("value1", updatedMediaService.tags().get("key1"));

        // delete media service
        mediaservicesManager.mediaservices().delete(rgName, accountName);

        // validate delete
        try {
            mediaservicesManager.mediaservices().getByResourceGroup(rgName, accountName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
