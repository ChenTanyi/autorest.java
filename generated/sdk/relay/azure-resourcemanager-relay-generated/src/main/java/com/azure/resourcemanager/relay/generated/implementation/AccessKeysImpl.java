// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.resourcemanager.relay.generated.RelayManager;
import com.azure.resourcemanager.relay.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.relay.generated.models.AccessKeys;

public final class AccessKeysImpl implements AccessKeys {
    private AccessKeysInner innerObject;

    private final RelayManager serviceManager;

    AccessKeysImpl(AccessKeysInner innerObject, RelayManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryConnectionString() {
        return this.innerModel().primaryConnectionString();
    }

    public String secondaryConnectionString() {
        return this.innerModel().secondaryConnectionString();
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public AccessKeysInner innerModel() {
        return this.innerObject;
    }

    private RelayManager manager() {
        return this.serviceManager;
    }
}
