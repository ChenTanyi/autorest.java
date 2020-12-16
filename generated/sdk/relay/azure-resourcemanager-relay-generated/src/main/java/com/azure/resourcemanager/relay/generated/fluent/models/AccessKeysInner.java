// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Namespace/Relay Connection String. */
@Fluent
public final class AccessKeysInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccessKeysInner.class);

    /*
     * Primary connection string of the created namespace authorization rule.
     */
    @JsonProperty(value = "primaryConnectionString")
    private String primaryConnectionString;

    /*
     * Secondary connection string of the created namespace authorization rule.
     */
    @JsonProperty(value = "secondaryConnectionString")
    private String secondaryConnectionString;

    /*
     * A base64-encoded 256-bit primary key for signing and validating the SAS
     * token.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /*
     * A base64-encoded 256-bit secondary key for signing and validating the
     * SAS token.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /*
     * A string that describes the authorization rule.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /**
     * Get the primaryConnectionString property: Primary connection string of the created namespace authorization rule.
     *
     * @return the primaryConnectionString value.
     */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }

    /**
     * Set the primaryConnectionString property: Primary connection string of the created namespace authorization rule.
     *
     * @param primaryConnectionString the primaryConnectionString value to set.
     * @return the AccessKeysInner object itself.
     */
    public AccessKeysInner withPrimaryConnectionString(String primaryConnectionString) {
        this.primaryConnectionString = primaryConnectionString;
        return this;
    }

    /**
     * Get the secondaryConnectionString property: Secondary connection string of the created namespace authorization
     * rule.
     *
     * @return the secondaryConnectionString value.
     */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }

    /**
     * Set the secondaryConnectionString property: Secondary connection string of the created namespace authorization
     * rule.
     *
     * @param secondaryConnectionString the secondaryConnectionString value to set.
     * @return the AccessKeysInner object itself.
     */
    public AccessKeysInner withSecondaryConnectionString(String secondaryConnectionString) {
        this.secondaryConnectionString = secondaryConnectionString;
        return this;
    }

    /**
     * Get the primaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the AccessKeysInner object itself.
     */
    public AccessKeysInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: A base64-encoded 256-bit secondary key for signing and validating the SAS token.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: A base64-encoded 256-bit secondary key for signing and validating the SAS token.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the AccessKeysInner object itself.
     */
    public AccessKeysInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get the keyName property: A string that describes the authorization rule.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: A string that describes the authorization rule.
     *
     * @param keyName the keyName value to set.
     * @return the AccessKeysInner object itself.
     */
    public AccessKeysInner withKeyName(String keyName) {
        this.keyName = keyName;
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