// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.MySqlManager;
import com.azure.resourcemanager.mysql.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.mysql.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.mysql.generated.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private final PrivateLinkResourcesClient innerClient;

    private final MySqlManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PrivateLinkResource get(String resourceGroupName, String serverName, String groupName) {
        PrivateLinkResourceInner inner = this.serviceClient().get(resourceGroupName, serverName, groupName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String serverName, String groupName, Context context) {
        Response<PrivateLinkResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, groupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
