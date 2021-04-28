// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KeyDelivery model. */
@Fluent
public final class KeyDelivery {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyDelivery.class);

    /*
     * The access control properties for Key Delivery.
     */
    @JsonProperty(value = "accessControl")
    private AccessControl accessControl;

    /**
     * Get the accessControl property: The access control properties for Key Delivery.
     *
     * @return the accessControl value.
     */
    public AccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set the accessControl property: The access control properties for Key Delivery.
     *
     * @param accessControl the accessControl value to set.
     * @return the KeyDelivery object itself.
     */
    public KeyDelivery withAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessControl() != null) {
            accessControl().validate();
        }
    }
}
