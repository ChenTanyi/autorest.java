// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.UsageInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of Usage. */
@Immutable
public interface Usage {
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
     * Gets the displayName property: Friendly name shown in the UI.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the resourceName property: Name of the quota resource.
     *
     * @return the resourceName value.
     */
    String resourceName();

    /**
     * Gets the unit property: Units of measurement for the quota resource.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the currentValue property: The current value of the resource counter.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the limit property: The resource limit.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the nextResetTime property: Next reset time for the resource counter.
     *
     * @return the nextResetTime value.
     */
    OffsetDateTime nextResetTime();

    /**
     * Gets the computeMode property: Compute mode used for this usage.
     *
     * @return the computeMode value.
     */
    ComputeModeOptions computeMode();

    /**
     * Gets the siteMode property: Site mode used for this usage.
     *
     * @return the siteMode value.
     */
    String siteMode();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.UsageInner object.
     *
     * @return the inner object.
     */
    UsageInner innerModel();
}