// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.generated.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerKeysClient;
import com.azure.resourcemanager.postgresql.generated.fluent.models.ServerKeyInner;
import com.azure.resourcemanager.postgresql.generated.models.ServerKey;
import com.azure.resourcemanager.postgresql.generated.models.ServerKeys;

public final class ServerKeysImpl implements ServerKeys {
    private final ServerKeysClient innerClient;

    private final PostgreSqlManager serviceManager;

    public ServerKeysImpl(ServerKeysClient innerClient, PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServerKey> list(String resourceGroupName, String serverName) {
        PagedIterable<ServerKeyInner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new ServerKeyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerKey> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerKeyInner> inner = this.serviceClient().list(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new ServerKeyImpl(inner1, this.manager()));
    }

    public ServerKey get(String resourceGroupName, String serverName, String keyName) {
        ServerKeyInner inner = this.serviceClient().get(resourceGroupName, serverName, keyName);
        if (inner != null) {
            return new ServerKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerKey> getWithResponse(
        String resourceGroupName, String serverName, String keyName, Context context) {
        Response<ServerKeyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, keyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String serverName, String keyName, String resourceGroupName) {
        this.serviceClient().delete(serverName, keyName, resourceGroupName);
    }

    public void delete(String serverName, String keyName, String resourceGroupName, Context context) {
        this.serviceClient().delete(serverName, keyName, resourceGroupName, context);
    }

    private ServerKeysClient serviceClient() {
        return this.innerClient;
    }

    private PostgreSqlManager manager() {
        return this.serviceManager;
    }

    public ServerKeyImpl define(String name) {
        return new ServerKeyImpl(name, this.manager());
    }
}
