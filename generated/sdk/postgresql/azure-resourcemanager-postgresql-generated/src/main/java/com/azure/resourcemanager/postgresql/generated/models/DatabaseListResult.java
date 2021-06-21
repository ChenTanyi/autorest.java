// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.generated.fluent.models.DatabaseInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A List of databases. */
@Fluent
public final class DatabaseListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseListResult.class);

    /*
     * The list of databases housed in a server
     */
    @JsonProperty(value = "value")
    private List<DatabaseInner> value;

    /*
     * The link used to get the next page of databases.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of databases housed in a server.
     *
     * @return the value value.
     */
    public List<DatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of databases housed in a server.
     *
     * @param value the value value to set.
     * @return the DatabaseListResult object itself.
     */
    public DatabaseListResult withValue(List<DatabaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of databases.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of databases.
     *
     * @param nextLink the nextLink value to set.
     * @return the DatabaseListResult object itself.
     */
    public DatabaseListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
