// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.DefaultSecurityRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;
import com.azure.resourcemanager.network.generated.models.DefaultSecurityRules;
import com.azure.resourcemanager.network.generated.models.SecurityRule;

public final class DefaultSecurityRulesImpl implements DefaultSecurityRules {
    private final DefaultSecurityRulesClient innerClient;

    private final NetworkManager serviceManager;

    public DefaultSecurityRulesImpl(DefaultSecurityRulesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityRule> list(String resourceGroupName, String networkSecurityGroupName) {
        PagedIterable<SecurityRuleInner> inner = this.serviceClient().list(resourceGroupName, networkSecurityGroupName);
        return inner.mapPage(inner1 -> new SecurityRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityRule> list(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        PagedIterable<SecurityRuleInner> inner =
            this.serviceClient().list(resourceGroupName, networkSecurityGroupName, context);
        return inner.mapPage(inner1 -> new SecurityRuleImpl(inner1, this.manager()));
    }

    public SecurityRule get(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        SecurityRuleInner inner =
            this.serviceClient().get(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName);
        if (inner != null) {
            return new SecurityRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecurityRule> getWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName, Context context) {
        Response<SecurityRuleInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DefaultSecurityRulesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
