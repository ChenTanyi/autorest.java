// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the key. */
@Fluent
public final class KeyProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyProperties.class);

    /*
     * The attributes of the key.
     */
    @JsonProperty(value = "attributes")
    private KeyAttributes attributes;

    /*
     * The type of the key. For valid values, see JsonWebKeyType.
     */
    @JsonProperty(value = "kty")
    private JsonWebKeyType kty;

    /*
     * The keyOps property.
     */
    @JsonProperty(value = "keyOps")
    private List<JsonWebKeyOperation> keyOps;

    /*
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     */
    @JsonProperty(value = "keySize")
    private Integer keySize;

    /*
     * The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     */
    @JsonProperty(value = "curveName")
    private JsonWebKeyCurveName curveName;

    /*
     * The URI to retrieve the current version of the key.
     */
    @JsonProperty(value = "keyUri", access = JsonProperty.Access.WRITE_ONLY)
    private String keyUri;

    /*
     * The URI to retrieve the specific version of the key.
     */
    @JsonProperty(value = "keyUriWithVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String keyUriWithVersion;

    /**
     * Get the attributes property: The attributes of the key.
     *
     * @return the attributes value.
     */
    public KeyAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The attributes of the key.
     *
     * @param attributes the attributes value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties withAttributes(KeyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the kty property: The type of the key. For valid values, see JsonWebKeyType.
     *
     * @return the kty value.
     */
    public JsonWebKeyType kty() {
        return this.kty;
    }

    /**
     * Set the kty property: The type of the key. For valid values, see JsonWebKeyType.
     *
     * @param kty the kty value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties withKty(JsonWebKeyType kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get the keyOps property: The keyOps property.
     *
     * @return the keyOps value.
     */
    public List<JsonWebKeyOperation> keyOps() {
        return this.keyOps;
    }

    /**
     * Set the keyOps property: The keyOps property.
     *
     * @param keyOps the keyOps value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties withKeyOps(List<JsonWebKeyOperation> keyOps) {
        this.keyOps = keyOps;
        return this;
    }

    /**
     * Get the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     *
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     *
     * @param keySize the keySize value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the curveName property: The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     *
     * @return the curveName value.
     */
    public JsonWebKeyCurveName curveName() {
        return this.curveName;
    }

    /**
     * Set the curveName property: The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     *
     * @param curveName the curveName value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties withCurveName(JsonWebKeyCurveName curveName) {
        this.curveName = curveName;
        return this;
    }

    /**
     * Get the keyUri property: The URI to retrieve the current version of the key.
     *
     * @return the keyUri value.
     */
    public String keyUri() {
        return this.keyUri;
    }

    /**
     * Get the keyUriWithVersion property: The URI to retrieve the specific version of the key.
     *
     * @return the keyUriWithVersion value.
     */
    public String keyUriWithVersion() {
        return this.keyUriWithVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attributes() != null) {
            attributes().validate();
        }
    }
}
