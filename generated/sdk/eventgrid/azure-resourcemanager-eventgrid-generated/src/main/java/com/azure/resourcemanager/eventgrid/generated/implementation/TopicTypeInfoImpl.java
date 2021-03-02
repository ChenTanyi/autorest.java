// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.resourcemanager.eventgrid.generated.fluent.models.TopicTypeInfoInner;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceRegionType;
import com.azure.resourcemanager.eventgrid.generated.models.TopicTypeInfo;
import com.azure.resourcemanager.eventgrid.generated.models.TopicTypePropertiesSupportedScopesForSourceItem;
import com.azure.resourcemanager.eventgrid.generated.models.TopicTypeProvisioningState;
import java.util.Collections;
import java.util.List;

public final class TopicTypeInfoImpl implements TopicTypeInfo {
    private TopicTypeInfoInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    TopicTypeInfoImpl(
        TopicTypeInfoInner innerObject, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
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

    public String provider() {
        return this.innerModel().provider();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public ResourceRegionType resourceRegionType() {
        return this.innerModel().resourceRegionType();
    }

    public TopicTypeProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<String> supportedLocations() {
        List<String> inner = this.innerModel().supportedLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String sourceResourceFormat() {
        return this.innerModel().sourceResourceFormat();
    }

    public List<TopicTypePropertiesSupportedScopesForSourceItem> supportedScopesForSource() {
        List<TopicTypePropertiesSupportedScopesForSourceItem> inner = this.innerModel().supportedScopesForSource();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public TopicTypeInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
