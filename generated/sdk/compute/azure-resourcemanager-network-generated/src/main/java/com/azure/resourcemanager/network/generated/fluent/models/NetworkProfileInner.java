// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterface;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterfaceConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network profile resource. */
@JsonFlatten
@Fluent
public class NetworkProfileInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkProfileInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * List of child container network interfaces.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<ContainerNetworkInterface> containerNetworkInterfaces;

    /*
     * List of chid container network interface configurations.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaceConfigurations")
    private List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations;

    /*
     * The resource GUID property of the network profile resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the network profile resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

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
     * Get the containerNetworkInterfaces property: List of child container network interfaces.
     *
     * @return the containerNetworkInterfaces value.
     */
    public List<ContainerNetworkInterface> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }

    /**
     * Get the containerNetworkInterfaceConfigurations property: List of chid container network interface
     * configurations.
     *
     * @return the containerNetworkInterfaceConfigurations value.
     */
    public List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations() {
        return this.containerNetworkInterfaceConfigurations;
    }

    /**
     * Set the containerNetworkInterfaceConfigurations property: List of chid container network interface
     * configurations.
     *
     * @param containerNetworkInterfaceConfigurations the containerNetworkInterfaceConfigurations value to set.
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withContainerNetworkInterfaceConfigurations(
        List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations) {
        this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network profile resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network profile resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerNetworkInterfaces() != null) {
            containerNetworkInterfaces().forEach(e -> e.validate());
        }
        if (containerNetworkInterfaceConfigurations() != null) {
            containerNetworkInterfaceConfigurations().forEach(e -> e.validate());
        }
    }
}
