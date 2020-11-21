// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a cloud service IP Configuration. */
@Fluent
public final class LoadBalancerFrontendIpConfigurationProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(LoadBalancerFrontendIpConfigurationProperties.class);

    /*
     * The publicIPAddress property.
     */
    @JsonProperty(value = "publicIPAddress")
    private SubResource publicIpAddress;

    /*
     * The subnet property.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * The private IP address referenced by the cloud service.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /**
     * Get the publicIpAddress property: The publicIPAddress property.
     *
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The publicIPAddress property.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the LoadBalancerFrontendIpConfigurationProperties object itself.
     */
    public LoadBalancerFrontendIpConfigurationProperties withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the subnet property: The subnet property.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The subnet property.
     *
     * @param subnet the subnet value to set.
     * @return the LoadBalancerFrontendIpConfigurationProperties object itself.
     */
    public LoadBalancerFrontendIpConfigurationProperties withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the privateIpAddress property: The private IP address referenced by the cloud service.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address referenced by the cloud service.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the LoadBalancerFrontendIpConfigurationProperties object itself.
     */
    public LoadBalancerFrontendIpConfigurationProperties withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}