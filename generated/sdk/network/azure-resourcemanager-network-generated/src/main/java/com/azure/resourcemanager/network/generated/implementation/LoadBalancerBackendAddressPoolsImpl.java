// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.LoadBalancerBackendAddressPoolsClient;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner;
import com.azure.resourcemanager.network.generated.models.BackendAddressPool;
import com.azure.resourcemanager.network.generated.models.LoadBalancerBackendAddressPools;

public final class LoadBalancerBackendAddressPoolsImpl implements LoadBalancerBackendAddressPools {
    private final LoadBalancerBackendAddressPoolsClient innerClient;

    private final NetworkManager serviceManager;

    public LoadBalancerBackendAddressPoolsImpl(
        LoadBalancerBackendAddressPoolsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BackendAddressPool> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<BackendAddressPoolInner> inner = this.serviceClient().list(resourceGroupName, loadBalancerName);
        return inner.mapPage(inner1 -> new BackendAddressPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<BackendAddressPool> list(String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<BackendAddressPoolInner> inner =
            this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return inner.mapPage(inner1 -> new BackendAddressPoolImpl(inner1, this.manager()));
    }

    public BackendAddressPool get(String resourceGroupName, String loadBalancerName, String backendAddressPoolName) {
        BackendAddressPoolInner inner =
            this.serviceClient().get(resourceGroupName, loadBalancerName, backendAddressPoolName);
        if (inner != null) {
            return new BackendAddressPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackendAddressPool> getWithResponse(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName, Context context) {
        Response<BackendAddressPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, loadBalancerName, backendAddressPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackendAddressPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String loadBalancerName, String backendAddressPoolName) {
        this.serviceClient().delete(resourceGroupName, loadBalancerName, backendAddressPoolName);
    }

    public void delete(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName, Context context) {
        this.serviceClient().delete(resourceGroupName, loadBalancerName, backendAddressPoolName, context);
    }

    private LoadBalancerBackendAddressPoolsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public BackendAddressPoolImpl define(String name) {
        return new BackendAddressPoolImpl(name, this.manager());
    }
}