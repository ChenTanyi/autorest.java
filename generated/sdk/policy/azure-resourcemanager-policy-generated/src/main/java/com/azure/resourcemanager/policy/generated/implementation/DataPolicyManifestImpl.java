// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.resourcemanager.policy.generated.PolicyManager;
import com.azure.resourcemanager.policy.generated.fluent.models.DataPolicyManifestInner;
import com.azure.resourcemanager.policy.generated.models.DataEffect;
import com.azure.resourcemanager.policy.generated.models.DataManifestCustomResourceFunctionDefinition;
import com.azure.resourcemanager.policy.generated.models.DataPolicyManifest;
import com.azure.resourcemanager.policy.generated.models.ResourceTypeAliases;
import java.util.Collections;
import java.util.List;

public final class DataPolicyManifestImpl implements DataPolicyManifest {
    private DataPolicyManifestInner innerObject;

    private final PolicyManager serviceManager;

    DataPolicyManifestImpl(DataPolicyManifestInner innerObject, PolicyManager serviceManager) {
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

    public List<String> namespaces() {
        List<String> inner = this.innerModel().namespaces();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String policyMode() {
        return this.innerModel().policyMode();
    }

    public Boolean isBuiltInOnly() {
        return this.innerModel().isBuiltInOnly();
    }

    public List<ResourceTypeAliases> resourceTypeAliases() {
        List<ResourceTypeAliases> inner = this.innerModel().resourceTypeAliases();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<DataEffect> effects() {
        List<DataEffect> inner = this.innerModel().effects();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> fieldValues() {
        List<String> inner = this.innerModel().fieldValues();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> standard() {
        List<String> inner = this.innerModel().standard();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<DataManifestCustomResourceFunctionDefinition> custom() {
        List<DataManifestCustomResourceFunctionDefinition> inner = this.innerModel().custom();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DataPolicyManifestInner innerModel() {
        return this.innerObject;
    }

    private PolicyManager manager() {
        return this.serviceManager;
    }
}
