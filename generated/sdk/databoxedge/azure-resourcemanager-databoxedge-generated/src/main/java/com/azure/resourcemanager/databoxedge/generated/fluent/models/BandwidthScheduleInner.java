// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.DayOfWeek;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The bandwidth schedule details. */
@JsonFlatten
@Fluent
public class BandwidthScheduleInner extends ArmBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BandwidthScheduleInner.class);

    /*
     * The start time of the schedule in UTC.
     */
    @JsonProperty(value = "properties.start", required = true)
    private String start;

    /*
     * The stop time of the schedule in UTC.
     */
    @JsonProperty(value = "properties.stop", required = true)
    private String stop;

    /*
     * The bandwidth rate in Mbps.
     */
    @JsonProperty(value = "properties.rateInMbps", required = true)
    private int rateInMbps;

    /*
     * The days of the week when this schedule is applicable.
     */
    @JsonProperty(value = "properties.days", required = true)
    private List<DayOfWeek> days;

    /**
     * Get the start property: The start time of the schedule in UTC.
     *
     * @return the start value.
     */
    public String start() {
        return this.start;
    }

    /**
     * Set the start property: The start time of the schedule in UTC.
     *
     * @param start the start value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Get the stop property: The stop time of the schedule in UTC.
     *
     * @return the stop value.
     */
    public String stop() {
        return this.stop;
    }

    /**
     * Set the stop property: The stop time of the schedule in UTC.
     *
     * @param stop the stop value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withStop(String stop) {
        this.stop = stop;
        return this;
    }

    /**
     * Get the rateInMbps property: The bandwidth rate in Mbps.
     *
     * @return the rateInMbps value.
     */
    public int rateInMbps() {
        return this.rateInMbps;
    }

    /**
     * Set the rateInMbps property: The bandwidth rate in Mbps.
     *
     * @param rateInMbps the rateInMbps value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withRateInMbps(int rateInMbps) {
        this.rateInMbps = rateInMbps;
        return this;
    }

    /**
     * Get the days property: The days of the week when this schedule is applicable.
     *
     * @return the days value.
     */
    public List<DayOfWeek> days() {
        return this.days;
    }

    /**
     * Set the days property: The days of the week when this schedule is applicable.
     *
     * @param days the days value to set.
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withDays(List<DayOfWeek> days) {
        this.days = days;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (start() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property start in model BandwidthScheduleInner"));
        }
        if (stop() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property stop in model BandwidthScheduleInner"));
        }
        if (days() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property days in model BandwidthScheduleInner"));
        }
    }
}