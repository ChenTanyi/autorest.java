// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteCrossConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsArpTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitsArpTableListResult;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitsRoutesTableListResult;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnection;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnections;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnectionsRoutesTableSummaryListResult;

public final class ExpressRouteCrossConnectionsImpl implements ExpressRouteCrossConnections {
    private final ExpressRouteCrossConnectionsClient innerClient;

    private final NetworkManager serviceManager;

    public ExpressRouteCrossConnectionsImpl(
        ExpressRouteCrossConnectionsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ExpressRouteCrossConnection> list() {
        PagedIterable<ExpressRouteCrossConnectionInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCrossConnection> list(Context context) {
        PagedIterable<ExpressRouteCrossConnectionInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCrossConnection> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ExpressRouteCrossConnectionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCrossConnection> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ExpressRouteCrossConnectionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public ExpressRouteCrossConnection getByResourceGroup(String resourceGroupName, String crossConnectionName) {
        ExpressRouteCrossConnectionInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, crossConnectionName);
        if (inner != null) {
            return new ExpressRouteCrossConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteCrossConnection> getByResourceGroupWithResponse(
        String resourceGroupName, String crossConnectionName, Context context) {
        Response<ExpressRouteCrossConnectionInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteCrossConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsArpTableListResult listArpTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCircuitsArpTableListResultInner inner =
            this.serviceClient().listArpTable(resourceGroupName, crossConnectionName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCircuitsArpTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsArpTableListResult listArpTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath, Context context) {
        ExpressRouteCircuitsArpTableListResultInner inner =
            this.serviceClient().listArpTable(resourceGroupName, crossConnectionName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCircuitsArpTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnectionsRoutesTableSummaryListResult listRoutesTableSummary(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner inner =
            this
                .serviceClient()
                .listRoutesTableSummary(resourceGroupName, crossConnectionName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCrossConnectionsRoutesTableSummaryListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnectionsRoutesTableSummaryListResult listRoutesTableSummary(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath, Context context) {
        ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner inner =
            this
                .serviceClient()
                .listRoutesTableSummary(resourceGroupName, crossConnectionName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCrossConnectionsRoutesTableSummaryListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableListResult listRoutesTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCircuitsRoutesTableListResultInner inner =
            this.serviceClient().listRoutesTable(resourceGroupName, crossConnectionName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableListResult listRoutesTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath, Context context) {
        ExpressRouteCircuitsRoutesTableListResultInner inner =
            this
                .serviceClient()
                .listRoutesTable(resourceGroupName, crossConnectionName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String crossConnectionName = Utils.getValueFromIdByName(id, "expressRouteCrossConnections");
        return this.getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, Context.NONE).getValue();
    }

    public Response<ExpressRouteCrossConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String crossConnectionName = Utils.getValueFromIdByName(id, "expressRouteCrossConnections");
        return this.getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, context);
    }

    private ExpressRouteCrossConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRouteCrossConnectionImpl define(String name) {
        return new ExpressRouteCrossConnectionImpl(name, this.manager());
    }
}
