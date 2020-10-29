// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Load balancing settings for a backend pool. */
@JsonFlatten
@Fluent
public class LoadBalancingSettingsModel extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancingSettingsModel.class);

    /*
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The number of samples to consider for load balancing decisions
     */
    @JsonProperty(value = "properties.sampleSize")
    private Integer sampleSize;

    /*
     * The number of samples within the sample period that must succeed
     */
    @JsonProperty(value = "properties.successfulSamplesRequired")
    private Integer successfulSamplesRequired;

    /*
     * The additional latency in milliseconds for probes to fall into the
     * lowest latency bucket
     */
    @JsonProperty(value = "properties.additionalLatencyMilliseconds")
    private Integer additionalLatencyMilliseconds;

    /*
     * Resource status.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the sampleSize property: The number of samples to consider for load balancing decisions.
     *
     * @return the sampleSize value.
     */
    public Integer sampleSize() {
        return this.sampleSize;
    }

    /**
     * Set the sampleSize property: The number of samples to consider for load balancing decisions.
     *
     * @param sampleSize the sampleSize value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
        return this;
    }

    /**
     * Get the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     *
     * @return the successfulSamplesRequired value.
     */
    public Integer successfulSamplesRequired() {
        return this.successfulSamplesRequired;
    }

    /**
     * Set the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     *
     * @param successfulSamplesRequired the successfulSamplesRequired value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withSuccessfulSamplesRequired(Integer successfulSamplesRequired) {
        this.successfulSamplesRequired = successfulSamplesRequired;
        return this;
    }

    /**
     * Get the additionalLatencyMilliseconds property: The additional latency in milliseconds for probes to fall into
     * the lowest latency bucket.
     *
     * @return the additionalLatencyMilliseconds value.
     */
    public Integer additionalLatencyMilliseconds() {
        return this.additionalLatencyMilliseconds;
    }

    /**
     * Set the additionalLatencyMilliseconds property: The additional latency in milliseconds for probes to fall into
     * the lowest latency bucket.
     *
     * @param additionalLatencyMilliseconds the additionalLatencyMilliseconds value to set.
     * @return the LoadBalancingSettingsModel object itself.
     */
    public LoadBalancingSettingsModel withAdditionalLatencyMilliseconds(Integer additionalLatencyMilliseconds) {
        this.additionalLatencyMilliseconds = additionalLatencyMilliseconds;
        return this;
    }

    /**
     * Get the resourceState property: Resource status.
     *
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
