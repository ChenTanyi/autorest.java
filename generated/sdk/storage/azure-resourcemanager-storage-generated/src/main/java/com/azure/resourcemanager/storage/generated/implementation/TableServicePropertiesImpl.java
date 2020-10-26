// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.TableServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.azure.resourcemanager.storage.generated.models.TableServiceProperties;

public final class TableServicePropertiesImpl
    implements TableServiceProperties, TableServiceProperties.Definition, TableServiceProperties.Update {
    private TableServicePropertiesInner innerObject;

    private final StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CorsRules cors() {
        return this.innerModel().cors();
    }

    public TableServicePropertiesInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    public TableServicePropertiesImpl withExistingStorageAccount(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public TableServiceProperties create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public TableServiceProperties create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, innerObject, context)
                .getValue();
        return this;
    }

    public TableServicePropertiesImpl(String name, StorageManager serviceManager) {
        this.innerObject = new TableServicePropertiesInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
    }

    public TableServicePropertiesImpl update() {
        return this;
    }

    public TableServiceProperties apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public TableServiceProperties apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, innerObject, context)
                .getValue();
        return this;
    }

    public TableServicePropertiesImpl(TableServicePropertiesInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
    }

    public TableServiceProperties refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableServices()
                .getServicePropertiesWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public TableServiceProperties refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableServices()
                .getServicePropertiesWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public TableServicePropertiesImpl withCors(CorsRules cors) {
        this.innerModel().withCors(cors);
        return this;
    }
}
