// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to specify configurations of PlayReady in Streaming Policy. */
@Fluent
public final class StreamingPolicyPlayReadyConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingPolicyPlayReadyConfiguration.class);

    /*
     * Template for the URL of the custom service delivering licenses to end
     * user players.  Not required when using Azure Media Services for issuing
     * licenses.  The template supports replaceable tokens that the service
     * will update at runtime with the value specific to the request.  The
     * currently supported token values are {AlternativeMediaId}, which is
     * replaced with the value of StreamingLocatorId.AlternativeMediaId, and
     * {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     */
    @JsonProperty(value = "customLicenseAcquisitionUrlTemplate")
    private String customLicenseAcquisitionUrlTemplate;

    /*
     * Custom attributes for PlayReady
     */
    @JsonProperty(value = "playReadyCustomAttributes")
    private String playReadyCustomAttributes;

    /**
     * Get the customLicenseAcquisitionUrlTemplate property: Template for the URL of the custom service delivering
     * licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token values are {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     *
     * @return the customLicenseAcquisitionUrlTemplate value.
     */
    public String customLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate;
    }

    /**
     * Set the customLicenseAcquisitionUrlTemplate property: Template for the URL of the custom service delivering
     * licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token values are {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     *
     * @param customLicenseAcquisitionUrlTemplate the customLicenseAcquisitionUrlTemplate value to set.
     * @return the StreamingPolicyPlayReadyConfiguration object itself.
     */
    public StreamingPolicyPlayReadyConfiguration withCustomLicenseAcquisitionUrlTemplate(
        String customLicenseAcquisitionUrlTemplate) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        return this;
    }

    /**
     * Get the playReadyCustomAttributes property: Custom attributes for PlayReady.
     *
     * @return the playReadyCustomAttributes value.
     */
    public String playReadyCustomAttributes() {
        return this.playReadyCustomAttributes;
    }

    /**
     * Set the playReadyCustomAttributes property: Custom attributes for PlayReady.
     *
     * @param playReadyCustomAttributes the playReadyCustomAttributes value to set.
     * @return the StreamingPolicyPlayReadyConfiguration object itself.
     */
    public StreamingPolicyPlayReadyConfiguration withPlayReadyCustomAttributes(String playReadyCustomAttributes) {
        this.playReadyCustomAttributes = playReadyCustomAttributes;
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