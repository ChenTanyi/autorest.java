// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list NetworkManager. It contains a list of network managers and a URL link to get the next
 * set of results.
 */
@Fluent
public final class NetworkManagerListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkManagerListResult.class);

    /*
     * Gets a page of NetworkManager
     */
    @JsonProperty(value = "value")
    private List<NetworkManagerInner> value;

    /*
     * Gets the URL to get the next page of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets a page of NetworkManager.
     *
     * @return the value value.
     */
    public List<NetworkManagerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of NetworkManager.
     *
     * @param value the value value to set.
     * @return the NetworkManagerListResult object itself.
     */
    public NetworkManagerListResult withValue(List<NetworkManagerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkManagerListResult object itself.
     */
    public NetworkManagerListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
