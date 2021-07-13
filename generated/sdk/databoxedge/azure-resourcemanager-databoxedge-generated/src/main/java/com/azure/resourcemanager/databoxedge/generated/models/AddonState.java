// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AddonState. */
public final class AddonState extends ExpandableStringEnum<AddonState> {
    /** Static value Invalid for AddonState. */
    public static final AddonState INVALID = fromString("Invalid");

    /** Static value Creating for AddonState. */
    public static final AddonState CREATING = fromString("Creating");

    /** Static value Created for AddonState. */
    public static final AddonState CREATED = fromString("Created");

    /** Static value Updating for AddonState. */
    public static final AddonState UPDATING = fromString("Updating");

    /** Static value Reconfiguring for AddonState. */
    public static final AddonState RECONFIGURING = fromString("Reconfiguring");

    /** Static value Failed for AddonState. */
    public static final AddonState FAILED = fromString("Failed");

    /** Static value Deleting for AddonState. */
    public static final AddonState DELETING = fromString("Deleting");

    /**
     * Creates or finds a AddonState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AddonState.
     */
    @JsonCreator
    public static AddonState fromString(String name) {
        return fromString(name, AddonState.class);
    }

    /** @return known AddonState values. */
    public static Collection<AddonState> values() {
        return values(AddonState.class);
    }
}