// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.AssetStorageEncryptionFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** An Asset. */
@JsonFlatten
@Fluent
public class AssetInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AssetInner.class);

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The Asset ID.
     */
    @JsonProperty(value = "properties.assetId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID assetId;

    /*
     * The creation date of the Asset.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The last modified date of the Asset.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The alternate ID of the Asset.
     */
    @JsonProperty(value = "properties.alternateId")
    private String alternateId;

    /*
     * The Asset description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The name of the asset blob container.
     */
    @JsonProperty(value = "properties.container")
    private String container;

    /*
     * The name of the storage account.
     */
    @JsonProperty(value = "properties.storageAccountName")
    private String storageAccountName;

    /*
     * The Asset encryption format. One of None or MediaStorageEncryption.
     */
    @JsonProperty(value = "properties.storageEncryptionFormat", access = JsonProperty.Access.WRITE_ONLY)
    private AssetStorageEncryptionFormat storageEncryptionFormat;

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the assetId property: The Asset ID.
     *
     * @return the assetId value.
     */
    public UUID assetId() {
        return this.assetId;
    }

    /**
     * Get the created property: The creation date of the Asset.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The last modified date of the Asset.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the alternateId property: The alternate ID of the Asset.
     *
     * @return the alternateId value.
     */
    public String alternateId() {
        return this.alternateId;
    }

    /**
     * Set the alternateId property: The alternate ID of the Asset.
     *
     * @param alternateId the alternateId value to set.
     * @return the AssetInner object itself.
     */
    public AssetInner withAlternateId(String alternateId) {
        this.alternateId = alternateId;
        return this;
    }

    /**
     * Get the description property: The Asset description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The Asset description.
     *
     * @param description the description value to set.
     * @return the AssetInner object itself.
     */
    public AssetInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the container property: The name of the asset blob container.
     *
     * @return the container value.
     */
    public String container() {
        return this.container;
    }

    /**
     * Set the container property: The name of the asset blob container.
     *
     * @param container the container value to set.
     * @return the AssetInner object itself.
     */
    public AssetInner withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Get the storageAccountName property: The name of the storage account.
     *
     * @return the storageAccountName value.
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the storageAccountName property: The name of the storage account.
     *
     * @param storageAccountName the storageAccountName value to set.
     * @return the AssetInner object itself.
     */
    public AssetInner withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the storageEncryptionFormat property: The Asset encryption format. One of None or MediaStorageEncryption.
     *
     * @return the storageEncryptionFormat value.
     */
    public AssetStorageEncryptionFormat storageEncryptionFormat() {
        return this.storageEncryptionFormat;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
