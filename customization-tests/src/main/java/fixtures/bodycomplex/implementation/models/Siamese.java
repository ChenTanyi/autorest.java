// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Siamese model. */
@Fluent
public final class Siamese extends Cat {
    /*
     * The breed property.
     */
    @JsonProperty(value = "breed")
    private String breed;

    /**
     * Get the breed property: The breed property.
     *
     * @return the breed value.
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Set the breed property: The breed property.
     *
     * @param breed the breed value to set.
     * @return the Siamese object itself.
     */
    public Siamese setBreed(String breed) {
        this.breed = breed;
        return this;
    }
}
