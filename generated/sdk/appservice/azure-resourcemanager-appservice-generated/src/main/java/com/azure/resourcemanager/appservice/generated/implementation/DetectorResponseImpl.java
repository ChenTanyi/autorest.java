// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.appservice.generated.models.DetectorInfo;
import com.azure.resourcemanager.appservice.generated.models.DetectorResponse;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticData;
import java.util.Collections;
import java.util.List;

public final class DetectorResponseImpl implements DetectorResponse {
    private DetectorResponseInner innerObject;

    private final WebSiteManager serviceManager;

    public DetectorResponseImpl(DetectorResponseInner innerObject, WebSiteManager serviceManager) {
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

    public DetectorInfo metadata() {
        return this.innerModel().metadata();
    }

    public List<DiagnosticData> dataset() {
        List<DiagnosticData> inner = this.innerModel().dataset();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public DetectorResponseInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}