// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.Office365PolicyProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual Appliance Site resource. */
@JsonFlatten
@Fluent
public class VirtualApplianceSiteInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualApplianceSiteInner.class);

    /*
     * Name of the virtual appliance site.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Site type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Address Prefix.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /*
     * Office 365 Policy.
     */
    @JsonProperty(value = "properties.o365Policy")
    private Office365PolicyProperties o365Policy;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the virtual appliance site.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the virtual appliance site.
     *
     * @param name the name value to set.
     * @return the VirtualApplianceSiteInner object itself.
     */
    public VirtualApplianceSiteInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Site type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address Prefix.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the VirtualApplianceSiteInner object itself.
     */
    public VirtualApplianceSiteInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the o365Policy property: Office 365 Policy.
     *
     * @return the o365Policy value.
     */
    public Office365PolicyProperties o365Policy() {
        return this.o365Policy;
    }

    /**
     * Set the o365Policy property: Office 365 Policy.
     *
     * @param o365Policy the o365Policy value to set.
     * @return the VirtualApplianceSiteInner object itself.
     */
    public VirtualApplianceSiteInner withO365Policy(Office365PolicyProperties o365Policy) {
        this.o365Policy = o365Policy;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (o365Policy() != null) {
            o365Policy().validate();
        }
    }
}