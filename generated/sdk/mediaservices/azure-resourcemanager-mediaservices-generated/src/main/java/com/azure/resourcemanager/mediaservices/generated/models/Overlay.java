// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Base type for all overlays - image, audio or video. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = Overlay.class)
@JsonTypeName("Overlay")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AudioOverlay", value = AudioOverlay.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.VideoOverlay", value = VideoOverlay.class)
})
@JsonFlatten
@Fluent
public class Overlay {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Overlay.class);

    /*
     * The label of the job input which is to be used as an overlay. The Input
     * must specify exactly one file. You can specify an image file in JPG or
     * PNG formats, or an audio file (such as a WAV, MP3, WMA or M4A file), or
     * a video file. See https://aka.ms/mesformats for the complete list of
     * supported audio and video file formats.
     */
    @JsonProperty(value = "inputLabel", required = true)
    private String inputLabel;

    /*
     * The start position, with reference to the input video, at which the
     * overlay starts. The value should be in ISO 8601 format. For example,
     * PT05S to start the overlay at 5 seconds into the input video. If not
     * specified the overlay starts from the beginning of the input video.
     */
    @JsonProperty(value = "start")
    private Duration start;

    /*
     * The end position, with reference to the input video, at which the
     * overlay ends. The value should be in ISO 8601 format. For example, PT30S
     * to end the overlay at 30 seconds into the input video. If not specified
     * or the value is greater than the input video duration, the overlay will
     * be applied until the end of the input video if the overlay media
     * duration is greater than the input video duration, else the overlay will
     * last as long as the overlay media duration.
     */
    @JsonProperty(value = "end")
    private Duration end;

    /*
     * The duration over which the overlay fades in onto the input video. The
     * value should be in ISO 8601 duration format. If not specified the
     * default behavior is to have no fade in (same as PT0S).
     */
    @JsonProperty(value = "fadeInDuration")
    private Duration fadeInDuration;

    /*
     * The duration over which the overlay fades out of the input video. The
     * value should be in ISO 8601 duration format. If not specified the
     * default behavior is to have no fade out (same as PT0S).
     */
    @JsonProperty(value = "fadeOutDuration")
    private Duration fadeOutDuration;

    /*
     * The gain level of audio in the overlay. The value should be in the range
     * [0, 1.0]. The default is 1.0.
     */
    @JsonProperty(value = "audioGainLevel")
    private Double audioGainLevel;

    /**
     * Get the inputLabel property: The label of the job input which is to be used as an overlay. The Input must specify
     * exactly one file. You can specify an image file in JPG or PNG formats, or an audio file (such as a WAV, MP3, WMA
     * or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video
     * file formats.
     *
     * @return the inputLabel value.
     */
    public String inputLabel() {
        return this.inputLabel;
    }

    /**
     * Set the inputLabel property: The label of the job input which is to be used as an overlay. The Input must specify
     * exactly one file. You can specify an image file in JPG or PNG formats, or an audio file (such as a WAV, MP3, WMA
     * or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video
     * file formats.
     *
     * @param inputLabel the inputLabel value to set.
     * @return the Overlay object itself.
     */
    public Overlay withInputLabel(String inputLabel) {
        this.inputLabel = inputLabel;
        return this;
    }

    /**
     * Get the start property: The start position, with reference to the input video, at which the overlay starts. The
     * value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If
     * not specified the overlay starts from the beginning of the input video.
     *
     * @return the start value.
     */
    public Duration start() {
        return this.start;
    }

    /**
     * Set the start property: The start position, with reference to the input video, at which the overlay starts. The
     * value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If
     * not specified the overlay starts from the beginning of the input video.
     *
     * @param start the start value to set.
     * @return the Overlay object itself.
     */
    public Overlay withStart(Duration start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: The end position, with reference to the input video, at which the overlay ends. The value
     * should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not
     * specified or the value is greater than the input video duration, the overlay will be applied until the end of the
     * input video if the overlay media duration is greater than the input video duration, else the overlay will last as
     * long as the overlay media duration.
     *
     * @return the end value.
     */
    public Duration end() {
        return this.end;
    }

    /**
     * Set the end property: The end position, with reference to the input video, at which the overlay ends. The value
     * should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not
     * specified or the value is greater than the input video duration, the overlay will be applied until the end of the
     * input video if the overlay media duration is greater than the input video duration, else the overlay will last as
     * long as the overlay media duration.
     *
     * @param end the end value to set.
     * @return the Overlay object itself.
     */
    public Overlay withEnd(Duration end) {
        this.end = end;
        return this;
    }

    /**
     * Get the fadeInDuration property: The duration over which the overlay fades in onto the input video. The value
     * should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as
     * PT0S).
     *
     * @return the fadeInDuration value.
     */
    public Duration fadeInDuration() {
        return this.fadeInDuration;
    }

    /**
     * Set the fadeInDuration property: The duration over which the overlay fades in onto the input video. The value
     * should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as
     * PT0S).
     *
     * @param fadeInDuration the fadeInDuration value to set.
     * @return the Overlay object itself.
     */
    public Overlay withFadeInDuration(Duration fadeInDuration) {
        this.fadeInDuration = fadeInDuration;
        return this;
    }

    /**
     * Get the fadeOutDuration property: The duration over which the overlay fades out of the input video. The value
     * should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as
     * PT0S).
     *
     * @return the fadeOutDuration value.
     */
    public Duration fadeOutDuration() {
        return this.fadeOutDuration;
    }

    /**
     * Set the fadeOutDuration property: The duration over which the overlay fades out of the input video. The value
     * should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as
     * PT0S).
     *
     * @param fadeOutDuration the fadeOutDuration value to set.
     * @return the Overlay object itself.
     */
    public Overlay withFadeOutDuration(Duration fadeOutDuration) {
        this.fadeOutDuration = fadeOutDuration;
        return this;
    }

    /**
     * Get the audioGainLevel property: The gain level of audio in the overlay. The value should be in the range [0,
     * 1.0]. The default is 1.0.
     *
     * @return the audioGainLevel value.
     */
    public Double audioGainLevel() {
        return this.audioGainLevel;
    }

    /**
     * Set the audioGainLevel property: The gain level of audio in the overlay. The value should be in the range [0,
     * 1.0]. The default is 1.0.
     *
     * @param audioGainLevel the audioGainLevel value to set.
     * @return the Overlay object itself.
     */
    public Overlay withAudioGainLevel(Double audioGainLevel) {
        this.audioGainLevel = audioGainLevel;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputLabel() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property inputLabel in model Overlay"));
        }
    }
}
