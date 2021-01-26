// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.implementation;

import com.azure.resourcemanager.resourcegraph.generated.ResourceGraphManager;
import com.azure.resourcemanager.resourcegraph.generated.fluent.models.ResourceChangeDataInner;
import com.azure.resourcemanager.resourcegraph.generated.models.ChangeType;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourceChangeData;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourcePropertyChange;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourceSnapshotData;
import java.util.Collections;
import java.util.List;

public final class ResourceChangeDataImpl implements ResourceChangeData {
    private ResourceChangeDataInner innerObject;

    private final ResourceGraphManager serviceManager;

    ResourceChangeDataImpl(ResourceChangeDataInner innerObject, ResourceGraphManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String changeId() {
        return this.innerModel().changeId();
    }

    public ResourceSnapshotData beforeSnapshot() {
        return this.innerModel().beforeSnapshot();
    }

    public ResourceSnapshotData afterSnapshot() {
        return this.innerModel().afterSnapshot();
    }

    public ChangeType changeType() {
        return this.innerModel().changeType();
    }

    public List<ResourcePropertyChange> propertyChanges() {
        List<ResourcePropertyChange> inner = this.innerModel().propertyChanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceChangeDataInner innerModel() {
        return this.innerObject;
    }

    private ResourceGraphManager manager() {
        return this.serviceManager;
    }
}
