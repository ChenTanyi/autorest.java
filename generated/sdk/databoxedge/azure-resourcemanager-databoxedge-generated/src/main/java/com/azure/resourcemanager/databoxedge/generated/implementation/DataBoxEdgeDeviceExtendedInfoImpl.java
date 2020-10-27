// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDeviceExtendedInfoInner;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceExtendedInfo;

public final class DataBoxEdgeDeviceExtendedInfoImpl implements DataBoxEdgeDeviceExtendedInfo {
    private DataBoxEdgeDeviceExtendedInfoInner innerObject;

    private final DataBoxEdgeManager serviceManager;

    public DataBoxEdgeDeviceExtendedInfoImpl(
        DataBoxEdgeDeviceExtendedInfoInner innerObject, DataBoxEdgeManager serviceManager) {
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

    public String encryptionKeyThumbprint() {
        return this.innerModel().encryptionKeyThumbprint();
    }

    public String encryptionKey() {
        return this.innerModel().encryptionKey();
    }

    public String resourceKey() {
        return this.innerModel().resourceKey();
    }

    public DataBoxEdgeDeviceExtendedInfoInner innerModel() {
        return this.innerObject;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
