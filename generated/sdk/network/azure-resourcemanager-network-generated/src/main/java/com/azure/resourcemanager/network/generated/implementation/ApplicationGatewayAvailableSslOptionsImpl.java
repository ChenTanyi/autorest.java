// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayAvailableSslOptionsInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayAvailableSslOptions;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslCipherSuite;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslPolicyName;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslProtocol;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApplicationGatewayAvailableSslOptionsImpl implements ApplicationGatewayAvailableSslOptions {
    private ApplicationGatewayAvailableSslOptionsInner innerObject;

    private final NetworkManager serviceManager;

    public ApplicationGatewayAvailableSslOptionsImpl(
        ApplicationGatewayAvailableSslOptionsInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public List<SubResource> predefinedPolicies() {
        List<SubResource> inner = this.innerModel().predefinedPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public ApplicationGatewaySslPolicyName defaultPolicy() {
        return this.innerModel().defaultPolicy();
    }

    public List<ApplicationGatewaySslCipherSuite> availableCipherSuites() {
        List<ApplicationGatewaySslCipherSuite> inner = this.innerModel().availableCipherSuites();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ApplicationGatewaySslProtocol> availableProtocols() {
        List<ApplicationGatewaySslProtocol> inner = this.innerModel().availableProtocols();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String id() {
        return this.innerModel().id();
    }

    public ApplicationGatewayAvailableSslOptionsInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}