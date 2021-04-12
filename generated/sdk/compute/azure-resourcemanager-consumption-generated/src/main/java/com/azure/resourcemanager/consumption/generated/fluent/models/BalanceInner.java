// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.models.BalancePropertiesAdjustmentDetailsItem;
import com.azure.resourcemanager.consumption.generated.models.BalancePropertiesNewPurchasesDetailsItem;
import com.azure.resourcemanager.consumption.generated.models.BillingFrequency;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/** A balance resource. */
@JsonFlatten
@Fluent
public class BalanceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BalanceInner.class);

    /*
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * The beginning balance for the billing period.
     */
    @JsonProperty(value = "properties.beginningBalance", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal beginningBalance;

    /*
     * The ending balance for the billing period (for open periods this will be
     * updated daily).
     */
    @JsonProperty(value = "properties.endingBalance", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal endingBalance;

    /*
     * Total new purchase amount.
     */
    @JsonProperty(value = "properties.newPurchases", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal newPurchases;

    /*
     * Total adjustment amount.
     */
    @JsonProperty(value = "properties.adjustments", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal adjustments;

    /*
     * Total Commitment usage.
     */
    @JsonProperty(value = "properties.utilized", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal utilized;

    /*
     * Overage for Azure services.
     */
    @JsonProperty(value = "properties.serviceOverage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal serviceOverage;

    /*
     * Charges Billed separately.
     */
    @JsonProperty(value = "properties.chargesBilledSeparately", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal chargesBilledSeparately;

    /*
     * serviceOverage + chargesBilledSeparately.
     */
    @JsonProperty(value = "properties.totalOverage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalOverage;

    /*
     * Azure service commitment + total Overage.
     */
    @JsonProperty(value = "properties.totalUsage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalUsage;

    /*
     * Total charges for Azure Marketplace.
     */
    @JsonProperty(value = "properties.azureMarketplaceServiceCharges", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal azureMarketplaceServiceCharges;

    /*
     * The billing frequency.
     */
    @JsonProperty(value = "properties.billingFrequency")
    private BillingFrequency billingFrequency;

    /*
     * Price is hidden or not.
     */
    @JsonProperty(value = "properties.priceHidden", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean priceHidden;

    /*
     * List of new purchases.
     */
    @JsonProperty(value = "properties.newPurchasesDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<BalancePropertiesNewPurchasesDetailsItem> newPurchasesDetails;

    /*
     * List of Adjustments (Promo credit, SIE credit etc.).
     */
    @JsonProperty(value = "properties.adjustmentDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<BalancePropertiesAdjustmentDetailsItem> adjustmentDetails;

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
     * Get the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the beginningBalance property: The beginning balance for the billing period.
     *
     * @return the beginningBalance value.
     */
    public BigDecimal beginningBalance() {
        return this.beginningBalance;
    }

    /**
     * Get the endingBalance property: The ending balance for the billing period (for open periods this will be updated
     * daily).
     *
     * @return the endingBalance value.
     */
    public BigDecimal endingBalance() {
        return this.endingBalance;
    }

    /**
     * Get the newPurchases property: Total new purchase amount.
     *
     * @return the newPurchases value.
     */
    public BigDecimal newPurchases() {
        return this.newPurchases;
    }

    /**
     * Get the adjustments property: Total adjustment amount.
     *
     * @return the adjustments value.
     */
    public BigDecimal adjustments() {
        return this.adjustments;
    }

    /**
     * Get the utilized property: Total Commitment usage.
     *
     * @return the utilized value.
     */
    public BigDecimal utilized() {
        return this.utilized;
    }

    /**
     * Get the serviceOverage property: Overage for Azure services.
     *
     * @return the serviceOverage value.
     */
    public BigDecimal serviceOverage() {
        return this.serviceOverage;
    }

    /**
     * Get the chargesBilledSeparately property: Charges Billed separately.
     *
     * @return the chargesBilledSeparately value.
     */
    public BigDecimal chargesBilledSeparately() {
        return this.chargesBilledSeparately;
    }

    /**
     * Get the totalOverage property: serviceOverage + chargesBilledSeparately.
     *
     * @return the totalOverage value.
     */
    public BigDecimal totalOverage() {
        return this.totalOverage;
    }

    /**
     * Get the totalUsage property: Azure service commitment + total Overage.
     *
     * @return the totalUsage value.
     */
    public BigDecimal totalUsage() {
        return this.totalUsage;
    }

    /**
     * Get the azureMarketplaceServiceCharges property: Total charges for Azure Marketplace.
     *
     * @return the azureMarketplaceServiceCharges value.
     */
    public BigDecimal azureMarketplaceServiceCharges() {
        return this.azureMarketplaceServiceCharges;
    }

    /**
     * Get the billingFrequency property: The billing frequency.
     *
     * @return the billingFrequency value.
     */
    public BillingFrequency billingFrequency() {
        return this.billingFrequency;
    }

    /**
     * Set the billingFrequency property: The billing frequency.
     *
     * @param billingFrequency the billingFrequency value to set.
     * @return the BalanceInner object itself.
     */
    public BalanceInner withBillingFrequency(BillingFrequency billingFrequency) {
        this.billingFrequency = billingFrequency;
        return this;
    }

    /**
     * Get the priceHidden property: Price is hidden or not.
     *
     * @return the priceHidden value.
     */
    public Boolean priceHidden() {
        return this.priceHidden;
    }

    /**
     * Get the newPurchasesDetails property: List of new purchases.
     *
     * @return the newPurchasesDetails value.
     */
    public List<BalancePropertiesNewPurchasesDetailsItem> newPurchasesDetails() {
        return this.newPurchasesDetails;
    }

    /**
     * Get the adjustmentDetails property: List of Adjustments (Promo credit, SIE credit etc.).
     *
     * @return the adjustmentDetails value.
     */
    public List<BalancePropertiesAdjustmentDetailsItem> adjustmentDetails() {
        return this.adjustmentDetails;
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
        if (newPurchasesDetails() != null) {
            newPurchasesDetails().forEach(e -> e.validate());
        }
        if (adjustmentDetails() != null) {
            adjustmentDetails().forEach(e -> e.validate());
        }
    }
}
