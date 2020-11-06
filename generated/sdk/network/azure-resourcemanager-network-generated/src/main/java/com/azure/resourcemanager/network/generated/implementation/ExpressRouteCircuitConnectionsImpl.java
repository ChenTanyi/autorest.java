// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteCircuitConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitConnectionInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitConnection;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitConnections;

public final class ExpressRouteCircuitConnectionsImpl implements ExpressRouteCircuitConnections {
    private final ExpressRouteCircuitConnectionsClient innerClient;

    private final NetworkManager serviceManager;

    public ExpressRouteCircuitConnectionsImpl(
        ExpressRouteCircuitConnectionsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, circuitName, peeringName, connectionName);
    }

    public void delete(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, circuitName, peeringName, connectionName, context);
    }

    public ExpressRouteCircuitConnection get(
        String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        ExpressRouteCircuitConnectionInner inner =
            this.serviceClient().get(resourceGroupName, circuitName, peeringName, connectionName);
        if (inner != null) {
            return new ExpressRouteCircuitConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteCircuitConnection> getWithResponse(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context) {
        Response<ExpressRouteCircuitConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, circuitName, peeringName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteCircuitConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressRouteCircuitConnection> list(
        String resourceGroupName, String circuitName, String peeringName) {
        PagedIterable<ExpressRouteCircuitConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, circuitName, peeringName);
        return inner.mapPage(inner1 -> new ExpressRouteCircuitConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCircuitConnection> list(
        String resourceGroupName, String circuitName, String peeringName, Context context) {
        PagedIterable<ExpressRouteCircuitConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, circuitName, peeringName, context);
        return inner.mapPage(inner1 -> new ExpressRouteCircuitConnectionImpl(inner1, this.manager()));
    }

    public ExpressRouteCircuitConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        String connectionName = Utils.getValueFromIdByName(id, "connections");
        return this
            .getWithResponse(resourceGroupName, circuitName, peeringName, connectionName, Context.NONE)
            .getValue();
    }

    public Response<ExpressRouteCircuitConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        String connectionName = Utils.getValueFromIdByName(id, "connections");
        return this.getWithResponse(resourceGroupName, circuitName, peeringName, connectionName, context);
    }

    private ExpressRouteCircuitConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRouteCircuitConnectionImpl define(String name) {
        return new ExpressRouteCircuitConnectionImpl(name, this.manager());
    }
}
