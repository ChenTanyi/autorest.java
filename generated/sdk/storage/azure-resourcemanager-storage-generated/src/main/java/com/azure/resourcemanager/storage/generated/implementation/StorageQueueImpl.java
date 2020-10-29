// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageQueueInner;
import com.azure.resourcemanager.storage.generated.models.StorageQueue;
import java.util.Collections;
import java.util.Map;

public final class StorageQueueImpl implements StorageQueue, StorageQueue.Definition, StorageQueue.Update {
    private StorageQueueInner innerObject;

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

    public Map<String, String> metadata() {
        Map<String, String> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public Integer approximateMessageCount() {
        return this.innerModel().approximateMessageCount();
    }

    public StorageQueueInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String queueName;

    public StorageQueueImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public StorageQueue create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQueues()
                .createWithResponse(resourceGroupName, accountName, queueName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public StorageQueue create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQueues()
                .createWithResponse(resourceGroupName, accountName, queueName, innerObject, context)
                .getValue();
        return this;
    }

    public StorageQueueImpl(String name, StorageManager serviceManager) {
        this.innerObject = new StorageQueueInner();
        this.serviceManager = serviceManager;
        this.queueName = name;
    }

    public StorageQueueImpl update() {
        return this;
    }

    public StorageQueue apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQueues()
                .updateWithResponse(resourceGroupName, accountName, queueName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public StorageQueue apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQueues()
                .updateWithResponse(resourceGroupName, accountName, queueName, innerObject, context)
                .getValue();
        return this;
    }

    public StorageQueueImpl(StorageQueueInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.queueName = Utils.getValueFromIdByName(innerObject.id(), "queues");
    }

    public StorageQueue refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQueues()
                .getWithResponse(resourceGroupName, accountName, queueName, Context.NONE)
                .getValue();
        return this;
    }

    public StorageQueue refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQueues()
                .getWithResponse(resourceGroupName, accountName, queueName, context)
                .getValue();
        return this;
    }

    public StorageQueueImpl withMetadata(Map<String, String> metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }
}
