// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.resourcemanager.eventgrid.generated.EventGridManager;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerNamespaceSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerNamespaceSharedAccessKeys;

public final class PartnerNamespaceSharedAccessKeysImpl implements PartnerNamespaceSharedAccessKeys {
    private PartnerNamespaceSharedAccessKeysInner innerObject;

    private final EventGridManager serviceManager;

    PartnerNamespaceSharedAccessKeysImpl(
        PartnerNamespaceSharedAccessKeysInner innerObject, EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String key1() {
        return this.innerModel().key1();
    }

    public String key2() {
        return this.innerModel().key2();
    }

    public PartnerNamespaceSharedAccessKeysInner innerModel() {
        return this.innerObject;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }
}
