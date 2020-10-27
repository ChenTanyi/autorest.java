// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Database. */
@JsonFlatten
@Fluent
public class DatabaseInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseInner.class);

    /*
     * The charset of the database.
     */
    @JsonProperty(value = "properties.charset")
    private String charset;

    /*
     * The collation of the database.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /**
     * Get the charset property: The charset of the database.
     *
     * @return the charset value.
     */
    public String charset() {
        return this.charset;
    }

    /**
     * Set the charset property: The charset of the database.
     *
     * @param charset the charset value to set.
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withCharset(String charset) {
        this.charset = charset;
        return this;
    }

    /**
     * Get the collation property: The collation of the database.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation property: The collation of the database.
     *
     * @param collation the collation value to set.
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withCollation(String collation) {
        this.collation = collation;
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
