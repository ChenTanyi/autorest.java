// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricInner;
import com.azure.resourcemanager.monitor.generated.models.LocalizableString;
import com.azure.resourcemanager.monitor.generated.models.Metric;
import com.azure.resourcemanager.monitor.generated.models.TimeSeriesElement;
import com.azure.resourcemanager.monitor.generated.models.Unit;
import java.util.Collections;
import java.util.List;

public final class MetricImpl implements Metric {
    private MetricInner innerObject;

    private final MonitorManager serviceManager;

    public MetricImpl(MetricInner innerObject, MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public LocalizableString name() {
        LocalizableStringInner inner = this.innerModel().name();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Unit unit() {
        return this.innerModel().unit();
    }

    public List<TimeSeriesElement> timeseries() {
        List<TimeSeriesElement> inner = this.innerModel().timeseries();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MetricInner innerModel() {
        return this.innerObject;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
