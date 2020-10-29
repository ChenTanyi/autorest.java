// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Defines modifiable attributes of an Experiment. */
@JsonFlatten
@Fluent
public class ExperimentUpdateModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExperimentUpdateModel.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The description of the intent or details of the Experiment
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The state of the Experiment
     */
    @JsonProperty(value = "properties.enabledState")
    private State enabledState;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the description property: The description of the intent or details of the Experiment.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the intent or details of the Experiment.
     *
     * @param description the description value to set.
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the enabledState property: The state of the Experiment.
     *
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: The state of the Experiment.
     *
     * @param enabledState the enabledState value to set.
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withEnabledState(State enabledState) {
        this.enabledState = enabledState;
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
