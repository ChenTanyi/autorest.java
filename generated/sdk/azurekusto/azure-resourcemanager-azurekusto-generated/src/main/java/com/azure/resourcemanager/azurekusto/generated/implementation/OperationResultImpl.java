// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.resourcemanager.azurekusto.generated.fluent.models.OperationResultInner;
import com.azure.resourcemanager.azurekusto.generated.models.OperationResult;
import com.azure.resourcemanager.azurekusto.generated.models.Status;
import java.time.OffsetDateTime;

public final class OperationResultImpl implements OperationResult {
    private OperationResultInner innerObject;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    OperationResultImpl(
        OperationResultInner innerObject, com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Double percentComplete() {
        return this.innerModel().percentComplete();
    }

    public String code() {
        return this.innerModel().code();
    }

    public String message() {
        return this.innerModel().message();
    }

    public String operationKind() {
        return this.innerModel().operationKind();
    }

    public String operationState() {
        return this.innerModel().operationState();
    }

    public OperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }
}