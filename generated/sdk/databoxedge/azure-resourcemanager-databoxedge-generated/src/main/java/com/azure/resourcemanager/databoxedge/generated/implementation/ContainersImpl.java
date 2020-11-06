// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.generated.fluent.ContainersClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ContainerInner;
import com.azure.resourcemanager.databoxedge.generated.models.Container;
import com.azure.resourcemanager.databoxedge.generated.models.Containers;

public final class ContainersImpl implements Containers {
    private final ContainersClient innerClient;

    private final DataBoxEdgeManager serviceManager;

    public ContainersImpl(ContainersClient innerClient, DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Container> listByStorageAccount(
        String deviceName, String storageAccountName, String resourceGroupName) {
        PagedIterable<ContainerInner> inner =
            this.serviceClient().listByStorageAccount(deviceName, storageAccountName, resourceGroupName);
        return inner.mapPage(inner1 -> new ContainerImpl(inner1, this.manager()));
    }

    public PagedIterable<Container> listByStorageAccount(
        String deviceName, String storageAccountName, String resourceGroupName, Context context) {
        PagedIterable<ContainerInner> inner =
            this.serviceClient().listByStorageAccount(deviceName, storageAccountName, resourceGroupName, context);
        return inner.mapPage(inner1 -> new ContainerImpl(inner1, this.manager()));
    }

    public Container get(String deviceName, String storageAccountName, String containerName, String resourceGroupName) {
        ContainerInner inner =
            this.serviceClient().get(deviceName, storageAccountName, containerName, resourceGroupName);
        if (inner != null) {
            return new ContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Container> getWithResponse(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context) {
        Response<ContainerInner> inner =
            this
                .serviceClient()
                .getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContainerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String storageAccountName, String containerName, String resourceGroupName) {
        this.serviceClient().delete(deviceName, storageAccountName, containerName, resourceGroupName);
    }

    public void delete(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, storageAccountName, containerName, resourceGroupName, context);
    }

    public void refresh(String deviceName, String storageAccountName, String containerName, String resourceGroupName) {
        this.serviceClient().refresh(deviceName, storageAccountName, containerName, resourceGroupName);
    }

    public void refresh(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context) {
        this.serviceClient().refresh(deviceName, storageAccountName, containerName, resourceGroupName, context);
    }

    public Container getById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        String containerName = Utils.getValueFromIdByName(id, "containers");
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        return this
            .getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, Context.NONE)
            .getValue();
    }

    public Response<Container> getByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        String containerName = Utils.getValueFromIdByName(id, "containers");
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        return this.getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, context);
    }

    private ContainersClient serviceClient() {
        return this.innerClient;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public ContainerImpl define(String name) {
        return new ContainerImpl(name, this.manager());
    }
}
