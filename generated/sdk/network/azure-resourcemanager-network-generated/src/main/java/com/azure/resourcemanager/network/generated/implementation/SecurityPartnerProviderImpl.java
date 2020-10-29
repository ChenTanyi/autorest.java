// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityPartnerProviderInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.SecurityPartnerProvider;
import com.azure.resourcemanager.network.generated.models.SecurityPartnerProviderConnectionStatus;
import com.azure.resourcemanager.network.generated.models.SecurityProviderName;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class SecurityPartnerProviderImpl
    implements SecurityPartnerProvider, SecurityPartnerProvider.Definition, SecurityPartnerProvider.Update {
    private SecurityPartnerProviderInner innerObject;

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

    public SecurityProviderName securityProviderName() {
        return this.innerModel().securityProviderName();
    }

    public SecurityPartnerProviderConnectionStatus connectionStatus() {
        return this.innerModel().connectionStatus();
    }

    public SubResource virtualHub() {
        return this.innerModel().virtualHub();
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

    public SecurityPartnerProviderInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String securityPartnerProviderName;

    private TagsObject updateParameters;

    public SecurityPartnerProviderImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SecurityPartnerProvider create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPartnerProviders()
                .createOrUpdate(resourceGroupName, securityPartnerProviderName, innerObject, Context.NONE);
        return this;
    }

    public SecurityPartnerProvider create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPartnerProviders()
                .createOrUpdate(resourceGroupName, securityPartnerProviderName, innerObject, context);
        return this;
    }

    public SecurityPartnerProviderImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new SecurityPartnerProviderInner();
        this.serviceManager = serviceManager;
        this.securityPartnerProviderName = name;
    }

    public SecurityPartnerProviderImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public SecurityPartnerProvider apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPartnerProviders()
                .updateTagsWithResponse(resourceGroupName, securityPartnerProviderName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public SecurityPartnerProvider apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPartnerProviders()
                .updateTagsWithResponse(resourceGroupName, securityPartnerProviderName, updateParameters, context)
                .getValue();
        return this;
    }

    public SecurityPartnerProviderImpl(SecurityPartnerProviderInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.securityPartnerProviderName = Utils.getValueFromIdByName(innerObject.id(), "securityPartnerProviders");
    }

    public SecurityPartnerProvider refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPartnerProviders()
                .getByResourceGroupWithResponse(resourceGroupName, securityPartnerProviderName, Context.NONE)
                .getValue();
        return this;
    }

    public SecurityPartnerProvider refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPartnerProviders()
                .getByResourceGroupWithResponse(resourceGroupName, securityPartnerProviderName, context)
                .getValue();
        return this;
    }

    public SecurityPartnerProviderImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SecurityPartnerProviderImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SecurityPartnerProviderImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SecurityPartnerProviderImpl withSecurityProviderName(SecurityProviderName securityProviderName) {
        this.innerModel().withSecurityProviderName(securityProviderName);
        return this;
    }

    public SecurityPartnerProviderImpl withVirtualHub(SubResource virtualHub) {
        this.innerModel().withVirtualHub(virtualHub);
        return this;
    }

    public SecurityPartnerProviderImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
