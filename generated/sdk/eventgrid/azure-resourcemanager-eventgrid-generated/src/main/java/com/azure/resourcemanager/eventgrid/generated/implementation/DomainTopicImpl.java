// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.resourcemanager.eventgrid.generated.fluent.models.DomainTopicInner;
import com.azure.resourcemanager.eventgrid.generated.models.DomainTopic;
import com.azure.resourcemanager.eventgrid.generated.models.DomainTopicProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.SystemData;

public final class DomainTopicImpl implements DomainTopic {
    private DomainTopicInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    DomainTopicImpl(
        DomainTopicInner innerObject, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DomainTopicProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DomainTopicInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
