// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Vcores capability. */
@Immutable
public final class VcoreCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VcoreCapability.class);

    /*
     * vCore name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * supported vCores
     */
    @JsonProperty(value = "vCores", access = JsonProperty.Access.WRITE_ONLY)
    private Long vCores;

    /*
     * supported IOPS
     */
    @JsonProperty(value = "supportedIops", access = JsonProperty.Access.WRITE_ONLY)
    private Long supportedIops;

    /*
     * supported memory per vCore in MB
     */
    @JsonProperty(value = "supportedMemoryPerVcoreMB", access = JsonProperty.Access.WRITE_ONLY)
    private Long supportedMemoryPerVcoreMB;

    /*
     * The status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the name property: vCore name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the vCores property: supported vCores.
     *
     * @return the vCores value.
     */
    public Long vCores() {
        return this.vCores;
    }

    /**
     * Get the supportedIops property: supported IOPS.
     *
     * @return the supportedIops value.
     */
    public Long supportedIops() {
        return this.supportedIops;
    }

    /**
     * Get the supportedMemoryPerVcoreMB property: supported memory per vCore in MB.
     *
     * @return the supportedMemoryPerVcoreMB value.
     */
    public Long supportedMemoryPerVcoreMB() {
        return this.supportedMemoryPerVcoreMB;
    }

    /**
     * Get the status property: The status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
