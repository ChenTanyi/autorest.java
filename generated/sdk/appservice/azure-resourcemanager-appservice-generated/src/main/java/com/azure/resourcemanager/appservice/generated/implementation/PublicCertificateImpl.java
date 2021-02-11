// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.PublicCertificateInner;
import com.azure.resourcemanager.appservice.generated.models.PublicCertificate;
import com.azure.resourcemanager.appservice.generated.models.PublicCertificateLocation;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class PublicCertificateImpl
    implements PublicCertificate, PublicCertificate.Definition, PublicCertificate.Update {
    private PublicCertificateInner innerObject;

    private final AppServiceManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public byte[] blob() {
        return this.innerModel().blob();
    }

    public PublicCertificateLocation publicCertificateLocation() {
        return this.innerModel().publicCertificateLocation();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public PublicCertificateInner innerModel() {
        return this.innerObject;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String publicCertificateName;

    public PublicCertificateImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public PublicCertificate create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdatePublicCertificateWithResponse(
                    resourceGroupName, name, publicCertificateName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PublicCertificate create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdatePublicCertificateWithResponse(
                    resourceGroupName, name, publicCertificateName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PublicCertificateImpl(String name, AppServiceManager serviceManager) {
        this.innerObject = new PublicCertificateInner();
        this.serviceManager = serviceManager;
        this.publicCertificateName = name;
    }

    public PublicCertificateImpl update() {
        return this;
    }

    public PublicCertificate apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdatePublicCertificateWithResponse(
                    resourceGroupName, name, publicCertificateName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PublicCertificate apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdatePublicCertificateWithResponse(
                    resourceGroupName, name, publicCertificateName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PublicCertificateImpl(PublicCertificateInner innerObject, AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
        this.publicCertificateName = Utils.getValueFromIdByName(innerObject.id(), "publicCertificates");
    }

    public PublicCertificate refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getPublicCertificateWithResponse(resourceGroupName, name, publicCertificateName, Context.NONE)
                .getValue();
        return this;
    }

    public PublicCertificate refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getPublicCertificateWithResponse(resourceGroupName, name, publicCertificateName, context)
                .getValue();
        return this;
    }

    public PublicCertificateImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public PublicCertificateImpl withBlob(byte[] blob) {
        this.innerModel().withBlob(blob);
        return this;
    }

    public PublicCertificateImpl withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation) {
        this.innerModel().withPublicCertificateLocation(publicCertificateLocation);
        return this;
    }
}
