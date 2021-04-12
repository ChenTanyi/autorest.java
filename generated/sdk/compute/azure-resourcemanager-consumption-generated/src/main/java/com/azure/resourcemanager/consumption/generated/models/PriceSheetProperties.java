// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.UUID;

/** The properties of the price sheet. */
@Immutable
public final class PriceSheetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PriceSheetProperties.class);

    /*
     * The id of the billing period resource that the usage belongs to.
     */
    @JsonProperty(value = "billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /*
     * The meter id (GUID)
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /*
     * The details about the meter. By default this is not populated, unless
     * it's specified in $expand.
     */
    @JsonProperty(value = "meterDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MeterDetails meterDetails;

    /*
     * Unit of measure
     */
    @JsonProperty(value = "unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /*
     * Included quality for an offer
     */
    @JsonProperty(value = "includedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal includedQuantity;

    /*
     * Part Number
     */
    @JsonProperty(value = "partNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String partNumber;

    /*
     * Unit Price
     */
    @JsonProperty(value = "unitPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal unitPrice;

    /*
     * Currency Code
     */
    @JsonProperty(value = "currencyCode", access = JsonProperty.Access.WRITE_ONLY)
    private String currencyCode;

    /*
     * Offer Id
     */
    @JsonProperty(value = "offerId", access = JsonProperty.Access.WRITE_ONLY)
    private String offerId;

    /**
     * Get the billingPeriodId property: The id of the billing period resource that the usage belongs to.
     *
     * @return the billingPeriodId value.
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
    }

    /**
     * Get the meterId property: The meter id (GUID).
     *
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the meterDetails property: The details about the meter. By default this is not populated, unless it's
     * specified in $expand.
     *
     * @return the meterDetails value.
     */
    public MeterDetails meterDetails() {
        return this.meterDetails;
    }

    /**
     * Get the unitOfMeasure property: Unit of measure.
     *
     * @return the unitOfMeasure value.
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get the includedQuantity property: Included quality for an offer.
     *
     * @return the includedQuantity value.
     */
    public BigDecimal includedQuantity() {
        return this.includedQuantity;
    }

    /**
     * Get the partNumber property: Part Number.
     *
     * @return the partNumber value.
     */
    public String partNumber() {
        return this.partNumber;
    }

    /**
     * Get the unitPrice property: Unit Price.
     *
     * @return the unitPrice value.
     */
    public BigDecimal unitPrice() {
        return this.unitPrice;
    }

    /**
     * Get the currencyCode property: Currency Code.
     *
     * @return the currencyCode value.
     */
    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Get the offerId property: Offer Id.
     *
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (meterDetails() != null) {
            meterDetails().validate();
        }
    }
}
