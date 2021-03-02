// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.AdminRuleInner;
import com.azure.resourcemanager.network.generated.models.AddressPrefixItem;
import com.azure.resourcemanager.network.generated.models.AdminRule;
import com.azure.resourcemanager.network.generated.models.NetworkManagerSecurityGroupItem;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.SecurityConfigurationRuleAccess;
import com.azure.resourcemanager.network.generated.models.SecurityConfigurationRuleDirection;
import com.azure.resourcemanager.network.generated.models.SecurityConfigurationRuleProtocol;
import com.azure.resourcemanager.network.generated.models.SystemData;
import java.util.Collections;
import java.util.List;

public final class AdminRuleImpl implements AdminRule, AdminRule.Definition, AdminRule.Update {
    private AdminRuleInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public SecurityConfigurationRuleProtocol protocol() {
        return this.innerModel().protocol();
    }

    public List<AddressPrefixItem> source() {
        List<AddressPrefixItem> inner = this.innerModel().source();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AddressPrefixItem> destination() {
        List<AddressPrefixItem> inner = this.innerModel().destination();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> sourcePortRanges() {
        List<String> inner = this.innerModel().sourcePortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> destinationPortRanges() {
        List<String> inner = this.innerModel().destinationPortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SecurityConfigurationRuleAccess access() {
        return this.innerModel().access();
    }

    public Integer priority() {
        return this.innerModel().priority();
    }

    public SecurityConfigurationRuleDirection direction() {
        return this.innerModel().direction();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<NetworkManagerSecurityGroupItem> appliesToGroups() {
        List<NetworkManagerSecurityGroupItem> inner = this.innerModel().appliesToGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public AdminRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkManagerName;

    private String configurationName;

    private String ruleName;

    public AdminRuleImpl withExistingSecurityConfiguration(
        String resourceGroupName, String networkManagerName, String configurationName) {
        this.resourceGroupName = resourceGroupName;
        this.networkManagerName = networkManagerName;
        this.configurationName = configurationName;
        return this;
    }

    public AdminRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdminRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, ruleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AdminRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdminRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, ruleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AdminRuleImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new AdminRuleInner();
        this.serviceManager = serviceManager;
        this.ruleName = name;
    }

    public AdminRuleImpl update() {
        return this;
    }

    public AdminRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdminRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, ruleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AdminRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdminRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, ruleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AdminRuleImpl(
        AdminRuleInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkManagerName = Utils.getValueFromIdByName(innerObject.id(), "networkManagers");
        this.configurationName = Utils.getValueFromIdByName(innerObject.id(), "securityConfigurations");
        this.ruleName = Utils.getValueFromIdByName(innerObject.id(), "adminRules");
    }

    public AdminRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdminRules()
                .getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, Context.NONE)
                .getValue();
        return this;
    }

    public AdminRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdminRules()
                .getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, context)
                .getValue();
        return this;
    }

    public AdminRuleImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public AdminRuleImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public AdminRuleImpl withProtocol(SecurityConfigurationRuleProtocol protocol) {
        this.innerModel().withProtocol(protocol);
        return this;
    }

    public AdminRuleImpl withSource(List<AddressPrefixItem> source) {
        this.innerModel().withSource(source);
        return this;
    }

    public AdminRuleImpl withDestination(List<AddressPrefixItem> destination) {
        this.innerModel().withDestination(destination);
        return this;
    }

    public AdminRuleImpl withSourcePortRanges(List<String> sourcePortRanges) {
        this.innerModel().withSourcePortRanges(sourcePortRanges);
        return this;
    }

    public AdminRuleImpl withDestinationPortRanges(List<String> destinationPortRanges) {
        this.innerModel().withDestinationPortRanges(destinationPortRanges);
        return this;
    }

    public AdminRuleImpl withAccess(SecurityConfigurationRuleAccess access) {
        this.innerModel().withAccess(access);
        return this;
    }

    public AdminRuleImpl withPriority(Integer priority) {
        this.innerModel().withPriority(priority);
        return this;
    }

    public AdminRuleImpl withDirection(SecurityConfigurationRuleDirection direction) {
        this.innerModel().withDirection(direction);
        return this;
    }

    public AdminRuleImpl withAppliesToGroups(List<NetworkManagerSecurityGroupItem> appliesToGroups) {
        this.innerModel().withAppliesToGroups(appliesToGroups);
        return this;
    }
}
