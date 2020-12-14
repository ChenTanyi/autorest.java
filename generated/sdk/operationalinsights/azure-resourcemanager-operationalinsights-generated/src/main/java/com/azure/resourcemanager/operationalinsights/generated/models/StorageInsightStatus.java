// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of the storage insight. */
@Fluent
public final class StorageInsightStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageInsightStatus.class);

    /*
     * The state of the storage insight connection to the workspace
     */
    @JsonProperty(value = "state", required = true)
    private StorageInsightState state;

    /*
     * Description of the state of the storage insight.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the state property: The state of the storage insight connection to the workspace.
     *
     * @return the state value.
     */
    public StorageInsightState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the storage insight connection to the workspace.
     *
     * @param state the state value to set.
     * @return the StorageInsightStatus object itself.
     */
    public StorageInsightStatus withState(StorageInsightState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the description property: Description of the state of the storage insight.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the state of the storage insight.
     *
     * @param description the description value to set.
     * @return the StorageInsightStatus object itself.
     */
    public StorageInsightStatus withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property state in model StorageInsightStatus"));
        }
    }
}
