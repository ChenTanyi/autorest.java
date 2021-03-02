// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.resourcemanager.frontdoor.generated.fluent.models.TimeseriesInner;
import com.azure.resourcemanager.frontdoor.generated.models.AggregationInterval;
import com.azure.resourcemanager.frontdoor.generated.models.Timeseries;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesDataPoint;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class TimeseriesImpl implements Timeseries {
    private TimeseriesInner innerObject;

    private final com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager;

    TimeseriesImpl(
        TimeseriesInner innerObject, com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String endpoint() {
        return this.innerModel().endpoint();
    }

    public String startDateTimeUtc() {
        return this.innerModel().startDateTimeUtc();
    }

    public String endDateTimeUtc() {
        return this.innerModel().endDateTimeUtc();
    }

    public AggregationInterval aggregationInterval() {
        return this.innerModel().aggregationInterval();
    }

    public TimeseriesType timeseriesType() {
        return this.innerModel().timeseriesType();
    }

    public String country() {
        return this.innerModel().country();
    }

    public List<TimeseriesDataPoint> timeseriesData() {
        List<TimeseriesDataPoint> inner = this.innerModel().timeseriesData();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public TimeseriesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.frontdoor.generated.FrontDoorManager manager() {
        return this.serviceManager;
    }
}
