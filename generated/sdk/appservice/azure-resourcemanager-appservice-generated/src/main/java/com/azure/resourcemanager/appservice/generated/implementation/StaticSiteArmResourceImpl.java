// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteArmResourceInner;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteBuildProperties;
import com.azure.resourcemanager.appservice.generated.models.StaticSitePatchResource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class StaticSiteArmResourceImpl
    implements StaticSiteArmResource, StaticSiteArmResource.Definition, StaticSiteArmResource.Update {
    private StaticSiteArmResourceInner innerObject;

    private final WebSiteManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SkuDescription sku() {
        return this.innerModel().sku();
    }

    public String defaultHostname() {
        return this.innerModel().defaultHostname();
    }

    public String repositoryUrl() {
        return this.innerModel().repositoryUrl();
    }

    public String branch() {
        return this.innerModel().branch();
    }

    public List<String> customDomains() {
        List<String> inner = this.innerModel().customDomains();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String repositoryToken() {
        return this.innerModel().repositoryToken();
    }

    public StaticSiteBuildProperties buildProperties() {
        return this.innerModel().buildProperties();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public StaticSiteArmResourceInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private StaticSitePatchResource updateStaticSiteEnvelope;

    public StaticSiteArmResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StaticSiteArmResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateStaticSiteWithResponse(resourceGroupName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public StaticSiteArmResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateStaticSiteWithResponse(resourceGroupName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    public StaticSiteArmResourceImpl(String name, WebSiteManager serviceManager) {
        this.innerObject = new StaticSiteArmResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public StaticSiteArmResourceImpl update() {
        this.updateStaticSiteEnvelope = new StaticSitePatchResource();
        return this;
    }

    public StaticSiteArmResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .updateStaticSiteWithResponse(resourceGroupName, name, updateStaticSiteEnvelope, Context.NONE)
                .getValue();
        return this;
    }

    public StaticSiteArmResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .updateStaticSiteWithResponse(resourceGroupName, name, updateStaticSiteEnvelope, context)
                .getValue();
        return this;
    }

    public StaticSiteArmResourceImpl(StaticSiteArmResourceInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "staticSites");
    }

    public StaticSiteArmResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
                .getValue();
        return this;
    }

    public StaticSiteArmResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getByResourceGroupWithResponse(resourceGroupName, name, context)
                .getValue();
        return this;
    }

    public StaticSiteArmResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public StaticSiteArmResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public StaticSiteArmResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public StaticSiteArmResourceImpl withSku(SkuDescription sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public StaticSiteArmResourceImpl withRepositoryUrl(String repositoryUrl) {
        if (isInCreateMode()) {
            this.innerModel().withRepositoryUrl(repositoryUrl);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withRepositoryUrl(repositoryUrl);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withBranch(String branch) {
        if (isInCreateMode()) {
            this.innerModel().withBranch(branch);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withBranch(branch);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withRepositoryToken(String repositoryToken) {
        if (isInCreateMode()) {
            this.innerModel().withRepositoryToken(repositoryToken);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withRepositoryToken(repositoryToken);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withBuildProperties(StaticSiteBuildProperties buildProperties) {
        if (isInCreateMode()) {
            this.innerModel().withBuildProperties(buildProperties);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withBuildProperties(buildProperties);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withKind(kind);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
