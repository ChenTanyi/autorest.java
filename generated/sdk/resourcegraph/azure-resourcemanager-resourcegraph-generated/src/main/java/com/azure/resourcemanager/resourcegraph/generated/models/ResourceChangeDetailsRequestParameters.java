// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The parameters for a specific change details request. */
@Fluent
public final class ResourceChangeDetailsRequestParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceChangeDetailsRequestParameters.class);

    /*
     * Specifies the list of resources for a change details request.
     */
    @JsonProperty(value = "resourceIds", required = true)
    private List<String> resourceIds;

    /*
     * Specifies the list of change IDs for a change details request.
     */
    @JsonProperty(value = "changeIds", required = true)
    private List<String> changeIds;

    /**
     * Get the resourceIds property: Specifies the list of resources for a change details request.
     *
     * @return the resourceIds value.
     */
    public List<String> resourceIds() {
        return this.resourceIds;
    }

    /**
     * Set the resourceIds property: Specifies the list of resources for a change details request.
     *
     * @param resourceIds the resourceIds value to set.
     * @return the ResourceChangeDetailsRequestParameters object itself.
     */
    public ResourceChangeDetailsRequestParameters withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * Get the changeIds property: Specifies the list of change IDs for a change details request.
     *
     * @return the changeIds value.
     */
    public List<String> changeIds() {
        return this.changeIds;
    }

    /**
     * Set the changeIds property: Specifies the list of change IDs for a change details request.
     *
     * @param changeIds the changeIds value to set.
     * @return the ResourceChangeDetailsRequestParameters object itself.
     */
    public ResourceChangeDetailsRequestParameters withChangeIds(List<String> changeIds) {
        this.changeIds = changeIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceIds() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceIds in model ResourceChangeDetailsRequestParameters"));
        }
        if (changeIds() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property changeIds in model ResourceChangeDetailsRequestParameters"));
        }
    }
}