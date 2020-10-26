// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.storage.generated.models.Operation;
import com.azure.resourcemanager.storage.generated.models.OperationDisplay;
import com.azure.resourcemanager.storage.generated.models.ServiceSpecification;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final StorageManager serviceManager;

    public OperationImpl(OperationInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public ServiceSpecification serviceSpecification() {
        return this.innerModel().serviceSpecification();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}
