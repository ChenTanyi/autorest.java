// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.FilterTrackSelection;
import com.azure.resourcemanager.mediaservices.generated.models.FirstQuality;
import com.azure.resourcemanager.mediaservices.generated.models.PresentationTimeRange;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Asset Filter. */
@JsonFlatten
@Fluent
public class AssetFilterInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AssetFilterInner.class);

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The presentation time range.
     */
    @JsonProperty(value = "properties.presentationTimeRange")
    private PresentationTimeRange presentationTimeRange;

    /*
     * The first quality.
     */
    @JsonProperty(value = "properties.firstQuality")
    private FirstQuality firstQuality;

    /*
     * The tracks selection conditions.
     */
    @JsonProperty(value = "properties.tracks")
    private List<FilterTrackSelection> tracks;

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the presentationTimeRange property: The presentation time range.
     *
     * @return the presentationTimeRange value.
     */
    public PresentationTimeRange presentationTimeRange() {
        return this.presentationTimeRange;
    }

    /**
     * Set the presentationTimeRange property: The presentation time range.
     *
     * @param presentationTimeRange the presentationTimeRange value to set.
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withPresentationTimeRange(PresentationTimeRange presentationTimeRange) {
        this.presentationTimeRange = presentationTimeRange;
        return this;
    }

    /**
     * Get the firstQuality property: The first quality.
     *
     * @return the firstQuality value.
     */
    public FirstQuality firstQuality() {
        return this.firstQuality;
    }

    /**
     * Set the firstQuality property: The first quality.
     *
     * @param firstQuality the firstQuality value to set.
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withFirstQuality(FirstQuality firstQuality) {
        this.firstQuality = firstQuality;
        return this;
    }

    /**
     * Get the tracks property: The tracks selection conditions.
     *
     * @return the tracks value.
     */
    public List<FilterTrackSelection> tracks() {
        return this.tracks;
    }

    /**
     * Set the tracks property: The tracks selection conditions.
     *
     * @param tracks the tracks value to set.
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withTracks(List<FilterTrackSelection> tracks) {
        this.tracks = tracks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (presentationTimeRange() != null) {
            presentationTimeRange().validate();
        }
        if (firstQuality() != null) {
            firstQuality().validate();
        }
        if (tracks() != null) {
            tracks().forEach(e -> e.validate());
        }
    }
}
