// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.ResourceSkusClient;
import com.azure.resourcemanager.compute.generated.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.compute.generated.models.ResourceSku;
import com.azure.resourcemanager.compute.generated.models.ResourceSkus;

public final class ResourceSkusImpl implements ResourceSkus {
    private final ResourceSkusClient innerClient;

    private final ComputeManager serviceManager;

    public ResourceSkusImpl(ResourceSkusClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceSku> list() {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceSku> list(String filter, Context context) {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list(filter, context);
        return inner.mapPage(inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    private ResourceSkusClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}