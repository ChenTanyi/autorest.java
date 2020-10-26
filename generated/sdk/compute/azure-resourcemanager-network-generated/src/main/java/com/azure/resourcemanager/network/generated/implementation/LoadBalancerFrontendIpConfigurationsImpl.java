// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.LoadBalancerFrontendIpConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.models.FrontendIpConfiguration;
import com.azure.resourcemanager.network.generated.models.LoadBalancerFrontendIpConfigurations;

public final class LoadBalancerFrontendIpConfigurationsImpl implements LoadBalancerFrontendIpConfigurations {
    private final LoadBalancerFrontendIpConfigurationsClient innerClient;

    private final NetworkManager serviceManager;

    public LoadBalancerFrontendIpConfigurationsImpl(
        LoadBalancerFrontendIpConfigurationsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FrontendIpConfiguration> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<FrontendIpConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, loadBalancerName);
        return inner.mapPage(inner1 -> new FrontendIpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<FrontendIpConfiguration> list(
        String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<FrontendIpConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return inner.mapPage(inner1 -> new FrontendIpConfigurationImpl(inner1, this.manager()));
    }

    public FrontendIpConfiguration get(
        String resourceGroupName, String loadBalancerName, String frontendIpConfigurationName) {
        FrontendIpConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, loadBalancerName, frontendIpConfigurationName);
        if (inner != null) {
            return new FrontendIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FrontendIpConfiguration> getWithResponse(
        String resourceGroupName, String loadBalancerName, String frontendIpConfigurationName, Context context) {
        Response<FrontendIpConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, loadBalancerName, frontendIpConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FrontendIpConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LoadBalancerFrontendIpConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
