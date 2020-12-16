// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.azure.resourcemanager.recoveryservices.generated.models.ClientDiscoveryDisplay;
import com.azure.resourcemanager.recoveryservices.generated.models.ClientDiscoveryForProperties;
import com.azure.resourcemanager.recoveryservices.generated.models.ClientDiscoveryValueForSingleApi;

public final class ClientDiscoveryValueForSingleApiImpl implements ClientDiscoveryValueForSingleApi {
    private ClientDiscoveryValueForSingleApiInner innerObject;

    private final RecoveryServicesManager serviceManager;

    ClientDiscoveryValueForSingleApiImpl(
        ClientDiscoveryValueForSingleApiInner innerObject, RecoveryServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public ClientDiscoveryDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public ClientDiscoveryForProperties properties() {
        return this.innerModel().properties();
    }

    public ClientDiscoveryValueForSingleApiInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}