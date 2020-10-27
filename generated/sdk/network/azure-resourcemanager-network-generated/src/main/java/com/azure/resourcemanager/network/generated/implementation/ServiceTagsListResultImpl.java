// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceTagsListResultInner;
import com.azure.resourcemanager.network.generated.models.ServiceTagInformation;
import com.azure.resourcemanager.network.generated.models.ServiceTagsListResult;
import java.util.Collections;
import java.util.List;

public final class ServiceTagsListResultImpl implements ServiceTagsListResult {
    private ServiceTagsListResultInner innerObject;

    private final NetworkManager serviceManager;

    public ServiceTagsListResultImpl(ServiceTagsListResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String changeNumber() {
        return this.innerModel().changeNumber();
    }

    public String cloud() {
        return this.innerModel().cloud();
    }

    public List<ServiceTagInformation> values() {
        List<ServiceTagInformation> inner = this.innerModel().values();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public ServiceTagsListResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
