// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableSummaryListResultInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitRoutesTableSummary;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitsRoutesTableSummaryListResult;
import java.util.Collections;
import java.util.List;

public final class ExpressRouteCircuitsRoutesTableSummaryListResultImpl
    implements ExpressRouteCircuitsRoutesTableSummaryListResult {
    private ExpressRouteCircuitsRoutesTableSummaryListResultInner innerObject;

    private final NetworkManager serviceManager;

    public ExpressRouteCircuitsRoutesTableSummaryListResultImpl(
        ExpressRouteCircuitsRoutesTableSummaryListResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ExpressRouteCircuitRoutesTableSummary> value() {
        List<ExpressRouteCircuitRoutesTableSummary> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ExpressRouteCircuitsRoutesTableSummaryListResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
