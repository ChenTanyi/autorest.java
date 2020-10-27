// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Input to get top query statistics. */
@JsonFlatten
@Fluent
public class TopQueryStatisticsInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopQueryStatisticsInput.class);

    /*
     * Max number of top queries to return.
     */
    @JsonProperty(value = "properties.numberOfTopQueries", required = true)
    private int numberOfTopQueries;

    /*
     * Aggregation function name.
     */
    @JsonProperty(value = "properties.aggregationFunction", required = true)
    private String aggregationFunction;

    /*
     * Observed metric name.
     */
    @JsonProperty(value = "properties.observedMetric", required = true)
    private String observedMetric;

    /*
     * Observation start time.
     */
    @JsonProperty(value = "properties.observationStartTime", required = true)
    private OffsetDateTime observationStartTime;

    /*
     * Observation end time.
     */
    @JsonProperty(value = "properties.observationEndTime", required = true)
    private OffsetDateTime observationEndTime;

    /*
     * Aggregation interval type in ISO 8601 format.
     */
    @JsonProperty(value = "properties.aggregationWindow", required = true)
    private String aggregationWindow;

    /**
     * Get the numberOfTopQueries property: Max number of top queries to return.
     *
     * @return the numberOfTopQueries value.
     */
    public int numberOfTopQueries() {
        return this.numberOfTopQueries;
    }

    /**
     * Set the numberOfTopQueries property: Max number of top queries to return.
     *
     * @param numberOfTopQueries the numberOfTopQueries value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withNumberOfTopQueries(int numberOfTopQueries) {
        this.numberOfTopQueries = numberOfTopQueries;
        return this;
    }

    /**
     * Get the aggregationFunction property: Aggregation function name.
     *
     * @return the aggregationFunction value.
     */
    public String aggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * Set the aggregationFunction property: Aggregation function name.
     *
     * @param aggregationFunction the aggregationFunction value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withAggregationFunction(String aggregationFunction) {
        this.aggregationFunction = aggregationFunction;
        return this;
    }

    /**
     * Get the observedMetric property: Observed metric name.
     *
     * @return the observedMetric value.
     */
    public String observedMetric() {
        return this.observedMetric;
    }

    /**
     * Set the observedMetric property: Observed metric name.
     *
     * @param observedMetric the observedMetric value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withObservedMetric(String observedMetric) {
        this.observedMetric = observedMetric;
        return this;
    }

    /**
     * Get the observationStartTime property: Observation start time.
     *
     * @return the observationStartTime value.
     */
    public OffsetDateTime observationStartTime() {
        return this.observationStartTime;
    }

    /**
     * Set the observationStartTime property: Observation start time.
     *
     * @param observationStartTime the observationStartTime value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withObservationStartTime(OffsetDateTime observationStartTime) {
        this.observationStartTime = observationStartTime;
        return this;
    }

    /**
     * Get the observationEndTime property: Observation end time.
     *
     * @return the observationEndTime value.
     */
    public OffsetDateTime observationEndTime() {
        return this.observationEndTime;
    }

    /**
     * Set the observationEndTime property: Observation end time.
     *
     * @param observationEndTime the observationEndTime value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withObservationEndTime(OffsetDateTime observationEndTime) {
        this.observationEndTime = observationEndTime;
        return this;
    }

    /**
     * Get the aggregationWindow property: Aggregation interval type in ISO 8601 format.
     *
     * @return the aggregationWindow value.
     */
    public String aggregationWindow() {
        return this.aggregationWindow;
    }

    /**
     * Set the aggregationWindow property: Aggregation interval type in ISO 8601 format.
     *
     * @param aggregationWindow the aggregationWindow value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withAggregationWindow(String aggregationWindow) {
        this.aggregationWindow = aggregationWindow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aggregationFunction() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aggregationFunction in model TopQueryStatisticsInput"));
        }
        if (observedMetric() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property observedMetric in model TopQueryStatisticsInput"));
        }
        if (observationStartTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property observationStartTime in model TopQueryStatisticsInput"));
        }
        if (observationEndTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property observationEndTime in model TopQueryStatisticsInput"));
        }
        if (aggregationWindow() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aggregationWindow in model TopQueryStatisticsInput"));
        }
    }
}