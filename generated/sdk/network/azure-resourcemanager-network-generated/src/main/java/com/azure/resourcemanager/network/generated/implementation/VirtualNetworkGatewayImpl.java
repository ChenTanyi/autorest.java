// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateway;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewaySku;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.network.generated.models.VpnClientConfiguration;
import com.azure.resourcemanager.network.generated.models.VpnGatewayGeneration;
import com.azure.resourcemanager.network.generated.models.VpnType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualNetworkGatewayImpl
    implements VirtualNetworkGateway, VirtualNetworkGateway.Definition, VirtualNetworkGateway.Update {
    private VirtualNetworkGatewayInner innerObject;

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
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<VirtualNetworkGatewayIpConfiguration> ipConfigurations() {
        List<VirtualNetworkGatewayIpConfiguration> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualNetworkGatewayType gatewayType() {
        return this.innerModel().gatewayType();
    }

    public VpnType vpnType() {
        return this.innerModel().vpnType();
    }

    public VpnGatewayGeneration vpnGatewayGeneration() {
        return this.innerModel().vpnGatewayGeneration();
    }

    public Boolean enableBgp() {
        return this.innerModel().enableBgp();
    }

    public Boolean enablePrivateIpAddress() {
        return this.innerModel().enablePrivateIpAddress();
    }

    public Boolean active() {
        return this.innerModel().active();
    }

    public SubResource gatewayDefaultSite() {
        return this.innerModel().gatewayDefaultSite();
    }

    public VirtualNetworkGatewaySku sku() {
        return this.innerModel().sku();
    }

    public VpnClientConfiguration vpnClientConfiguration() {
        return this.innerModel().vpnClientConfiguration();
    }

    public BgpSettings bgpSettings() {
        return this.innerModel().bgpSettings();
    }

    public AddressSpace customRoutes() {
        return this.innerModel().customRoutes();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean enableDnsForwarding() {
        return this.innerModel().enableDnsForwarding();
    }

    public String inboundDnsForwardingEndpoint() {
        return this.innerModel().inboundDnsForwardingEndpoint();
    }

    public String virtualNetworkExtendedLocationResourceId() {
        return this.innerModel().virtualNetworkExtendedLocationResourceId();
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
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

    public VirtualNetworkGatewayInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkGatewayName;

    private TagsObject updateParameters;

    public VirtualNetworkGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetworkGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, innerObject, Context.NONE);
        return this;
    }

    public VirtualNetworkGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, innerObject, context);
        return this;
    }

    public VirtualNetworkGatewayImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkGatewayInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkGatewayName = name;
    }

    public VirtualNetworkGatewayImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public VirtualNetworkGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .updateTags(resourceGroupName, virtualNetworkGatewayName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualNetworkGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .updateTags(resourceGroupName, virtualNetworkGatewayName, updateParameters, context);
        return this;
    }

    public VirtualNetworkGatewayImpl(VirtualNetworkGatewayInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkGatewayName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkGateways");
    }

    public VirtualNetworkGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualNetworkGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualNetworkGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualNetworkGatewayImpl withIpConfigurations(List<VirtualNetworkGatewayIpConfiguration> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public VirtualNetworkGatewayImpl withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.innerModel().withGatewayType(gatewayType);
        return this;
    }

    public VirtualNetworkGatewayImpl withVpnType(VpnType vpnType) {
        this.innerModel().withVpnType(vpnType);
        return this;
    }

    public VirtualNetworkGatewayImpl withVpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
        this.innerModel().withVpnGatewayGeneration(vpnGatewayGeneration);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnableBgp(Boolean enableBgp) {
        this.innerModel().withEnableBgp(enableBgp);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnablePrivateIpAddress(Boolean enablePrivateIpAddress) {
        this.innerModel().withEnablePrivateIpAddress(enablePrivateIpAddress);
        return this;
    }

    public VirtualNetworkGatewayImpl withActive(Boolean active) {
        this.innerModel().withActive(active);
        return this;
    }

    public VirtualNetworkGatewayImpl withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.innerModel().withGatewayDefaultSite(gatewayDefaultSite);
        return this;
    }

    public VirtualNetworkGatewayImpl withSku(VirtualNetworkGatewaySku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public VirtualNetworkGatewayImpl withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.innerModel().withVpnClientConfiguration(vpnClientConfiguration);
        return this;
    }

    public VirtualNetworkGatewayImpl withBgpSettings(BgpSettings bgpSettings) {
        this.innerModel().withBgpSettings(bgpSettings);
        return this;
    }

    public VirtualNetworkGatewayImpl withCustomRoutes(AddressSpace customRoutes) {
        this.innerModel().withCustomRoutes(customRoutes);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnableDnsForwarding(Boolean enableDnsForwarding) {
        this.innerModel().withEnableDnsForwarding(enableDnsForwarding);
        return this;
    }

    public VirtualNetworkGatewayImpl withVirtualNetworkExtendedLocationResourceId(
        String virtualNetworkExtendedLocationResourceId) {
        this.innerModel().withVirtualNetworkExtendedLocationResourceId(virtualNetworkExtendedLocationResourceId);
        return this;
    }

    public VirtualNetworkGatewayImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
