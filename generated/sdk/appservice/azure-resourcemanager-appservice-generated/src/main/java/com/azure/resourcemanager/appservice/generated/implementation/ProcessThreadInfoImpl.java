// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.ProcessThreadInfoInner;
import com.azure.resourcemanager.appservice.generated.models.ProcessThreadInfo;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.time.OffsetDateTime;

public final class ProcessThreadInfoImpl implements ProcessThreadInfo {
    private ProcessThreadInfoInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    ProcessThreadInfoImpl(
        ProcessThreadInfoInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Integer identifier() {
        return this.innerModel().identifier();
    }

    public String href() {
        return this.innerModel().href();
    }

    public String process() {
        return this.innerModel().process();
    }

    public String startAddress() {
        return this.innerModel().startAddress();
    }

    public Integer currentPriority() {
        return this.innerModel().currentPriority();
    }

    public String priorityLevel() {
        return this.innerModel().priorityLevel();
    }

    public Integer basePriority() {
        return this.innerModel().basePriority();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public String totalProcessorTime() {
        return this.innerModel().totalProcessorTime();
    }

    public String userProcessorTime() {
        return this.innerModel().userProcessorTime();
    }

    public String state() {
        return this.innerModel().state();
    }

    public String waitReason() {
        return this.innerModel().waitReason();
    }

    public ProcessThreadInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
