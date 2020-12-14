// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.resourcemanager.eventgrid.generated.EventGridManager;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionFullUrl;

public final class EventSubscriptionFullUrlImpl implements EventSubscriptionFullUrl {
    private EventSubscriptionFullUrlInner innerObject;

    private final EventGridManager serviceManager;

    EventSubscriptionFullUrlImpl(EventSubscriptionFullUrlInner innerObject, EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String endpointUrl() {
        return this.innerModel().endpointUrl();
    }

    public EventSubscriptionFullUrlInner innerModel() {
        return this.innerObject;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }
}
