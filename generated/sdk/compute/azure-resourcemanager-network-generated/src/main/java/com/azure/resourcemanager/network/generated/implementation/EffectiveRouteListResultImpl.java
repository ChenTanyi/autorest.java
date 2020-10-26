// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteListResultInner;
import com.azure.resourcemanager.network.generated.models.EffectiveRoute;
import com.azure.resourcemanager.network.generated.models.EffectiveRouteListResult;
import java.util.Collections;
import java.util.List;

public final class EffectiveRouteListResultImpl implements EffectiveRouteListResult {
    private EffectiveRouteListResultInner innerObject;

    private final NetworkManager serviceManager;

    public EffectiveRouteListResultImpl(EffectiveRouteListResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<EffectiveRoute> value() {
        List<EffectiveRoute> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public EffectiveRouteListResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
