// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.GenerateDetailedCostReportOperationStatusesInner;
import com.azure.resourcemanager.costmanagement.generated.models.GenerateDetailedCostReportOperationStatuses;
import com.azure.resourcemanager.costmanagement.generated.models.Status;
import java.time.OffsetDateTime;

public final class GenerateDetailedCostReportOperationStatusesImpl
    implements GenerateDetailedCostReportOperationStatuses {
    private GenerateDetailedCostReportOperationStatusesInner innerObject;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    GenerateDetailedCostReportOperationStatusesImpl(
        GenerateDetailedCostReportOperationStatusesInner innerObject,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public String downloadUrl() {
        return this.innerModel().downloadUrl();
    }

    public OffsetDateTime validTill() {
        return this.innerModel().validTill();
    }

    public GenerateDetailedCostReportOperationStatusesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }
}
