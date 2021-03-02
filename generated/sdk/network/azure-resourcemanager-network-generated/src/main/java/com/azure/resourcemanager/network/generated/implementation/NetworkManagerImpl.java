// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerInner;
import com.azure.resourcemanager.network.generated.models.NetworkManager;
import com.azure.resourcemanager.network.generated.models.NetworkManagerPropertiesNetworkManagerScopes;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ScopeAccesses;
import com.azure.resourcemanager.network.generated.models.SystemData;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkManagerImpl implements NetworkManager, NetworkManager.Definition, NetworkManager.Update {
    private NetworkManagerInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public NetworkManagerPropertiesNetworkManagerScopes networkManagerScopes() {
        return this.innerModel().networkManagerScopes();
    }

    public List<ScopeAccesses> networkManagerScopeAccesses() {
        List<ScopeAccesses> inner = this.innerModel().networkManagerScopeAccesses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public NetworkManagerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkManagerName;

    private TagsObject updateParameters;

    public NetworkManagerImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkManager create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkManagers()
                .createOrUpdateWithResponse(resourceGroupName, networkManagerName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public NetworkManager create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkManagers()
                .createOrUpdateWithResponse(resourceGroupName, networkManagerName, this.innerModel(), context)
                .getValue();
        return this;
    }

    NetworkManagerImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new NetworkManagerInner();
        this.serviceManager = serviceManager;
        this.networkManagerName = name;
    }

    public NetworkManagerImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkManager apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkManagers()
                .patchTagsWithResponse(resourceGroupName, networkManagerName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkManager apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkManagers()
                .patchTagsWithResponse(resourceGroupName, networkManagerName, updateParameters, context)
                .getValue();
        return this;
    }

    NetworkManagerImpl(
        NetworkManagerInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkManagerName = Utils.getValueFromIdByName(innerObject.id(), "networkManagers");
    }

    public NetworkManager refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkManagers()
                .getByResourceGroupWithResponse(resourceGroupName, networkManagerName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkManager refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkManagers()
                .getByResourceGroupWithResponse(resourceGroupName, networkManagerName, context)
                .getValue();
        return this;
    }

    public NetworkManagerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkManagerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkManagerImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkManagerImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public NetworkManagerImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public NetworkManagerImpl withNetworkManagerScopes(
        NetworkManagerPropertiesNetworkManagerScopes networkManagerScopes) {
        this.innerModel().withNetworkManagerScopes(networkManagerScopes);
        return this;
    }

    public NetworkManagerImpl withNetworkManagerScopeAccesses(List<ScopeAccesses> networkManagerScopeAccesses) {
        this.innerModel().withNetworkManagerScopeAccesses(networkManagerScopeAccesses);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
