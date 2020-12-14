// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.resourcemanager.operationalinsights.generated.fluent.models.AvailableServiceTierInner;

/** An immutable client-side representation of AvailableServiceTier. */
public interface AvailableServiceTier {
    /**
     * Gets the serviceTier property: The name of the Service Tier.
     *
     * @return the serviceTier value.
     */
    SkuNameEnum serviceTier();

    /**
     * Gets the enabled property: True if the Service Tier is enabled for the workspace.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the minimumRetention property: The minimum retention for the Service Tier, in days.
     *
     * @return the minimumRetention value.
     */
    Long minimumRetention();

    /**
     * Gets the maximumRetention property: The maximum retention for the Service Tier, in days.
     *
     * @return the maximumRetention value.
     */
    Long maximumRetention();

    /**
     * Gets the defaultRetention property: The default retention for the Service Tier, in days.
     *
     * @return the defaultRetention value.
     */
    Long defaultRetention();

    /**
     * Gets the capacityReservationLevel property: The capacity reservation level in GB per day. Returned for the
     * Capacity Reservation Service Tier.
     *
     * @return the capacityReservationLevel value.
     */
    Long capacityReservationLevel();

    /**
     * Gets the lastSkuUpdate property: Time when the sku was last updated for the workspace. Returned for the Capacity
     * Reservation Service Tier.
     *
     * @return the lastSkuUpdate value.
     */
    String lastSkuUpdate();

    /**
     * Gets the inner com.azure.resourcemanager.operationalinsights.generated.fluent.models.AvailableServiceTierInner
     * object.
     *
     * @return the inner object.
     */
    AvailableServiceTierInner innerModel();
}
