// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.TableInner;
import com.azure.resourcemanager.storage.generated.models.Table;

public final class TableImpl implements Table {
    private TableInner innerObject;

    private final StorageManager serviceManager;

    public TableImpl(TableInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String tableName() {
        return this.innerModel().tableName();
    }

    public TableInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}