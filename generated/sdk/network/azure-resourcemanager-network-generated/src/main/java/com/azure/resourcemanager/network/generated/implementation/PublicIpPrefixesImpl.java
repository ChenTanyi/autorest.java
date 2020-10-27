// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.PublicIpPrefixesClient;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpPrefixInner;
import com.azure.resourcemanager.network.generated.models.PublicIpPrefix;
import com.azure.resourcemanager.network.generated.models.PublicIpPrefixes;

public final class PublicIpPrefixesImpl implements PublicIpPrefixes {
    private final PublicIpPrefixesClient innerClient;

    private final NetworkManager serviceManager;

    public PublicIpPrefixesImpl(PublicIpPrefixesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String publicIpPrefixName) {
        this.serviceClient().delete(resourceGroupName, publicIpPrefixName);
    }

    public void delete(String resourceGroupName, String publicIpPrefixName, Context context) {
        this.serviceClient().delete(resourceGroupName, publicIpPrefixName, context);
    }

    public PublicIpPrefix getByResourceGroup(String resourceGroupName, String publicIpPrefixName) {
        PublicIpPrefixInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, publicIpPrefixName);
        if (inner != null) {
            return new PublicIpPrefixImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpPrefix> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpPrefixName, String expand, Context context) {
        Response<PublicIpPrefixInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, publicIpPrefixName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpPrefixImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PublicIpPrefix> list() {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpPrefix> list(Context context) {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpPrefix> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpPrefix> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    private PublicIpPrefixesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public PublicIpPrefixImpl define(String name) {
        return new PublicIpPrefixImpl(name, this.manager());
    }
}
