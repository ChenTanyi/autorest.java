// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetInfoInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetRouteInner;
import com.azure.resourcemanager.appservice.generated.models.VnetInfo;
import com.azure.resourcemanager.appservice.generated.models.VnetRoute;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VnetInfoImpl implements VnetInfo, VnetInfo.Definition, VnetInfo.Update {
    private VnetInfoInner innerObject;

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

    public String vnetResourceId() {
        return this.innerModel().vnetResourceId();
    }

    public String certThumbprint() {
        return this.innerModel().certThumbprint();
    }

    public String certBlob() {
        return this.innerModel().certBlob();
    }

    public List<VnetRoute> routes() {
        List<VnetRouteInner> inner = this.innerModel().routes();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VnetRouteImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean resyncRequired() {
        return this.innerModel().resyncRequired();
    }

    public String dnsServers() {
        return this.innerModel().dnsServers();
    }

    public Boolean isSwift() {
        return this.innerModel().isSwift();
    }

    public VnetInfoInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String vnetName;

    private String slot;

    public VnetInfoImpl withExistingSlot(String resourceGroupName, String name, String slot) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.slot = slot;
        return this;
    }

    public VnetInfo create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdateVnetConnectionSlotWithResponse(
                    resourceGroupName, name, vnetName, slot, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public VnetInfo create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdateVnetConnectionSlotWithResponse(
                    resourceGroupName, name, vnetName, slot, innerObject, context)
                .getValue();
        return this;
    }

    public VnetInfoImpl(String name, WebSiteManager serviceManager) {
        this.innerObject = new VnetInfoInner();
        this.serviceManager = serviceManager;
        this.vnetName = name;
    }

    public VnetInfoImpl update() {
        return this;
    }

    public VnetInfo apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateVnetConnectionSlotWithResponse(
                    resourceGroupName, name, vnetName, slot, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public VnetInfo apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateVnetConnectionSlotWithResponse(resourceGroupName, name, vnetName, slot, innerObject, context)
                .getValue();
        return this;
    }

    public VnetInfoImpl(VnetInfoInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
        this.vnetName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkConnections");
        this.slot = Utils.getValueFromIdByName(innerObject.id(), "slots");
    }

    public VnetInfo refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getVnetConnectionSlotWithResponse(resourceGroupName, name, vnetName, slot, Context.NONE)
                .getValue();
        return this;
    }

    public VnetInfo refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getVnetConnectionSlotWithResponse(resourceGroupName, name, vnetName, slot, context)
                .getValue();
        return this;
    }

    public VnetInfoImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public VnetInfoImpl withVnetResourceId(String vnetResourceId) {
        this.innerModel().withVnetResourceId(vnetResourceId);
        return this;
    }

    public VnetInfoImpl withCertBlob(String certBlob) {
        this.innerModel().withCertBlob(certBlob);
        return this;
    }

    public VnetInfoImpl withDnsServers(String dnsServers) {
        this.innerModel().withDnsServers(dnsServers);
        return this;
    }

    public VnetInfoImpl withIsSwift(Boolean isSwift) {
        this.innerModel().withIsSwift(isSwift);
        return this;
    }
}
