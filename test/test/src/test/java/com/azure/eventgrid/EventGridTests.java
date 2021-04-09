package com.azure.eventgrid;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.resourcemanager.eventgrid.generated.EventGridManager;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.generated.models.StorageQueueEventSubscriptionDestination;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.azure.resourcemanager.storage.generated.models.StorageAccount;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EventGridTests extends Base {

    @Test
    public void testEventGrid() {
        String saName = randomString("sa", 10);
        String saName2 = randomString("sa", 10);
        String esName = randomString("es", 15);

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

        StorageAccount storageAccount2 = storageManager.storageAccounts()
                .define(saName2)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withSku(new Sku().withName(SkuName.STANDARD_LRS))
                .withKind(Kind.STORAGE_V2)
                .withEnableHttpsTrafficOnly(true)
                .create();
        storageManager.queues().define("eventgridqueue")
                .withExistingStorageAccount(rgName, storageAccount2.name())
                .create();

        EventGridManager manager = EventGridManager
                .configure()
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        EventSubscription eventSubscription = manager.eventSubscriptions().define(esName)
                .withExistingScope(storageAccount.id())
                .withDestination(new StorageQueueEventSubscriptionDestination()
                        .withResourceId(storageAccount2.id()).withQueueName("eventgridqueue"))
                .create();

        eventSubscription.update()
                .withLabels(Arrays.asList("label1"))
                .apply();

        manager.eventSubscriptions().deleteById(eventSubscription.id());
    }
}
