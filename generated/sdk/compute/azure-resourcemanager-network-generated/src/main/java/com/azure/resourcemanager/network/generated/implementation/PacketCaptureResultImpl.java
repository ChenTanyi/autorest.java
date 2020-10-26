// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.PacketCaptureResultInner;
import com.azure.resourcemanager.network.generated.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.generated.models.PacketCaptureResult;
import com.azure.resourcemanager.network.generated.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class PacketCaptureResultImpl implements PacketCaptureResult {
    private PacketCaptureResultInner innerObject;

    private final NetworkManager serviceManager;

    public PacketCaptureResultImpl(PacketCaptureResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String target() {
        return this.innerModel().target();
    }

    public Integer bytesToCapturePerPacket() {
        return this.innerModel().bytesToCapturePerPacket();
    }

    public Integer totalBytesPerSession() {
        return this.innerModel().totalBytesPerSession();
    }

    public Integer timeLimitInSeconds() {
        return this.innerModel().timeLimitInSeconds();
    }

    public PacketCaptureStorageLocation storageLocation() {
        return this.innerModel().storageLocation();
    }

    public List<PacketCaptureFilter> filters() {
        List<PacketCaptureFilter> inner = this.innerModel().filters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PacketCaptureResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
