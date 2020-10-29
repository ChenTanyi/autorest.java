// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ClusterInner;
import com.azure.resourcemanager.eventhubs.generated.models.Cluster;
import com.azure.resourcemanager.eventhubs.generated.models.ClusterSku;
import java.util.Collections;
import java.util.Map;

public final class ClusterImpl implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterInner innerObject;

    private final EventHubManager serviceManager;

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
            return null;
        }
    }

    public ClusterSku sku() {
        return this.innerModel().sku();
    }

    public String createdAt() {
        return this.innerModel().createdAt();
    }

    public String updatedAt() {
        return this.innerModel().updatedAt();
    }

    public String metricId() {
        return this.innerModel().metricId();
    }

    public String status() {
        return this.innerModel().status();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ClusterInner innerModel() {
        return this.innerObject;
    }

    private EventHubManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    public ClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Cluster create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(resourceGroupName, clusterName, innerObject, Context.NONE);
        return this;
    }

    public Cluster create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(resourceGroupName, clusterName, innerObject, context);
        return this;
    }

    public ClusterImpl(String name, EventHubManager serviceManager) {
        this.innerObject = new ClusterInner();
        this.serviceManager = serviceManager;
        this.clusterName = name;
    }

    public ClusterImpl update() {
        return this;
    }

    public Cluster apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .update(resourceGroupName, clusterName, innerObject, Context.NONE);
        return this;
    }

    public Cluster apply(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getClusters().update(resourceGroupName, clusterName, innerObject, context);
        return this;
    }

    public ClusterImpl(ClusterInner innerObject, EventHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
    }

    public Cluster refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE)
                .getValue();
        return this;
    }

    public Cluster refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, context)
                .getValue();
        return this;
    }

    public ClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ClusterImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ClusterImpl withSku(ClusterSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }
}
