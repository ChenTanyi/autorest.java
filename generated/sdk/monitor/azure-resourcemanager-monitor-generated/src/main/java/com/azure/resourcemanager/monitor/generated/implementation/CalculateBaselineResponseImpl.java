// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.models.CalculateBaselineResponseInner;
import com.azure.resourcemanager.monitor.generated.models.Baseline;
import com.azure.resourcemanager.monitor.generated.models.CalculateBaselineResponse;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class CalculateBaselineResponseImpl implements CalculateBaselineResponse {
    private CalculateBaselineResponseInner innerObject;

    private final MonitorManager serviceManager;

    public CalculateBaselineResponseImpl(CalculateBaselineResponseInner innerObject, MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String type() {
        return this.innerModel().type();
    }

    public List<OffsetDateTime> timestamps() {
        List<OffsetDateTime> inner = this.innerModel().timestamps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<Baseline> baseline() {
        List<Baseline> inner = this.innerModel().baseline();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public CalculateBaselineResponseInner innerModel() {
        return this.innerObject;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
