// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.LinkedServiceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list linked service operation response. */
@Fluent
public final class LinkedServiceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedServiceListResult.class);

    /*
     * The list of linked service instances
     */
    @JsonProperty(value = "value")
    private List<LinkedServiceInner> value;

    /**
     * Get the value property: The list of linked service instances.
     *
     * @return the value value.
     */
    public List<LinkedServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of linked service instances.
     *
     * @param value the value value to set.
     * @return the LinkedServiceListResult object itself.
     */
    public LinkedServiceListResult withValue(List<LinkedServiceInner> value) {
        this.value = value;
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
