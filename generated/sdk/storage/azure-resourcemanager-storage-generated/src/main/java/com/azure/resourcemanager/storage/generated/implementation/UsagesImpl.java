// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.UsagesClient;
import com.azure.resourcemanager.storage.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.storage.generated.models.Usage;
import com.azure.resourcemanager.storage.generated.models.Usages;

public final class UsagesImpl implements Usages {
    private final UsagesClient innerClient;

    private final StorageManager serviceManager;

    public UsagesImpl(UsagesClient innerClient, StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> listByLocation(String location) {
        PagedIterable<UsageInner> inner = this.serviceClient().listByLocation(location);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listByLocation(String location, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().listByLocation(location, context);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}