// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeinterlaceMode. */
public final class DeinterlaceMode extends ExpandableStringEnum<DeinterlaceMode> {
    /** Static value Off for DeinterlaceMode. */
    public static final DeinterlaceMode OFF = fromString("Off");

    /** Static value AutoPixelAdaptive for DeinterlaceMode. */
    public static final DeinterlaceMode AUTO_PIXEL_ADAPTIVE = fromString("AutoPixelAdaptive");

    /**
     * Creates or finds a DeinterlaceMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeinterlaceMode.
     */
    @JsonCreator
    public static DeinterlaceMode fromString(String name) {
        return fromString(name, DeinterlaceMode.class);
    }

    /** @return known DeinterlaceMode values. */
    public static Collection<DeinterlaceMode> values() {
        return values(DeinterlaceMode.class);
    }
}
