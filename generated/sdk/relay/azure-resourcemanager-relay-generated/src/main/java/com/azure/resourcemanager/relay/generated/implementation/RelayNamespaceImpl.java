// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.generated.RelayManager;
import com.azure.resourcemanager.relay.generated.fluent.models.RelayNamespaceInner;
import com.azure.resourcemanager.relay.generated.models.ProvisioningStateEnum;
import com.azure.resourcemanager.relay.generated.models.RelayNamespace;
import com.azure.resourcemanager.relay.generated.models.RelayUpdateParameters;
import com.azure.resourcemanager.relay.generated.models.Sku;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class RelayNamespaceImpl implements RelayNamespace, RelayNamespace.Definition, RelayNamespace.Update {
    private RelayNamespaceInner innerObject;

    private final RelayManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public ProvisioningStateEnum provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public OffsetDateTime updatedAt() {
        return this.innerModel().updatedAt();
    }

    public String serviceBusEndpoint() {
        return this.innerModel().serviceBusEndpoint();
    }

    public String metricId() {
        return this.innerModel().metricId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public RelayNamespaceInner innerModel() {
        return this.innerObject;
    }

    private RelayManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private RelayUpdateParameters updateParameters;

    public RelayNamespaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public RelayNamespace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdate(resourceGroupName, namespaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public RelayNamespace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdate(resourceGroupName, namespaceName, this.innerModel(), context);
        return this;
    }

    RelayNamespaceImpl(String name, RelayManager serviceManager) {
        this.innerObject = new RelayNamespaceInner();
        this.serviceManager = serviceManager;
        this.namespaceName = name;
    }

    public RelayNamespaceImpl update() {
        this.updateParameters = new RelayUpdateParameters();
        return this;
    }

    public RelayNamespace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .updateWithResponse(resourceGroupName, namespaceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public RelayNamespace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .updateWithResponse(resourceGroupName, namespaceName, updateParameters, context)
                .getValue();
        return this;
    }

    RelayNamespaceImpl(RelayNamespaceInner innerObject, RelayManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
    }

    public RelayNamespace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getByResourceGroupWithResponse(resourceGroupName, namespaceName, Context.NONE)
                .getValue();
        return this;
    }

    public RelayNamespace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getByResourceGroupWithResponse(resourceGroupName, namespaceName, context)
                .getValue();
        return this;
    }

    public RelayNamespaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public RelayNamespaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public RelayNamespaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public RelayNamespaceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
