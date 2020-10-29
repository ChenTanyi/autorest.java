// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.generated.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.generated.fluent.models.VirtualNetworkRuleInner;
import com.azure.resourcemanager.postgresql.generated.models.VirtualNetworkRule;
import com.azure.resourcemanager.postgresql.generated.models.VirtualNetworkRuleState;

public final class VirtualNetworkRuleImpl
    implements VirtualNetworkRule, VirtualNetworkRule.Definition, VirtualNetworkRule.Update {
    private VirtualNetworkRuleInner innerObject;

    private final PostgreSqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String virtualNetworkSubnetId() {
        return this.innerModel().virtualNetworkSubnetId();
    }

    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.innerModel().ignoreMissingVnetServiceEndpoint();
    }

    public VirtualNetworkRuleState state() {
        return this.innerModel().state();
    }

    public VirtualNetworkRuleInner innerModel() {
        return this.innerObject;
    }

    private PostgreSqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String virtualNetworkRuleName;

    public VirtualNetworkRuleImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public VirtualNetworkRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, innerObject, Context.NONE);
        return this;
    }

    public VirtualNetworkRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, innerObject, context);
        return this;
    }

    public VirtualNetworkRuleImpl(String name, PostgreSqlManager serviceManager) {
        this.innerObject = new VirtualNetworkRuleInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkRuleName = name;
    }

    public VirtualNetworkRuleImpl update() {
        return this;
    }

    public VirtualNetworkRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, innerObject, Context.NONE);
        return this;
    }

    public VirtualNetworkRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, innerObject, context);
        return this;
    }

    public VirtualNetworkRuleImpl(VirtualNetworkRuleInner innerObject, PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.virtualNetworkRuleName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkRules");
    }

    public VirtualNetworkRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .getWithResponse(resourceGroupName, serverName, virtualNetworkRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .getWithResponse(resourceGroupName, serverName, virtualNetworkRuleName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkRuleImpl withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.innerModel().withVirtualNetworkSubnetId(virtualNetworkSubnetId);
        return this;
    }

    public VirtualNetworkRuleImpl withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.innerModel().withIgnoreMissingVnetServiceEndpoint(ignoreMissingVnetServiceEndpoint);
        return this;
    }
}
