// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The table configuration for the Log Analytics integration. */
@Fluent
public final class AzureMonitorTableConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureMonitorTableConfiguration.class);

    /*
     * The name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: The name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     *
     * @param name the name value to set.
     * @return the AzureMonitorTableConfiguration object itself.
     */
    public AzureMonitorTableConfiguration withName(String name) {
        this.name = name;
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
