// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventhubs.generated.models.ConnectionState;
import com.azure.resourcemanager.eventhubs.generated.models.EndPointProvisioningState;
import com.azure.resourcemanager.eventhubs.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.eventhubs.generated.models.PrivateEndpointConnection;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final EventHubManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public ConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public EndPointProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private EventHubManager manager() {
        return this.serviceManager;
    }

    private String privateEndpointConnectionName;

    private String resourceGroupName;

    private String namespaceName;

    public PrivateEndpointConnectionImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, innerObject, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl(String name, EventHubManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, privateEndpointConnectionName, innerObject, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject, EventHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.privateEndpointConnectionName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(
        ConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    public PrivateEndpointConnectionImpl withProvisioningState(EndPointProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }
}
