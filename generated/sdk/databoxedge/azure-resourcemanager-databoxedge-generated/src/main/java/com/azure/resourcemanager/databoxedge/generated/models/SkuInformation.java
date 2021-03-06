// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Sku information. */
@Immutable
public final class SkuInformation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuInformation.class);

    /*
     * The sku name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The sku tier.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /*
     * The sku kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * The Sku family.
     */
    @JsonProperty(value = "family", access = JsonProperty.Access.WRITE_ONLY)
    private String family;

    /*
     * The pricing info of the Sku.
     */
    @JsonProperty(value = "costs", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuCost> costs;

    /*
     * The locations where Sku is available.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /*
     * The locations where Sku is available with zones and sites info
     */
    @JsonProperty(value = "locationInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuLocationInfo> locationInfo;

    /*
     * The required quotaIds for the sku to be available.
     */
    @JsonProperty(value = "requiredQuotaIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredQuotaIds;

    /*
     * The required features for the sku to be available.
     */
    @JsonProperty(value = "requiredFeatures", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredFeatures;

    /**
     * Get the name property: The sku name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier property: The sku tier.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the kind property: The sku kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the family property: The Sku family.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Get the costs property: The pricing info of the Sku.
     *
     * @return the costs value.
     */
    public List<SkuCost> costs() {
        return this.costs;
    }

    /**
     * Get the locations property: The locations where Sku is available.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the locationInfo property: The locations where Sku is available with zones and sites info.
     *
     * @return the locationInfo value.
     */
    public List<SkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Get the requiredQuotaIds property: The required quotaIds for the sku to be available.
     *
     * @return the requiredQuotaIds value.
     */
    public List<String> requiredQuotaIds() {
        return this.requiredQuotaIds;
    }

    /**
     * Get the requiredFeatures property: The required features for the sku to be available.
     *
     * @return the requiredFeatures value.
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (costs() != null) {
            costs().forEach(e -> e.validate());
        }
        if (locationInfo() != null) {
            locationInfo().forEach(e -> e.validate());
        }
    }
}
