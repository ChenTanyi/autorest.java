// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.generated.fluent.IotHubsClient;
import com.azure.resourcemanager.iothub.generated.models.FailoverInput;
import com.azure.resourcemanager.iothub.generated.models.IotHubs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotHubsImpl implements IotHubs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubsImpl.class);

    private final IotHubsClient innerClient;

    private final com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager;

    public IotHubsImpl(
        IotHubsClient innerClient, com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void manualFailover(String iotHubName, String resourceGroupName, FailoverInput failoverInput) {
        this.serviceClient().manualFailover(iotHubName, resourceGroupName, failoverInput);
    }

    public void manualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context) {
        this.serviceClient().manualFailover(iotHubName, resourceGroupName, failoverInput, context);
    }

    private IotHubsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iothub.generated.IotHubManager manager() {
        return this.serviceManager;
    }
}
