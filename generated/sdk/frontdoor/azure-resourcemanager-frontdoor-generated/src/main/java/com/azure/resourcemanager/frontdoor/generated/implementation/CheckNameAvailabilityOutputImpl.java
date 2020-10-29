// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.resourcemanager.frontdoor.generated.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.frontdoor.generated.models.Availability;
import com.azure.resourcemanager.frontdoor.generated.models.CheckNameAvailabilityOutput;

public final class CheckNameAvailabilityOutputImpl implements CheckNameAvailabilityOutput {
    private CheckNameAvailabilityOutputInner innerObject;

    private final FrontDoorManager serviceManager;

    public CheckNameAvailabilityOutputImpl(
        CheckNameAvailabilityOutputInner innerObject, FrontDoorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Availability nameAvailability() {
        return this.innerModel().nameAvailability();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityOutputInner innerModel() {
        return this.innerObject;
    }

    private FrontDoorManager manager() {
        return this.serviceManager;
    }
}
