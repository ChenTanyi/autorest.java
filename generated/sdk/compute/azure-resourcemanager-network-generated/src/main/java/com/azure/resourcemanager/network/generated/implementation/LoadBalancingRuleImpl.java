// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancingRuleInner;
import com.azure.resourcemanager.network.generated.models.LoadBalancingRule;
import com.azure.resourcemanager.network.generated.models.LoadDistribution;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TransportProtocol;

public final class LoadBalancingRuleImpl implements LoadBalancingRule {
    private LoadBalancingRuleInner innerObject;

    private final NetworkManager serviceManager;

    public LoadBalancingRuleImpl(LoadBalancingRuleInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SubResource frontendIpConfiguration() {
        return this.innerModel().frontendIpConfiguration();
    }

    public SubResource backendAddressPool() {
        return this.innerModel().backendAddressPool();
    }

    public SubResource probe() {
        return this.innerModel().probe();
    }

    public TransportProtocol protocol() {
        return this.innerModel().protocol();
    }

    public LoadDistribution loadDistribution() {
        return this.innerModel().loadDistribution();
    }

    public Integer frontendPort() {
        return this.innerModel().frontendPort();
    }

    public Integer backendPort() {
        return this.innerModel().backendPort();
    }

    public Integer idleTimeoutInMinutes() {
        return this.innerModel().idleTimeoutInMinutes();
    }

    public Boolean enableFloatingIp() {
        return this.innerModel().enableFloatingIp();
    }

    public Boolean enableTcpReset() {
        return this.innerModel().enableTcpReset();
    }

    public Boolean disableOutboundSnat() {
        return this.innerModel().disableOutboundSnat();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public LoadBalancingRuleInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}