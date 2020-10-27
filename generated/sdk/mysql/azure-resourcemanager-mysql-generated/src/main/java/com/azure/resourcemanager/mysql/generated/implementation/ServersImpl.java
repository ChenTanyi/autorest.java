// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.MySqlManager;
import com.azure.resourcemanager.mysql.generated.fluent.ServersClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerInner;
import com.azure.resourcemanager.mysql.generated.models.Server;
import com.azure.resourcemanager.mysql.generated.models.ServerUpgradeParameters;
import com.azure.resourcemanager.mysql.generated.models.Servers;

public final class ServersImpl implements Servers {
    private final ServersClient innerClient;

    private final MySqlManager serviceManager;

    public ServersImpl(ServersClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String serverName) {
        this.serviceClient().delete(resourceGroupName, serverName);
    }

    public void delete(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, context);
    }

    public Server getByResourceGroup(String resourceGroupName, String serverName) {
        ServerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, serverName);
        if (inner != null) {
            return new ServerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Server> getByResourceGroupWithResponse(
        String resourceGroupName, String serverName, Context context) {
        Response<ServerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Server> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> list() {
        PagedIterable<ServerInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> list(Context context) {
        PagedIterable<ServerInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public void restart(String resourceGroupName, String serverName) {
        this.serviceClient().restart(resourceGroupName, serverName);
    }

    public void restart(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().restart(resourceGroupName, serverName, context);
    }

    public void start(String resourceGroupName, String serverName) {
        this.serviceClient().start(resourceGroupName, serverName);
    }

    public void start(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().start(resourceGroupName, serverName, context);
    }

    public void stop(String resourceGroupName, String serverName) {
        this.serviceClient().stop(resourceGroupName, serverName);
    }

    public void stop(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().stop(resourceGroupName, serverName, context);
    }

    public void upgrade(String resourceGroupName, String serverName, ServerUpgradeParameters parameters) {
        this.serviceClient().upgrade(resourceGroupName, serverName, parameters);
    }

    public void upgrade(
        String resourceGroupName, String serverName, ServerUpgradeParameters parameters, Context context) {
        this.serviceClient().upgrade(resourceGroupName, serverName, parameters, context);
    }

    private ServersClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }

    public ServerImpl define(String name) {
        return new ServerImpl(name, this.manager());
    }
}