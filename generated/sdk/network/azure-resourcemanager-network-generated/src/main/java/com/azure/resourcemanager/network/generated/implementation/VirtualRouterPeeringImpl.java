// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterPeeringInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualRouterPeering;

public final class VirtualRouterPeeringImpl
    implements VirtualRouterPeering, VirtualRouterPeering.Definition, VirtualRouterPeering.Update {
    private VirtualRouterPeeringInner innerObject;

    private final NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Long peerAsn() {
        return this.innerModel().peerAsn();
    }

    public String peerIp() {
        return this.innerModel().peerIp();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualRouterPeeringInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualRouterName;

    private String peeringName;

    public VirtualRouterPeeringImpl withExistingVirtualRouter(String resourceGroupName, String virtualRouterName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualRouterName = virtualRouterName;
        return this;
    }

    public VirtualRouterPeering create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualRouterPeerings()
                .createOrUpdate(resourceGroupName, virtualRouterName, peeringName, innerObject, Context.NONE);
        return this;
    }

    public VirtualRouterPeering create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualRouterPeerings()
                .createOrUpdate(resourceGroupName, virtualRouterName, peeringName, innerObject, context);
        return this;
    }

    public VirtualRouterPeeringImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new VirtualRouterPeeringInner();
        this.serviceManager = serviceManager;
        this.peeringName = name;
    }

    public VirtualRouterPeeringImpl update() {
        return this;
    }

    public VirtualRouterPeering apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualRouterPeerings()
                .createOrUpdate(resourceGroupName, virtualRouterName, peeringName, innerObject, Context.NONE);
        return this;
    }

    public VirtualRouterPeering apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualRouterPeerings()
                .createOrUpdate(resourceGroupName, virtualRouterName, peeringName, innerObject, context);
        return this;
    }

    public VirtualRouterPeeringImpl(VirtualRouterPeeringInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualRouterName = Utils.getValueFromIdByName(innerObject.id(), "virtualRouters");
        this.peeringName = Utils.getValueFromIdByName(innerObject.id(), "peerings");
    }

    public VirtualRouterPeering refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualRouterPeerings()
                .getWithResponse(resourceGroupName, virtualRouterName, peeringName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualRouterPeering refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualRouterPeerings()
                .getWithResponse(resourceGroupName, virtualRouterName, peeringName, context)
                .getValue();
        return this;
    }

    public VirtualRouterPeeringImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    public VirtualRouterPeeringImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public VirtualRouterPeeringImpl withPeerAsn(Long peerAsn) {
        this.innerModel().withPeerAsn(peerAsn);
        return this;
    }

    public VirtualRouterPeeringImpl withPeerIp(String peerIp) {
        this.innerModel().withPeerIp(peerIp);
        return this;
    }
}
