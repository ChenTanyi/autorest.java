// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ProvisioningStateDR. */
public enum ProvisioningStateDR {
    /** Enum value Accepted. */
    ACCEPTED("Accepted"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a ProvisioningStateDR instance. */
    private final String value;

    ProvisioningStateDR(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProvisioningStateDR instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProvisioningStateDR object, or null if unable to parse.
     */
    @JsonCreator
    public static ProvisioningStateDR fromString(String value) {
        ProvisioningStateDR[] items = ProvisioningStateDR.values();
        for (ProvisioningStateDR item : items) {
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