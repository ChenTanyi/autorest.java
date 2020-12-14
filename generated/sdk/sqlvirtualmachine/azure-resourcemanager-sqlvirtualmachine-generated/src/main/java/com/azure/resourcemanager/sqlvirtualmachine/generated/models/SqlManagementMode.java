// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SqlManagementMode. */
public final class SqlManagementMode extends ExpandableStringEnum<SqlManagementMode> {
    /** Static value Full for SqlManagementMode. */
    public static final SqlManagementMode FULL = fromString("Full");

    /** Static value LightWeight for SqlManagementMode. */
    public static final SqlManagementMode LIGHT_WEIGHT = fromString("LightWeight");

    /** Static value NoAgent for SqlManagementMode. */
    public static final SqlManagementMode NO_AGENT = fromString("NoAgent");

    /**
     * Creates or finds a SqlManagementMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlManagementMode.
     */
    @JsonCreator
    public static SqlManagementMode fromString(String name) {
        return fromString(name, SqlManagementMode.class);
    }

    /** @return known SqlManagementMode values. */
    public static Collection<SqlManagementMode> values() {
        return values(SqlManagementMode.class);
    }
}
