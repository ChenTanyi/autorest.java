// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.generated.IotHubManager;
import com.azure.resourcemanager.iothub.generated.fluent.models.CertificateDescriptionInner;
import com.azure.resourcemanager.iothub.generated.models.CertificateDescription;
import com.azure.resourcemanager.iothub.generated.models.CertificateProperties;

public final class CertificateDescriptionImpl
    implements CertificateDescription, CertificateDescription.Definition, CertificateDescription.Update {
    private CertificateDescriptionInner innerObject;

    private final IotHubManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CertificateProperties properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public CertificateDescriptionInner innerModel() {
        return this.innerObject;
    }

    private IotHubManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String certificateName;

    private String createIfMatch;

    private String updateIfMatch;

    public CertificateDescriptionImpl withExistingIotHub(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public CertificateDescription create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, resourceName, certificateName, this.innerModel(), createIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public CertificateDescription create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, resourceName, certificateName, this.innerModel(), createIfMatch, context)
                .getValue();
        return this;
    }

    public CertificateDescriptionImpl(String name, IotHubManager serviceManager) {
        this.innerObject = new CertificateDescriptionInner();
        this.serviceManager = serviceManager;
        this.certificateName = name;
        this.createIfMatch = null;
    }

    public CertificateDescriptionImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public CertificateDescription apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, resourceName, certificateName, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public CertificateDescription apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, resourceName, certificateName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    public CertificateDescriptionImpl(CertificateDescriptionInner innerObject, IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "IotHubs");
        this.certificateName = Utils.getValueFromIdByName(innerObject.id(), "certificates");
    }

    public CertificateDescription refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, resourceName, certificateName, Context.NONE)
                .getValue();
        return this;
    }

    public CertificateDescription refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, resourceName, certificateName, context)
                .getValue();
        return this;
    }

    public CertificateDescriptionImpl withProperties(CertificateProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public CertificateDescriptionImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
