// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ResourceNavigationLinksClient;
import com.azure.resourcemanager.network.generated.fluent.models.ResourceNavigationLinksListResultInner;
import com.azure.resourcemanager.network.generated.models.ResourceNavigationLinks;
import com.azure.resourcemanager.network.generated.models.ResourceNavigationLinksListResult;

public final class ResourceNavigationLinksImpl implements ResourceNavigationLinks {
    private final ResourceNavigationLinksClient innerClient;

    private final NetworkManager serviceManager;

    public ResourceNavigationLinksImpl(ResourceNavigationLinksClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ResourceNavigationLinksListResult list(
        String resourceGroupName, String virtualNetworkName, String subnetName) {
        ResourceNavigationLinksListResultInner inner =
            this.serviceClient().list(resourceGroupName, virtualNetworkName, subnetName);
        if (inner != null) {
            return new ResourceNavigationLinksListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceNavigationLinksListResult> listWithResponse(
        String resourceGroupName, String virtualNetworkName, String subnetName, Context context) {
        Response<ResourceNavigationLinksListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, virtualNetworkName, subnetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceNavigationLinksListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResourceNavigationLinksClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
