// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FrontDoorRedirectType. */
public final class FrontDoorRedirectType extends ExpandableStringEnum<FrontDoorRedirectType> {
    /** Static value Moved for FrontDoorRedirectType. */
    public static final FrontDoorRedirectType MOVED = fromString("Moved");

    /** Static value Found for FrontDoorRedirectType. */
    public static final FrontDoorRedirectType FOUND = fromString("Found");

    /** Static value TemporaryRedirect for FrontDoorRedirectType. */
    public static final FrontDoorRedirectType TEMPORARY_REDIRECT = fromString("TemporaryRedirect");

    /** Static value PermanentRedirect for FrontDoorRedirectType. */
    public static final FrontDoorRedirectType PERMANENT_REDIRECT = fromString("PermanentRedirect");

    /**
     * Creates or finds a FrontDoorRedirectType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FrontDoorRedirectType.
     */
    @JsonCreator
    public static FrontDoorRedirectType fromString(String name) {
        return fromString(name, FrontDoorRedirectType.class);
    }

    /** @return known FrontDoorRedirectType values. */
    public static Collection<FrontDoorRedirectType> values() {
        return values(FrontDoorRedirectType.class);
    }
}
