// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a built-in preset for encoding the input video with the Standard Encoder. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.BuiltInStandardEncoderPreset")
@JsonFlatten
@Fluent
public class BuiltInStandardEncoderPreset extends Preset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BuiltInStandardEncoderPreset.class);

    /*
     * The built-in preset to be used for encoding videos.
     */
    @JsonProperty(value = "presetName", required = true)
    private EncoderNamedPreset presetName;

    /**
     * Get the presetName property: The built-in preset to be used for encoding videos.
     *
     * @return the presetName value.
     */
    public EncoderNamedPreset presetName() {
        return this.presetName;
    }

    /**
     * Set the presetName property: The built-in preset to be used for encoding videos.
     *
     * @param presetName the presetName value to set.
     * @return the BuiltInStandardEncoderPreset object itself.
     */
    public BuiltInStandardEncoderPreset withPresetName(EncoderNamedPreset presetName) {
        this.presetName = presetName;
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
        if (presetName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property presetName in model BuiltInStandardEncoderPreset"));
        }
    }
}
