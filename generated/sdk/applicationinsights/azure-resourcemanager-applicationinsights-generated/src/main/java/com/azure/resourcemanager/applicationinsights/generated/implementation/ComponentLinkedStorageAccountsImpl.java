// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ComponentLinkedStorageAccountsInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentLinkedStorageAccounts;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentLinkedStorageAccountsPatch;
import com.azure.resourcemanager.applicationinsights.generated.models.StorageType;

public final class ComponentLinkedStorageAccountsImpl
    implements ComponentLinkedStorageAccounts,
        ComponentLinkedStorageAccounts.Definition,
        ComponentLinkedStorageAccounts.Update {
    private ComponentLinkedStorageAccountsInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String linkedStorageAccount() {
        return this.innerModel().linkedStorageAccount();
    }

    public ComponentLinkedStorageAccountsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private StorageType storageType;

    private ComponentLinkedStorageAccountsPatch updateLinkedStorageAccountsProperties;

    public ComponentLinkedStorageAccountsImpl withExistingComponent(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public ComponentLinkedStorageAccounts create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComponentLinkedStorageAccountsOperations()
                .createAndUpdateWithResponse(
                    resourceGroupName, resourceName, storageType, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ComponentLinkedStorageAccounts create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComponentLinkedStorageAccountsOperations()
                .createAndUpdateWithResponse(resourceGroupName, resourceName, storageType, this.innerModel(), context)
                .getValue();
        return this;
    }

    ComponentLinkedStorageAccountsImpl(
        StorageType name,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = new ComponentLinkedStorageAccountsInner();
        this.serviceManager = serviceManager;
        this.storageType = name;
    }

    public ComponentLinkedStorageAccountsImpl update() {
        this.updateLinkedStorageAccountsProperties = new ComponentLinkedStorageAccountsPatch();
        return this;
    }

    public ComponentLinkedStorageAccounts apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComponentLinkedStorageAccountsOperations()
                .updateWithResponse(
                    resourceGroupName, resourceName, storageType, updateLinkedStorageAccountsProperties, Context.NONE)
                .getValue();
        return this;
    }

    public ComponentLinkedStorageAccounts apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComponentLinkedStorageAccountsOperations()
                .updateWithResponse(
                    resourceGroupName, resourceName, storageType, updateLinkedStorageAccountsProperties, context)
                .getValue();
        return this;
    }

    ComponentLinkedStorageAccountsImpl(
        ComponentLinkedStorageAccountsInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "components");
        this.storageType =
            StorageType.fromString(Utils.getValueFromIdByName(innerObject.id(), "linkedStorageAccounts"));
    }

    public ComponentLinkedStorageAccounts refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComponentLinkedStorageAccountsOperations()
                .getWithResponse(resourceGroupName, resourceName, storageType, Context.NONE)
                .getValue();
        return this;
    }

    public ComponentLinkedStorageAccounts refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComponentLinkedStorageAccountsOperations()
                .getWithResponse(resourceGroupName, resourceName, storageType, context)
                .getValue();
        return this;
    }

    public ComponentLinkedStorageAccountsImpl withLinkedStorageAccount(String linkedStorageAccount) {
        if (isInCreateMode()) {
            this.innerModel().withLinkedStorageAccount(linkedStorageAccount);
            return this;
        } else {
            this.updateLinkedStorageAccountsProperties.withLinkedStorageAccount(linkedStorageAccount);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
