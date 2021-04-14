// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.AnnotationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Annotations list result. */
@Immutable
public final class AnnotationsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AnnotationsListResult.class);

    /*
     * An array of annotations.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<AnnotationInner> value;

    /**
     * Get the value property: An array of annotations.
     *
     * @return the value value.
     */
    public List<AnnotationInner> value() {
        return this.value;
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
