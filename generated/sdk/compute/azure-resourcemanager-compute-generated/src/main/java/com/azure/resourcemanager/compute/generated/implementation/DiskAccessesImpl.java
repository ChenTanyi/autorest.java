// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.DiskAccessesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskAccessInner;
import com.azure.resourcemanager.compute.generated.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.compute.generated.models.DiskAccess;
import com.azure.resourcemanager.compute.generated.models.DiskAccesses;
import com.azure.resourcemanager.compute.generated.models.PrivateLinkResourceListResult;

public final class DiskAccessesImpl implements DiskAccesses {
    private final DiskAccessesClient innerClient;

    private final ComputeManager serviceManager;

    public DiskAccessesImpl(DiskAccessesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DiskAccess getByResourceGroup(String resourceGroupName, String diskAccessName) {
        DiskAccessInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, diskAccessName);
        if (inner != null) {
            return new DiskAccessImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiskAccess> getByResourceGroupWithResponse(
        String resourceGroupName, String diskAccessName, Context context) {
        Response<DiskAccessInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, diskAccessName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiskAccessImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String diskAccessName) {
        this.serviceClient().delete(resourceGroupName, diskAccessName);
    }

    public void delete(String resourceGroupName, String diskAccessName, Context context) {
        this.serviceClient().delete(resourceGroupName, diskAccessName, context);
    }

    public PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskAccess> list() {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskAccess> list(Context context) {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PrivateLinkResourceListResult getPrivateLinkResources(String resourceGroupName, String diskAccessName) {
        PrivateLinkResourceListResultInner inner =
            this.serviceClient().getPrivateLinkResources(resourceGroupName, diskAccessName);
        if (inner != null) {
            return new PrivateLinkResourceListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResourceListResult> getPrivateLinkResourcesWithResponse(
        String resourceGroupName, String diskAccessName, Context context) {
        Response<PrivateLinkResourceListResultInner> inner =
            this.serviceClient().getPrivateLinkResourcesWithResponse(resourceGroupName, diskAccessName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DiskAccessesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public DiskAccessImpl define(String name) {
        return new DiskAccessImpl(name, this.manager());
    }
}