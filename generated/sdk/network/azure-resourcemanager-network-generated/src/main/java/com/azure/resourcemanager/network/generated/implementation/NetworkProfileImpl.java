// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkProfileInner;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterface;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterfaceConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkProfile;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkProfileImpl implements NetworkProfile, NetworkProfile.Definition, NetworkProfile.Update {
    private NetworkProfileInner innerObject;

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

    public List<ContainerNetworkInterface> containerNetworkInterfaces() {
        List<ContainerNetworkInterface> inner = this.innerModel().containerNetworkInterfaces();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations() {
        List<ContainerNetworkInterfaceConfiguration> inner =
            this.innerModel().containerNetworkInterfaceConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public NetworkProfileInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkProfileName;

    private TagsObject updateParameters;

    public NetworkProfileImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkProfile create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkProfiles()
                .createOrUpdateWithResponse(resourceGroupName, networkProfileName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkProfile create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkProfiles()
                .createOrUpdateWithResponse(resourceGroupName, networkProfileName, innerObject, context)
                .getValue();
        return this;
    }

    public NetworkProfileImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new NetworkProfileInner();
        this.serviceManager = serviceManager;
        this.networkProfileName = name;
    }

    public NetworkProfileImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkProfile apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkProfiles()
                .updateTagsWithResponse(resourceGroupName, networkProfileName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkProfile apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkProfiles()
                .updateTagsWithResponse(resourceGroupName, networkProfileName, updateParameters, context)
                .getValue();
        return this;
    }

    public NetworkProfileImpl(NetworkProfileInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkProfileName = Utils.getValueFromIdByName(innerObject.id(), "networkProfiles");
    }

    public NetworkProfile refresh() {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkProfiles()
                .getByResourceGroupWithResponse(resourceGroupName, networkProfileName, refreshExpand, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkProfile refresh(Context context) {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkProfiles()
                .getByResourceGroupWithResponse(resourceGroupName, networkProfileName, refreshExpand, context)
                .getValue();
        return this;
    }

    public NetworkProfileImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkProfileImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkProfileImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkProfileImpl withContainerNetworkInterfaceConfigurations(
        List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations) {
        this.innerModel().withContainerNetworkInterfaceConfigurations(containerNetworkInterfaceConfigurations);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
