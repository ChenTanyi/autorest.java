// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceSkuInstances;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Definition of the NetworkVirtualApplianceSkus resource. */
@JsonFlatten
@Fluent
public class NetworkVirtualApplianceSkuInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkVirtualApplianceSkuInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Network Virtual Appliance Sku vendor.
     */
    @JsonProperty(value = "properties.vendor", access = JsonProperty.Access.WRITE_ONLY)
    private String vendor;

    /*
     * Available Network Virtual Appliance versions.
     */
    @JsonProperty(value = "properties.availableVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> availableVersions;

    /*
     * The list of scale units available.
     */
    @JsonProperty(value = "properties.availableScaleUnits")
    private List<NetworkVirtualApplianceSkuInstances> availableScaleUnits;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the vendor property: Network Virtual Appliance Sku vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Get the availableVersions property: Available Network Virtual Appliance versions.
     *
     * @return the availableVersions value.
     */
    public List<String> availableVersions() {
        return this.availableVersions;
    }

    /**
     * Get the availableScaleUnits property: The list of scale units available.
     *
     * @return the availableScaleUnits value.
     */
    public List<NetworkVirtualApplianceSkuInstances> availableScaleUnits() {
        return this.availableScaleUnits;
    }

    /**
     * Set the availableScaleUnits property: The list of scale units available.
     *
     * @param availableScaleUnits the availableScaleUnits value to set.
     * @return the NetworkVirtualApplianceSkuInner object itself.
     */
    public NetworkVirtualApplianceSkuInner withAvailableScaleUnits(
        List<NetworkVirtualApplianceSkuInstances> availableScaleUnits) {
        this.availableScaleUnits = availableScaleUnits;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the NetworkVirtualApplianceSkuInner object itself.
     */
    public NetworkVirtualApplianceSkuInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availableScaleUnits() != null) {
            availableScaleUnits().forEach(e -> e.validate());
        }
    }
}