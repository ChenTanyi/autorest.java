// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.recoveryservices.generated.models.OperationResource;
import java.time.OffsetDateTime;

public final class OperationResourceImpl implements OperationResource {
    private OperationResourceInner innerObject;

    private final RecoveryServicesManager serviceManager;

    OperationResourceImpl(OperationResourceInner innerObject, RecoveryServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OperationResourceInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}