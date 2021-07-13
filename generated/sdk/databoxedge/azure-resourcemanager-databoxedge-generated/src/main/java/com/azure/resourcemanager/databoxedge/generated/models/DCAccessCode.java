// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.resourcemanager.databoxedge.generated.fluent.models.DCAccessCodeInner;

/** An immutable client-side representation of DCAccessCode. */
public interface DCAccessCode {
    /**
     * Gets the authCode property: DCAccess Code for the Self Managed shipment.
     *
     * @return the authCode value.
     */
    String authCode();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.DCAccessCodeInner object.
     *
     * @return the inner object.
     */
    DCAccessCodeInner innerModel();
}