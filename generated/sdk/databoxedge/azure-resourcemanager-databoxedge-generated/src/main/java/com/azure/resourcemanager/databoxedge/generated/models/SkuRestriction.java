// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The restrictions because of which SKU cannot be used. */
@Immutable
public final class SkuRestriction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuRestriction.class);

    /*
     * The type of the restriction.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The locations where sku is restricted.
     */
    @JsonProperty(value = "values", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> values;

    /*
     * The SKU restriction reason.
     */
    @JsonProperty(value = "reasonCode", access = JsonProperty.Access.WRITE_ONLY)
    private SkuRestrictionReasonCode reasonCode;

    /*
     * Restriction of the SKU for the location/zone
     */
    @JsonProperty(value = "restrictionInfo", access = JsonProperty.Access.WRITE_ONLY)
    private SkuRestrictionInfo restrictionInfo;

    /**
     * Get the type property: The type of the restriction.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the values property: The locations where sku is restricted.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Get the reasonCode property: The SKU restriction reason.
     *
     * @return the reasonCode value.
     */
    public SkuRestrictionReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Get the restrictionInfo property: Restriction of the SKU for the location/zone.
     *
     * @return the restrictionInfo value.
     */
    public SkuRestrictionInfo restrictionInfo() {
        return this.restrictionInfo;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restrictionInfo() != null) {
            restrictionInfo().validate();
        }
    }
}
