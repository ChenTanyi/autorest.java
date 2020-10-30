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

    private String subscriptionId;
    private String fdName;

    @Test
    public void testFrontDoor() {
        fdName = randomString("fd", 10);
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
        String frontendName = "frontend1";
        String loadBalancingName = "loadbalancing1";
        String healthProbeName = "healthprobe1";
        String routingRuleName = "rule1";
        String backendPoolName = "backend1";
        subscriptionId = profile.getSubscriptionId();
        String frontendEndpointsId = getResourceId("frontendEndpoints", frontendName);
        String loadBalancingSettingsId = getResourceId("loadBalancingSettings", loadBalancingName);
        String healthProbeSettingsId = getResourceId("healthProbeSettings", healthProbeName);
        String backendPoolsId = getResourceId("backendPools", backendPoolName);

        FrontDoor frontDoor = frontDoorManager.frontDoors().define(fdName)
                .withRegion("global")
                .withExistingResourceGroup(rgName)
                .withFrontendEndpoints(Collections.singletonList(
                        new FrontendEndpointInner()
                                .withName(frontendName)
                                .withHostname(fdName + ".azurefd.net")
                                .withSessionAffinityEnabledState(SessionAffinityEnabledState.DISABLED)
                ))
                .withBackendPools(Collections.singletonList(
                        new BackendPool().withName(backendPoolName).withBackends(Collections.singletonList(
                                new Backend()
                                        .withAddress(backendAddress)
                                        .withEnabledState(BackendEnabledState.ENABLED)
                                        .withBackendHostHeader(backendAddress)
                                        .withHttpPort(80)
                                        .withHttpsPort(443)
                                        .withPriority(1)
                                        .withWeight(50)
                        ))
                        .withLoadBalancingSettings(new SubResource().withId(loadBalancingSettingsId))
                        .withHealthProbeSettings(new SubResource().withId(healthProbeSettingsId))
                ))
                .withLoadBalancingSettings(Collections.singletonList(
                        new LoadBalancingSettingsModel()
                            .withName(loadBalancingName)
                            .withSampleSize(4)
                            .withSuccessfulSamplesRequired(2)
                            .withAdditionalLatencyMilliseconds(0)
                ))
                .withHealthProbeSettings(Collections.singletonList(
                        new HealthProbeSettingsModel()
                                .withName(healthProbeName)
                                .withEnabledState(HealthProbeEnabled.ENABLED)
                                .withPath("/")
                                .withProtocol(FrontDoorProtocol.HTTPS)
                                .withHealthProbeMethod(FrontDoorHealthProbeMethod.HEAD)
                                .withIntervalInSeconds(30)
                ))
                .withRoutingRules(Collections.singletonList(
                        new RoutingRule()
                                .withName(routingRuleName)
                                .withEnabledState(RoutingRuleEnabledState.ENABLED)
                                .withFrontendEndpoints(Collections.singletonList(new SubResource().withId(frontendEndpointsId)))
                                .withAcceptedProtocols(Arrays.asList(FrontDoorProtocol.HTTP, FrontDoorProtocol.HTTPS))
                                .withPatternsToMatch(Collections.singletonList("/*"))
                                .withRouteConfiguration(new ForwardingConfiguration()
                                        .withForwardingProtocol(FrontDoorForwardingProtocol.HTTPS_ONLY)
                                        .withBackendPool(new SubResource().withId(backendPoolsId)))
                ))
                .create();

        frontDoor.refresh();
    }

    private String getResourceId(String type, String name) {
        return String.format("/subscriptions/%1$s/resourceGroups/%2$s/providers/Microsoft.Network/frontdoors/%3$s/%4$s/%5$s",
                subscriptionId, rgName, fdName, type, name);
    }
}
