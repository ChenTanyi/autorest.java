package com.azure.frontdoor;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.frontdoor.generated.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.FrontendEndpointInner;
import com.azure.resourcemanager.frontdoor.generated.models.Backend;
import com.azure.resourcemanager.frontdoor.generated.models.BackendEnabledState;
import com.azure.resourcemanager.frontdoor.generated.models.BackendPool;
import com.azure.resourcemanager.frontdoor.generated.models.ForwardingConfiguration;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoor;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorForwardingProtocol;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorHealthProbeMethod;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.generated.models.HealthProbeEnabled;
import com.azure.resourcemanager.frontdoor.generated.models.HealthProbeSettingsModel;
import com.azure.resourcemanager.frontdoor.generated.models.LoadBalancingSettingsModel;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRule;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleEnabledState;
import com.azure.resourcemanager.frontdoor.generated.models.SessionAffinityEnabledState;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.azure.resourcemanager.storage.generated.models.StorageAccount;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
                                .withHostname("fd1weidxu.azurefd.net")
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
                        .withLoadBalancingSettings(new SubResource().withId())
                ))
                .withLoadBalancingSettings(Collections.singletonList(
                        new LoadBalancingSettingsModel()
                            .withName("loadbalancer1")
                            .withSampleSize(4)
                            .withSuccessfulSamplesRequired(2)
                            .withAdditionalLatencyMilliseconds(0)
                ))
                .withHealthProbeSettings(Collections.singletonList(
                        new HealthProbeSettingsModel()
                                .withName("healthprobe1")
                                .withEnabledState(HealthProbeEnabled.ENABLED)
                                .withPath("/")
                                .withProtocol(FrontDoorProtocol.HTTPS)
                                .withHealthProbeMethod(FrontDoorHealthProbeMethod.HEAD)
                                .withIntervalInSeconds(30)
                ))
                .withRoutingRules(Collections.singletonList(
                        new RoutingRule()
                                .withName("rule1")
                                .withEnabledState(RoutingRuleEnabledState.ENABLED)
                                .withFrontendEndpoints(Collections.singletonList(new SubResource().withId()))
                                .withAcceptedProtocols(Arrays.asList(FrontDoorProtocol.HTTP, FrontDoorProtocol.HTTPS))
                                .withPatternsToMatch("/*")
                                .withRouteConfiguration(new ForwardingConfiguration()
                                        .withForwardingProtocol(FrontDoorForwardingProtocol.HTTPS_ONLY)
                                        .withBackendPool(new SubResource().withId()))
                ))
                .create();

        frontDoor.refresh();
    }
}
