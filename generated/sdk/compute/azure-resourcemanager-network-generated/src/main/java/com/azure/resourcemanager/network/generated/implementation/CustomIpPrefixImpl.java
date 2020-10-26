// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixInner;
import com.azure.resourcemanager.network.generated.models.CommissionedState;
import com.azure.resourcemanager.network.generated.models.CustomIpPrefix;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CustomIpPrefixImpl implements CustomIpPrefix, CustomIpPrefix.Definition, CustomIpPrefix.Update {
    private CustomIpPrefixInner innerObject;

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

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String cidr() {
        return this.innerModel().cidr();
    }

    public CommissionedState commissionedState() {
        return this.innerModel().commissionedState();
    }

    public List<SubResource> publicIpPrefixes() {
        List<SubResource> inner = this.innerModel().publicIpPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
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

    public CustomIpPrefixInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String customIpPrefixName;

    private String resourceGroupName;

    private TagsObject updateParameters;

    public CustomIpPrefixImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CustomIpPrefix create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .createOrUpdate(resourceGroupName, customIpPrefixName, innerObject, Context.NONE);
        return this;
    }

    public CustomIpPrefix create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .createOrUpdate(resourceGroupName, customIpPrefixName, innerObject, context);
        return this;
    }

    public CustomIpPrefixImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new CustomIpPrefixInner();
        this.serviceManager = serviceManager;
        this.customIpPrefixName = name;
    }

    public CustomIpPrefixImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public CustomIpPrefix apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .updateTagsWithResponse(resourceGroupName, customIpPrefixName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public CustomIpPrefix apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .updateTagsWithResponse(resourceGroupName, customIpPrefixName, updateParameters, context)
                .getValue();
        return this;
    }

    public CustomIpPrefixImpl(CustomIpPrefixInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.customIpPrefixName = Utils.getValueFromIdByName(innerObject.id(), "customIpPrefixes");
    }

    public CustomIpPrefixImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CustomIpPrefixImpl withCidr(String cidr) {
        this.innerModel().withCidr(cidr);
        return this;
    }

    public CustomIpPrefixImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public CustomIpPrefixImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    public CustomIpPrefixImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public CustomIpPrefixImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CustomIpPrefixImpl withCommissionedState(CommissionedState commissionedState) {
        this.innerModel().withCommissionedState(commissionedState);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}