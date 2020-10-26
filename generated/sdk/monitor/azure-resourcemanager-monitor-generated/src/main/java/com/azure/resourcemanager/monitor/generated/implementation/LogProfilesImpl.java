// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.LogProfilesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.LogProfileResourceInner;
import com.azure.resourcemanager.monitor.generated.models.LogProfileResource;
import com.azure.resourcemanager.monitor.generated.models.LogProfiles;

public final class LogProfilesImpl implements LogProfiles {
    private final LogProfilesClient innerClient;

    private final MonitorManager serviceManager;

    public LogProfilesImpl(LogProfilesClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String logProfileName) {
        this.serviceClient().delete(logProfileName);
    }

    public Response<Void> deleteWithResponse(String logProfileName, Context context) {
        return this.serviceClient().deleteWithResponse(logProfileName, context);
    }

    public LogProfileResource get(String logProfileName) {
        LogProfileResourceInner inner = this.serviceClient().get(logProfileName);
        if (inner != null) {
            return new LogProfileResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LogProfileResource> getWithResponse(String logProfileName, Context context) {
        Response<LogProfileResourceInner> inner = this.serviceClient().getWithResponse(logProfileName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LogProfileResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<LogProfileResource> list() {
        PagedIterable<LogProfileResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new LogProfileResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogProfileResource> list(Context context) {
        PagedIterable<LogProfileResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new LogProfileResourceImpl(inner1, this.manager()));
    }

    private LogProfilesClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }

    public LogProfileResourceImpl define(String name) {
        return new LogProfileResourceImpl(name, this.manager());
    }
}
