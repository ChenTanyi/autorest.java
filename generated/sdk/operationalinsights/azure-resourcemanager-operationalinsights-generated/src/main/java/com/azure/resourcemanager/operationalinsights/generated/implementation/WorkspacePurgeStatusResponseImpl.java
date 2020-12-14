// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.WorkspacePurgeStatusResponseInner;
import com.azure.resourcemanager.operationalinsights.generated.models.PurgeState;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspacePurgeStatusResponse;

public final class WorkspacePurgeStatusResponseImpl implements WorkspacePurgeStatusResponse {
    private WorkspacePurgeStatusResponseInner innerObject;

    private final LogAnalyticsManager serviceManager;

    WorkspacePurgeStatusResponseImpl(
        WorkspacePurgeStatusResponseInner innerObject, LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public PurgeState status() {
        return this.innerModel().status();
    }

    public WorkspacePurgeStatusResponseInner innerModel() {
        return this.innerObject;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
