// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.IpFilterRuleInner;
import com.azure.resourcemanager.eventhubs.generated.models.IpAction;
import com.azure.resourcemanager.eventhubs.generated.models.IpFilterRule;

public final class IpFilterRuleImpl implements IpFilterRule, IpFilterRule.Definition, IpFilterRule.Update {
    private IpFilterRuleInner innerObject;

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

    public String ipMask() {
        return this.innerModel().ipMask();
    }

    public IpAction action() {
        return this.innerModel().action();
    }

    public String filterName() {
        return this.innerModel().filterName();
    }

    public IpFilterRuleInner innerModel() {
        return this.innerObject;
    }

    private EventHubManager manager() {
        return this.serviceManager;
    }

    private String ipFilterRuleName;

    private String resourceGroupName;

    private String namespaceName;

    public IpFilterRuleImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public IpFilterRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateIpFilterRuleWithResponse(
                    resourceGroupName, namespaceName, ipFilterRuleName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public IpFilterRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateIpFilterRuleWithResponse(
                    resourceGroupName, namespaceName, ipFilterRuleName, innerObject, context)
                .getValue();
        return this;
    }

    public IpFilterRuleImpl(String name, EventHubManager serviceManager) {
        this.innerObject = new IpFilterRuleInner();
        this.serviceManager = serviceManager;
        this.ipFilterRuleName = name;
    }

    public IpFilterRuleImpl update() {
        return this;
    }

    public IpFilterRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateIpFilterRuleWithResponse(
                    resourceGroupName, namespaceName, ipFilterRuleName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public IpFilterRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateIpFilterRuleWithResponse(
                    resourceGroupName, namespaceName, ipFilterRuleName, innerObject, context)
                .getValue();
        return this;
    }

    public IpFilterRuleImpl(IpFilterRuleInner innerObject, EventHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.ipFilterRuleName = Utils.getValueFromIdByName(innerObject.id(), "ipfilterrules");
    }

    public IpFilterRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getIpFilterRuleWithResponse(resourceGroupName, namespaceName, ipFilterRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public IpFilterRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getIpFilterRuleWithResponse(resourceGroupName, namespaceName, ipFilterRuleName, context)
                .getValue();
        return this;
    }

    public IpFilterRuleImpl withFilterName(String filterName) {
        this.innerModel().withFilterName(filterName);
        return this;
    }

    public IpFilterRuleImpl withAction(IpAction action) {
        this.innerModel().withAction(action);
        return this;
    }

    public IpFilterRuleImpl withIpMask(String ipMask) {
        this.innerModel().withIpMask(ipMask);
        return this;
    }
}
