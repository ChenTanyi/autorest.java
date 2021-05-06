// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.resourcemanager.consumption.generated.fluent.models.LotSummaryInner;
import com.azure.resourcemanager.consumption.generated.models.Amount;
import com.azure.resourcemanager.consumption.generated.models.LotSource;
import com.azure.resourcemanager.consumption.generated.models.LotSummary;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class LotSummaryImpl implements LotSummary {
    private LotSummaryInner innerObject;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    LotSummaryImpl(
        LotSummaryInner innerObject,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
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

    public Amount originalAmount() {
        return this.innerModel().originalAmount();
    }

    public Amount closedBalance() {
        return this.innerModel().closedBalance();
    }

    public LotSource source() {
        return this.innerModel().source();
    }

    public OffsetDateTime startDate() {
        return this.innerModel().startDate();
    }

    public OffsetDateTime expirationDate() {
        return this.innerModel().expirationDate();
    }

    public String poNumber() {
        return this.innerModel().poNumber();
    }

    public OffsetDateTime purchaseDate() {
        return this.innerModel().purchaseDate();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public LotSummaryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
