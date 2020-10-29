package com.azure.frontdoor;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.resourcemanager.frontdoor.generated.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.FrontendEndpointInner;
import com.azure.resourcemanager.frontdoor.generated.models.Backend;
import com.azure.resourcemanager.frontdoor.generated.models.BackendEnabledState;
import com.azure.resourcemanager.frontdoor.generated.models.BackendPool;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoor;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRule;
import com.azure.resourcemanager.frontdoor.generated.models.SessionAffinityEnabledState;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.azure.resourcemanager.storage.generated.models.StorageAccount;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class FrontDoorTests extends Base {

    @Test
    public void testFrontDoor() {
        String fdName = randomString("fd", 10);
        String saName = randomString("sa", 10);

        FrontDoorManager frontDoorManager = FrontDoorManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

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

        String backendAddress = storageAccount.name() + ".blob.core.windows.net";

        FrontDoor frontDoor = frontDoorManager.frontDoors().define(fdName)
                .withRegion("global")
                .withExistingResourceGroup(rgName)
                .withFrontendEndpoints(Collections.singletonList(
                        new FrontendEndpointInner()
                                .withName("frontend1")
                                .withHostname(fdName)
                                .withSessionAffinityEnabledState(SessionAffinityEnabledState.DISABLED)
                ))
                .withBackendPools(Collections.singletonList(
                        new BackendPool().withName("backend1").withBackends(Collections.singletonList(
                                new Backend()
                                        .withAddress(backendAddress)
                                        .withEnabledState(BackendEnabledState.ENABLED)
                                        .withBackendHostHeader(backendAddress)
                                        .withHttpPort(80)
                                        .withHttpsPort(443)
                                        .withPriority(1)
                                        .withWeight(50)
                        ))
                ))
                .create();

        int i = 1;
    }
}
