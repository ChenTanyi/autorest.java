// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.generated.fluent.models.ServerInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of servers. */
@Fluent
public final class ServerListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerListResult.class);

    /*
     * The list of servers
     */
    @JsonProperty(value = "value")
    private List<ServerInner> value;

    /**
     * Get the value property: The list of servers.
     *
     * @return the value value.
     */
    public List<ServerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of servers.
     *
     * @param value the value value to set.
     * @return the ServerListResult object itself.
     */
    public ServerListResult withValue(List<ServerInner> value) {
        this.value = value;
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
