// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteExtensionInfoInner;
import com.azure.resourcemanager.appservice.generated.models.SiteExtensionInfo;
import com.azure.resourcemanager.appservice.generated.models.SiteExtensionType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class SiteExtensionInfoImpl implements SiteExtensionInfo {
    private SiteExtensionInfoInner innerObject;

    private final WebSiteManager serviceManager;

    public SiteExtensionInfoImpl(SiteExtensionInfoInner innerObject, WebSiteManager serviceManager) {
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

    public String extensionId() {
        return this.innerModel().extensionId();
    }

    public String title() {
        return this.innerModel().title();
    }

    public SiteExtensionType extensionType() {
        return this.innerModel().extensionType();
    }

    public String summary() {
        return this.innerModel().summary();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String extensionUrl() {
        return this.innerModel().extensionUrl();
    }

    public String projectUrl() {
        return this.innerModel().projectUrl();
    }

    public String iconUrl() {
        return this.innerModel().iconUrl();
    }

    public String licenseUrl() {
        return this.innerModel().licenseUrl();
    }

    public String feedUrl() {
        return this.innerModel().feedUrl();
    }

    public List<String> authors() {
        List<String> inner = this.innerModel().authors();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String installerCommandLineParams() {
        return this.innerModel().installerCommandLineParams();
    }

    public OffsetDateTime publishedDateTime() {
        return this.innerModel().publishedDateTime();
    }

    public Integer downloadCount() {
        return this.innerModel().downloadCount();
    }

    public Boolean localIsLatestVersion() {
        return this.innerModel().localIsLatestVersion();
    }

    public String localPath() {
        return this.innerModel().localPath();
    }

    public OffsetDateTime installedDateTime() {
        return this.innerModel().installedDateTime();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String comment() {
        return this.innerModel().comment();
    }

    public SiteExtensionInfoInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
