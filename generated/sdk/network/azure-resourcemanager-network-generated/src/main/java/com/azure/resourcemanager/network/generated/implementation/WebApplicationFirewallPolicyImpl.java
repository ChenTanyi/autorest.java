// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.WebApplicationFirewallPolicyInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGateway;
import com.azure.resourcemanager.network.generated.models.ManagedRulesDefinition;
import com.azure.resourcemanager.network.generated.models.PolicySettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallCustomRule;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallPolicy;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallPolicyResourceState;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class WebApplicationFirewallPolicyImpl
    implements WebApplicationFirewallPolicy,
        WebApplicationFirewallPolicy.Definition,
        WebApplicationFirewallPolicy.Update {
    private WebApplicationFirewallPolicyInner innerObject;

    private final NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public PolicySettings policySettings() {
        return this.innerModel().policySettings();
    }

    public List<WebApplicationFirewallCustomRule> customRules() {
        List<WebApplicationFirewallCustomRule> inner = this.innerModel().customRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ApplicationGateway> applicationGateways() {
        List<ApplicationGatewayInner> inner = this.innerModel().applicationGateways();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationGatewayImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public WebApplicationFirewallPolicyResourceState resourceState() {
        return this.innerModel().resourceState();
    }

    public ManagedRulesDefinition managedRules() {
        return this.innerModel().managedRules();
    }

    public List<SubResource> httpListeners() {
        List<SubResource> inner = this.innerModel().httpListeners();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<SubResource> pathBasedRules() {
        List<SubResource> inner = this.innerModel().pathBasedRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WebApplicationFirewallPolicyInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String policyName;

    public WebApplicationFirewallPolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public WebApplicationFirewallPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApplicationFirewallPolicies()
                .createOrUpdateWithResponse(resourceGroupName, policyName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public WebApplicationFirewallPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApplicationFirewallPolicies()
                .createOrUpdateWithResponse(resourceGroupName, policyName, innerObject, context)
                .getValue();
        return this;
    }

    public WebApplicationFirewallPolicyImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new WebApplicationFirewallPolicyInner();
        this.serviceManager = serviceManager;
        this.policyName = name;
    }

    public WebApplicationFirewallPolicyImpl update() {
        return this;
    }

    public WebApplicationFirewallPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApplicationFirewallPolicies()
                .createOrUpdateWithResponse(resourceGroupName, policyName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public WebApplicationFirewallPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApplicationFirewallPolicies()
                .createOrUpdateWithResponse(resourceGroupName, policyName, innerObject, context)
                .getValue();
        return this;
    }

    public WebApplicationFirewallPolicyImpl(
        WebApplicationFirewallPolicyInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.policyName =
            Utils.getValueFromIdByName(innerObject.id(), "ApplicationGatewayWebApplicationFirewallPolicies");
    }

    public WebApplicationFirewallPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApplicationFirewallPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, policyName, Context.NONE)
                .getValue();
        return this;
    }

    public WebApplicationFirewallPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApplicationFirewallPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, policyName, context)
                .getValue();
        return this;
    }

    public WebApplicationFirewallPolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WebApplicationFirewallPolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WebApplicationFirewallPolicyImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public WebApplicationFirewallPolicyImpl withPolicySettings(PolicySettings policySettings) {
        this.innerModel().withPolicySettings(policySettings);
        return this;
    }

    public WebApplicationFirewallPolicyImpl withCustomRules(List<WebApplicationFirewallCustomRule> customRules) {
        this.innerModel().withCustomRules(customRules);
        return this;
    }

    public WebApplicationFirewallPolicyImpl withManagedRules(ManagedRulesDefinition managedRules) {
        this.innerModel().withManagedRules(managedRules);
        return this;
    }
}
