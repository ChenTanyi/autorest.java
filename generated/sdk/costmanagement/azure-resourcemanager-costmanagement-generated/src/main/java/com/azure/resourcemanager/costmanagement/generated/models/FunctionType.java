// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FunctionType. */
public final class FunctionType extends ExpandableStringEnum<FunctionType> {
    /** Static value Sum for FunctionType. */
    public static final FunctionType SUM = fromString("Sum");

    /**
     * Creates or finds a FunctionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FunctionType.
     */
    @JsonCreator
    public static FunctionType fromString(String name) {
        return fromString(name, FunctionType.class);
    }

    /** @return known FunctionType values. */
    public static Collection<FunctionType> values() {
        return values(FunctionType.class);
    }
}