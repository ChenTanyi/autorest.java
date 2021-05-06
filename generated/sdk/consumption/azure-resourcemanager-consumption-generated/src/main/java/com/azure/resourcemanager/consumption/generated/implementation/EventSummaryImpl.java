// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.resourcemanager.consumption.generated.fluent.models.EventSummaryInner;
import com.azure.resourcemanager.consumption.generated.models.Amount;
import com.azure.resourcemanager.consumption.generated.models.EventSummary;
import com.azure.resourcemanager.consumption.generated.models.EventType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class EventSummaryImpl implements EventSummary {
    private EventSummaryInner innerObject;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    EventSummaryImpl(
        EventSummaryInner innerObject,
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

    public OffsetDateTime transactionDate() {
        return this.innerModel().transactionDate();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Amount newCredit() {
        return this.innerModel().newCredit();
    }

    public Amount adjustments() {
        return this.innerModel().adjustments();
    }

    public Amount creditExpired() {
        return this.innerModel().creditExpired();
    }

    public Amount charges() {
        return this.innerModel().charges();
    }

    public Amount closedBalance() {
        return this.innerModel().closedBalance();
    }

    public EventType eventType() {
        return this.innerModel().eventType();
    }

    public String invoiceNumber() {
        return this.innerModel().invoiceNumber();
    }

    public String billingProfileId() {
        return this.innerModel().billingProfileId();
    }

    public String billingProfileDisplayName() {
        return this.innerModel().billingProfileDisplayName();
    }

    public String lotId() {
        return this.innerModel().lotId();
    }

    public String lotSource() {
        return this.innerModel().lotSource();
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

    public EventSummaryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
