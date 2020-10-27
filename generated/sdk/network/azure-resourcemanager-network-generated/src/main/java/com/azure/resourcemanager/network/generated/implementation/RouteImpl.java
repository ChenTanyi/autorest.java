// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.RouteInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Route;
import com.azure.resourcemanager.network.generated.models.RouteNextHopType;

public final class RouteImpl implements Route {
    private RouteInner innerObject;

    private final NetworkManager serviceManager;

    public RouteImpl(RouteInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public RouteNextHopType nextHopType() {
        return this.innerModel().nextHopType();
    }

    public String nextHopIpAddress() {
        return this.innerModel().nextHopIpAddress();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RouteInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
