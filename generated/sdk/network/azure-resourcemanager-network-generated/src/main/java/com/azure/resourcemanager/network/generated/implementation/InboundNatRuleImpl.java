// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.models.InboundNatRule;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TransportProtocol;

public final class InboundNatRuleImpl implements InboundNatRule, InboundNatRule.Definition, InboundNatRule.Update {
    private InboundNatRuleInner innerObject;

    private final NetworkManager serviceManager;

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

    public NetworkInterfaceIpConfiguration backendIpConfiguration() {
        NetworkInterfaceIpConfigurationInner inner = this.innerModel().backendIpConfiguration();
        if (inner != null) {
            return new NetworkInterfaceIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TransportProtocol protocol() {
        return this.innerModel().protocol();
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

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public InboundNatRuleInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String loadBalancerName;

    private String inboundNatRuleName;

    public InboundNatRuleImpl withExistingLoadBalancer(String resourceGroupName, String loadBalancerName) {
        this.resourceGroupName = resourceGroupName;
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    public InboundNatRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInboundNatRules()
                .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, innerObject, Context.NONE);
        return this;
    }

    public InboundNatRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInboundNatRules()
                .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, innerObject, context);
        return this;
    }

    public InboundNatRuleImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new InboundNatRuleInner();
        this.serviceManager = serviceManager;
        this.inboundNatRuleName = name;
    }

    public InboundNatRuleImpl update() {
        return this;
    }

    public InboundNatRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInboundNatRules()
                .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, innerObject, Context.NONE);
        return this;
    }

    public InboundNatRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInboundNatRules()
                .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, innerObject, context);
        return this;
    }

    public InboundNatRuleImpl(InboundNatRuleInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.loadBalancerName = Utils.getValueFromIdByName(innerObject.id(), "loadBalancers");
        this.inboundNatRuleName = Utils.getValueFromIdByName(innerObject.id(), "inboundNatRules");
    }

    public InboundNatRule refresh() {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInboundNatRules()
                .getWithResponse(resourceGroupName, loadBalancerName, inboundNatRuleName, refreshExpand, Context.NONE)
                .getValue();
        return this;
    }

    public InboundNatRule refresh(Context context) {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInboundNatRules()
                .getWithResponse(resourceGroupName, loadBalancerName, inboundNatRuleName, refreshExpand, context)
                .getValue();
        return this;
    }

    public InboundNatRuleImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    public InboundNatRuleImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public InboundNatRuleImpl withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.innerModel().withFrontendIpConfiguration(frontendIpConfiguration);
        return this;
    }

    public InboundNatRuleImpl withProtocol(TransportProtocol protocol) {
        this.innerModel().withProtocol(protocol);
        return this;
    }

    public InboundNatRuleImpl withFrontendPort(Integer frontendPort) {
        this.innerModel().withFrontendPort(frontendPort);
        return this;
    }

    public InboundNatRuleImpl withBackendPort(Integer backendPort) {
        this.innerModel().withBackendPort(backendPort);
        return this;
    }

    public InboundNatRuleImpl withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.innerModel().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    public InboundNatRuleImpl withEnableFloatingIp(Boolean enableFloatingIp) {
        this.innerModel().withEnableFloatingIp(enableFloatingIp);
        return this;
    }

    public InboundNatRuleImpl withEnableTcpReset(Boolean enableTcpReset) {
        this.innerModel().withEnableTcpReset(enableTcpReset);
        return this;
    }
}
