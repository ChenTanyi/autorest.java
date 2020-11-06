// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.resourcemanager.postgresql.generated.fluent.models.PerformanceTierPropertiesInner;
import java.util.List;

/** An immutable client-side representation of PerformanceTierProperties. */
public interface PerformanceTierProperties {
    /**
     * Gets the id property: ID of the performance tier.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the serviceLevelObjectives property: Service level objectives associated with the performance tier.
     *
     * @return the serviceLevelObjectives value.
     */
    List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives();

    /**
     * Gets the inner com.azure.resourcemanager.postgresql.generated.fluent.models.PerformanceTierPropertiesInner
     * object.
     *
     * @return the inner object.
     */
    PerformanceTierPropertiesInner innerModel();
}
