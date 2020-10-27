// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContentKeyPolicyFairPlayOfflineRentalConfiguration model. */
@Fluent
public final class ContentKeyPolicyFairPlayOfflineRentalConfiguration {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ContentKeyPolicyFairPlayOfflineRentalConfiguration.class);

    /*
     * Playback duration
     */
    @JsonProperty(value = "playbackDurationSeconds", required = true)
    private long playbackDurationSeconds;

    /*
     * Storage duration
     */
    @JsonProperty(value = "storageDurationSeconds", required = true)
    private long storageDurationSeconds;

    /**
     * Get the playbackDurationSeconds property: Playback duration.
     *
     * @return the playbackDurationSeconds value.
     */
    public long playbackDurationSeconds() {
        return this.playbackDurationSeconds;
    }

    /**
     * Set the playbackDurationSeconds property: Playback duration.
     *
     * @param playbackDurationSeconds the playbackDurationSeconds value to set.
     * @return the ContentKeyPolicyFairPlayOfflineRentalConfiguration object itself.
     */
    public ContentKeyPolicyFairPlayOfflineRentalConfiguration withPlaybackDurationSeconds(
        long playbackDurationSeconds) {
        this.playbackDurationSeconds = playbackDurationSeconds;
        return this;
    }

    /**
     * Get the storageDurationSeconds property: Storage duration.
     *
     * @return the storageDurationSeconds value.
     */
    public long storageDurationSeconds() {
        return this.storageDurationSeconds;
    }

    /**
     * Set the storageDurationSeconds property: Storage duration.
     *
     * @param storageDurationSeconds the storageDurationSeconds value to set.
     * @return the ContentKeyPolicyFairPlayOfflineRentalConfiguration object itself.
     */
    public ContentKeyPolicyFairPlayOfflineRentalConfiguration withStorageDurationSeconds(long storageDurationSeconds) {
        this.storageDurationSeconds = storageDurationSeconds;
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