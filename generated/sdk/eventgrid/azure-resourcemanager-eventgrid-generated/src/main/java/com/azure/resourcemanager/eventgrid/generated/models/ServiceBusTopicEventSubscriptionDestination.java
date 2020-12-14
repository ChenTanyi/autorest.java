// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about the service bus topic destination for an event subscription. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("ServiceBusTopic")
@JsonFlatten
@Fluent
public class ServiceBusTopicEventSubscriptionDestination extends EventSubscriptionDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceBusTopicEventSubscriptionDestination.class);

    /*
     * The Azure Resource Id that represents the endpoint of the Service Bus
     * Topic destination of an event subscription.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of the Service Bus Topic
     * destination of an event subscription.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of the Service Bus Topic
     * destination of an event subscription.
     *
     * @param resourceId the resourceId value to set.
     * @return the ServiceBusTopicEventSubscriptionDestination object itself.
     */
    public ServiceBusTopicEventSubscriptionDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
