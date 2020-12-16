// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.resourcemanager.costmanagement.generated.CostManagementManager;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.costmanagement.generated.models.Operation;
import com.azure.resourcemanager.costmanagement.generated.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final CostManagementManager serviceManager;

    OperationImpl(OperationInner innerObject, CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private CostManagementManager manager() {
        return this.serviceManager;
    }
}