// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Describes the offer term. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "Name",
    defaultImpl = OfferTermInfo.class)
@JsonTypeName("OfferTermInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Monetary Credit", value = MonetaryCredit.class),
    @JsonSubTypes.Type(name = "Monetary Commitment", value = MonetaryCommitment.class),
    @JsonSubTypes.Type(name = "Recurring Charge", value = RecurringCharge.class)
})
@Fluent
public class OfferTermInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OfferTermInfo.class);

    /*
     * Indicates the date from which the offer term is effective.
     */
    @JsonProperty(value = "EffectiveDate")
    private OffsetDateTime effectiveDate;

    /**
     * Get the effectiveDate property: Indicates the date from which the offer term is effective.
     *
     * @return the effectiveDate value.
     */
    public OffsetDateTime effectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Set the effectiveDate property: Indicates the date from which the offer term is effective.
     *
     * @param effectiveDate the effectiveDate value to set.
     * @return the OfferTermInfo object itself.
     */
    public OfferTermInfo withEffectiveDate(OffsetDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
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
