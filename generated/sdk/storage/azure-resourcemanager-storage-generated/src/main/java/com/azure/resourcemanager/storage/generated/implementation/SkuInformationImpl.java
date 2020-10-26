// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.SkuInformationInner;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.Restriction;
import com.azure.resourcemanager.storage.generated.models.SkuCapability;
import com.azure.resourcemanager.storage.generated.models.SkuInformation;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.azure.resourcemanager.storage.generated.models.SkuTier;
import java.util.Collections;
import java.util.List;

public final class SkuInformationImpl implements SkuInformation {
    private SkuInformationInner innerObject;

    private final StorageManager serviceManager;

    public SkuInformationImpl(SkuInformationInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public SkuName name() {
        return this.innerModel().name();
    }

    public SkuTier tier() {
        return this.innerModel().tier();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public List<String> locations() {
        List<String> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<SkuCapability> capabilities() {
        List<SkuCapability> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<Restriction> restrictions() {
        List<Restriction> inner = this.innerModel().restrictions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public SkuInformationInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}