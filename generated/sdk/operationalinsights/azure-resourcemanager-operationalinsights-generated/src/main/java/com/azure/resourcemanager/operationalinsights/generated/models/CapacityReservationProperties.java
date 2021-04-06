// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Capacity Reservation properties. */
@Immutable
public final class CapacityReservationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityReservationProperties.class);

    /*
     * The last time Sku was updated.
     */
    @JsonProperty(value = "lastSkuUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private String lastSkuUpdate;

    /*
     * Minimum CapacityReservation value in GB.
     */
    @JsonProperty(value = "minCapacity", access = JsonProperty.Access.WRITE_ONLY)
    private Long minCapacity;

    /*
     * Maximum CapacityReservation value in GB.
     */
    @JsonProperty(value = "maxCapacity", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxCapacity;

    /**
     * Get the lastSkuUpdate property: The last time Sku was updated.
     *
     * @return the lastSkuUpdate value.
     */
    public String lastSkuUpdate() {
        return this.lastSkuUpdate;
    }

    /**
     * Get the minCapacity property: Minimum CapacityReservation value in GB.
     *
     * @return the minCapacity value.
     */
    public Long minCapacity() {
        return this.minCapacity;
    }

    /**
     * Get the maxCapacity property: Maximum CapacityReservation value in GB.
     *
     * @return the maxCapacity value.
     */
    public Long maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
