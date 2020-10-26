// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.DiagnosticSettingsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsResourceCollectionInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettings;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsResource;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsResourceCollection;

public final class DiagnosticSettingsImpl implements DiagnosticSettings {
    private final DiagnosticSettingsClient innerClient;

    private final MonitorManager serviceManager;

    public DiagnosticSettingsImpl(DiagnosticSettingsClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DiagnosticSettingsResource get(String resourceUri, String name) {
        DiagnosticSettingsResourceInner inner = this.serviceClient().get(resourceUri, name);
        if (inner != null) {
            return new DiagnosticSettingsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsResource> getWithResponse(String resourceUri, String name, Context context) {
        Response<DiagnosticSettingsResourceInner> inner =
            this.serviceClient().getWithResponse(resourceUri, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticSettingsResource createOrUpdate(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters) {
        DiagnosticSettingsResourceInner inner = this.serviceClient().createOrUpdate(resourceUri, name, parameters);
        if (inner != null) {
            return new DiagnosticSettingsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsResource> createOrUpdateWithResponse(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters, Context context) {
        Response<DiagnosticSettingsResourceInner> inner =
            this.serviceClient().createOrUpdateWithResponse(resourceUri, name, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceUri, String name) {
        this.serviceClient().delete(resourceUri, name);
    }

    public Response<Void> deleteWithResponse(String resourceUri, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceUri, name, context);
    }

    public DiagnosticSettingsResourceCollection list(String resourceUri) {
        DiagnosticSettingsResourceCollectionInner inner = this.serviceClient().list(resourceUri);
        if (inner != null) {
            return new DiagnosticSettingsResourceCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsResourceCollection> listWithResponse(String resourceUri, Context context) {
        Response<DiagnosticSettingsResourceCollectionInner> inner =
            this.serviceClient().listWithResponse(resourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsResourceCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DiagnosticSettingsClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
