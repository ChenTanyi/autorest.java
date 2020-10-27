// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.mediaservices.generated.models.Operation;
import com.azure.resourcemanager.mediaservices.generated.models.OperationDisplay;
import com.azure.resourcemanager.mediaservices.generated.models.Properties;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final MediaservicesManager serviceManager;

    public OperationImpl(OperationInner innerObject, MediaservicesManager serviceManager) {
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

    public Properties properties() {
        return this.innerModel().properties();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }
}