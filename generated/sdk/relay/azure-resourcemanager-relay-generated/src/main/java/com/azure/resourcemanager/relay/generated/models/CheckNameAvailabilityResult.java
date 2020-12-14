// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.models;

import com.azure.resourcemanager.relay.generated.fluent.models.CheckNameAvailabilityResultInner;

/** An immutable client-side representation of CheckNameAvailabilityResult. */
public interface CheckNameAvailabilityResult {
    /**
     * Gets the message property: The detailed info regarding the reason associated with the namespace.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the nameAvailable property: Value indicating namespace is available. Returns true if the namespace is
     * available; otherwise, false.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason for unavailability of a namespace.
     *
     * @return the reason value.
     */
    UnavailableReason reason();

    /**
     * Gets the inner com.azure.resourcemanager.relay.generated.fluent.models.CheckNameAvailabilityResultInner object.
     *
     * @return the inner object.
     */
    CheckNameAvailabilityResultInner innerModel();
}
