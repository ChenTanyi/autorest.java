// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmCopySlotEntityInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigInner;
import com.azure.resourcemanager.appservice.generated.models.CsmCopySlotEntity;
import com.azure.resourcemanager.appservice.generated.models.SiteConfig;

public final class CsmCopySlotEntityImpl implements CsmCopySlotEntity {
    private CsmCopySlotEntityInner innerObject;

    private final AppServiceManager serviceManager;

    CsmCopySlotEntityImpl(CsmCopySlotEntityInner innerObject, AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String targetSlot() {
        return this.innerModel().targetSlot();
    }

    public SiteConfig siteConfig() {
        SiteConfigInner inner = this.innerModel().siteConfig();
        if (inner != null) {
            return new SiteConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CsmCopySlotEntityInner innerModel() {
        return this.innerObject;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }
}
