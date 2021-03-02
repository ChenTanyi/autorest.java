// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.resourcemanager.search.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.search.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.search.generated.models.PrivateLinkResourceProperties;

public final class PrivateLinkResourceImpl implements PrivateLinkResource {
    private PrivateLinkResourceInner innerObject;

    private final com.azure.resourcemanager.search.generated.SearchManager serviceManager;

    PrivateLinkResourceImpl(
        PrivateLinkResourceInner innerObject, com.azure.resourcemanager.search.generated.SearchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateLinkResourceProperties properties() {
        return this.innerModel().properties();
    }

    public PrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.search.generated.SearchManager manager() {
        return this.serviceManager;
    }
}
