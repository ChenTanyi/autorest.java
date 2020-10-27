// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteLinkInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLink;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinkAdminState;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinkConnectorType;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinkMacSecConfig;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;

public final class ExpressRouteLinkImpl implements ExpressRouteLink {
    private ExpressRouteLinkInner innerObject;

    private final NetworkManager serviceManager;

    public ExpressRouteLinkImpl(ExpressRouteLinkInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String routerName() {
        return this.innerModel().routerName();
    }

    public String interfaceName() {
        return this.innerModel().interfaceName();
    }

    public String patchPanelId() {
        return this.innerModel().patchPanelId();
    }

    public String rackId() {
        return this.innerModel().rackId();
    }

    public ExpressRouteLinkConnectorType connectorType() {
        return this.innerModel().connectorType();
    }

    public ExpressRouteLinkAdminState adminState() {
        return this.innerModel().adminState();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ExpressRouteLinkMacSecConfig macSecConfig() {
        return this.innerModel().macSecConfig();
    }

    public ExpressRouteLinkInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}