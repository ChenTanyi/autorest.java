// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The encryption properties for the IoT hub. */
@Fluent
public final class EncryptionPropertiesDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionPropertiesDescription.class);

    /*
     * The source of the key.
     */
    @JsonProperty(value = "keySource")
    private String keySource;

    /*
     * The properties of the KeyVault key.
     */
    @JsonProperty(value = "keyVaultProperties")
    private List<KeyVaultKeyProperties> keyVaultProperties;

    /**
     * Get the keySource property: The source of the key.
     *
     * @return the keySource value.
     */
    public String keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: The source of the key.
     *
     * @param keySource the keySource value to set.
     * @return the EncryptionPropertiesDescription object itself.
     */
    public EncryptionPropertiesDescription withKeySource(String keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the keyVaultProperties property: The properties of the KeyVault key.
     *
     * @return the keyVaultProperties value.
     */
    public List<KeyVaultKeyProperties> keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The properties of the KeyVault key.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionPropertiesDescription object itself.
     */
    public EncryptionPropertiesDescription withKeyVaultProperties(List<KeyVaultKeyProperties> keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().forEach(e -> e.validate());
        }
    }
}
