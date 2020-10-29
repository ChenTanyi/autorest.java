// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.generated.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.WebApplicationFirewallPolicyInner;
import com.azure.resourcemanager.frontdoor.generated.models.CustomRuleList;
import com.azure.resourcemanager.frontdoor.generated.models.FrontendEndpointLink;
import com.azure.resourcemanager.frontdoor.generated.models.ManagedRuleSetList;
import com.azure.resourcemanager.frontdoor.generated.models.PolicyResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.PolicySettings;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleLink;
import com.azure.resourcemanager.frontdoor.generated.models.WebApplicationFirewallPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WebApplicationFirewallPolicyImpl
    implements WebApplicationFirewallPolicy,
        WebApplicationFirewallPolicy.Definition,
        WebApplicationFirewallPolicy.Update {
    private WebApplicationFirewallPolicyInner innerObject;

    private final FrontDoorManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

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

    public CustomRuleList customRules() {
        return this.innerModel().customRules();
    }

    public ManagedRuleSetList managedRules() {
        return this.innerModel().managedRules();
    }

    public List<FrontendEndpointLink> frontendEndpointLinks() {
        List<FrontendEndpointLink> inner = this.innerModel().frontendEndpointLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<RoutingRuleLink> routingRuleLinks() {
        List<RoutingRuleLink> inner = this.innerModel().routingRuleLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PolicyResourceState resourceState() {
        return this.innerModel().resourceState();
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

    private FrontDoorManager manager() {
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
                .getPolicies()
                .createOrUpdate(resourceGroupName, policyName, innerObject, Context.NONE);
        return this;
    }

    public WebApplicationFirewallPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .createOrUpdate(resourceGroupName, policyName, innerObject, context);
        return this;
    }

    public WebApplicationFirewallPolicyImpl(String name, FrontDoorManager serviceManager) {
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
                .getPolicies()
                .createOrUpdate(resourceGroupName, policyName, innerObject, Context.NONE);
        return this;
    }

    public WebApplicationFirewallPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .createOrUpdate(resourceGroupName, policyName, innerObject, context);
        return this;
    }

    public WebApplicationFirewallPolicyImpl(
        WebApplicationFirewallPolicyInner innerObject, FrontDoorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.policyName = Utils.getValueFromIdByName(innerObject.id(), "FrontDoorWebApplicationFirewallPolicies");
    }

    public WebApplicationFirewallPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, policyName, Context.NONE)
                .getValue();
        return this;
    }

    public WebApplicationFirewallPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
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

    public WebApplicationFirewallPolicyImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public WebApplicationFirewallPolicyImpl withPolicySettings(PolicySettings policySettings) {
        this.innerModel().withPolicySettings(policySettings);
        return this;
    }

    public WebApplicationFirewallPolicyImpl withCustomRules(CustomRuleList customRules) {
        this.innerModel().withCustomRules(customRules);
        return this;
    }

    public WebApplicationFirewallPolicyImpl withManagedRules(ManagedRuleSetList managedRules) {
        this.innerModel().withManagedRules(managedRules);
        return this;
    }
}
