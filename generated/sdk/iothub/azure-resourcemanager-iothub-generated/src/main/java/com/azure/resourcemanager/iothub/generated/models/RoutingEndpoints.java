// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties related to the custom endpoints to which your IoT hub routes messages based on the routing rules. A
 * maximum of 10 custom endpoints are allowed across all endpoint types for paid hubs and only 1 custom endpoint is
 * allowed across all endpoint types for free hubs.
 */
@Fluent
public final class RoutingEndpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingEndpoints.class);

    /*
     * The list of Service Bus queue endpoints that IoT hub routes the messages
     * to, based on the routing rules.
     */
    @JsonProperty(value = "serviceBusQueues")
    private List<RoutingServiceBusQueueEndpointProperties> serviceBusQueues;

    /*
     * The list of Service Bus topic endpoints that the IoT hub routes the
     * messages to, based on the routing rules.
     */
    @JsonProperty(value = "serviceBusTopics")
    private List<RoutingServiceBusTopicEndpointProperties> serviceBusTopics;

    /*
     * The list of Event Hubs endpoints that IoT hub routes messages to, based
     * on the routing rules. This list does not include the built-in Event Hubs
     * endpoint.
     */
    @JsonProperty(value = "eventHubs")
    private List<RoutingEventHubProperties> eventHubs;

    /*
     * The list of storage container endpoints that IoT hub routes messages to,
     * based on the routing rules.
     */
    @JsonProperty(value = "storageContainers")
    private List<RoutingStorageContainerProperties> storageContainers;

    /**
     * Get the serviceBusQueues property: The list of Service Bus queue endpoints that IoT hub routes the messages to,
     * based on the routing rules.
     *
     * @return the serviceBusQueues value.
     */
    public List<RoutingServiceBusQueueEndpointProperties> serviceBusQueues() {
        return this.serviceBusQueues;
    }

    /**
     * Set the serviceBusQueues property: The list of Service Bus queue endpoints that IoT hub routes the messages to,
     * based on the routing rules.
     *
     * @param serviceBusQueues the serviceBusQueues value to set.
     * @return the RoutingEndpoints object itself.
     */
    public RoutingEndpoints withServiceBusQueues(List<RoutingServiceBusQueueEndpointProperties> serviceBusQueues) {
        this.serviceBusQueues = serviceBusQueues;
        return this;
    }

    /**
     * Get the serviceBusTopics property: The list of Service Bus topic endpoints that the IoT hub routes the messages
     * to, based on the routing rules.
     *
     * @return the serviceBusTopics value.
     */
    public List<RoutingServiceBusTopicEndpointProperties> serviceBusTopics() {
        return this.serviceBusTopics;
    }

    /**
     * Set the serviceBusTopics property: The list of Service Bus topic endpoints that the IoT hub routes the messages
     * to, based on the routing rules.
     *
     * @param serviceBusTopics the serviceBusTopics value to set.
     * @return the RoutingEndpoints object itself.
     */
    public RoutingEndpoints withServiceBusTopics(List<RoutingServiceBusTopicEndpointProperties> serviceBusTopics) {
        this.serviceBusTopics = serviceBusTopics;
        return this;
    }

    /**
     * Get the eventHubs property: The list of Event Hubs endpoints that IoT hub routes messages to, based on the
     * routing rules. This list does not include the built-in Event Hubs endpoint.
     *
     * @return the eventHubs value.
     */
    public List<RoutingEventHubProperties> eventHubs() {
        return this.eventHubs;
    }

    /**
     * Set the eventHubs property: The list of Event Hubs endpoints that IoT hub routes messages to, based on the
     * routing rules. This list does not include the built-in Event Hubs endpoint.
     *
     * @param eventHubs the eventHubs value to set.
     * @return the RoutingEndpoints object itself.
     */
    public RoutingEndpoints withEventHubs(List<RoutingEventHubProperties> eventHubs) {
        this.eventHubs = eventHubs;
        return this;
    }

    /**
     * Get the storageContainers property: The list of storage container endpoints that IoT hub routes messages to,
     * based on the routing rules.
     *
     * @return the storageContainers value.
     */
    public List<RoutingStorageContainerProperties> storageContainers() {
        return this.storageContainers;
    }

    /**
     * Set the storageContainers property: The list of storage container endpoints that IoT hub routes messages to,
     * based on the routing rules.
     *
     * @param storageContainers the storageContainers value to set.
     * @return the RoutingEndpoints object itself.
     */
    public RoutingEndpoints withStorageContainers(List<RoutingStorageContainerProperties> storageContainers) {
        this.storageContainers = storageContainers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceBusQueues() != null) {
            serviceBusQueues().forEach(e -> e.validate());
        }
        if (serviceBusTopics() != null) {
            serviceBusTopics().forEach(e -> e.validate());
        }
        if (eventHubs() != null) {
            eventHubs().forEach(e -> e.validate());
        }
        if (storageContainers() != null) {
            storageContainers().forEach(e -> e.validate());
        }
    }
}
