// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.resourcemanager.authorization.generated.fluent.models.PermissionInner;
import com.azure.resourcemanager.authorization.generated.models.Permission;
import java.util.Collections;
import java.util.List;

public final class PermissionImpl implements Permission {
    private PermissionInner innerObject;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    PermissionImpl(
        PermissionInner innerObject,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> actions() {
        List<String> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> notActions() {
        List<String> inner = this.innerModel().notActions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> dataActions() {
        List<String> inner = this.innerModel().dataActions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> notDataActions() {
        List<String> inner = this.innerModel().notDataActions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PermissionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }
}
