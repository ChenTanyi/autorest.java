// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.PreconfiguredEndpointInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a list of preconfigured endpoints. */
@Fluent
public final class PreconfiguredEndpointList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PreconfiguredEndpointList.class);

    /*
     * List of PreconfiguredEndpoints supported by NetworkExperiment.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<PreconfiguredEndpointInner> value;

    /*
     * URL to get the next set of PreconfiguredEndpoints if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of PreconfiguredEndpoints supported by NetworkExperiment.
     *
     * @return the value value.
     */
    public List<PreconfiguredEndpointInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of PreconfiguredEndpoints if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of PreconfiguredEndpoints if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the PreconfiguredEndpointList object itself.
     */
    public PreconfiguredEndpointList withNextLink(String nextLink) {
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
