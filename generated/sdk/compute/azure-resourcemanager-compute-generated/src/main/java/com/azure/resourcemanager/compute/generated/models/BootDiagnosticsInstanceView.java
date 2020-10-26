// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The instance view of a virtual machine boot diagnostics. */
@Immutable
public final class BootDiagnosticsInstanceView {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BootDiagnosticsInstanceView.class);

    /*
     * The console screenshot blob URI. <br><br>NOTE: This will **not** be set
     * if boot diagnostics is currently enabled with managed storage.
     */
    @JsonProperty(value = "consoleScreenshotBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String consoleScreenshotBlobUri;

    /*
     * The serial console log blob Uri. <br><br>NOTE: This will **not** be set
     * if boot diagnostics is currently enabled with managed storage.
     */
    @JsonProperty(value = "serialConsoleLogBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String serialConsoleLogBlobUri;

    /*
     * The boot diagnostics status information for the VM. <br><br> NOTE: It
     * will be set only if there are errors encountered in enabling boot
     * diagnostics.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private InstanceViewStatus status;

    /**
     * Get the consoleScreenshotBlobUri property: The console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will
     * **not** be set if boot diagnostics is currently enabled with managed storage.
     *
     * @return the consoleScreenshotBlobUri value.
     */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    /**
     * Get the serialConsoleLogBlobUri property: The serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will
     * **not** be set if boot diagnostics is currently enabled with managed storage.
     *
     * @return the serialConsoleLogBlobUri value.
     */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

    /**
     * Get the status property: The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will
     * be set only if there are errors encountered in enabling boot diagnostics.
     *
     * @return the status value.
     */
    public InstanceViewStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
    }
}