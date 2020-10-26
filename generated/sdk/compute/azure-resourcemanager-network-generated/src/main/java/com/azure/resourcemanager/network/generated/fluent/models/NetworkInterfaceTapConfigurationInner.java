// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tap configuration in a Network Interface. */
@JsonFlatten
@Fluent
public class NetworkInterfaceTapConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceTapConfigurationInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The reference to the Virtual Network Tap resource.
     */
    @JsonProperty(value = "properties.virtualNetworkTap")
    private VirtualNetworkTapInner virtualNetworkTap;

    /*
     * The provisioning state of the network interface tap configuration
     * resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the NetworkInterfaceTapConfigurationInner object itself.
     */
    public NetworkInterfaceTapConfigurationInner withName(String name) {
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
     * Get the type property: Sub Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the virtualNetworkTap property: The reference to the Virtual Network Tap resource.
     *
     * @return the virtualNetworkTap value.
     */
    public VirtualNetworkTapInner virtualNetworkTap() {
        return this.virtualNetworkTap;
    }

    /**
     * Set the virtualNetworkTap property: The reference to the Virtual Network Tap resource.
     *
     * @param virtualNetworkTap the virtualNetworkTap value to set.
     * @return the NetworkInterfaceTapConfigurationInner object itself.
     */
    public NetworkInterfaceTapConfigurationInner withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap) {
        this.virtualNetworkTap = virtualNetworkTap;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network interface tap configuration resource.
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
        if (virtualNetworkTap() != null) {
            virtualNetworkTap().validate();
        }
    }
}
