// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Premier add-on. */
@JsonFlatten
@Fluent
public class PremierAddOnInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PremierAddOnInner.class);

    /*
     * Premier add on SKU.
     */
    @JsonProperty(value = "properties.sku")
    private String sku;

    /*
     * Premier add on Product.
     */
    @JsonProperty(value = "properties.product")
    private String product;

    /*
     * Premier add on Vendor.
     */
    @JsonProperty(value = "properties.vendor")
    private String vendor;

    /*
     * Premier add on Marketplace publisher.
     */
    @JsonProperty(value = "properties.marketplacePublisher")
    private String marketplacePublisher;

    /*
     * Premier add on Marketplace offer.
     */
    @JsonProperty(value = "properties.marketplaceOffer")
    private String marketplaceOffer;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the sku property: Premier add on SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Premier add on SKU.
     *
     * @param sku the sku value to set.
     * @return the PremierAddOnInner object itself.
     */
    public PremierAddOnInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the product property: Premier add on Product.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Premier add on Product.
     *
     * @param product the product value to set.
     * @return the PremierAddOnInner object itself.
     */
    public PremierAddOnInner withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the vendor property: Premier add on Vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: Premier add on Vendor.
     *
     * @param vendor the vendor value to set.
     * @return the PremierAddOnInner object itself.
     */
    public PremierAddOnInner withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the marketplacePublisher property: Premier add on Marketplace publisher.
     *
     * @return the marketplacePublisher value.
     */
    public String marketplacePublisher() {
        return this.marketplacePublisher;
    }

    /**
     * Set the marketplacePublisher property: Premier add on Marketplace publisher.
     *
     * @param marketplacePublisher the marketplacePublisher value to set.
     * @return the PremierAddOnInner object itself.
     */
    public PremierAddOnInner withMarketplacePublisher(String marketplacePublisher) {
        this.marketplacePublisher = marketplacePublisher;
        return this;
    }

    /**
     * Get the marketplaceOffer property: Premier add on Marketplace offer.
     *
     * @return the marketplaceOffer value.
     */
    public String marketplaceOffer() {
        return this.marketplaceOffer;
    }

    /**
     * Set the marketplaceOffer property: Premier add on Marketplace offer.
     *
     * @param marketplaceOffer the marketplaceOffer value to set.
     * @return the PremierAddOnInner object itself.
     */
    public PremierAddOnInner withMarketplaceOffer(String marketplaceOffer) {
        this.marketplaceOffer = marketplaceOffer;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the PremierAddOnInner object itself.
     */
    public PremierAddOnInner withKind(String kind) {
        this.kind = kind;
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
