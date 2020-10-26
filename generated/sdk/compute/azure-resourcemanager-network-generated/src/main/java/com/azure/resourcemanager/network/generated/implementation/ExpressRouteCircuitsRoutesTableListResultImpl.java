// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableListResultInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitRoutesTable;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitsRoutesTableListResult;
import java.util.Collections;
import java.util.List;

public final class ExpressRouteCircuitsRoutesTableListResultImpl implements ExpressRouteCircuitsRoutesTableListResult {
    private ExpressRouteCircuitsRoutesTableListResultInner innerObject;

    private final NetworkManager serviceManager;

    public ExpressRouteCircuitsRoutesTableListResultImpl(
        ExpressRouteCircuitsRoutesTableListResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ExpressRouteCircuitRoutesTable> value() {
        List<ExpressRouteCircuitRoutesTable> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ExpressRouteCircuitsRoutesTableListResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}