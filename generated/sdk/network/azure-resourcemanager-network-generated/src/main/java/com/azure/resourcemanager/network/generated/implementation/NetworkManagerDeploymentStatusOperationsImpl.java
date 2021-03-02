// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NetworkManagerDeploymentStatusOperationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerDeploymentStatusInner;
import com.azure.resourcemanager.network.generated.models.NetworkManagerDeploymentStatus;
import com.azure.resourcemanager.network.generated.models.NetworkManagerDeploymentStatusOperations;
import com.azure.resourcemanager.network.generated.models.NetworkManagerDeploymentStatusParameter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkManagerDeploymentStatusOperationsImpl implements NetworkManagerDeploymentStatusOperations {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(NetworkManagerDeploymentStatusOperationsImpl.class);

    private final NetworkManagerDeploymentStatusOperationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NetworkManagerDeploymentStatusOperationsImpl(
        NetworkManagerDeploymentStatusOperationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkManagerDeploymentStatus> list(
        String resourceGroupName, String networkManagerName, NetworkManagerDeploymentStatusParameter parameters) {
        PagedIterable<NetworkManagerDeploymentStatusInner> inner =
            this.serviceClient().list(resourceGroupName, networkManagerName, parameters);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerDeploymentStatusImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManagerDeploymentStatus> list(
        String resourceGroupName,
        String networkManagerName,
        NetworkManagerDeploymentStatusParameter parameters,
        Integer top,
        String skipToken,
        Context context) {
        PagedIterable<NetworkManagerDeploymentStatusInner> inner =
            this.serviceClient().list(resourceGroupName, networkManagerName, parameters, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerDeploymentStatusImpl(inner1, this.manager()));
    }

    private NetworkManagerDeploymentStatusOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
