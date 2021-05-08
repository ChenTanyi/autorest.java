// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Use to provide parameters when requesting an import of all devices in the hub. */
@Fluent
public final class ImportDevicesRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportDevicesRequest.class);

    /*
     * The input blob container URI.
     */
    @JsonProperty(value = "inputBlobContainerUri", required = true)
    private String inputBlobContainerUri;

    /*
     * The output blob container URI.
     */
    @JsonProperty(value = "outputBlobContainerUri", required = true)
    private String outputBlobContainerUri;

    /*
     * The blob name to be used when importing from the provided input blob
     * container.
     */
    @JsonProperty(value = "inputBlobName")
    private String inputBlobName;

    /*
     * The blob name to use for storing the status of the import job.
     */
    @JsonProperty(value = "outputBlobName")
    private String outputBlobName;

    /*
     * Specifies authentication type being used for connecting to the storage
     * account.
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * Managed identity properties of storage endpoint for import devices.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * The value indicating whether configurations should be imported.
     */
    @JsonProperty(value = "includeConfigurations")
    private Boolean includeConfigurations;

    /*
     * The blob name to be used when importing configurations from the provided
     * input blob container.
     */
    @JsonProperty(value = "configurationsBlobName")
    private String configurationsBlobName;

    /**
     * Get the inputBlobContainerUri property: The input blob container URI.
     *
     * @return the inputBlobContainerUri value.
     */
    public String inputBlobContainerUri() {
        return this.inputBlobContainerUri;
    }

    /**
     * Set the inputBlobContainerUri property: The input blob container URI.
     *
     * @param inputBlobContainerUri the inputBlobContainerUri value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withInputBlobContainerUri(String inputBlobContainerUri) {
        this.inputBlobContainerUri = inputBlobContainerUri;
        return this;
    }

    /**
     * Get the outputBlobContainerUri property: The output blob container URI.
     *
     * @return the outputBlobContainerUri value.
     */
    public String outputBlobContainerUri() {
        return this.outputBlobContainerUri;
    }

    /**
     * Set the outputBlobContainerUri property: The output blob container URI.
     *
     * @param outputBlobContainerUri the outputBlobContainerUri value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withOutputBlobContainerUri(String outputBlobContainerUri) {
        this.outputBlobContainerUri = outputBlobContainerUri;
        return this;
    }

    /**
     * Get the inputBlobName property: The blob name to be used when importing from the provided input blob container.
     *
     * @return the inputBlobName value.
     */
    public String inputBlobName() {
        return this.inputBlobName;
    }

    /**
     * Set the inputBlobName property: The blob name to be used when importing from the provided input blob container.
     *
     * @param inputBlobName the inputBlobName value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withInputBlobName(String inputBlobName) {
        this.inputBlobName = inputBlobName;
        return this;
    }

    /**
     * Get the outputBlobName property: The blob name to use for storing the status of the import job.
     *
     * @return the outputBlobName value.
     */
    public String outputBlobName() {
        return this.outputBlobName;
    }

    /**
     * Set the outputBlobName property: The blob name to use for storing the status of the import job.
     *
     * @param outputBlobName the outputBlobName value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withOutputBlobName(String outputBlobName) {
        this.outputBlobName = outputBlobName;
        return this;
    }

    /**
     * Get the authenticationType property: Specifies authentication type being used for connecting to the storage
     * account.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Specifies authentication type being used for connecting to the storage
     * account.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties of storage endpoint for import devices.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties of storage endpoint for import devices.
     *
     * @param identity the identity value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the includeConfigurations property: The value indicating whether configurations should be imported.
     *
     * @return the includeConfigurations value.
     */
    public Boolean includeConfigurations() {
        return this.includeConfigurations;
    }

    /**
     * Set the includeConfigurations property: The value indicating whether configurations should be imported.
     *
     * @param includeConfigurations the includeConfigurations value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withIncludeConfigurations(Boolean includeConfigurations) {
        this.includeConfigurations = includeConfigurations;
        return this;
    }

    /**
     * Get the configurationsBlobName property: The blob name to be used when importing configurations from the provided
     * input blob container.
     *
     * @return the configurationsBlobName value.
     */
    public String configurationsBlobName() {
        return this.configurationsBlobName;
    }

    /**
     * Set the configurationsBlobName property: The blob name to be used when importing configurations from the provided
     * input blob container.
     *
     * @param configurationsBlobName the configurationsBlobName value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withConfigurationsBlobName(String configurationsBlobName) {
        this.configurationsBlobName = configurationsBlobName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputBlobContainerUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property inputBlobContainerUri in model ImportDevicesRequest"));
        }
        if (outputBlobContainerUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property outputBlobContainerUri in model ImportDevicesRequest"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
