// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertOperator. */
public final class AlertOperator extends ExpandableStringEnum<AlertOperator> {
    /** Static value None for AlertOperator. */
    public static final AlertOperator NONE = fromString("None");

    /** Static value EqualTo for AlertOperator. */
    public static final AlertOperator EQUAL_TO = fromString("EqualTo");

    /** Static value GreaterThan for AlertOperator. */
    public static final AlertOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqualTo for AlertOperator. */
    public static final AlertOperator GREATER_THAN_OR_EQUAL_TO = fromString("GreaterThanOrEqualTo");

    /** Static value LessThan for AlertOperator. */
    public static final AlertOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqualTo for AlertOperator. */
    public static final AlertOperator LESS_THAN_OR_EQUAL_TO = fromString("LessThanOrEqualTo");

    /**
     * Creates or finds a AlertOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertOperator.
     */
    @JsonCreator
    public static AlertOperator fromString(String name) {
        return fromString(name, AlertOperator.class);
    }

    /** @return known AlertOperator values. */
    public static Collection<AlertOperator> values() {
        return values(AlertOperator.class);
    }
}
