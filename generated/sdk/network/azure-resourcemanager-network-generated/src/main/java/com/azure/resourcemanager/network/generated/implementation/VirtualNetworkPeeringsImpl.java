// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworkPeeringsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeering;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeerings;

public final class VirtualNetworkPeeringsImpl implements VirtualNetworkPeerings {
    private final VirtualNetworkPeeringsClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualNetworkPeeringsImpl(VirtualNetworkPeeringsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
    }

    public void delete(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    public VirtualNetworkPeering get(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        VirtualNetworkPeeringInner inner =
            this.serviceClient().get(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
        if (inner != null) {
            return new VirtualNetworkPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetworkPeering> getWithResponse(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context) {
        Response<VirtualNetworkPeeringInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkPeeringImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualNetworkPeering createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters) {
        VirtualNetworkPeeringInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters);
        if (inner != null) {
            return new VirtualNetworkPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualNetworkPeering createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        Context context) {
        VirtualNetworkPeeringInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    virtualNetworkName,
                    virtualNetworkPeeringName,
                    virtualNetworkPeeringParameters,
                    context);
        if (inner != null) {
            return new VirtualNetworkPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetworkPeering> list(String resourceGroupName, String virtualNetworkName) {
        PagedIterable<VirtualNetworkPeeringInner> inner =
            this.serviceClient().list(resourceGroupName, virtualNetworkName);
        return inner.mapPage(inner1 -> new VirtualNetworkPeeringImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkPeering> list(
        String resourceGroupName, String virtualNetworkName, Context context) {
        PagedIterable<VirtualNetworkPeeringInner> inner =
            this.serviceClient().list(resourceGroupName, virtualNetworkName, context);
        return inner.mapPage(inner1 -> new VirtualNetworkPeeringImpl(inner1, this.manager()));
    }

    private VirtualNetworkPeeringsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}