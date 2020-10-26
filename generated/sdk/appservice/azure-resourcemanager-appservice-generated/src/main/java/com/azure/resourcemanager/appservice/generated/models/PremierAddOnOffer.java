// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.PremierAddOnOfferInner;

/** An immutable client-side representation of PremierAddOnOffer. */
@Immutable
public interface PremierAddOnOffer {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the sku property: Premier add on SKU.
     *
     * @return the sku value.
     */
    String sku();

    /**
     * Gets the product property: Premier add on offer Product.
     *
     * @return the product value.
     */
    String product();

    /**
     * Gets the vendor property: Premier add on offer Vendor.
     *
     * @return the vendor value.
     */
    String vendor();

    /**
     * Gets the promoCodeRequired property: &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the promoCodeRequired value.
     */
    Boolean promoCodeRequired();

    /**
     * Gets the quota property: Premier add on offer Quota.
     *
     * @return the quota value.
     */
    Integer quota();

    /**
     * Gets the webHostingPlanRestrictions property: App Service plans this offer is restricted to.
     *
     * @return the webHostingPlanRestrictions value.
     */
    AppServicePlanRestrictions webHostingPlanRestrictions();

    /**
     * Gets the privacyPolicyUrl property: Privacy policy URL.
     *
     * @return the privacyPolicyUrl value.
     */
    String privacyPolicyUrl();

    /**
     * Gets the legalTermsUrl property: Legal terms URL.
     *
     * @return the legalTermsUrl value.
     */
    String legalTermsUrl();

    /**
     * Gets the marketplacePublisher property: Marketplace publisher.
     *
     * @return the marketplacePublisher value.
     */
    String marketplacePublisher();

    /**
     * Gets the marketplaceOffer property: Marketplace offer.
     *
     * @return the marketplaceOffer value.
     */
    String marketplaceOffer();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.PremierAddOnOfferInner object.
     *
     * @return the inner object.
     */
    PremierAddOnOfferInner innerModel();
}
