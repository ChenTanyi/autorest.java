// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.RoleInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.ResourceInstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.RoleInstanceView;
import java.util.Collections;
import java.util.List;

public final class RoleInstanceViewImpl implements RoleInstanceView {
    private RoleInstanceViewInner innerObject;

    private final ComputeManager serviceManager;

    public RoleInstanceViewImpl(RoleInstanceViewInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Integer platformUpdateDomain() {
        return this.innerModel().platformUpdateDomain();
    }

    public Integer platformFaultDomain() {
        return this.innerModel().platformFaultDomain();
    }

    public String privateId() {
        return this.innerModel().privateId();
    }

    public List<ResourceInstanceViewStatus> statuses() {
        List<ResourceInstanceViewStatus> inner = this.innerModel().statuses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RoleInstanceViewInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}