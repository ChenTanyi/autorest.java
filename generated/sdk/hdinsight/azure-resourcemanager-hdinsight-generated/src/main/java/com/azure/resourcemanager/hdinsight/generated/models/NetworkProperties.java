// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The network properties. */
@Fluent
public final class NetworkProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkProperties.class);

    /*
     * The direction for the resource provider connection.
     */
    @JsonProperty(value = "resourceProviderConnection")
    private ResourceProviderConnection resourceProviderConnection;

    /*
     * Indicates whether or not private link is enabled.
     */
    @JsonProperty(value = "privateLink")
    private PrivateLink privateLink;

    /**
     * Get the resourceProviderConnection property: The direction for the resource provider connection.
     *
     * @return the resourceProviderConnection value.
     */
    public ResourceProviderConnection resourceProviderConnection() {
        return this.resourceProviderConnection;
    }

    /**
     * Set the resourceProviderConnection property: The direction for the resource provider connection.
     *
     * @param resourceProviderConnection the resourceProviderConnection value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withResourceProviderConnection(ResourceProviderConnection resourceProviderConnection) {
        this.resourceProviderConnection = resourceProviderConnection;
        return this;
    }

    /**
     * Get the privateLink property: Indicates whether or not private link is enabled.
     *
     * @return the privateLink value.
     */
    public PrivateLink privateLink() {
        return this.privateLink;
    }

    /**
     * Set the privateLink property: Indicates whether or not private link is enabled.
     *
     * @param privateLink the privateLink value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withPrivateLink(PrivateLink privateLink) {
        this.privateLink = privateLink;
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
