// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupExportResultInner;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupExportResult;

public final class ResourceGroupExportResultImpl implements ResourceGroupExportResult {
    private ResourceGroupExportResultInner innerObject;

    private final ResourceManager serviceManager;

    public ResourceGroupExportResultImpl(ResourceGroupExportResultInner innerObject, ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Object template() {
        return this.innerModel().template();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public ResourceGroupExportResultInner innerModel() {
        return this.innerObject;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }
}