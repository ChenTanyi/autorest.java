// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmPublishingCredentialsPoliciesCollectionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmPublishingCredentialsPoliciesEntityInner;
import com.azure.resourcemanager.appservice.generated.models.CsmPublishingCredentialsPoliciesCollection;
import com.azure.resourcemanager.appservice.generated.models.CsmPublishingCredentialsPoliciesEntity;

public final class CsmPublishingCredentialsPoliciesCollectionImpl
    implements CsmPublishingCredentialsPoliciesCollection {
    private CsmPublishingCredentialsPoliciesCollectionInner innerObject;

    private final WebSiteManager serviceManager;

    public CsmPublishingCredentialsPoliciesCollectionImpl(
        CsmPublishingCredentialsPoliciesCollectionInner innerObject, WebSiteManager serviceManager) {
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

    public CsmPublishingCredentialsPoliciesEntity ftp() {
        CsmPublishingCredentialsPoliciesEntityInner inner = this.innerModel().ftp();
        if (inner != null) {
            return new CsmPublishingCredentialsPoliciesEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CsmPublishingCredentialsPoliciesEntity scm() {
        CsmPublishingCredentialsPoliciesEntityInner inner = this.innerModel().scm();
        if (inner != null) {
            return new CsmPublishingCredentialsPoliciesEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CsmPublishingCredentialsPoliciesCollectionInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}