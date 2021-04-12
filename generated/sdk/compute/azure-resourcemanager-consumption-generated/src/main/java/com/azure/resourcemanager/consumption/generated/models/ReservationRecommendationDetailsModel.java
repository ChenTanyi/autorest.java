// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationRecommendationDetailsModelInner;
import java.util.Map;

/** An immutable client-side representation of ReservationRecommendationDetailsModel. */
public interface ReservationRecommendationDetailsModel {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: Resource Location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the sku property: Resource sku.
     *
     * @return the sku value.
     */
    String sku();

    /**
     * Gets the currency property: An ISO 4217 currency code identifier for the costs and savings.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the resource property: Resource specific properties.
     *
     * @return the resource value.
     */
    ReservationRecommendationDetailsResourceProperties resource();

    /**
     * Gets the resourceGroup property: Resource Group.
     *
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * Gets the savings property: Savings information for the recommendation.
     *
     * @return the savings value.
     */
    ReservationRecommendationDetailsSavingsProperties savings();

    /**
     * Gets the scope property: Scope of the reservation, ex: Single or Shared.
     *
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the usage property: Historical usage details used to calculate the estimated savings.
     *
     * @return the usage value.
     */
    ReservationRecommendationDetailsUsageProperties usage();

    /**
     * Gets the etag property: Resource etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner
     * com.azure.resourcemanager.consumption.generated.fluent.models.ReservationRecommendationDetailsModelInner object.
     *
     * @return the inner object.
     */
    ReservationRecommendationDetailsModelInner innerModel();
}
