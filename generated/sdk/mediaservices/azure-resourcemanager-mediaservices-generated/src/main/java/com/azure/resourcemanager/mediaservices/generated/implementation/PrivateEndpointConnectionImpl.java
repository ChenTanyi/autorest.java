// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateLinkServiceConnectionState;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final MediaservicesManager serviceManager;

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

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String name;

    public PrivateEndpointConnectionImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(resourceGroupName, accountName, name, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(resourceGroupName, accountName, name, innerObject, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl(String name, MediaservicesManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(resourceGroupName, accountName, name, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdateWithResponse(resourceGroupName, accountName, name, innerObject, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl(
        PrivateEndpointConnectionInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaservices");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, accountName, name, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, accountName, name, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }
}
