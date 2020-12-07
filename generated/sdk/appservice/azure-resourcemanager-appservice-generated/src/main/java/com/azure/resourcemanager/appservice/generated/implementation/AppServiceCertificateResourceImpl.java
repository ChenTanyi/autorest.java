// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateResourceInner;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificatePatchResource;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateResource;
import com.azure.resourcemanager.appservice.generated.models.KeyVaultSecretStatus;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.util.Collections;
import java.util.Map;

public final class AppServiceCertificateResourceImpl
    implements AppServiceCertificateResource,
        AppServiceCertificateResource.Definition,
        AppServiceCertificateResource.Update {
    private AppServiceCertificateResourceInner innerObject;

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

    public String keyVaultId() {
        return this.innerModel().keyVaultId();
    }

    public String keyVaultSecretName() {
        return this.innerModel().keyVaultSecretName();
    }

    public KeyVaultSecretStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AppServiceCertificateResourceInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String certificateOrderName;

    private String name;

    private AppServiceCertificatePatchResource updateKeyVaultCertificate;

    public AppServiceCertificateResourceImpl withExistingCertificateOrder(
        String resourceGroupName, String certificateOrderName) {
        this.resourceGroupName = resourceGroupName;
        this.certificateOrderName = certificateOrderName;
        return this;
    }

    public AppServiceCertificateResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceCertificateOrders()
                .createOrUpdateCertificate(
                    resourceGroupName, certificateOrderName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public AppServiceCertificateResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceCertificateOrders()
                .createOrUpdateCertificate(resourceGroupName, certificateOrderName, name, this.innerModel(), context);
        return this;
    }

    AppServiceCertificateResourceImpl(String name, WebSiteManager serviceManager) {
        this.innerObject = new AppServiceCertificateResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public AppServiceCertificateResourceImpl update() {
        this.updateKeyVaultCertificate = new AppServiceCertificatePatchResource();
        return this;
    }

    public AppServiceCertificateResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceCertificateOrders()
                .updateCertificateWithResponse(
                    resourceGroupName, certificateOrderName, name, updateKeyVaultCertificate, Context.NONE)
                .getValue();
        return this;
    }

    public AppServiceCertificateResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceCertificateOrders()
                .updateCertificateWithResponse(
                    resourceGroupName, certificateOrderName, name, updateKeyVaultCertificate, context)
                .getValue();
        return this;
    }

    AppServiceCertificateResourceImpl(AppServiceCertificateResourceInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.certificateOrderName = Utils.getValueFromIdByName(innerObject.id(), "certificateOrders");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "certificates");
    }

    public AppServiceCertificateResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceCertificateOrders()
                .getCertificateWithResponse(resourceGroupName, certificateOrderName, name, Context.NONE)
                .getValue();
        return this;
    }

    public AppServiceCertificateResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceCertificateOrders()
                .getCertificateWithResponse(resourceGroupName, certificateOrderName, name, context)
                .getValue();
        return this;
    }

    public AppServiceCertificateResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AppServiceCertificateResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AppServiceCertificateResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AppServiceCertificateResourceImpl withKeyVaultId(String keyVaultId) {
        if (isInCreateMode()) {
            this.innerModel().withKeyVaultId(keyVaultId);
            return this;
        } else {
            this.updateKeyVaultCertificate.withKeyVaultId(keyVaultId);
            return this;
        }
    }

    public AppServiceCertificateResourceImpl withKeyVaultSecretName(String keyVaultSecretName) {
        if (isInCreateMode()) {
            this.innerModel().withKeyVaultSecretName(keyVaultSecretName);
            return this;
        } else {
            this.updateKeyVaultCertificate.withKeyVaultSecretName(keyVaultSecretName);
            return this;
        }
    }

    public AppServiceCertificateResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateKeyVaultCertificate.withKind(kind);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
