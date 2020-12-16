// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MetricType. */
public final class MetricType extends ExpandableStringEnum<MetricType> {
    /** Static value ActualCost for MetricType. */
    public static final MetricType ACTUAL_COST = fromString("ActualCost");

    /** Static value AmortizedCost for MetricType. */
    public static final MetricType AMORTIZED_COST = fromString("AmortizedCost");

    /** Static value AHUB for MetricType. */
    public static final MetricType AHUB = fromString("AHUB");

    /**
     * Creates or finds a MetricType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MetricType.
     */
    @JsonCreator
    public static MetricType fromString(String name) {
        return fromString(name, MetricType.class);
    }

    /** @return known MetricType values. */
    public static Collection<MetricType> values() {
        return values(MetricType.class);
    }
}