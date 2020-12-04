// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.ListContentKeysResponseInner;
import com.azure.resourcemanager.mediaservices.generated.models.ListContentKeysResponse;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingLocatorContentKey;
import java.util.Collections;
import java.util.List;

public final class ListContentKeysResponseImpl implements ListContentKeysResponse {
    private ListContentKeysResponseInner innerObject;

    private final MediaservicesManager serviceManager;

    ListContentKeysResponseImpl(ListContentKeysResponseInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<StreamingLocatorContentKey> contentKeys() {
        List<StreamingLocatorContentKey> inner = this.innerModel().contentKeys();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ListContentKeysResponseInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }
}
