// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.MySqlManager;
import com.azure.resourcemanager.mysql.generated.fluent.ReplicasClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerInner;
import com.azure.resourcemanager.mysql.generated.models.Replicas;
import com.azure.resourcemanager.mysql.generated.models.Server;

public final class ReplicasImpl implements Replicas {
    private final ReplicasClient innerClient;

    private final MySqlManager serviceManager;

    public ReplicasImpl(ReplicasClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Server> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new ServerImpl(inner1, this.manager()));
    }

    private ReplicasClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}