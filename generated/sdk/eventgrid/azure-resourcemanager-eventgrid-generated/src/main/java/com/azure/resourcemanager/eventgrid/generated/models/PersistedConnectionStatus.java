// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PersistedConnectionStatus. */
public final class PersistedConnectionStatus extends ExpandableStringEnum<PersistedConnectionStatus> {
    /** Static value Pending for PersistedConnectionStatus. */
    public static final PersistedConnectionStatus PENDING = fromString("Pending");

    /** Static value Approved for PersistedConnectionStatus. */
    public static final PersistedConnectionStatus APPROVED = fromString("Approved");

    /** Static value Rejected for PersistedConnectionStatus. */
    public static final PersistedConnectionStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for PersistedConnectionStatus. */
    public static final PersistedConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a PersistedConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PersistedConnectionStatus.
     */
    @JsonCreator
    public static PersistedConnectionStatus fromString(String name) {
        return fromString(name, PersistedConnectionStatus.class);
    }

    /** @return known PersistedConnectionStatus values. */
    public static Collection<PersistedConnectionStatus> values() {
        return values(PersistedConnectionStatus.class);
    }
}
