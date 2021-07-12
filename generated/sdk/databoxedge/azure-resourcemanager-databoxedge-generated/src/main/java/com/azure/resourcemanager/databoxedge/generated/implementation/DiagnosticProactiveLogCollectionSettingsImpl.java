// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DiagnosticProactiveLogCollectionSettingsInner;
import com.azure.resourcemanager.databoxedge.generated.models.DiagnosticProactiveLogCollectionSettings;
import com.azure.resourcemanager.databoxedge.generated.models.ProactiveDiagnosticsConsent;

public final class DiagnosticProactiveLogCollectionSettingsImpl implements DiagnosticProactiveLogCollectionSettings {
    private DiagnosticProactiveLogCollectionSettingsInner innerObject;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    DiagnosticProactiveLogCollectionSettingsImpl(
        DiagnosticProactiveLogCollectionSettingsInner innerObject,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProactiveDiagnosticsConsent userConsent() {
        return this.innerModel().userConsent();
    }

    public DiagnosticProactiveLogCollectionSettingsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
