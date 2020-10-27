// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for IotHubNameUnavailabilityReason. */
public enum IotHubNameUnavailabilityReason {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value AlreadyExists. */
    ALREADY_EXISTS("AlreadyExists");

    /** The actual serialized value for a IotHubNameUnavailabilityReason instance. */
    private final String value;

    IotHubNameUnavailabilityReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IotHubNameUnavailabilityReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IotHubNameUnavailabilityReason object, or null if unable to parse.
     */
    @JsonCreator
    public static IotHubNameUnavailabilityReason fromString(String value) {
        IotHubNameUnavailabilityReason[] items = IotHubNameUnavailabilityReason.values();
        for (IotHubNameUnavailabilityReason item : items) {
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