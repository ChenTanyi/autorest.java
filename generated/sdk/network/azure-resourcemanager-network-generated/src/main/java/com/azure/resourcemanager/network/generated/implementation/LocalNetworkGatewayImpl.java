// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.LocalNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.LocalNetworkGateway;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class LocalNetworkGatewayImpl
    implements LocalNetworkGateway, LocalNetworkGateway.Definition, LocalNetworkGateway.Update {
    private LocalNetworkGatewayInner innerObject;

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

    public AddressSpace localNetworkAddressSpace() {
        return this.innerModel().localNetworkAddressSpace();
    }

    public String gatewayIpAddress() {
        return this.innerModel().gatewayIpAddress();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public BgpSettings bgpSettings() {
        return this.innerModel().bgpSettings();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
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

    public LocalNetworkGatewayInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String localNetworkGatewayName;

    private TagsObject updateParameters;

    public LocalNetworkGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public LocalNetworkGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLocalNetworkGateways()
                .createOrUpdate(resourceGroupName, localNetworkGatewayName, innerObject, Context.NONE);
        return this;
    }

    public LocalNetworkGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLocalNetworkGateways()
                .createOrUpdate(resourceGroupName, localNetworkGatewayName, innerObject, context);
        return this;
    }

    public LocalNetworkGatewayImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new LocalNetworkGatewayInner();
        this.serviceManager = serviceManager;
        this.localNetworkGatewayName = name;
    }

    public LocalNetworkGatewayImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public LocalNetworkGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLocalNetworkGateways()
                .updateTagsWithResponse(resourceGroupName, localNetworkGatewayName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public LocalNetworkGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLocalNetworkGateways()
                .updateTagsWithResponse(resourceGroupName, localNetworkGatewayName, updateParameters, context)
                .getValue();
        return this;
    }

    public LocalNetworkGatewayImpl(LocalNetworkGatewayInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.localNetworkGatewayName = Utils.getValueFromIdByName(innerObject.id(), "localNetworkGateways");
    }

    public LocalNetworkGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLocalNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, localNetworkGatewayName, Context.NONE)
                .getValue();
        return this;
    }

    public LocalNetworkGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLocalNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, localNetworkGatewayName, context)
                .getValue();
        return this;
    }

    public LocalNetworkGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public LocalNetworkGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public LocalNetworkGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public LocalNetworkGatewayImpl withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        this.innerModel().withLocalNetworkAddressSpace(localNetworkAddressSpace);
        return this;
    }

    public LocalNetworkGatewayImpl withGatewayIpAddress(String gatewayIpAddress) {
        this.innerModel().withGatewayIpAddress(gatewayIpAddress);
        return this;
    }

    public LocalNetworkGatewayImpl withFqdn(String fqdn) {
        this.innerModel().withFqdn(fqdn);
        return this;
    }

    public LocalNetworkGatewayImpl withBgpSettings(BgpSettings bgpSettings) {
        this.innerModel().withBgpSettings(bgpSettings);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
