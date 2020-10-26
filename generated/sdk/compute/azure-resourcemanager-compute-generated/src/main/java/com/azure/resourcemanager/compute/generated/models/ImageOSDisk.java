// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an Operating System disk. */
@Fluent
public final class ImageOSDisk extends ImageDisk {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageOSDisk.class);

    /*
     * This property allows you to specify the type of the OS that is included
     * in the disk if creating a VM from a custom image. <br><br> Possible
     * values are: <br><br> **Windows** <br><br> **Linux**
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemTypes osType;

    /*
     * The OS State.
     */
    @JsonProperty(value = "osState", required = true)
    private OperatingSystemStateTypes osState;

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @param osType the osType value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState property: The OS State.
     *
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState property: The OS State.
     *
     * @param osState the osState value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
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
        if (osType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property osType in model ImageOSDisk"));
        }
        if (osState() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property osState in model ImageOSDisk"));
        }
    }
}
