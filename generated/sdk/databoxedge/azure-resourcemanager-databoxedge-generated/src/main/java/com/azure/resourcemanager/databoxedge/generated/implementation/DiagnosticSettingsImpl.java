// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.DiagnosticSettingsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DiagnosticProactiveLogCollectionSettingsInner;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DiagnosticRemoteSupportSettingsInner;
import com.azure.resourcemanager.databoxedge.generated.models.DiagnosticProactiveLogCollectionSettings;
import com.azure.resourcemanager.databoxedge.generated.models.DiagnosticRemoteSupportSettings;
import com.azure.resourcemanager.databoxedge.generated.models.DiagnosticSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DiagnosticSettingsImpl implements DiagnosticSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticSettingsImpl.class);

    private final DiagnosticSettingsClient innerClient;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    public DiagnosticSettingsImpl(
        DiagnosticSettingsClient innerClient,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DiagnosticProactiveLogCollectionSettings getDiagnosticProactiveLogCollectionSettings(
        String deviceName, String resourceGroupName) {
        DiagnosticProactiveLogCollectionSettingsInner inner =
            this.serviceClient().getDiagnosticProactiveLogCollectionSettings(deviceName, resourceGroupName);
        if (inner != null) {
            return new DiagnosticProactiveLogCollectionSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticProactiveLogCollectionSettings> getDiagnosticProactiveLogCollectionSettingsWithResponse(
        String deviceName, String resourceGroupName, Context context) {
        Response<DiagnosticProactiveLogCollectionSettingsInner> inner =
            this
                .serviceClient()
                .getDiagnosticProactiveLogCollectionSettingsWithResponse(deviceName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticProactiveLogCollectionSettingsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void updateDiagnosticProactiveLogCollectionSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticProactiveLogCollectionSettingsInner proactiveLogCollectionSettings) {
        this
            .serviceClient()
            .updateDiagnosticProactiveLogCollectionSettings(
                deviceName, resourceGroupName, proactiveLogCollectionSettings);
    }

    public void updateDiagnosticProactiveLogCollectionSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticProactiveLogCollectionSettingsInner proactiveLogCollectionSettings,
        Context context) {
        this
            .serviceClient()
            .updateDiagnosticProactiveLogCollectionSettings(
                deviceName, resourceGroupName, proactiveLogCollectionSettings, context);
    }

    public DiagnosticRemoteSupportSettings getDiagnosticRemoteSupportSettings(
        String deviceName, String resourceGroupName) {
        DiagnosticRemoteSupportSettingsInner inner =
            this.serviceClient().getDiagnosticRemoteSupportSettings(deviceName, resourceGroupName);
        if (inner != null) {
            return new DiagnosticRemoteSupportSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticRemoteSupportSettings> getDiagnosticRemoteSupportSettingsWithResponse(
        String deviceName, String resourceGroupName, Context context) {
        Response<DiagnosticRemoteSupportSettingsInner> inner =
            this.serviceClient().getDiagnosticRemoteSupportSettingsWithResponse(deviceName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticRemoteSupportSettingsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void updateDiagnosticRemoteSupportSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticRemoteSupportSettingsInner diagnosticRemoteSupportSettings) {
        this
            .serviceClient()
            .updateDiagnosticRemoteSupportSettings(deviceName, resourceGroupName, diagnosticRemoteSupportSettings);
    }

    public void updateDiagnosticRemoteSupportSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticRemoteSupportSettingsInner diagnosticRemoteSupportSettings,
        Context context) {
        this
            .serviceClient()
            .updateDiagnosticRemoteSupportSettings(
                deviceName, resourceGroupName, diagnosticRemoteSupportSettings, context);
    }

    private DiagnosticSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
