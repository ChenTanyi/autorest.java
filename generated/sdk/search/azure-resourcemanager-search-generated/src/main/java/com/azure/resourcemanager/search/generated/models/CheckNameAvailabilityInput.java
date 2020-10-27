// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input of check name availability API. */
@Fluent
public final class CheckNameAvailabilityInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilityInput.class);

    /*
     * The search service name to validate. Search service names must only
     * contain lowercase letters, digits or dashes, cannot use dash as the
     * first two or last one characters, cannot contain consecutive dashes, and
     * must be between 2 and 60 characters in length.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of the resource whose name is to be validated. This value must
     * always be 'searchServices'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /** Creates an instance of CheckNameAvailabilityInput class. */
    public CheckNameAvailabilityInput() {
        type = "searchServices";
    }

    /**
     * Get the name property: The search service name to validate. Search service names must only contain lowercase
     * letters, digits or dashes, cannot use dash as the first two or last one characters, cannot contain consecutive
     * dashes, and must be between 2 and 60 characters in length.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The search service name to validate. Search service names must only contain lowercase
     * letters, digits or dashes, cannot use dash as the first two or last one characters, cannot contain consecutive
     * dashes, and must be between 2 and 60 characters in length.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the resource whose name is to be validated. This value must always be
     * 'searchServices'.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource whose name is to be validated. This value must always be
     * 'searchServices'.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model CheckNameAvailabilityInput"));
        }
    }
}