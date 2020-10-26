// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.WebJobInner;
import com.azure.resourcemanager.appservice.generated.models.WebJob;
import com.azure.resourcemanager.appservice.generated.models.WebJobType;
import java.util.Collections;
import java.util.Map;

public final class WebJobImpl implements WebJob {
    private WebJobInner innerObject;

    private final WebSiteManager serviceManager;

    public WebJobImpl(WebJobInner innerObject, WebSiteManager serviceManager) {
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

    public String runCommand() {
        return this.innerModel().runCommand();
    }

    public String url() {
        return this.innerModel().url();
    }

    public String extraInfoUrl() {
        return this.innerModel().extraInfoUrl();
    }

    public WebJobType webJobType() {
        return this.innerModel().webJobType();
    }

    public String error() {
        return this.innerModel().error();
    }

    public Boolean usingSdk() {
        return this.innerModel().usingSdk();
    }

    public Map<String, Object> settings() {
        Map<String, Object> inner = this.innerModel().settings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public WebJobInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
