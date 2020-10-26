// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorDefinitionInner;
import com.azure.resourcemanager.appservice.generated.models.DetectorDefinition;

public final class DetectorDefinitionImpl implements DetectorDefinition {
    private DetectorDefinitionInner innerObject;

    private final WebSiteManager serviceManager;

    public DetectorDefinitionImpl(DetectorDefinitionInner innerObject, WebSiteManager serviceManager) {
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

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Double rank() {
        return this.innerModel().rank();
    }

    public Boolean isEnabled() {
        return this.innerModel().isEnabled();
    }

    public DetectorDefinitionInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
