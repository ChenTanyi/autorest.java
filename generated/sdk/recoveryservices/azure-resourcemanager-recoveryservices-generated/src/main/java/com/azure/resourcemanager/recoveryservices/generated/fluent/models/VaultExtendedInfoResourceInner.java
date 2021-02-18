// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Vault extended information. */
@JsonFlatten
@Fluent
public class VaultExtendedInfoResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VaultExtendedInfoResourceInner.class);

    /*
     * Integrity key.
     */
    @JsonProperty(value = "properties.integrityKey")
    private String integrityKey;

    /*
     * Encryption key.
     */
    @JsonProperty(value = "properties.encryptionKey")
    private String encryptionKey;

    /*
     * Encryption key thumbprint.
     */
    @JsonProperty(value = "properties.encryptionKeyThumbprint")
    private String encryptionKeyThumbprint;

    /*
     * Algorithm for Vault ExtendedInfo
     */
    @JsonProperty(value = "properties.algorithm")
    private String algorithm;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the integrityKey property: Integrity key.
     *
     * @return the integrityKey value.
     */
    public String integrityKey() {
        return this.integrityKey;
    }

    /**
     * Set the integrityKey property: Integrity key.
     *
     * @param integrityKey the integrityKey value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withIntegrityKey(String integrityKey) {
        this.integrityKey = integrityKey;
        return this;
    }

    /**
     * Get the encryptionKey property: Encryption key.
     *
     * @return the encryptionKey value.
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: Encryption key.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * Get the encryptionKeyThumbprint property: Encryption key thumbprint.
     *
     * @return the encryptionKeyThumbprint value.
     */
    public String encryptionKeyThumbprint() {
        return this.encryptionKeyThumbprint;
    }

    /**
     * Set the encryptionKeyThumbprint property: Encryption key thumbprint.
     *
     * @param encryptionKeyThumbprint the encryptionKeyThumbprint value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEncryptionKeyThumbprint(String encryptionKeyThumbprint) {
        this.encryptionKeyThumbprint = encryptionKeyThumbprint;
        return this;
    }

    /**
     * Get the algorithm property: Algorithm for Vault ExtendedInfo.
     *
     * @return the algorithm value.
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: Algorithm for Vault ExtendedInfo.
     *
     * @param algorithm the algorithm value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the etag property: Optional ETag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Optional ETag.
     *
     * @param etag the etag value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEtag(String etag) {
        this.etag = etag;
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
