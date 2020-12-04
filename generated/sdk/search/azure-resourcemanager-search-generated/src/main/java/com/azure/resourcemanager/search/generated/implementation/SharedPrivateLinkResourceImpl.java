// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.search.generated.SearchManager;
import com.azure.resourcemanager.search.generated.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.search.generated.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.search.generated.models.SharedPrivateLinkResourceProperties;
import java.util.UUID;

public final class SharedPrivateLinkResourceImpl
    implements SharedPrivateLinkResource, SharedPrivateLinkResource.Definition, SharedPrivateLinkResource.Update {
    private SharedPrivateLinkResourceInner innerObject;

    private final SearchManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SharedPrivateLinkResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SharedPrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private SearchManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String searchServiceName;

    private String sharedPrivateLinkResourceName;

    private UUID createClientRequestId;

    private UUID updateClientRequestId;

    public SharedPrivateLinkResourceImpl withExistingSearchService(String resourceGroupName, String searchServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.searchServiceName = searchServiceName;
        return this;
    }

    public SharedPrivateLinkResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSharedPrivateLinkResources()
                .createOrUpdate(
                    resourceGroupName,
                    searchServiceName,
                    sharedPrivateLinkResourceName,
                    this.innerModel(),
                    createClientRequestId,
                    Context.NONE);
        return this;
    }

    public SharedPrivateLinkResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSharedPrivateLinkResources()
                .createOrUpdate(
                    resourceGroupName,
                    searchServiceName,
                    sharedPrivateLinkResourceName,
                    this.innerModel(),
                    createClientRequestId,
                    context);
        return this;
    }

    SharedPrivateLinkResourceImpl(String name, SearchManager serviceManager) {
        this.innerObject = new SharedPrivateLinkResourceInner();
        this.serviceManager = serviceManager;
        this.sharedPrivateLinkResourceName = name;
        this.createClientRequestId = null;
    }

    public SharedPrivateLinkResourceImpl update() {
        this.updateClientRequestId = null;
        return this;
    }

    public SharedPrivateLinkResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSharedPrivateLinkResources()
                .createOrUpdate(
                    resourceGroupName,
                    searchServiceName,
                    sharedPrivateLinkResourceName,
                    this.innerModel(),
                    updateClientRequestId,
                    Context.NONE);
        return this;
    }

    public SharedPrivateLinkResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSharedPrivateLinkResources()
                .createOrUpdate(
                    resourceGroupName,
                    searchServiceName,
                    sharedPrivateLinkResourceName,
                    this.innerModel(),
                    updateClientRequestId,
                    context);
        return this;
    }

    SharedPrivateLinkResourceImpl(SharedPrivateLinkResourceInner innerObject, SearchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.searchServiceName = Utils.getValueFromIdByName(innerObject.id(), "searchServices");
        this.sharedPrivateLinkResourceName = Utils.getValueFromIdByName(innerObject.id(), "sharedPrivateLinkResources");
    }

    public SharedPrivateLinkResource refresh() {
        UUID localClientRequestId = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSharedPrivateLinkResources()
                .getWithResponse(
                    resourceGroupName,
                    searchServiceName,
                    sharedPrivateLinkResourceName,
                    localClientRequestId,
                    Context.NONE)
                .getValue();
        return this;
    }

    public SharedPrivateLinkResource refresh(Context context) {
        UUID localClientRequestId = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSharedPrivateLinkResources()
                .getWithResponse(
                    resourceGroupName, searchServiceName, sharedPrivateLinkResourceName, localClientRequestId, context)
                .getValue();
        return this;
    }

    public SharedPrivateLinkResourceImpl withProperties(SharedPrivateLinkResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public SharedPrivateLinkResourceImpl withClientRequestId(UUID clientRequestId) {
        if (isInCreateMode()) {
            this.createClientRequestId = clientRequestId;
            return this;
        } else {
            this.updateClientRequestId = clientRequestId;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
