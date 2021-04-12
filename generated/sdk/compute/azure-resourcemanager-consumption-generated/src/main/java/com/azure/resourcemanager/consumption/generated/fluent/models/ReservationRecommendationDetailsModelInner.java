// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsResourceProperties;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsSavingsProperties;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsUsageProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Reservation recommendation details. */
@JsonFlatten
@Fluent
public class ReservationRecommendationDetailsModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReservationRecommendationDetailsModelInner.class);

    /*
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource sku
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * An ISO 4217 currency code identifier for the costs and savings
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * Resource specific properties.
     */
    @JsonProperty(value = "properties.resource", access = JsonProperty.Access.WRITE_ONLY)
    private ReservationRecommendationDetailsResourceProperties resource;

    /*
     * Resource Group.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * Savings information for the recommendation.
     */
    @JsonProperty(value = "properties.savings", access = JsonProperty.Access.WRITE_ONLY)
    private ReservationRecommendationDetailsSavingsProperties savings;

    /*
     * Scope of the reservation, ex: Single or Shared.
     */
    @JsonProperty(value = "properties.scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /*
     * Historical usage details used to calculate the estimated savings.
     */
    @JsonProperty(value = "properties.usage", access = JsonProperty.Access.WRITE_ONLY)
    private ReservationRecommendationDetailsUsageProperties usage;

    /*
     * Resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     *
     * @param location the location value to set.
     * @return the ReservationRecommendationDetailsModelInner object itself.
     */
    public ReservationRecommendationDetailsModelInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku property: Resource sku.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Resource sku.
     *
     * @param sku the sku value to set.
     * @return the ReservationRecommendationDetailsModelInner object itself.
     */
    public ReservationRecommendationDetailsModelInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the currency property: An ISO 4217 currency code identifier for the costs and savings.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the resource property: Resource specific properties.
     *
     * @return the resource value.
     */
    public ReservationRecommendationDetailsResourceProperties resource() {
        return this.resource;
    }

    /**
     * Get the resourceGroup property: Resource Group.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the savings property: Savings information for the recommendation.
     *
     * @return the savings value.
     */
    public ReservationRecommendationDetailsSavingsProperties savings() {
        return this.savings;
    }

    /**
     * Get the scope property: Scope of the reservation, ex: Single or Shared.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Get the usage property: Historical usage details used to calculate the estimated savings.
     *
     * @return the usage value.
     */
    public ReservationRecommendationDetailsUsageProperties usage() {
        return this.usage;
    }

    /**
     * Get the etag property: Resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
        if (savings() != null) {
            savings().validate();
        }
        if (usage() != null) {
            usage().validate();
        }
    }
}
