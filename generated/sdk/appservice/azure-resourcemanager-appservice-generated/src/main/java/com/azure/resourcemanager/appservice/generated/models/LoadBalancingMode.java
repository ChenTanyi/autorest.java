// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LoadBalancingMode. */
public final class LoadBalancingMode extends ExpandableStringEnum<LoadBalancingMode> {
    /** Static value None for LoadBalancingMode. */
    public static final LoadBalancingMode NONE = fromString("None");

    /** Static value Web for LoadBalancingMode. */
    public static final LoadBalancingMode WEB = fromString("Web");

    /** Static value Publishing for LoadBalancingMode. */
    public static final LoadBalancingMode PUBLISHING = fromString("Publishing");

    /** Static value Web,Publishing for LoadBalancingMode. */
    public static final LoadBalancingMode WEB_PUBLISHING = fromString("Web,Publishing");

    /**
     * Creates or finds a LoadBalancingMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancingMode.
     */
    @JsonCreator
    public static LoadBalancingMode fromString(String name) {
        return fromString(name, LoadBalancingMode.class);
    }

    /** @return known LoadBalancingMode values. */
    public static Collection<LoadBalancingMode> values() {
        return values(LoadBalancingMode.class);
    }
}