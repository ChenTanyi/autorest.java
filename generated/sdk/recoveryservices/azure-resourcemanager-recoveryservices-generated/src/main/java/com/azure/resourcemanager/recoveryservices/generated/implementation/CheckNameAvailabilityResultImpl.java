// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.resourcemanager.recoveryservices.generated.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.recoveryservices.generated.models.CheckNameAvailabilityResult;

public final class CheckNameAvailabilityResultImpl implements CheckNameAvailabilityResult {
    private CheckNameAvailabilityResultInner innerObject;

    private final com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager;

    CheckNameAvailabilityResultImpl(
        CheckNameAvailabilityResultInner innerObject,
        com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}
