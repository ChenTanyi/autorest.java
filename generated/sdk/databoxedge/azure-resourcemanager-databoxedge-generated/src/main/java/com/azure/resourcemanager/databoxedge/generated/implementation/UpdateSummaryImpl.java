// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.resourcemanager.databoxedge.generated.fluent.models.UpdateSummaryInner;
import com.azure.resourcemanager.databoxedge.generated.models.InstallRebootBehavior;
import com.azure.resourcemanager.databoxedge.generated.models.UpdateOperation;
import com.azure.resourcemanager.databoxedge.generated.models.UpdateSummary;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class UpdateSummaryImpl implements UpdateSummary {
    private UpdateSummaryInner innerObject;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    UpdateSummaryImpl(
        UpdateSummaryInner innerObject,
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

    public String deviceVersionNumber() {
        return this.innerModel().deviceVersionNumber();
    }

    public String friendlyDeviceVersionName() {
        return this.innerModel().friendlyDeviceVersionName();
    }

    public OffsetDateTime deviceLastScannedDateTime() {
        return this.innerModel().deviceLastScannedDateTime();
    }

    public OffsetDateTime lastCompletedScanJobDateTime() {
        return this.innerModel().lastCompletedScanJobDateTime();
    }

    public OffsetDateTime lastCompletedDownloadJobDateTime() {
        return this.innerModel().lastCompletedDownloadJobDateTime();
    }

    public OffsetDateTime lastCompletedInstallJobDateTime() {
        return this.innerModel().lastCompletedInstallJobDateTime();
    }

    public Integer totalNumberOfUpdatesAvailable() {
        return this.innerModel().totalNumberOfUpdatesAvailable();
    }

    public Integer totalNumberOfUpdatesPendingDownload() {
        return this.innerModel().totalNumberOfUpdatesPendingDownload();
    }

    public Integer totalNumberOfUpdatesPendingInstall() {
        return this.innerModel().totalNumberOfUpdatesPendingInstall();
    }

    public InstallRebootBehavior rebootBehavior() {
        return this.innerModel().rebootBehavior();
    }

    public UpdateOperation ongoingUpdateOperation() {
        return this.innerModel().ongoingUpdateOperation();
    }

    public String inProgressDownloadJobId() {
        return this.innerModel().inProgressDownloadJobId();
    }

    public String inProgressInstallJobId() {
        return this.innerModel().inProgressInstallJobId();
    }

    public OffsetDateTime inProgressDownloadJobStartedDateTime() {
        return this.innerModel().inProgressDownloadJobStartedDateTime();
    }

    public OffsetDateTime inProgressInstallJobStartedDateTime() {
        return this.innerModel().inProgressInstallJobStartedDateTime();
    }

    public List<String> updateTitles() {
        List<String> inner = this.innerModel().updateTitles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Double totalUpdateSizeInBytes() {
        return this.innerModel().totalUpdateSizeInBytes();
    }

    public UpdateSummaryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
