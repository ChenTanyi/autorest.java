// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.P2SVpnGatewayInner;
import com.azure.resourcemanager.network.generated.models.P2SConnectionConfiguration;
import com.azure.resourcemanager.network.generated.models.P2SVpnGateway;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VpnClientConnectionHealth;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class P2SVpnGatewayImpl implements P2SVpnGateway, P2SVpnGateway.Definition, P2SVpnGateway.Update {
    private P2SVpnGatewayInner innerObject;

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

    public SubResource virtualHub() {
        return this.innerModel().virtualHub();
    }

    public List<P2SConnectionConfiguration> p2SConnectionConfigurations() {
        List<P2SConnectionConfiguration> inner = this.innerModel().p2SConnectionConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Integer vpnGatewayScaleUnit() {
        return this.innerModel().vpnGatewayScaleUnit();
    }

    public SubResource vpnServerConfiguration() {
        return this.innerModel().vpnServerConfiguration();
    }

    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.innerModel().vpnClientConnectionHealth();
    }

    public List<String> customDnsServers() {
        List<String> inner = this.innerModel().customDnsServers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
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

    public P2SVpnGatewayInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String gatewayName;

    private TagsObject updateP2SVpnGatewayParameters;

    public P2SVpnGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public P2SVpnGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getP2SVpnGateways()
                .createOrUpdate(resourceGroupName, gatewayName, innerObject, Context.NONE);
        return this;
    }

    public P2SVpnGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getP2SVpnGateways()
                .createOrUpdate(resourceGroupName, gatewayName, innerObject, context);
        return this;
    }

    public P2SVpnGatewayImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new P2SVpnGatewayInner();
        this.serviceManager = serviceManager;
        this.gatewayName = name;
    }

    public P2SVpnGatewayImpl update() {
        this.updateP2SVpnGatewayParameters = new TagsObject();
        return this;
    }

    public P2SVpnGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getP2SVpnGateways()
                .updateTags(resourceGroupName, gatewayName, updateP2SVpnGatewayParameters, Context.NONE);
        return this;
    }

    public P2SVpnGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getP2SVpnGateways()
                .updateTags(resourceGroupName, gatewayName, updateP2SVpnGatewayParameters, context);
        return this;
    }

    public P2SVpnGatewayImpl(P2SVpnGatewayInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.gatewayName = Utils.getValueFromIdByName(innerObject.id(), "p2svpnGateways");
    }

    public P2SVpnGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getP2SVpnGateways()
                .getByResourceGroupWithResponse(resourceGroupName, gatewayName, Context.NONE)
                .getValue();
        return this;
    }

    public P2SVpnGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getP2SVpnGateways()
                .getByResourceGroupWithResponse(resourceGroupName, gatewayName, context)
                .getValue();
        return this;
    }

    public P2SVpnGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public P2SVpnGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public P2SVpnGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateP2SVpnGatewayParameters.withTags(tags);
            return this;
        }
    }

    public P2SVpnGatewayImpl withVirtualHub(SubResource virtualHub) {
        this.innerModel().withVirtualHub(virtualHub);
        return this;
    }

    public P2SVpnGatewayImpl withP2SConnectionConfigurations(
        List<P2SConnectionConfiguration> p2SConnectionConfigurations) {
        this.innerModel().withP2SConnectionConfigurations(p2SConnectionConfigurations);
        return this;
    }

    public P2SVpnGatewayImpl withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.innerModel().withVpnGatewayScaleUnit(vpnGatewayScaleUnit);
        return this;
    }

    public P2SVpnGatewayImpl withVpnServerConfiguration(SubResource vpnServerConfiguration) {
        this.innerModel().withVpnServerConfiguration(vpnServerConfiguration);
        return this;
    }

    public P2SVpnGatewayImpl withCustomDnsServers(List<String> customDnsServers) {
        this.innerModel().withCustomDnsServers(customDnsServers);
        return this;
    }

    public P2SVpnGatewayImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
