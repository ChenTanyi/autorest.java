// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.LoadBalancerLoadBalancingRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancingRuleInner;
import com.azure.resourcemanager.network.generated.models.LoadBalancerLoadBalancingRules;
import com.azure.resourcemanager.network.generated.models.LoadBalancingRule;

public final class LoadBalancerLoadBalancingRulesImpl implements LoadBalancerLoadBalancingRules {
    private final LoadBalancerLoadBalancingRulesClient innerClient;

    private final NetworkManager serviceManager;

    public LoadBalancerLoadBalancingRulesImpl(
        LoadBalancerLoadBalancingRulesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LoadBalancingRule> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<LoadBalancingRuleInner> inner = this.serviceClient().list(resourceGroupName, loadBalancerName);
        return inner.mapPage(inner1 -> new LoadBalancingRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<LoadBalancingRule> list(String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<LoadBalancingRuleInner> inner =
            this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return inner.mapPage(inner1 -> new LoadBalancingRuleImpl(inner1, this.manager()));
    }

    public LoadBalancingRule get(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        LoadBalancingRuleInner inner =
            this.serviceClient().get(resourceGroupName, loadBalancerName, loadBalancingRuleName);
        if (inner != null) {
            return new LoadBalancingRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LoadBalancingRule> getWithResponse(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName, Context context) {
        Response<LoadBalancingRuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, loadBalancerName, loadBalancingRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LoadBalancingRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LoadBalancerLoadBalancingRulesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
