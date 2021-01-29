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
import java.util.List;

/** Information about the azure function destination for an event subscription. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("AzureFunction")
@JsonFlatten
@Fluent
public class AzureFunctionEventSubscriptionDestination extends EventSubscriptionDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFunctionEventSubscriptionDestination.class);

    /*
     * The Azure Resource Id that represents the endpoint of the Azure Function
     * destination of an event subscription.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /*
     * Maximum number of events per batch.
     */
    @JsonProperty(value = "properties.maxEventsPerBatch")
    private Integer maxEventsPerBatch;

    /*
     * Preferred batch size in Kilobytes.
     */
    @JsonProperty(value = "properties.preferredBatchSizeInKilobytes")
    private Integer preferredBatchSizeInKilobytes;

    /*
     * Delivery attribute details.
     */
    @JsonProperty(value = "properties.deliveryAttributeMappings")
    private List<DeliveryAttributeMapping> deliveryAttributeMappings;

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     *
     * @param resourceId the resourceId value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @return the maxEventsPerBatch value.
     */
    public Integer maxEventsPerBatch() {
        return this.maxEventsPerBatch;
    }

    /**
     * Set the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @param maxEventsPerBatch the maxEventsPerBatch value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withMaxEventsPerBatch(Integer maxEventsPerBatch) {
        this.maxEventsPerBatch = maxEventsPerBatch;
        return this;
    }

    /**
     * Get the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @return the preferredBatchSizeInKilobytes value.
     */
    public Integer preferredBatchSizeInKilobytes() {
        return this.preferredBatchSizeInKilobytes;
    }

    /**
     * Set the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @param preferredBatchSizeInKilobytes the preferredBatchSizeInKilobytes value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withPreferredBatchSizeInKilobytes(
        Integer preferredBatchSizeInKilobytes) {
        this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
        return this;
    }

    /**
     * Get the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @return the deliveryAttributeMappings value.
     */
    public List<DeliveryAttributeMapping> deliveryAttributeMappings() {
        return this.deliveryAttributeMappings;
    }

    /**
     * Set the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @param deliveryAttributeMappings the deliveryAttributeMappings value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withDeliveryAttributeMappings(
        List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        this.deliveryAttributeMappings = deliveryAttributeMappings;
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
        if (deliveryAttributeMappings() != null) {
            deliveryAttributeMappings().forEach(e -> e.validate());
        }
    }
}
