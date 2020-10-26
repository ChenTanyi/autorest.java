// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.ContainerServicesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.ContainerServiceInner;
import com.azure.resourcemanager.compute.generated.models.ContainerService;
import com.azure.resourcemanager.compute.generated.models.ContainerServices;

public final class ContainerServicesImpl implements ContainerServices {
    private final ContainerServicesClient innerClient;

    private final ComputeManager serviceManager;

    public ContainerServicesImpl(ContainerServicesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ContainerService> list() {
        PagedIterable<ContainerServiceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ContainerServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<ContainerService> list(Context context) {
        PagedIterable<ContainerServiceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ContainerServiceImpl(inner1, this.manager()));
    }

    public ContainerService getByResourceGroup(String resourceGroupName, String containerServiceName) {
        ContainerServiceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, containerServiceName);
        if (inner != null) {
            return new ContainerServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ContainerService> getByResourceGroupWithResponse(
        String resourceGroupName, String containerServiceName, Context context) {
        Response<ContainerServiceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, containerServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContainerServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String containerServiceName) {
        this.serviceClient().delete(resourceGroupName, containerServiceName);
    }

    public void delete(String resourceGroupName, String containerServiceName, Context context) {
        this.serviceClient().delete(resourceGroupName, containerServiceName, context);
    }

    public PagedIterable<ContainerService> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ContainerServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ContainerServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<ContainerService> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ContainerServiceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ContainerServiceImpl(inner1, this.manager()));
    }

    private ContainerServicesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public ContainerServiceImpl define(String name) {
        return new ContainerServiceImpl(name, this.manager());
    }
}
