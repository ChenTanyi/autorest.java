// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.UpdateDomainInner;
import com.azure.resourcemanager.compute.generated.models.UpdateDomain;

public final class UpdateDomainImpl implements UpdateDomain {
    private UpdateDomainInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    UpdateDomainImpl(
        UpdateDomainInner innerObject, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public UpdateDomainInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}