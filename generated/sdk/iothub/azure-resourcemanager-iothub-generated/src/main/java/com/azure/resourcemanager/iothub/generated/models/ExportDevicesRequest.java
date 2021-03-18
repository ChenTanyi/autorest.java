// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Use to provide parameters when requesting an export of all devices in the IoT hub. */
@Fluent
public final class ExportDevicesRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportDevicesRequest.class);

    /*
     * The export blob container URI.
     */
    @JsonProperty(value = "exportBlobContainerUri", required = true)
    private String exportBlobContainerUri;

    /*
     * The value indicating whether keys should be excluded during export.
     */
    @JsonProperty(value = "excludeKeys", required = true)
    private boolean excludeKeys;

    /*
     * The name of the blob that will be created in the provided output blob
     * container. This blob will contain the exported device registry
     * information for the IoT Hub.
     */
    @JsonProperty(value = "exportBlobName")
    private String exportBlobName;

    /*
     * Specifies authentication type being used for connecting to the storage
     * account.
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * Managed identity properties of storage endpoint for export devices.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /**
     * Get the exportBlobContainerUri property: The export blob container URI.
     *
     * @return the exportBlobContainerUri value.
     */
    public String exportBlobContainerUri() {
        return this.exportBlobContainerUri;
    }

    /**
     * Set the exportBlobContainerUri property: The export blob container URI.
     *
     * @param exportBlobContainerUri the exportBlobContainerUri value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExportBlobContainerUri(String exportBlobContainerUri) {
        this.exportBlobContainerUri = exportBlobContainerUri;
        return this;
    }

    /**
     * Get the excludeKeys property: The value indicating whether keys should be excluded during export.
     *
     * @return the excludeKeys value.
     */
    public boolean excludeKeys() {
        return this.excludeKeys;
    }

    /**
     * Set the excludeKeys property: The value indicating whether keys should be excluded during export.
     *
     * @param excludeKeys the excludeKeys value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExcludeKeys(boolean excludeKeys) {
        this.excludeKeys = excludeKeys;
        return this;
    }

    /**
     * Get the exportBlobName property: The name of the blob that will be created in the provided output blob container.
     * This blob will contain the exported device registry information for the IoT Hub.
     *
     * @return the exportBlobName value.
     */
    public String exportBlobName() {
        return this.exportBlobName;
    }

    /**
     * Set the exportBlobName property: The name of the blob that will be created in the provided output blob container.
     * This blob will contain the exported device registry information for the IoT Hub.
     *
     * @param exportBlobName the exportBlobName value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExportBlobName(String exportBlobName) {
        this.exportBlobName = exportBlobName;
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
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties of storage endpoint for export devices.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties of storage endpoint for export devices.
     *
     * @param identity the identity value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exportBlobContainerUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property exportBlobContainerUri in model ExportDevicesRequest"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
