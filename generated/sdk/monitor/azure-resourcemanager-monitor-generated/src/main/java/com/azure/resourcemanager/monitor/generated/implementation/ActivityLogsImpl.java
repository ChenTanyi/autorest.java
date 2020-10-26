// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.ActivityLogsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.EventDataInner;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogs;
import com.azure.resourcemanager.monitor.generated.models.EventData;

public final class ActivityLogsImpl implements ActivityLogs {
    private final ActivityLogsClient innerClient;

    private final MonitorManager serviceManager;

    public ActivityLogsImpl(ActivityLogsClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EventData> list(String filter) {
        PagedIterable<EventDataInner> inner = this.serviceClient().list(filter);
        return inner.mapPage(inner1 -> new EventDataImpl(inner1, this.manager()));
    }

    public PagedIterable<EventData> list(String filter, String select, Context context) {
        PagedIterable<EventDataInner> inner = this.serviceClient().list(filter, select, context);
        return inner.mapPage(inner1 -> new EventDataImpl(inner1, this.manager()));
    }

    private ActivityLogsClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}