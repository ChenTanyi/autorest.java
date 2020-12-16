// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Full endpoint url of an event subscription. */
@Fluent
public final class EventSubscriptionFullUrlInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventSubscriptionFullUrlInner.class);

    /*
     * The URL that represents the endpoint of the destination of an event
     * subscription.
     */
    @JsonProperty(value = "endpointUrl")
    private String endpointUrl;

    /**
     * Get the endpointUrl property: The URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointUrl value.
     */
    public String endpointUrl() {
        return this.endpointUrl;
    }

    /**
     * Set the endpointUrl property: The URL that represents the endpoint of the destination of an event subscription.
     *
     * @param endpointUrl the endpointUrl value to set.
     * @return the EventSubscriptionFullUrlInner object itself.
     */
    public EventSubscriptionFullUrlInner withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}