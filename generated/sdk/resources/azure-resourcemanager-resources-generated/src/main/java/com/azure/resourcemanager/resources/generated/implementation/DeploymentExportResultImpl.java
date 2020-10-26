// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentExportResultInner;
import com.azure.resourcemanager.resources.generated.models.DeploymentExportResult;

public final class DeploymentExportResultImpl implements DeploymentExportResult {
    private DeploymentExportResultInner innerObject;

    private final ResourceManager serviceManager;

    public DeploymentExportResultImpl(DeploymentExportResultInner innerObject, ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Object template() {
        return this.innerModel().template();
    }

    public DeploymentExportResultInner innerModel() {
        return this.innerObject;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }
}
