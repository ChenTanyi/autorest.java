// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Grain. */
public final class Grain extends ExpandableStringEnum<Grain> {
    /** Static value Daily for Grain. */
    public static final Grain DAILY = fromString("Daily");

    /** Static value Monthly for Grain. */
    public static final Grain MONTHLY = fromString("Monthly");

    /** Static value Yearly for Grain. */
    public static final Grain YEARLY = fromString("Yearly");

    /**
     * Creates or finds a Grain from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Grain.
     */
    @JsonCreator
    public static Grain fromString(String name) {
        return fromString(name, Grain.class);
    }

    /** @return known Grain values. */
    public static Collection<Grain> values() {
        return values(Grain.class);
    }
}
