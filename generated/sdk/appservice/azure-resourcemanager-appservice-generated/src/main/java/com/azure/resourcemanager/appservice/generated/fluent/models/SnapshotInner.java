// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A snapshot of an app. */
@JsonFlatten
@Immutable
public class SnapshotInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotInner.class);

    /*
     * The time the snapshot was taken.
     */
    @JsonProperty(value = "properties.time", access = JsonProperty.Access.WRITE_ONLY)
    private String time;

    /**
     * Get the time property: The time the snapshot was taken.
     *
     * @return the time value.
     */
    public String time() {
        return this.time;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
