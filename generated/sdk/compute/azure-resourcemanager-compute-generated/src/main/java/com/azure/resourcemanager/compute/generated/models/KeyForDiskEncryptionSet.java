// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Key Vault Key Url to be used for server side encryption of Managed Disks and Snapshots. */
@Fluent
public final class KeyForDiskEncryptionSet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyForDiskEncryptionSet.class);

    /*
     * Resource id of the KeyVault containing the key or secret. This property
     * is optional and cannot be used if the KeyVault subscription is not the
     * same as the Disk Encryption Set subscription.
     */
    @JsonProperty(value = "sourceVault")
    private SourceVault sourceVault;

    /*
     * Fully versioned Key Url pointing to a key in KeyVault
     */
    @JsonProperty(value = "keyUrl", required = true)
    private String keyUrl;

    /**
     * Get the sourceVault property: Resource id of the KeyVault containing the key or secret. This property is optional
     * and cannot be used if the KeyVault subscription is not the same as the Disk Encryption Set subscription.
     *
     * @return the sourceVault value.
     */
    public SourceVault sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: Resource id of the KeyVault containing the key or secret. This property is optional
     * and cannot be used if the KeyVault subscription is not the same as the Disk Encryption Set subscription.
     *
     * @param sourceVault the sourceVault value to set.
     * @return the KeyForDiskEncryptionSet object itself.
     */
    public KeyForDiskEncryptionSet withSourceVault(SourceVault sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the keyUrl property: Fully versioned Key Url pointing to a key in KeyVault.
     *
     * @return the keyUrl value.
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set the keyUrl property: Fully versioned Key Url pointing to a key in KeyVault.
     *
     * @param keyUrl the keyUrl value to set.
     * @return the KeyForDiskEncryptionSet object itself.
     */
    public KeyForDiskEncryptionSet withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceVault() != null) {
            sourceVault().validate();
        }
        if (keyUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyUrl in model KeyForDiskEncryptionSet"));
        }
    }
}