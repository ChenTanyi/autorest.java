// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for FrontEndServiceType. */
public enum FrontEndServiceType {
    /** Enum value NodePort. */
    NODE_PORT("NodePort"),

    /** Enum value LoadBalancer. */
    LOAD_BALANCER("LoadBalancer");

    /** The actual serialized value for a FrontEndServiceType instance. */
    private final String value;

    FrontEndServiceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FrontEndServiceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FrontEndServiceType object, or null if unable to parse.
     */
    @JsonCreator
    public static FrontEndServiceType fromString(String value) {
        FrontEndServiceType[] items = FrontEndServiceType.values();
        for (FrontEndServiceType item : items) {
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
