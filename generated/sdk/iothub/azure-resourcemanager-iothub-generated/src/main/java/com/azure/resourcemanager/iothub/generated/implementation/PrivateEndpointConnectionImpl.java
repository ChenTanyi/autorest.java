// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.resourcemanager.iothub.generated.IotHubManager;
import com.azure.resourcemanager.iothub.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.iothub.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.iothub.generated.models.PrivateEndpointConnectionProperties;

public final class PrivateEndpointConnectionImpl implements PrivateEndpointConnection {
    private PrivateEndpointConnectionInner innerObject;

    private final IotHubManager serviceManager;

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject, IotHubManager serviceManager) {
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

    public PrivateEndpointConnectionProperties properties() {
        return this.innerModel().properties();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private IotHubManager manager() {
        return this.serviceManager;
    }
}
