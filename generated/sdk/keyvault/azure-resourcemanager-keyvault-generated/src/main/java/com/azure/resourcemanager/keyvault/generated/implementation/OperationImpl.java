// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.keyvault.generated.models.Operation;
import com.azure.resourcemanager.keyvault.generated.models.OperationDisplay;
import com.azure.resourcemanager.keyvault.generated.models.ServiceSpecification;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final KeyVaultManager serviceManager;

    public OperationImpl(OperationInner innerObject, KeyVaultManager serviceManager) {
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

    private KeyVaultManager manager() {
        return this.serviceManager;
    }
}