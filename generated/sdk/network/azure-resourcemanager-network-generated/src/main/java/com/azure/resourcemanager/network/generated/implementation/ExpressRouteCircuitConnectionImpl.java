// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitConnectionInner;
import com.azure.resourcemanager.network.generated.models.CircuitConnectionStatus;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitConnection;
import com.azure.resourcemanager.network.generated.models.Ipv6CircuitConnectionConfig;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;

public final class ExpressRouteCircuitConnectionImpl
    implements ExpressRouteCircuitConnection,
        ExpressRouteCircuitConnection.Definition,
        ExpressRouteCircuitConnection.Update {
    private ExpressRouteCircuitConnectionInner innerObject;

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

    public SubResource expressRouteCircuitPeering() {
        return this.innerModel().expressRouteCircuitPeering();
    }

    public SubResource peerExpressRouteCircuitPeering() {
        return this.innerModel().peerExpressRouteCircuitPeering();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public String authorizationKey() {
        return this.innerModel().authorizationKey();
    }

    public Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig() {
        return this.innerModel().ipv6CircuitConnectionConfig();
    }

    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.innerModel().circuitConnectionStatus();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ExpressRouteCircuitConnectionInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String circuitName;

    private String peeringName;

    private String connectionName;

    public ExpressRouteCircuitConnectionImpl withExistingPeering(
        String resourceGroupName, String circuitName, String peeringName) {
        this.resourceGroupName = resourceGroupName;
        this.circuitName = circuitName;
        this.peeringName = peeringName;
        return this;
    }

    public ExpressRouteCircuitConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuitConnections()
                .createOrUpdate(resourceGroupName, circuitName, peeringName, connectionName, innerObject, Context.NONE);
        return this;
    }

    public ExpressRouteCircuitConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuitConnections()
                .createOrUpdate(resourceGroupName, circuitName, peeringName, connectionName, innerObject, context);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new ExpressRouteCircuitConnectionInner();
        this.serviceManager = serviceManager;
        this.connectionName = name;
    }

    public ExpressRouteCircuitConnectionImpl update() {
        return this;
    }

    public ExpressRouteCircuitConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuitConnections()
                .createOrUpdate(resourceGroupName, circuitName, peeringName, connectionName, innerObject, Context.NONE);
        return this;
    }

    public ExpressRouteCircuitConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuitConnections()
                .createOrUpdate(resourceGroupName, circuitName, peeringName, connectionName, innerObject, context);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl(
        ExpressRouteCircuitConnectionInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.circuitName = Utils.getValueFromIdByName(innerObject.id(), "expressRouteCircuits");
        this.peeringName = Utils.getValueFromIdByName(innerObject.id(), "peerings");
        this.connectionName = Utils.getValueFromIdByName(innerObject.id(), "connections");
    }

    public ExpressRouteCircuitConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuitConnections()
                .getWithResponse(resourceGroupName, circuitName, peeringName, connectionName, Context.NONE)
                .getValue();
        return this;
    }

    public ExpressRouteCircuitConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRouteCircuitConnections()
                .getWithResponse(resourceGroupName, circuitName, peeringName, connectionName, context)
                .getValue();
        return this;
    }

    public ExpressRouteCircuitConnectionImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering) {
        this.innerModel().withExpressRouteCircuitPeering(expressRouteCircuitPeering);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl withPeerExpressRouteCircuitPeering(
        SubResource peerExpressRouteCircuitPeering) {
        this.innerModel().withPeerExpressRouteCircuitPeering(peerExpressRouteCircuitPeering);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl withAddressPrefix(String addressPrefix) {
        this.innerModel().withAddressPrefix(addressPrefix);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl withAuthorizationKey(String authorizationKey) {
        this.innerModel().withAuthorizationKey(authorizationKey);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl withIpv6CircuitConnectionConfig(
        Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig) {
        this.innerModel().withIpv6CircuitConnectionConfig(ipv6CircuitConnectionConfig);
        return this;
    }

    public ExpressRouteCircuitConnectionImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }
}
