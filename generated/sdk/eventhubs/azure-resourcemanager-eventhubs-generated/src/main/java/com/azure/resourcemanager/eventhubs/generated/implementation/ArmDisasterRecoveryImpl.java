// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubsManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ArmDisasterRecoveryInner;
import com.azure.resourcemanager.eventhubs.generated.models.ArmDisasterRecovery;
import com.azure.resourcemanager.eventhubs.generated.models.ProvisioningStateDR;
import com.azure.resourcemanager.eventhubs.generated.models.RoleDisasterRecovery;

public final class ArmDisasterRecoveryImpl
    implements ArmDisasterRecovery, ArmDisasterRecovery.Definition, ArmDisasterRecovery.Update {
    private ArmDisasterRecoveryInner innerObject;

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

    public ProvisioningStateDR provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String partnerNamespace() {
        return this.innerModel().partnerNamespace();
    }

    public String alternateName() {
        return this.innerModel().alternateName();
    }

    public RoleDisasterRecovery role() {
        return this.innerModel().role();
    }

    public Long pendingReplicationOperationsCount() {
        return this.innerModel().pendingReplicationOperationsCount();
    }

    public ArmDisasterRecoveryInner innerModel() {
        return this.innerObject;
    }

    private EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String alias;

    public ArmDisasterRecoveryImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public ArmDisasterRecovery create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisasterRecoveryConfigs()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, alias, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ArmDisasterRecovery create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisasterRecoveryConfigs()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, alias, this.innerModel(), context)
                .getValue();
        return this;
    }

    ArmDisasterRecoveryImpl(String name, EventHubsManager serviceManager) {
        this.innerObject = new ArmDisasterRecoveryInner();
        this.serviceManager = serviceManager;
        this.alias = name;
    }

    public ArmDisasterRecoveryImpl update() {
        return this;
    }

    public ArmDisasterRecovery apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisasterRecoveryConfigs()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, alias, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ArmDisasterRecovery apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisasterRecoveryConfigs()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, alias, this.innerModel(), context)
                .getValue();
        return this;
    }

    ArmDisasterRecoveryImpl(ArmDisasterRecoveryInner innerObject, EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.alias = Utils.getValueFromIdByName(innerObject.id(), "disasterRecoveryConfigs");
    }

    public ArmDisasterRecovery refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisasterRecoveryConfigs()
                .getWithResponse(resourceGroupName, namespaceName, alias, Context.NONE)
                .getValue();
        return this;
    }

    public ArmDisasterRecovery refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisasterRecoveryConfigs()
                .getWithResponse(resourceGroupName, namespaceName, alias, context)
                .getValue();
        return this;
    }

    public void breakPairing() {
        serviceManager.disasterRecoveryConfigs().breakPairing(resourceGroupName, namespaceName, alias);
    }

    public Response<Void> breakPairingWithResponse(Context context) {
        return serviceManager
            .disasterRecoveryConfigs()
            .breakPairingWithResponse(resourceGroupName, namespaceName, alias, context);
    }

    public void failOver() {
        serviceManager.disasterRecoveryConfigs().failOver(resourceGroupName, namespaceName, alias);
    }

    public Response<Void> failOverWithResponse(Context context) {
        return serviceManager
            .disasterRecoveryConfigs()
            .failOverWithResponse(resourceGroupName, namespaceName, alias, context);
    }

    public ArmDisasterRecoveryImpl withPartnerNamespace(String partnerNamespace) {
        this.innerModel().withPartnerNamespace(partnerNamespace);
        return this;
    }

    public ArmDisasterRecoveryImpl withAlternateName(String alternateName) {
        this.innerModel().withAlternateName(alternateName);
        return this;
    }
}
