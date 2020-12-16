// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AliasPathMetadata model. */
@Immutable
public final class AliasPathMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AliasPathMetadata.class);

    /*
     * The type of the token that the alias path is referring to.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private AliasPathTokenType type;

    /*
     * The attributes of the token that the alias path is referring to.
     */
    @JsonProperty(value = "attributes", access = JsonProperty.Access.WRITE_ONLY)
    private AliasPathAttributes attributes;

    /**
     * Get the type property: The type of the token that the alias path is referring to.
     *
     * @return the type value.
     */
    public AliasPathTokenType type() {
        return this.type;
    }

    /**
     * Get the attributes property: The attributes of the token that the alias path is referring to.
     *
     * @return the attributes value.
     */
    public AliasPathAttributes attributes() {
        return this.attributes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
