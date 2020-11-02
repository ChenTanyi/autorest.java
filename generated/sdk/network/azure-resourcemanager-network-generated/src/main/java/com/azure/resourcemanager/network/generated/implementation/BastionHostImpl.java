// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.BastionHostInner;
import com.azure.resourcemanager.network.generated.models.BastionHost;
import com.azure.resourcemanager.network.generated.models.BastionHostIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class BastionHostImpl implements BastionHost, BastionHost.Definition, BastionHost.Update {
    private BastionHostInner innerObject;

    private final NetworkManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public List<BastionHostIpConfiguration> ipConfigurations() {
        List<BastionHostIpConfiguration> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String dnsName() {
        return this.innerModel().dnsName();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public BastionHostInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String bastionHostname;

    public BastionHostImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public BastionHost create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBastionHosts()
                .createOrUpdate(resourceGroupName, bastionHostname, innerObject, Context.NONE);
        return this;
    }

    public BastionHost create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBastionHosts()
                .createOrUpdate(resourceGroupName, bastionHostname, innerObject, context);
        return this;
    }

    public BastionHostImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new BastionHostInner();
        this.serviceManager = serviceManager;
        this.bastionHostname = name;
    }

    public BastionHostImpl update() {
        return this;
    }

    public BastionHost apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBastionHosts()
                .createOrUpdate(resourceGroupName, bastionHostname, innerObject, Context.NONE);
        return this;
    }

    public BastionHost apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBastionHosts()
                .createOrUpdate(resourceGroupName, bastionHostname, innerObject, context);
        return this;
    }

    public BastionHostImpl(BastionHostInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.bastionHostname = Utils.getValueFromIdByName(innerObject.id(), "bastionHosts");
    }

    public BastionHost refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBastionHosts()
                .getByResourceGroupWithResponse(resourceGroupName, bastionHostname, Context.NONE)
                .getValue();
        return this;
    }

    public BastionHost refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBastionHosts()
                .getByResourceGroupWithResponse(resourceGroupName, bastionHostname, context)
                .getValue();
        return this;
    }

    public BastionHostImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public BastionHostImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public BastionHostImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public BastionHostImpl withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public BastionHostImpl withDnsName(String dnsName) {
        this.innerModel().withDnsName(dnsName);
        return this;
    }
}
