// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.models.LatencyMetric;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Defines the LatencyScorecard. */
@JsonFlatten
@Fluent
public class LatencyScorecardInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LatencyScorecardInner.class);

    /*
     * The unique identifier of the Latency Scorecard
     */
    @JsonProperty(value = "properties.id", access = JsonProperty.Access.WRITE_ONLY)
    private String idPropertiesId;

    /*
     * The name of the Latency Scorecard
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String namePropertiesName;

    /*
     * The description of the Latency Scorecard
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The A endpoint in the scorecard
     */
    @JsonProperty(value = "properties.endpointA", access = JsonProperty.Access.WRITE_ONLY)
    private String endpointA;

    /*
     * The B endpoint in the scorecard
     */
    @JsonProperty(value = "properties.endpointB", access = JsonProperty.Access.WRITE_ONLY)
    private String endpointB;

    /*
     * The start time of the Latency Scorecard in UTC
     */
    @JsonProperty(value = "properties.startDateTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startDateTimeUtc;

    /*
     * The end time of the Latency Scorecard in UTC
     */
    @JsonProperty(value = "properties.endDateTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endDateTimeUtc;

    /*
     * The country associated with the Latency Scorecard. Values are country
     * ISO codes as specified here-
     * https://www.iso.org/iso-3166-country-codes.html
     */
    @JsonProperty(value = "properties.country", access = JsonProperty.Access.WRITE_ONLY)
    private String country;

    /*
     * The latency metrics of the Latency Scorecard
     */
    @JsonProperty(value = "properties.latencyMetrics")
    private List<LatencyMetric> latencyMetrics;

    /**
     * Get the idPropertiesId property: The unique identifier of the Latency Scorecard.
     *
     * @return the idPropertiesId value.
     */
    public String idPropertiesId() {
        return this.idPropertiesId;
    }

    /**
     * Get the namePropertiesName property: The name of the Latency Scorecard.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Get the description property: The description of the Latency Scorecard.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the endpointA property: The A endpoint in the scorecard.
     *
     * @return the endpointA value.
     */
    public String endpointA() {
        return this.endpointA;
    }

    /**
     * Get the endpointB property: The B endpoint in the scorecard.
     *
     * @return the endpointB value.
     */
    public String endpointB() {
        return this.endpointB;
    }

    /**
     * Get the startDateTimeUtc property: The start time of the Latency Scorecard in UTC.
     *
     * @return the startDateTimeUtc value.
     */
    public OffsetDateTime startDateTimeUtc() {
        return this.startDateTimeUtc;
    }

    /**
     * Get the endDateTimeUtc property: The end time of the Latency Scorecard in UTC.
     *
     * @return the endDateTimeUtc value.
     */
    public OffsetDateTime endDateTimeUtc() {
        return this.endDateTimeUtc;
    }

    /**
     * Get the country property: The country associated with the Latency Scorecard. Values are country ISO codes as
     * specified here- https://www.iso.org/iso-3166-country-codes.html.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Get the latencyMetrics property: The latency metrics of the Latency Scorecard.
     *
     * @return the latencyMetrics value.
     */
    public List<LatencyMetric> latencyMetrics() {
        return this.latencyMetrics;
    }

    /**
     * Set the latencyMetrics property: The latency metrics of the Latency Scorecard.
     *
     * @param latencyMetrics the latencyMetrics value to set.
     * @return the LatencyScorecardInner object itself.
     */
    public LatencyScorecardInner withLatencyMetrics(List<LatencyMetric> latencyMetrics) {
        this.latencyMetrics = latencyMetrics;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LatencyScorecardInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LatencyScorecardInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (latencyMetrics() != null) {
            latencyMetrics().forEach(e -> e.validate());
        }
    }
}
