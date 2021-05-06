// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;

/** reservation summary resource. */
@JsonFlatten
@Immutable
public class ReservationSummaryInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReservationSummaryInner.class);

    /*
     * The reservation order ID is the identifier for a reservation purchase.
     * Each reservation order ID represents a single purchase transaction. A
     * reservation order contains reservations. The reservation order specifies
     * the VM size and region for the reservations.
     */
    @JsonProperty(value = "properties.reservationOrderId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationOrderId;

    /*
     * The reservation ID is the identifier of a reservation within a
     * reservation order. Each reservation is the grouping for applying the
     * benefit scope and also specifies the number of instances to which the
     * reservation benefit can be applied to.
     */
    @JsonProperty(value = "properties.reservationId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationId;

    /*
     * This is the ARM Sku name. It can be used to join with the serviceType
     * field in additional info in usage records.
     */
    @JsonProperty(value = "properties.skuName", access = JsonProperty.Access.WRITE_ONLY)
    private String skuName;

    /*
     * This is the total hours reserved. E.g. if reservation for 1 instance was
     * made on 1 PM, this will be 11 hours for that day and 24 hours from
     * subsequent days
     */
    @JsonProperty(value = "properties.reservedHours", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal reservedHours;

    /*
     * Data corresponding to the utilization record. If the grain of data is
     * monthly, it will be first day of month.
     */
    @JsonProperty(value = "properties.usageDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageDate;

    /*
     * Total used hours by the reservation
     */
    @JsonProperty(value = "properties.usedHours", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal usedHours;

    /*
     * This is the minimum hourly utilization in the usage time (day or month).
     * E.g. if usage record corresponds to 12/10/2017 and on that for hour 4
     * and 5, utilization was 10%, this field will return 10% for that day
     */
    @JsonProperty(value = "properties.minUtilizationPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal minUtilizationPercentage;

    /*
     * This is average utilization for the entire time range. (day or month
     * depending on the grain)
     */
    @JsonProperty(value = "properties.avgUtilizationPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal avgUtilizationPercentage;

    /*
     * This is the maximum hourly utilization in the usage time (day or month).
     * E.g. if usage record corresponds to 12/10/2017 and on that for hour 4
     * and 5, utilization was 100%, this field will return 100% for that day.
     */
    @JsonProperty(value = "properties.maxUtilizationPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal maxUtilizationPercentage;

    /*
     * The reservation kind.
     */
    @JsonProperty(value = "properties.kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * This is the purchased quantity for the reservationId.
     */
    @JsonProperty(value = "properties.purchasedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal purchasedQuantity;

    /*
     * This is the remaining quantity for the reservationId.
     */
    @JsonProperty(value = "properties.remainingQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal remainingQuantity;

    /*
     * This is the total count of instances that are reserved for the
     * reservationId.
     */
    @JsonProperty(value = "properties.totalReservedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalReservedQuantity;

    /*
     * This is the used quantity for the reservationId.
     */
    @JsonProperty(value = "properties.usedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal usedQuantity;

    /*
     * This is the utilized percentage for the reservation Id.
     */
    @JsonProperty(value = "properties.utilizedPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal utilizedPercentage;

    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the reservationOrderId property: The reservation order ID is the identifier for a reservation purchase. Each
     * reservation order ID represents a single purchase transaction. A reservation order contains reservations. The
     * reservation order specifies the VM size and region for the reservations.
     *
     * @return the reservationOrderId value.
     */
    public String reservationOrderId() {
        return this.reservationOrderId;
    }

    /**
     * Get the reservationId property: The reservation ID is the identifier of a reservation within a reservation order.
     * Each reservation is the grouping for applying the benefit scope and also specifies the number of instances to
     * which the reservation benefit can be applied to.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the skuName property: This is the ARM Sku name. It can be used to join with the serviceType field in
     * additional info in usage records.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Get the reservedHours property: This is the total hours reserved. E.g. if reservation for 1 instance was made on
     * 1 PM, this will be 11 hours for that day and 24 hours from subsequent days.
     *
     * @return the reservedHours value.
     */
    public BigDecimal reservedHours() {
        return this.reservedHours;
    }

    /**
     * Get the usageDate property: Data corresponding to the utilization record. If the grain of data is monthly, it
     * will be first day of month.
     *
     * @return the usageDate value.
     */
    public OffsetDateTime usageDate() {
        return this.usageDate;
    }

    /**
     * Get the usedHours property: Total used hours by the reservation.
     *
     * @return the usedHours value.
     */
    public BigDecimal usedHours() {
        return this.usedHours;
    }

    /**
     * Get the minUtilizationPercentage property: This is the minimum hourly utilization in the usage time (day or
     * month). E.g. if usage record corresponds to 12/10/2017 and on that for hour 4 and 5, utilization was 10%, this
     * field will return 10% for that day.
     *
     * @return the minUtilizationPercentage value.
     */
    public BigDecimal minUtilizationPercentage() {
        return this.minUtilizationPercentage;
    }

    /**
     * Get the avgUtilizationPercentage property: This is average utilization for the entire time range. (day or month
     * depending on the grain).
     *
     * @return the avgUtilizationPercentage value.
     */
    public BigDecimal avgUtilizationPercentage() {
        return this.avgUtilizationPercentage;
    }

    /**
     * Get the maxUtilizationPercentage property: This is the maximum hourly utilization in the usage time (day or
     * month). E.g. if usage record corresponds to 12/10/2017 and on that for hour 4 and 5, utilization was 100%, this
     * field will return 100% for that day.
     *
     * @return the maxUtilizationPercentage value.
     */
    public BigDecimal maxUtilizationPercentage() {
        return this.maxUtilizationPercentage;
    }

    /**
     * Get the kind property: The reservation kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the purchasedQuantity property: This is the purchased quantity for the reservationId.
     *
     * @return the purchasedQuantity value.
     */
    public BigDecimal purchasedQuantity() {
        return this.purchasedQuantity;
    }

    /**
     * Get the remainingQuantity property: This is the remaining quantity for the reservationId.
     *
     * @return the remainingQuantity value.
     */
    public BigDecimal remainingQuantity() {
        return this.remainingQuantity;
    }

    /**
     * Get the totalReservedQuantity property: This is the total count of instances that are reserved for the
     * reservationId.
     *
     * @return the totalReservedQuantity value.
     */
    public BigDecimal totalReservedQuantity() {
        return this.totalReservedQuantity;
    }

    /**
     * Get the usedQuantity property: This is the used quantity for the reservationId.
     *
     * @return the usedQuantity value.
     */
    public BigDecimal usedQuantity() {
        return this.usedQuantity;
    }

    /**
     * Get the utilizedPercentage property: This is the utilized percentage for the reservation Id.
     *
     * @return the utilizedPercentage value.
     */
    public BigDecimal utilizedPercentage() {
        return this.utilizedPercentage;
    }

    /**
     * Get the etag property: The etag for the resource.
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
    }
}
