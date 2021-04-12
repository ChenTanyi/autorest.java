// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.resourcemanager.consumption.generated.fluent.models.ManagementGroupAggregatedCostResultInner;
import com.azure.resourcemanager.consumption.generated.models.ManagementGroupAggregatedCostResult;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ManagementGroupAggregatedCostResultImpl implements ManagementGroupAggregatedCostResult {
    private ManagementGroupAggregatedCostResultInner innerObject;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    ManagementGroupAggregatedCostResultImpl(
        ManagementGroupAggregatedCostResultInner innerObject,
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

    public String billingPeriodId() {
        return this.innerModel().billingPeriodId();
    }

    public OffsetDateTime usageStart() {
        return this.innerModel().usageStart();
    }

    public OffsetDateTime usageEnd() {
        return this.innerModel().usageEnd();
    }

    public BigDecimal azureCharges() {
        return this.innerModel().azureCharges();
    }

    public BigDecimal marketplaceCharges() {
        return this.innerModel().marketplaceCharges();
    }

    public BigDecimal chargesBilledSeparately() {
        return this.innerModel().chargesBilledSeparately();
    }

    public String currency() {
        return this.innerModel().currency();
    }

    public List<ManagementGroupAggregatedCostResult> children() {
        List<ManagementGroupAggregatedCostResultInner> inner = this.innerModel().children();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ManagementGroupAggregatedCostResultImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> includedSubscriptions() {
        List<String> inner = this.innerModel().includedSubscriptions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> excludedSubscriptions() {
        List<String> inner = this.innerModel().excludedSubscriptions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public ManagementGroupAggregatedCostResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
