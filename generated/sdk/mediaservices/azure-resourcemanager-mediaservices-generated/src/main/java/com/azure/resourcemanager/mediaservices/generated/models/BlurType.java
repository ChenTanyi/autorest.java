// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlurType. */
public final class BlurType extends ExpandableStringEnum<BlurType> {
    /** Static value Box for BlurType. */
    public static final BlurType BOX = fromString("Box");

    /** Static value Low for BlurType. */
    public static final BlurType LOW = fromString("Low");

    /** Static value Med for BlurType. */
    public static final BlurType MED = fromString("Med");

    /** Static value High for BlurType. */
    public static final BlurType HIGH = fromString("High");

    /** Static value Black for BlurType. */
    public static final BlurType BLACK = fromString("Black");

    /**
     * Creates or finds a BlurType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlurType.
     */
    @JsonCreator
    public static BlurType fromString(String name) {
        return fromString(name, BlurType.class);
    }

    /** @return known BlurType values. */
    public static Collection<BlurType> values() {
        return values(BlurType.class);
    }
}