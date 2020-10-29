// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.resourcemanager.authorization.generated.AuthorizationManager;
import com.azure.resourcemanager.authorization.generated.fluent.models.DenyAssignmentInner;
import com.azure.resourcemanager.authorization.generated.models.DenyAssignment;
import com.azure.resourcemanager.authorization.generated.models.DenyAssignmentPermission;
import com.azure.resourcemanager.authorization.generated.models.Principal;
import java.util.Collections;
import java.util.List;

public final class DenyAssignmentImpl implements DenyAssignment {
    private DenyAssignmentInner innerObject;

    private final AuthorizationManager serviceManager;

    public DenyAssignmentImpl(DenyAssignmentInner innerObject, AuthorizationManager serviceManager) {
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

    public String denyAssignmentName() {
        return this.innerModel().denyAssignmentName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<DenyAssignmentPermission> permissions() {
        List<DenyAssignmentPermission> inner = this.innerModel().permissions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public Boolean doNotApplyToChildScopes() {
        return this.innerModel().doNotApplyToChildScopes();
    }

    public List<Principal> principals() {
        List<Principal> inner = this.innerModel().principals();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<Principal> excludePrincipals() {
        List<Principal> inner = this.innerModel().excludePrincipals();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public Boolean isSystemProtected() {
        return this.innerModel().isSystemProtected();
    }

    public DenyAssignmentInner innerModel() {
        return this.innerObject;
    }

    private AuthorizationManager manager() {
        return this.serviceManager;
    }
}
