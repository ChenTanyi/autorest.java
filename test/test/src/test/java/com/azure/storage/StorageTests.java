package com.azure.storage;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.models.ResourceGroup;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.models.AccessTier;
import com.azure.resourcemanager.storage.generated.models.BlobContainer;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.PublicAccess;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.azure.resourcemanager.storage.generated.models.StorageAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class StorageTests extends Base {

    @Test
    public void testStorage() {
        String saName = randomString("sa", 10);
        String blobContainerName = "container1";
        Region region = Region.US_WEST;

        ResourceGroup rg = resourceManager.resourceGroups().define(rgName)
                .withRegion(region)
                .create();

        StorageManager storageManager = StorageManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        StorageAccount storageAccount = storageManager.storageAccounts().define(saName)
                .withRegion(rg.region())
                .withExistingResourceGroup(rgName)
                .withSku(new Sku().withName(SkuName.STANDARD_LRS))
                .withKind(Kind.STORAGE_V2)
                .withEnableHttpsTrafficOnly(true)
                .withTags(Map.of("tag1", "value1"))
                .create();
        Assertions.assertNotNull(storageAccount);
        Assertions.assertEquals(Kind.STORAGE_V2, storageAccount.kind());
        Assertions.assertEquals(true, storageAccount.enableHttpsTrafficOnly());

        storageAccount.refresh();
        Assertions.assertEquals(Kind.STORAGE_V2, storageAccount.kind());
        Assertions.assertEquals("value1", storageAccount.tags().get("tag1"));

        StorageAccount storageAccount2 = storageManager.storageAccounts().getByResourceGroup(rgName, saName);
        Assertions.assertEquals(Kind.STORAGE_V2, storageAccount2.kind());

        Assertions.assertEquals(1, storageManager.storageAccounts().listByResourceGroup(rgName).stream().count());

        storageAccount2.update()
                .withAccessTier(AccessTier.COOL)
                .withTags(Map.of("tag2", "value2"))
                .apply();
        Assertions.assertEquals(AccessTier.COOL, storageAccount2.accessTier());
        Assertions.assertEquals("value2", storageAccount2.tags().get("tag2"));

        BlobContainer blobContainer = storageManager.blobContainers().defineContainer(blobContainerName)
                .withExistingStorageAccount(rgName, saName)
                .withPublicAccess(PublicAccess.BLOB)
                .create(new Context("key", "value"));
        Assertions.assertNotNull(blobContainer);

        blobContainer.refresh();
        Assertions.assertEquals(PublicAccess.BLOB, blobContainer.publicAccess());

        Assertions.assertEquals(1, storageManager.blobContainers().list(rgName, saName).stream().count());

        BlobContainer blobContainer2 = storageManager.blobContainers().get(rgName, saName, blobContainerName);
        blobContainer2.update()
                .withPublicAccess(PublicAccess.NONE)
                .apply(new Context("key", "value"));
        Assertions.assertEquals(PublicAccess.NONE, blobContainer2.publicAccess());

        storageManager.storageAccounts().delete(rgName, saName);
        Assertions.assertThrows(ManagementException.class, () -> storageManager.storageAccounts().getByResourceGroup(rgName, saName));
    }
}
