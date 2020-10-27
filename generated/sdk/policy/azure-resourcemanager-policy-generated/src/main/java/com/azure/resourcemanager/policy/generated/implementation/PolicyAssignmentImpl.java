// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.resourcemanager.policy.generated.PolicyManager;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyAssignmentInner;
import com.azure.resourcemanager.policy.generated.models.EnforcementMode;
import com.azure.resourcemanager.policy.generated.models.Identity;
import com.azure.resourcemanager.policy.generated.models.ParameterValuesValue;
import com.azure.resourcemanager.policy.generated.models.PolicyAssignment;
import com.azure.resourcemanager.policy.generated.models.PolicySku;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PolicyAssignmentImpl implements PolicyAssignment {
    private PolicyAssignmentInner innerObject;

    private final PolicyManager serviceManager;

    public PolicyAssignmentImpl(PolicyAssignmentInner innerObject, PolicyManager serviceManager) {
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

    public PolicySku sku() {
        return this.innerModel().sku();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String policyDefinitionId() {
        return this.innerModel().policyDefinitionId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public List<String> notScopes() {
        List<String> inner = this.innerModel().notScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public Map<String, ParameterValuesValue> parameters() {
        Map<String, ParameterValuesValue> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public String description() {
        return this.innerModel().description();
    }

    public Object metadata() {
        return this.innerModel().metadata();
    }

    public EnforcementMode enforcementMode() {
        return this.innerModel().enforcementMode();
    }

    public PolicyAssignmentInner innerModel() {
        return this.innerObject;
    }

    private PolicyManager manager() {
        return this.serviceManager;
    }
}