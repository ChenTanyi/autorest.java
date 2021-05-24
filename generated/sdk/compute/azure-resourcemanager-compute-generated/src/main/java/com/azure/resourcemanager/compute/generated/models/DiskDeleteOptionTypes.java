// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DiskDeleteOptionTypes. */
public final class DiskDeleteOptionTypes extends ExpandableStringEnum<DiskDeleteOptionTypes> {
    /** Static value Delete for DiskDeleteOptionTypes. */
    public static final DiskDeleteOptionTypes DELETE = fromString("Delete");

    /** Static value Detach for DiskDeleteOptionTypes. */
    public static final DiskDeleteOptionTypes DETACH = fromString("Detach");

    /**
     * Creates or finds a DiskDeleteOptionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskDeleteOptionTypes.
     */
    @JsonCreator
    public static DiskDeleteOptionTypes fromString(String name) {
        return fromString(name, DiskDeleteOptionTypes.class);
    }

    /** @return known DiskDeleteOptionTypes values. */
    public static Collection<DiskDeleteOptionTypes> values() {
        return values(DiskDeleteOptionTypes.class);
    }
}