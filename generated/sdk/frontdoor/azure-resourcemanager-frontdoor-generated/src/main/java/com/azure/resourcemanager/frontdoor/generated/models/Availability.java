// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Availability. */
public final class Availability extends ExpandableStringEnum<Availability> {
    /** Static value Available for Availability. */
    public static final Availability AVAILABLE = fromString("Available");

    /** Static value Unavailable for Availability. */
    public static final Availability UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates or finds a Availability from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Availability.
     */
    @JsonCreator
    public static Availability fromString(String name) {
        return fromString(name, Availability.class);
    }

    /** @return known Availability values. */
    public static Collection<Availability> values() {
        return values(Availability.class);
    }
}
