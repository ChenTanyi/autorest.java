// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.generated.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.generated.fluent.PoliciesClient;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.WebApplicationFirewallPolicyInner;
import com.azure.resourcemanager.frontdoor.generated.models.Policies;
import com.azure.resourcemanager.frontdoor.generated.models.WebApplicationFirewallPolicy;

public final class PoliciesImpl implements Policies {
    private final PoliciesClient innerClient;

    private final FrontDoorManager serviceManager;

    public PoliciesImpl(PoliciesClient innerClient, FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName) {
        PagedIterable<WebApplicationFirewallPolicyInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new WebApplicationFirewallPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<WebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<WebApplicationFirewallPolicyInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new WebApplicationFirewallPolicyImpl(inner1, this.manager()));
    }

    public WebApplicationFirewallPolicy getByResourceGroup(String resourceGroupName, String policyName) {
        WebApplicationFirewallPolicyInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, policyName);
        if (inner != null) {
            return new WebApplicationFirewallPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WebApplicationFirewallPolicy> getByResourceGroupWithResponse(
        String resourceGroupName, String policyName, Context context) {
        Response<WebApplicationFirewallPolicyInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, policyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WebApplicationFirewallPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String policyName) {
        this.serviceClient().delete(resourceGroupName, policyName);
    }

    public void delete(String resourceGroupName, String policyName, Context context) {
        this.serviceClient().delete(resourceGroupName, policyName, context);
    }

    public WebApplicationFirewallPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String policyName = Utils.getValueFromIdByName(id, "FrontDoorWebApplicationFirewallPolicies");
        return this.getByResourceGroupWithResponse(resourceGroupName, policyName, Context.NONE).getValue();
    }

    public Response<WebApplicationFirewallPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String policyName = Utils.getValueFromIdByName(id, "FrontDoorWebApplicationFirewallPolicies");
        return this.getByResourceGroupWithResponse(resourceGroupName, policyName, context);
    }

    private PoliciesClient serviceClient() {
        return this.innerClient;
    }

    private FrontDoorManager manager() {
        return this.serviceManager;
    }

    public WebApplicationFirewallPolicyImpl define(String name) {
        return new WebApplicationFirewallPolicyImpl(name, this.manager());
    }
}
