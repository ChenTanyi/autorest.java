// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters used to create a key. */
@Fluent
public final class KeyCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyCreateParameters.class);

    /*
     * The tags that will be assigned to the key.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The properties of the key to be created.
     */
    @JsonProperty(value = "properties", required = true)
    private KeyProperties properties;

    /**
     * Get the tags property: The tags that will be assigned to the key.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the key.
     *
     * @param tags the tags value to set.
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties of the key to be created.
     *
     * @return the properties value.
     */
    public KeyProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the key to be created.
     *
     * @param properties the properties value to set.
     * @return the KeyCreateParameters object itself.
     */
    public KeyCreateParameters withProperties(KeyProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model KeyCreateParameters"));
        } else {
            properties().validate();
        }
    }
}