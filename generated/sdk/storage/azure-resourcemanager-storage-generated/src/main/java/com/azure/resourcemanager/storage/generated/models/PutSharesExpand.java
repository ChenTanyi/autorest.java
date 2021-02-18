// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PutSharesExpand. */
public enum PutSharesExpand {
    /** Enum value snapshots. */
    SNAPSHOTS("snapshots");

    /** The actual serialized value for a PutSharesExpand instance. */
    private final String value;

    PutSharesExpand(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PutSharesExpand instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PutSharesExpand object, or null if unable to parse.
     */
    @JsonCreator
    public static PutSharesExpand fromString(String value) {
        PutSharesExpand[] items = PutSharesExpand.values();
        for (PutSharesExpand item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
