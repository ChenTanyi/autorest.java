// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.EffectiveNetworkSecurityGroupListResultInner;
import com.azure.resourcemanager.network.generated.models.EffectiveNetworkSecurityGroup;
import com.azure.resourcemanager.network.generated.models.EffectiveNetworkSecurityGroupListResult;
import java.util.Collections;
import java.util.List;

public final class EffectiveNetworkSecurityGroupListResultImpl implements EffectiveNetworkSecurityGroupListResult {
    private EffectiveNetworkSecurityGroupListResultInner innerObject;

    private final NetworkManager serviceManager;

    public EffectiveNetworkSecurityGroupListResultImpl(
        EffectiveNetworkSecurityGroupListResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<EffectiveNetworkSecurityGroup> value() {
        List<EffectiveNetworkSecurityGroup> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public EffectiveNetworkSecurityGroupListResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
