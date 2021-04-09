// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters for creating or updating a secret. */
@Fluent
public final class SecretCreateOrUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretCreateOrUpdateParameters.class);

    /*
     * The tags that will be assigned to the secret.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Properties of the secret
     */
    @JsonProperty(value = "properties", required = true)
    private SecretProperties properties;

    /**
     * Get the tags property: The tags that will be assigned to the secret.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the secret.
     *
     * @param tags the tags value to set.
     * @return the SecretCreateOrUpdateParameters object itself.
     */
    public SecretCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties of the secret.
     *
     * @return the properties value.
     */
    public SecretProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the secret.
     *
     * @param properties the properties value to set.
     * @return the SecretCreateOrUpdateParameters object itself.
     */
    public SecretCreateOrUpdateParameters withProperties(SecretProperties properties) {
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
                    new IllegalArgumentException(
                        "Missing required property properties in model SecretCreateOrUpdateParameters"));
        } else {
            properties().validate();
        }
    }
}