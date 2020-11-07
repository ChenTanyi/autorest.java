// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.WebApplicationFirewallPoliciesClient;
import com.azure.resourcemanager.network.generated.fluent.models.WebApplicationFirewallPolicyInner;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallPolicies;
import com.azure.resourcemanager.network.generated.models.WebApplicationFirewallPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WebApplicationFirewallPoliciesImpl implements WebApplicationFirewallPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebApplicationFirewallPoliciesImpl.class);

    private final WebApplicationFirewallPoliciesClient innerClient;

    private final NetworkManager serviceManager;

    public WebApplicationFirewallPoliciesImpl(
        WebApplicationFirewallPoliciesClient innerClient, NetworkManager serviceManager) {
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

    public PagedIterable<WebApplicationFirewallPolicy> list() {
        PagedIterable<WebApplicationFirewallPolicyInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new WebApplicationFirewallPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<WebApplicationFirewallPolicy> list(Context context) {
        PagedIterable<WebApplicationFirewallPolicyInner> inner = this.serviceClient().list(context);
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
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String policyName = Utils.getValueFromIdByName(id, "ApplicationGatewayWebApplicationFirewallPolicies");
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'ApplicationGatewayWebApplicationFirewallPolicies'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, policyName, Context.NONE).getValue();
    }

    public Response<WebApplicationFirewallPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String policyName = Utils.getValueFromIdByName(id, "ApplicationGatewayWebApplicationFirewallPolicies");
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'ApplicationGatewayWebApplicationFirewallPolicies'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, policyName, context);
    }

    private WebApplicationFirewallPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public WebApplicationFirewallPolicyImpl define(String name) {
        return new WebApplicationFirewallPolicyImpl(name, this.manager());
    }
}
