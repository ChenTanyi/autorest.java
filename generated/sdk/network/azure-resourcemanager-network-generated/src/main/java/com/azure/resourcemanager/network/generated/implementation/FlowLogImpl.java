// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInner;
import com.azure.resourcemanager.network.generated.models.FlowLog;
import com.azure.resourcemanager.network.generated.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RetentionPolicyParameters;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.TrafficAnalyticsProperties;
import java.util.Collections;
import java.util.Map;

public final class FlowLogImpl implements FlowLog, FlowLog.Definition, FlowLog.Update {
    private FlowLogInner innerObject;

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

    public String targetResourceId() {
        return this.innerModel().targetResourceId();
    }

    public String targetResourceGuid() {
        return this.innerModel().targetResourceGuid();
    }

    public String storageId() {
        return this.innerModel().storageId();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public RetentionPolicyParameters retentionPolicy() {
        return this.innerModel().retentionPolicy();
    }

    public FlowLogFormatParameters format() {
        return this.innerModel().format();
    }

    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.innerModel().flowAnalyticsConfiguration();
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

    public FlowLogInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkWatcherName;

    private String flowLogName;

    private TagsObject updateParameters;

    public FlowLogImpl withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName) {
        this.resourceGroupName = resourceGroupName;
        this.networkWatcherName = networkWatcherName;
        return this;
    }

    public FlowLog create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFlowLogs()
                .createOrUpdate(resourceGroupName, networkWatcherName, flowLogName, innerObject, Context.NONE);
        return this;
    }

    public FlowLog create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFlowLogs()
                .createOrUpdate(resourceGroupName, networkWatcherName, flowLogName, innerObject, context);
        return this;
    }

    public FlowLogImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new FlowLogInner();
        this.serviceManager = serviceManager;
        this.flowLogName = name;
    }

    public FlowLogImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public FlowLog apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFlowLogs()
                .updateTagsWithResponse(
                    resourceGroupName, networkWatcherName, flowLogName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public FlowLog apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFlowLogs()
                .updateTagsWithResponse(resourceGroupName, networkWatcherName, flowLogName, updateParameters, context)
                .getValue();
        return this;
    }

    public FlowLogImpl(FlowLogInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkWatcherName = Utils.getValueFromIdByName(innerObject.id(), "networkWatchers");
        this.flowLogName = Utils.getValueFromIdByName(innerObject.id(), "flowLogs");
    }

    public FlowLogImpl withTargetResourceId(String targetResourceId) {
        this.innerModel().withTargetResourceId(targetResourceId);
        return this;
    }

    public FlowLogImpl withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        this.innerModel().withRetentionPolicy(retentionPolicy);
        return this;
    }

    public FlowLogImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    public FlowLogImpl withStorageId(String storageId) {
        this.innerModel().withStorageId(storageId);
        return this;
    }

    public FlowLogImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public FlowLogImpl withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration) {
        this.innerModel().withFlowAnalyticsConfiguration(flowAnalyticsConfiguration);
        return this;
    }

    public FlowLogImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FlowLogImpl withFormat(FlowLogFormatParameters format) {
        this.innerModel().withFormat(format);
        return this;
    }

    public FlowLogImpl withEnabled(Boolean enabled) {
        this.innerModel().withEnabled(enabled);
        return this;
    }

    public FlowLogImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
