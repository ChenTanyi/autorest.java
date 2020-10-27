// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworkTapsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTap;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTaps;

public final class VirtualNetworkTapsImpl implements VirtualNetworkTaps {
    private final VirtualNetworkTapsClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualNetworkTapsImpl(VirtualNetworkTapsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String tapName) {
        this.serviceClient().delete(resourceGroupName, tapName);
    }

    public void delete(String resourceGroupName, String tapName, Context context) {
        this.serviceClient().delete(resourceGroupName, tapName, context);
    }

    public VirtualNetworkTap getByResourceGroup(String resourceGroupName, String tapName) {
        VirtualNetworkTapInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, tapName);
        if (inner != null) {
            return new VirtualNetworkTapImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetworkTap> getByResourceGroupWithResponse(
        String resourceGroupName, String tapName, Context context) {
        Response<VirtualNetworkTapInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, tapName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkTapImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetworkTap> list() {
        PagedIterable<VirtualNetworkTapInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkTap> list(Context context) {
        PagedIterable<VirtualNetworkTapInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkTap> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualNetworkTapInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkTap> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualNetworkTapInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    private VirtualNetworkTapsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkTapImpl define(String name) {
        return new VirtualNetworkTapImpl(name, this.manager());
    }
}