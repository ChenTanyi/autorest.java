// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateLinkResourceListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateLinkResourceListResultImpl implements PrivateLinkResourceListResult {
    private PrivateLinkResourceListResultInner innerObject;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    PrivateLinkResourceListResultImpl(
        PrivateLinkResourceListResultInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateLinkResource> value() {
        List<PrivateLinkResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourceListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
