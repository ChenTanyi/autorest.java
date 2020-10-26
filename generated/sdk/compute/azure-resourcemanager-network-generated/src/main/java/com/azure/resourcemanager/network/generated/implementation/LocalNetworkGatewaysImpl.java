// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.LocalNetworkGatewaysClient;
import com.azure.resourcemanager.network.generated.fluent.models.LocalNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.LocalNetworkGateway;
import com.azure.resourcemanager.network.generated.models.LocalNetworkGateways;

public final class LocalNetworkGatewaysImpl implements LocalNetworkGateways {
    private final LocalNetworkGatewaysClient innerClient;

    private final NetworkManager serviceManager;

    public LocalNetworkGatewaysImpl(LocalNetworkGatewaysClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LocalNetworkGateway getByResourceGroup(String resourceGroupName, String localNetworkGatewayName) {
        LocalNetworkGatewayInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, localNetworkGatewayName);
        if (inner != null) {
            return new LocalNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LocalNetworkGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String localNetworkGatewayName, Context context) {
        Response<LocalNetworkGatewayInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, localNetworkGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LocalNetworkGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String localNetworkGatewayName) {
        this.serviceClient().delete(resourceGroupName, localNetworkGatewayName);
    }

    public void delete(String resourceGroupName, String localNetworkGatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, localNetworkGatewayName, context);
    }

    public PagedIterable<LocalNetworkGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<LocalNetworkGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new LocalNetworkGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<LocalNetworkGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<LocalNetworkGatewayInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new LocalNetworkGatewayImpl(inner1, this.manager()));
    }

    private LocalNetworkGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public LocalNetworkGatewayImpl define(String name) {
        return new LocalNetworkGatewayImpl(name, this.manager());
    }
}
