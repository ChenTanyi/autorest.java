// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.models.BackendAddressPool;
import com.azure.resourcemanager.network.generated.models.LoadBalancerBackendAddress;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class BackendAddressPoolImpl
    implements BackendAddressPool, BackendAddressPool.Definition, BackendAddressPool.Update {
    private BackendAddressPoolInner innerObject;

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

    public List<LoadBalancerBackendAddress> loadBalancerBackendAddresses() {
        List<LoadBalancerBackendAddress> inner = this.innerModel().loadBalancerBackendAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<NetworkInterfaceIpConfiguration> backendIpConfigurations() {
        List<NetworkInterfaceIpConfigurationInner> inner = this.innerModel().backendIpConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceIpConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<SubResource> loadBalancingRules() {
        List<SubResource> inner = this.innerModel().loadBalancingRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public SubResource outboundRule() {
        return this.innerModel().outboundRule();
    }

    public List<SubResource> outboundRules() {
        List<SubResource> inner = this.innerModel().outboundRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public BackendAddressPoolInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String loadBalancerName;

    private String backendAddressPoolName;

    public BackendAddressPoolImpl withExistingLoadBalancer(String resourceGroupName, String loadBalancerName) {
        this.resourceGroupName = resourceGroupName;
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    public BackendAddressPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLoadBalancerBackendAddressPools()
                .createOrUpdate(resourceGroupName, loadBalancerName, backendAddressPoolName, innerObject, Context.NONE);
        return this;
    }

    public BackendAddressPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLoadBalancerBackendAddressPools()
                .createOrUpdate(resourceGroupName, loadBalancerName, backendAddressPoolName, innerObject, context);
        return this;
    }

    public BackendAddressPoolImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new BackendAddressPoolInner();
        this.serviceManager = serviceManager;
        this.backendAddressPoolName = name;
    }

    public BackendAddressPoolImpl update() {
        return this;
    }

    public BackendAddressPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLoadBalancerBackendAddressPools()
                .createOrUpdate(resourceGroupName, loadBalancerName, backendAddressPoolName, innerObject, Context.NONE);
        return this;
    }

    public BackendAddressPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLoadBalancerBackendAddressPools()
                .createOrUpdate(resourceGroupName, loadBalancerName, backendAddressPoolName, innerObject, context);
        return this;
    }

    public BackendAddressPoolImpl(BackendAddressPoolInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.loadBalancerName = Utils.getValueFromIdByName(innerObject.id(), "loadBalancers");
        this.backendAddressPoolName = Utils.getValueFromIdByName(innerObject.id(), "backendAddressPools");
    }

    public BackendAddressPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLoadBalancerBackendAddressPools()
                .getWithResponse(resourceGroupName, loadBalancerName, backendAddressPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public BackendAddressPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLoadBalancerBackendAddressPools()
                .getWithResponse(resourceGroupName, loadBalancerName, backendAddressPoolName, context)
                .getValue();
        return this;
    }

    public BackendAddressPoolImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public BackendAddressPoolImpl withLoadBalancerBackendAddresses(
        List<LoadBalancerBackendAddress> loadBalancerBackendAddresses) {
        this.innerModel().withLoadBalancerBackendAddresses(loadBalancerBackendAddresses);
        return this;
    }
}
