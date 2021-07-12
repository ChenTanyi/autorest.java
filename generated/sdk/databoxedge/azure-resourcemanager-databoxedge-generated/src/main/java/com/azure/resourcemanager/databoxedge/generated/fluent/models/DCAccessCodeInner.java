// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DC Access code in the case of Self Managed Shipping. */
@JsonFlatten
@Fluent
public class DCAccessCodeInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DCAccessCodeInner.class);

    /*
     * DCAccess Code for the Self Managed shipment.
     */
    @JsonProperty(value = "properties.authCode")
    private String authCode;

    /**
     * Get the authCode property: DCAccess Code for the Self Managed shipment.
     *
     * @return the authCode value.
     */
    public String authCode() {
        return this.authCode;
    }

    /**
     * Set the authCode property: DCAccess Code for the Self Managed shipment.
     *
     * @param authCode the authCode value to set.
     * @return the DCAccessCodeInner object itself.
     */
    public DCAccessCodeInner withAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
