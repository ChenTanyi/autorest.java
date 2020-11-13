// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters for a specific change details request. */
@Fluent
public final class ResourceChangeDetailsRequestParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceChangeDetailsRequestParameters.class);

    /*
     * Specifies the resource for a change details request.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * Specifies the change ID.
     */
    @JsonProperty(value = "changeId", required = true)
    private String changeId;

    /**
     * Get the resourceId property: Specifies the resource for a change details request.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Specifies the resource for a change details request.
     *
     * @param resourceId the resourceId value to set.
     * @return the ResourceChangeDetailsRequestParameters object itself.
     */
    public ResourceChangeDetailsRequestParameters withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the changeId property: Specifies the change ID.
     *
     * @return the changeId value.
     */
    public String changeId() {
        return this.changeId;
    }

    /**
     * Set the changeId property: Specifies the change ID.
     *
     * @param changeId the changeId value to set.
     * @return the ResourceChangeDetailsRequestParameters object itself.
     */
    public ResourceChangeDetailsRequestParameters withChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceId in model ResourceChangeDetailsRequestParameters"));
        }
        if (changeId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property changeId in model ResourceChangeDetailsRequestParameters"));
        }
    }
}