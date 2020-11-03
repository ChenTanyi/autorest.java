// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.resourcemanager.authorization.generated.AuthorizationManager;
import com.azure.resourcemanager.authorization.generated.fluent.models.PermissionInner;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleDefinitionInner;
import com.azure.resourcemanager.authorization.generated.models.Permission;
import com.azure.resourcemanager.authorization.generated.models.RoleDefinition;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class RoleDefinitionImpl implements RoleDefinition {
    private RoleDefinitionInner innerObject;

    private final AuthorizationManager serviceManager;

    public RoleDefinitionImpl(RoleDefinitionInner innerObject, AuthorizationManager serviceManager) {
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

    public String roleName() {
        return this.innerModel().roleName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String roleType() {
        return this.innerModel().roleType();
    }

    public List<Permission> permissions() {
        List<PermissionInner> inner = this.innerModel().permissions();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PermissionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> assignableScopes() {
        List<String> inner = this.innerModel().assignableScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RoleDefinitionInner innerModel() {
        return this.innerObject;
    }

    private AuthorizationManager manager() {
        return this.serviceManager;
    }
}
