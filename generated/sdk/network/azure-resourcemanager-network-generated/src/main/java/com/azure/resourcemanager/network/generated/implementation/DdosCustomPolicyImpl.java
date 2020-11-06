// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.DdosCustomPolicyInner;
import com.azure.resourcemanager.network.generated.models.DdosCustomPolicy;
import com.azure.resourcemanager.network.generated.models.ProtocolCustomSettingsFormat;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DdosCustomPolicyImpl
    implements DdosCustomPolicy, DdosCustomPolicy.Definition, DdosCustomPolicy.Update {
    private DdosCustomPolicyInner innerObject;

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

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<SubResource> publicIpAddresses() {
        List<SubResource> inner = this.innerModel().publicIpAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ProtocolCustomSettingsFormat> protocolCustomSettings() {
        List<ProtocolCustomSettingsFormat> inner = this.innerModel().protocolCustomSettings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
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

    public DdosCustomPolicyInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String ddosCustomPolicyName;

    private TagsObject updateParameters;

    public DdosCustomPolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DdosCustomPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDdosCustomPolicies()
                .createOrUpdate(resourceGroupName, ddosCustomPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public DdosCustomPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDdosCustomPolicies()
                .createOrUpdate(resourceGroupName, ddosCustomPolicyName, this.innerModel(), context);
        return this;
    }

    public DdosCustomPolicyImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new DdosCustomPolicyInner();
        this.serviceManager = serviceManager;
        this.ddosCustomPolicyName = name;
    }

    public DdosCustomPolicyImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public DdosCustomPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDdosCustomPolicies()
                .updateTagsWithResponse(resourceGroupName, ddosCustomPolicyName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public DdosCustomPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDdosCustomPolicies()
                .updateTagsWithResponse(resourceGroupName, ddosCustomPolicyName, updateParameters, context)
                .getValue();
        return this;
    }

    public DdosCustomPolicyImpl(DdosCustomPolicyInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.ddosCustomPolicyName = Utils.getValueFromIdByName(innerObject.id(), "ddosCustomPolicies");
    }

    public DdosCustomPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDdosCustomPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, ddosCustomPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public DdosCustomPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDdosCustomPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, ddosCustomPolicyName, context)
                .getValue();
        return this;
    }

    public DdosCustomPolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DdosCustomPolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DdosCustomPolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DdosCustomPolicyImpl withProtocolCustomSettings(List<ProtocolCustomSettingsFormat> protocolCustomSettings) {
        this.innerModel().withProtocolCustomSettings(protocolCustomSettings);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
