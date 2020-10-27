// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** scale units definition. */
@Fluent
public final class StreamingEntityScaleUnit {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingEntityScaleUnit.class);

    /*
     * The scale unit number of the streaming endpoint.
     */
    @JsonProperty(value = "scaleUnit")
    private Integer scaleUnit;

    /**
     * Get the scaleUnit property: The scale unit number of the streaming endpoint.
     *
     * @return the scaleUnit value.
     */
    public Integer scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set the scaleUnit property: The scale unit number of the streaming endpoint.
     *
     * @param scaleUnit the scaleUnit value to set.
     * @return the StreamingEntityScaleUnit object itself.
     */
    public StreamingEntityScaleUnit withScaleUnit(Integer scaleUnit) {
        this.scaleUnit = scaleUnit;
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