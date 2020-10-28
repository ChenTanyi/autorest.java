// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner;
import com.azure.resourcemanager.network.generated.models.NetworkWatcher;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class NetworkWatcherImpl implements NetworkWatcher, NetworkWatcher.Definition, NetworkWatcher.Update {
    private NetworkWatcherInner innerObject;

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

    public NetworkWatcherInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkWatcherName;

    private TagsObject updateParameters;

    public NetworkWatcherImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkWatcher create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkWatchers()
                .createOrUpdateWithResponse(resourceGroupName, networkWatcherName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkWatcher create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkWatchers()
                .createOrUpdateWithResponse(resourceGroupName, networkWatcherName, innerObject, context)
                .getValue();
        return this;
    }

    public NetworkWatcherImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new NetworkWatcherInner();
        this.serviceManager = serviceManager;
        this.networkWatcherName = name;
    }

    public NetworkWatcherImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkWatcher apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkWatchers()
                .updateTagsWithResponse(resourceGroupName, networkWatcherName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkWatcher apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkWatchers()
                .updateTagsWithResponse(resourceGroupName, networkWatcherName, updateParameters, context)
                .getValue();
        return this;
    }

    public NetworkWatcherImpl(NetworkWatcherInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkWatcherName = Utils.getValueFromIdByName(innerObject.id(), "networkWatchers");
    }

    public NetworkWatcher refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkWatchers()
                .getByResourceGroupWithResponse(resourceGroupName, networkWatcherName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkWatcher refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkWatchers()
                .getByResourceGroupWithResponse(resourceGroupName, networkWatcherName, context)
                .getValue();
        return this;
    }

    public NetworkWatcherImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkWatcherImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkWatcherImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkWatcherImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
