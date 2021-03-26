// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.OSFamilyInner;
import com.azure.resourcemanager.compute.generated.models.OSFamily;
import com.azure.resourcemanager.compute.generated.models.OSFamilyProperties;

public final class OSFamilyImpl implements OSFamily {
    private OSFamilyInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    OSFamilyImpl(OSFamilyInner innerObject, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public OSFamilyProperties properties() {
        return this.innerModel().properties();
    }

    public OSFamilyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}