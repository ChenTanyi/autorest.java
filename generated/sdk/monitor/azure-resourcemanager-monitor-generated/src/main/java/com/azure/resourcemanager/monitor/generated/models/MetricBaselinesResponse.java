// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.models.SingleMetricBaselineInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of metric baselines. */
@Fluent
public final class MetricBaselinesResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricBaselinesResponse.class);

    /*
     * The list of metric baselines.
     */
    @JsonProperty(value = "value")
    private List<SingleMetricBaselineInner> value;

    /**
     * Get the value property: The list of metric baselines.
     *
     * @return the value value.
     */
    public List<SingleMetricBaselineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of metric baselines.
     *
     * @param value the value value to set.
     * @return the MetricBaselinesResponse object itself.
     */
    public MetricBaselinesResponse withValue(List<SingleMetricBaselineInner> value) {
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