// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Hop link. */
@JsonFlatten
@Immutable
public class HopLink {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HopLink.class);

    /*
     * The ID of the next hop.
     */
    @JsonProperty(value = "nextHopId", access = JsonProperty.Access.WRITE_ONLY)
    private String nextHopId;

    /*
     * Link type.
     */
    @JsonProperty(value = "linkType", access = JsonProperty.Access.WRITE_ONLY)
    private String linkType;

    /*
     * List of issues.
     */
    @JsonProperty(value = "issues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityIssue> issues;

    /*
     * Provides additional context on links.
     */
    @JsonProperty(value = "context", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> context;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * Minimum roundtrip time in milliseconds.
     */
    @JsonProperty(value = "properties.roundTripTimeMin", access = JsonProperty.Access.WRITE_ONLY)
    private Long roundTripTimeMin;

    /*
     * Average roundtrip time in milliseconds.
     */
    @JsonProperty(value = "properties.roundTripTimeAvg", access = JsonProperty.Access.WRITE_ONLY)
    private Long roundTripTimeAvg;

    /*
     * Maximum roundtrip time in milliseconds.
     */
    @JsonProperty(value = "properties.roundTripTimeMax", access = JsonProperty.Access.WRITE_ONLY)
    private Long roundTripTimeMax;

    /**
     * Get the nextHopId property: The ID of the next hop.
     *
     * @return the nextHopId value.
     */
    public String nextHopId() {
        return this.nextHopId;
    }

    /**
     * Get the linkType property: Link type.
     *
     * @return the linkType value.
     */
    public String linkType() {
        return this.linkType;
    }

    /**
     * Get the issues property: List of issues.
     *
     * @return the issues value.
     */
    public List<ConnectivityIssue> issues() {
        return this.issues;
    }

    /**
     * Get the context property: Provides additional context on links.
     *
     * @return the context value.
     */
    public Map<String, String> context() {
        return this.context;
    }

    /**
     * Get the resourceId property: Resource ID.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the roundTripTimeMin property: Minimum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMin value.
     */
    public Long roundTripTimeMin() {
        return this.roundTripTimeMin;
    }

    /**
     * Get the roundTripTimeAvg property: Average roundtrip time in milliseconds.
     *
     * @return the roundTripTimeAvg value.
     */
    public Long roundTripTimeAvg() {
        return this.roundTripTimeAvg;
    }

    /**
     * Get the roundTripTimeMax property: Maximum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMax value.
     */
    public Long roundTripTimeMax() {
        return this.roundTripTimeMax;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (issues() != null) {
            issues().forEach(e -> e.validate());
        }
    }
}
