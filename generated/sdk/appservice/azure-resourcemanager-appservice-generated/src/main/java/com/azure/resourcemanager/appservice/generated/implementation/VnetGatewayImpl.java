// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetGatewayInner;
import com.azure.resourcemanager.appservice.generated.models.VnetGateway;

public final class VnetGatewayImpl implements VnetGateway, VnetGateway.Definition, VnetGateway.Update {
    private VnetGatewayInner innerObject;

    private final WebSiteManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String vnetName() {
        return this.innerModel().vnetName();
    }

    public String vpnPackageUri() {
        return this.innerModel().vpnPackageUri();
    }

    public VnetGatewayInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String vnetName;

    private String gatewayName;

    private String slot;

    public VnetGatewayImpl withExistingVirtualNetworkConnection(
        String resourceGroupName, String name, String vnetName, String gatewayName) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.vnetName = vnetName;
        this.gatewayName = gatewayName;
        return this;
    }

    public VnetGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdateVnetConnectionGatewaySlotWithResponse(
                    resourceGroupName, name, vnetName, gatewayName, slot, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public VnetGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdateVnetConnectionGatewaySlotWithResponse(
                    resourceGroupName, name, vnetName, gatewayName, slot, innerObject, context)
                .getValue();
        return this;
    }

    public VnetGatewayImpl(String name, WebSiteManager serviceManager) {
        this.innerObject = new VnetGatewayInner();
        this.serviceManager = serviceManager;
        this.slot = name;
    }

    public VnetGatewayImpl update() {
        return this;
    }

    public VnetGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateVnetConnectionGatewaySlotWithResponse(
                    resourceGroupName, name, vnetName, gatewayName, slot, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public VnetGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateVnetConnectionGatewaySlotWithResponse(
                    resourceGroupName, name, vnetName, gatewayName, slot, innerObject, context)
                .getValue();
        return this;
    }

    public VnetGatewayImpl(VnetGatewayInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
        this.vnetName = Utils.getValueFromIdByName(innerObject.id(), "slots");
        this.gatewayName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkConnections");
        this.slot = Utils.getValueFromIdByName(innerObject.id(), "gateways");
    }

    public VnetGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getVnetConnectionGatewaySlotWithResponse(
                    resourceGroupName, name, vnetName, gatewayName, slot, Context.NONE)
                .getValue();
        return this;
    }

    public VnetGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getVnetConnectionGatewaySlotWithResponse(resourceGroupName, name, vnetName, gatewayName, slot, context)
                .getValue();
        return this;
    }

    public VnetGatewayImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public VnetGatewayImpl withVnetName(String vnetName) {
        this.innerModel().withVnetName(vnetName);
        return this;
    }

    public VnetGatewayImpl withVpnPackageUri(String vpnPackageUri) {
        this.innerModel().withVpnPackageUri(vpnPackageUri);
        return this;
    }
}
