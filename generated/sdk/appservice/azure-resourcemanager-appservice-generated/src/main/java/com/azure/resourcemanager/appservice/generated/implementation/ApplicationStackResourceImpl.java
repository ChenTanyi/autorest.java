// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.ApplicationStackResourceInner;
import com.azure.resourcemanager.appservice.generated.models.ApplicationStack;
import com.azure.resourcemanager.appservice.generated.models.ApplicationStackResource;
import com.azure.resourcemanager.appservice.generated.models.StackMajorVersion;
import java.util.Collections;
import java.util.List;

public final class ApplicationStackResourceImpl implements ApplicationStackResource {
    private ApplicationStackResourceInner innerObject;

    private final WebSiteManager serviceManager;

    public ApplicationStackResourceImpl(ApplicationStackResourceInner innerObject, WebSiteManager serviceManager) {
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

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String display() {
        return this.innerModel().display();
    }

    public String dependency() {
        return this.innerModel().dependency();
    }

    public List<StackMajorVersion> majorVersions() {
        List<StackMajorVersion> inner = this.innerModel().majorVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationStack> frameworks() {
        List<ApplicationStack> inner = this.innerModel().frameworks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationStackResourceInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
