// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ApplicationGatewayPrivateEndpointConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayPrivateEndpointConnection;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayPrivateEndpointConnections;

public final class ApplicationGatewayPrivateEndpointConnectionsImpl
    implements ApplicationGatewayPrivateEndpointConnections {
    private final ApplicationGatewayPrivateEndpointConnectionsClient innerClient;

    private final NetworkManager serviceManager;

    public ApplicationGatewayPrivateEndpointConnectionsImpl(
        ApplicationGatewayPrivateEndpointConnectionsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String applicationGatewayName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, applicationGatewayName, connectionName);
    }

    public void delete(
        String resourceGroupName, String applicationGatewayName, String connectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, applicationGatewayName, connectionName, context);
    }

    public ApplicationGatewayPrivateEndpointConnection update(
        String resourceGroupName,
        String applicationGatewayName,
        String connectionName,
        ApplicationGatewayPrivateEndpointConnectionInner parameters) {
        ApplicationGatewayPrivateEndpointConnectionInner inner =
            this.serviceClient().update(resourceGroupName, applicationGatewayName, connectionName, parameters);
        if (inner != null) {
            return new ApplicationGatewayPrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGatewayPrivateEndpointConnection update(
        String resourceGroupName,
        String applicationGatewayName,
        String connectionName,
        ApplicationGatewayPrivateEndpointConnectionInner parameters,
        Context context) {
        ApplicationGatewayPrivateEndpointConnectionInner inner =
            this.serviceClient().update(resourceGroupName, applicationGatewayName, connectionName, parameters, context);
        if (inner != null) {
            return new ApplicationGatewayPrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGatewayPrivateEndpointConnection get(
        String resourceGroupName, String applicationGatewayName, String connectionName) {
        ApplicationGatewayPrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, applicationGatewayName, connectionName);
        if (inner != null) {
            return new ApplicationGatewayPrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationGatewayPrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String applicationGatewayName, String connectionName, Context context) {
        Response<ApplicationGatewayPrivateEndpointConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, applicationGatewayName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationGatewayPrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ApplicationGatewayPrivateEndpointConnection> list(
        String resourceGroupName, String applicationGatewayName) {
        PagedIterable<ApplicationGatewayPrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, applicationGatewayName);
        return inner.mapPage(inner1 -> new ApplicationGatewayPrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationGatewayPrivateEndpointConnection> list(
        String resourceGroupName, String applicationGatewayName, Context context) {
        PagedIterable<ApplicationGatewayPrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, applicationGatewayName, context);
        return inner.mapPage(inner1 -> new ApplicationGatewayPrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    private ApplicationGatewayPrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}