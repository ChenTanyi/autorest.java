// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.ContentKeyPolicyPropertiesInner;
import com.azure.resourcemanager.mediaservices.generated.models.ContentKeyPolicyOption;
import com.azure.resourcemanager.mediaservices.generated.models.ContentKeyPolicyProperties;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ContentKeyPolicyPropertiesImpl implements ContentKeyPolicyProperties {
    private ContentKeyPolicyPropertiesInner innerObject;

    private final com.azure.resourcemanager.mediaservices.generated.MediaservicesManager serviceManager;

    ContentKeyPolicyPropertiesImpl(
        ContentKeyPolicyPropertiesInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public UUID policyId() {
        return this.innerModel().policyId();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<ContentKeyPolicyOption> options() {
        List<ContentKeyPolicyOption> inner = this.innerModel().options();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ContentKeyPolicyPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaservicesManager manager() {
        return this.serviceManager;
    }
}
