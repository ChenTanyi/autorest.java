// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Specifies the live event type and optional encoding settings for encoding live events. */
@Fluent
public final class LiveEventEncoding {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LiveEventEncoding.class);

    /*
     * Live event type. When encodingType is set to None, the service simply
     * passes through the incoming video and audio layer(s) to the output. When
     * encodingType is set to Standard or Premium1080p, a live encoder
     * transcodes the incoming stream into multiple bitrates or layers. See
     * https://go.microsoft.com/fwlink/?linkid=2095101 for more information.
     * This property cannot be modified after the live event is created.
     */
    @JsonProperty(value = "encodingType")
    private LiveEventEncodingType encodingType;

    /*
     * The optional encoding preset name, used when encodingType is not None.
     * This value is specified at creation time and cannot be updated. If the
     * encodingType is set to Standard, then the default preset name is
     * ‘Default720p’. Else if the encodingType is set to Premium1080p, the
     * default preset is ‘Default1080p’.
     */
    @JsonProperty(value = "presetName")
    private String presetName;

    /*
     * Specifies how the input video will be resized to fit the desired output
     * resolution(s). Default is None
     */
    @JsonProperty(value = "stretchMode")
    private StretchMode stretchMode;

    /*
     * Use an ISO 8601 time value between 0.5 to 20 seconds to specify the
     * output fragment length for the video and audio tracks of an encoding
     * live event. For example, use PT2S to indicate 2 seconds. For the video
     * track it also defines the key frame interval, or the length of a GoP
     * (group of pictures).   If this value is not set for an encoding live
     * event, the fragment duration defaults to 2 seconds. The value cannot be
     * set for pass-through live events.
     */
    @JsonProperty(value = "keyFrameInterval")
    private Duration keyFrameInterval;

    /**
     * Get the encodingType property: Live event type. When encodingType is set to None, the service simply passes
     * through the incoming video and audio layer(s) to the output. When encodingType is set to Standard or
     * Premium1080p, a live encoder transcodes the incoming stream into multiple bitrates or layers. See
     * https://go.microsoft.com/fwlink/?linkid=2095101 for more information. This property cannot be modified after the
     * live event is created.
     *
     * @return the encodingType value.
     */
    public LiveEventEncodingType encodingType() {
        return this.encodingType;
    }

    /**
     * Set the encodingType property: Live event type. When encodingType is set to None, the service simply passes
     * through the incoming video and audio layer(s) to the output. When encodingType is set to Standard or
     * Premium1080p, a live encoder transcodes the incoming stream into multiple bitrates or layers. See
     * https://go.microsoft.com/fwlink/?linkid=2095101 for more information. This property cannot be modified after the
     * live event is created.
     *
     * @param encodingType the encodingType value to set.
     * @return the LiveEventEncoding object itself.
     */
    public LiveEventEncoding withEncodingType(LiveEventEncodingType encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * Get the presetName property: The optional encoding preset name, used when encodingType is not None. This value is
     * specified at creation time and cannot be updated. If the encodingType is set to Standard, then the default preset
     * name is ‘Default720p’. Else if the encodingType is set to Premium1080p, the default preset is ‘Default1080p’.
     *
     * @return the presetName value.
     */
    public String presetName() {
        return this.presetName;
    }

    /**
     * Set the presetName property: The optional encoding preset name, used when encodingType is not None. This value is
     * specified at creation time and cannot be updated. If the encodingType is set to Standard, then the default preset
     * name is ‘Default720p’. Else if the encodingType is set to Premium1080p, the default preset is ‘Default1080p’.
     *
     * @param presetName the presetName value to set.
     * @return the LiveEventEncoding object itself.
     */
    public LiveEventEncoding withPresetName(String presetName) {
        this.presetName = presetName;
        return this;
    }

    /**
     * Get the stretchMode property: Specifies how the input video will be resized to fit the desired output
     * resolution(s). Default is None.
     *
     * @return the stretchMode value.
     */
    public StretchMode stretchMode() {
        return this.stretchMode;
    }

    /**
     * Set the stretchMode property: Specifies how the input video will be resized to fit the desired output
     * resolution(s). Default is None.
     *
     * @param stretchMode the stretchMode value to set.
     * @return the LiveEventEncoding object itself.
     */
    public LiveEventEncoding withStretchMode(StretchMode stretchMode) {
        this.stretchMode = stretchMode;
        return this;
    }

    /**
     * Get the keyFrameInterval property: Use an ISO 8601 time value between 0.5 to 20 seconds to specify the output
     * fragment length for the video and audio tracks of an encoding live event. For example, use PT2S to indicate 2
     * seconds. For the video track it also defines the key frame interval, or the length of a GoP (group of pictures).
     * If this value is not set for an encoding live event, the fragment duration defaults to 2 seconds. The value
     * cannot be set for pass-through live events.
     *
     * @return the keyFrameInterval value.
     */
    public Duration keyFrameInterval() {
        return this.keyFrameInterval;
    }

    /**
     * Set the keyFrameInterval property: Use an ISO 8601 time value between 0.5 to 20 seconds to specify the output
     * fragment length for the video and audio tracks of an encoding live event. For example, use PT2S to indicate 2
     * seconds. For the video track it also defines the key frame interval, or the length of a GoP (group of pictures).
     * If this value is not set for an encoding live event, the fragment duration defaults to 2 seconds. The value
     * cannot be set for pass-through live events.
     *
     * @param keyFrameInterval the keyFrameInterval value to set.
     * @return the LiveEventEncoding object itself.
     */
    public LiveEventEncoding withKeyFrameInterval(Duration keyFrameInterval) {
        this.keyFrameInterval = keyFrameInterval;
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