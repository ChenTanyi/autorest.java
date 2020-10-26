// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.TopLevelDomainInner;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomain;

public final class TopLevelDomainImpl implements TopLevelDomain {
    private TopLevelDomainInner innerObject;

    private final WebSiteManager serviceManager;

    public TopLevelDomainImpl(TopLevelDomainInner innerObject, WebSiteManager serviceManager) {
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

    public Boolean privacy() {
        return this.innerModel().privacy();
    }

    public TopLevelDomainInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
