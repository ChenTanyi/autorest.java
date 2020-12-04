// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubsManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.eventhubs.generated.models.AccessRights;
import com.azure.resourcemanager.eventhubs.generated.models.AuthorizationRule;
import java.util.Collections;
import java.util.List;

public final class AuthorizationRuleImpl
    implements AuthorizationRule, AuthorizationRule.Definition, AuthorizationRule.Update {
    private AuthorizationRuleInner innerObject;

    private final EventHubsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public List<AccessRights> rights() {
        List<AccessRights> inner = this.innerModel().rights();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AuthorizationRuleInner innerModel() {
        return this.innerObject;
    }

    private EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String authorizationRuleName;

    public AuthorizationRuleImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public AuthorizationRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AuthorizationRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AuthorizationRuleImpl(String name, EventHubsManager serviceManager) {
        this.innerObject = new AuthorizationRuleInner();
        this.serviceManager = serviceManager;
        this.authorizationRuleName = name;
    }

    public AuthorizationRuleImpl update() {
        return this;
    }

    public AuthorizationRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AuthorizationRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AuthorizationRuleImpl(AuthorizationRuleInner innerObject, EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.authorizationRuleName = Utils.getValueFromIdByName(innerObject.id(), "authorizationRules");
    }

    public AuthorizationRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public AuthorizationRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context)
                .getValue();
        return this;
    }

    public AuthorizationRuleImpl withRights(List<AccessRights> rights) {
        this.innerModel().withRights(rights);
        return this;
    }
}
