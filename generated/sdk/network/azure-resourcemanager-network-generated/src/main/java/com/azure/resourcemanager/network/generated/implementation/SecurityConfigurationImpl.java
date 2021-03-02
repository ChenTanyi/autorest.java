// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityConfigurationInner;
import com.azure.resourcemanager.network.generated.models.NetworkManagerSecurityGroupItem;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.SecurityConfiguration;
import com.azure.resourcemanager.network.generated.models.SecurityType;
import com.azure.resourcemanager.network.generated.models.SystemData;
import java.util.Collections;
import java.util.List;

public final class SecurityConfigurationImpl
    implements SecurityConfiguration, SecurityConfiguration.Definition, SecurityConfiguration.Update {
    private SecurityConfigurationInner innerObject;

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

    public SecurityType securityType() {
        return this.innerModel().securityType();
    }

    public Boolean deleteExistingNSGs() {
        return this.innerModel().deleteExistingNSGs();
    }

    public List<NetworkManagerSecurityGroupItem> appliesToGroups() {
        List<NetworkManagerSecurityGroupItem> inner = this.innerModel().appliesToGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SecurityConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkManagerName;

    private String configurationName;

    public SecurityConfigurationImpl withExistingNetworkManager(String resourceGroupName, String networkManagerName) {
        this.resourceGroupName = resourceGroupName;
        this.networkManagerName = networkManagerName;
        return this;
    }

    public SecurityConfiguration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SecurityConfiguration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SecurityConfigurationImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new SecurityConfigurationInner();
        this.serviceManager = serviceManager;
        this.configurationName = name;
    }

    public SecurityConfigurationImpl update() {
        return this;
    }

    public SecurityConfiguration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SecurityConfiguration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, configurationName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SecurityConfigurationImpl(
        SecurityConfigurationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkManagerName = Utils.getValueFromIdByName(innerObject.id(), "networkManagers");
        this.configurationName = Utils.getValueFromIdByName(innerObject.id(), "securityConfigurations");
    }

    public SecurityConfiguration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityConfigurations()
                .getWithResponse(resourceGroupName, networkManagerName, configurationName, Context.NONE)
                .getValue();
        return this;
    }

    public SecurityConfiguration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityConfigurations()
                .getWithResponse(resourceGroupName, networkManagerName, configurationName, context)
                .getValue();
        return this;
    }

    public SecurityConfigurationImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public SecurityConfigurationImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public SecurityConfigurationImpl withSecurityType(SecurityType securityType) {
        this.innerModel().withSecurityType(securityType);
        return this;
    }

    public SecurityConfigurationImpl withDeleteExistingNSGs(Boolean deleteExistingNSGs) {
        this.innerModel().withDeleteExistingNSGs(deleteExistingNSGs);
        return this;
    }

    public SecurityConfigurationImpl withAppliesToGroups(List<NetworkManagerSecurityGroupItem> appliesToGroups) {
        this.innerModel().withAppliesToGroups(appliesToGroups);
        return this;
    }
}
