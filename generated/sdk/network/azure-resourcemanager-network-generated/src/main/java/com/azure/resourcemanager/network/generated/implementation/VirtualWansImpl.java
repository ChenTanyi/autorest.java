// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.VirtualWansClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualWanInner;
import com.azure.resourcemanager.network.generated.models.VirtualWan;
import com.azure.resourcemanager.network.generated.models.VirtualWans;

public final class VirtualWansImpl implements VirtualWans {
    private final VirtualWansClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualWansImpl(VirtualWansClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualWan getByResourceGroup(String resourceGroupName, String virtualWanName) {
        VirtualWanInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, virtualWanName);
        if (inner != null) {
            return new VirtualWanImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualWan> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualWanName, Context context) {
        Response<VirtualWanInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualWanName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualWanImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String virtualWanName) {
        this.serviceClient().delete(resourceGroupName, virtualWanName);
    }

    public void delete(String resourceGroupName, String virtualWanName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualWanName, context);
    }

    public PagedIterable<VirtualWan> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualWanInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new VirtualWanImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualWan> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualWanInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new VirtualWanImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualWan> list() {
        PagedIterable<VirtualWanInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new VirtualWanImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualWan> list(Context context) {
        PagedIterable<VirtualWanInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new VirtualWanImpl(inner1, this.manager()));
    }

    public VirtualWan getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String virtualWanName = Utils.getValueFromIdByName(id, "virtualWans");
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualWanName, Context.NONE).getValue();
    }

    public Response<VirtualWan> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String virtualWanName = Utils.getValueFromIdByName(id, "virtualWans");
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualWanName, context);
    }

    private VirtualWansClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualWanImpl define(String name) {
        return new VirtualWanImpl(name, this.manager());
    }
}
