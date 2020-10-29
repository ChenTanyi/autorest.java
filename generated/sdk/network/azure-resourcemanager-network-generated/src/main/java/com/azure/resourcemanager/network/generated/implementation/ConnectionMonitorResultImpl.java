// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorResultInner;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitor;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorDestination;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpoint;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorOutput;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorResult;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorSource;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestGroup;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorType;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ConnectionMonitorResultImpl
    implements ConnectionMonitorResult, ConnectionMonitorResult.Definition, ConnectionMonitorResult.Update {
    private ConnectionMonitorResultInner innerObject;

    private final NetworkManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public ConnectionMonitorSource source() {
        return this.innerModel().source();
    }

    public ConnectionMonitorDestination destination() {
        return this.innerModel().destination();
    }

    public Boolean autoStart() {
        return this.innerModel().autoStart();
    }

    public Integer monitoringIntervalInSeconds() {
        return this.innerModel().monitoringIntervalInSeconds();
    }

    public List<ConnectionMonitorEndpoint> endpoints() {
        List<ConnectionMonitorEndpoint> inner = this.innerModel().endpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ConnectionMonitorTestConfiguration> testConfigurations() {
        List<ConnectionMonitorTestConfiguration> inner = this.innerModel().testConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ConnectionMonitorTestGroup> testGroups() {
        List<ConnectionMonitorTestGroup> inner = this.innerModel().testGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ConnectionMonitorOutput> outputs() {
        List<ConnectionMonitorOutput> inner = this.innerModel().outputs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String notes() {
        return this.innerModel().notes();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public String monitoringStatus() {
        return this.innerModel().monitoringStatus();
    }

    public ConnectionMonitorType connectionMonitorType() {
        return this.innerModel().connectionMonitorType();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ConnectionMonitorResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkWatcherName;

    private String connectionMonitorName;

    private ConnectionMonitor createParameters;

    private TagsObject updateParameters;

    public ConnectionMonitorResultImpl withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName) {
        this.resourceGroupName = resourceGroupName;
        this.networkWatcherName = networkWatcherName;
        return this;
    }

    public ConnectionMonitorResult create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectionMonitors()
                .createOrUpdate(
                    resourceGroupName, networkWatcherName, connectionMonitorName, createParameters, Context.NONE);
        return this;
    }

    public ConnectionMonitorResult create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectionMonitors()
                .createOrUpdate(
                    resourceGroupName, networkWatcherName, connectionMonitorName, createParameters, context);
        return this;
    }

    public ConnectionMonitorResultImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new ConnectionMonitorResultInner();
        this.serviceManager = serviceManager;
        this.connectionMonitorName = name;
        this.createParameters = new ConnectionMonitor();
    }

    public ConnectionMonitorResultImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public ConnectionMonitorResult apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectionMonitors()
                .updateTagsWithResponse(
                    resourceGroupName, networkWatcherName, connectionMonitorName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ConnectionMonitorResult apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectionMonitors()
                .updateTagsWithResponse(
                    resourceGroupName, networkWatcherName, connectionMonitorName, updateParameters, context)
                .getValue();
        return this;
    }

    public ConnectionMonitorResultImpl(ConnectionMonitorResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkWatcherName = Utils.getValueFromIdByName(innerObject.id(), "networkWatchers");
        this.connectionMonitorName = Utils.getValueFromIdByName(innerObject.id(), "connectionMonitors");
    }

    public ConnectionMonitorResult refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectionMonitors()
                .getWithResponse(resourceGroupName, networkWatcherName, connectionMonitorName, Context.NONE)
                .getValue();
        return this;
    }

    public ConnectionMonitorResult refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectionMonitors()
                .getWithResponse(resourceGroupName, networkWatcherName, connectionMonitorName, context)
                .getValue();
        return this;
    }

    public ConnectionMonitorResultImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public ConnectionMonitorResultImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public ConnectionMonitorResultImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ConnectionMonitorResultImpl withSource(ConnectionMonitorSource source) {
        this.createParameters.withSource(source);
        return this;
    }

    public ConnectionMonitorResultImpl withDestination(ConnectionMonitorDestination destination) {
        this.createParameters.withDestination(destination);
        return this;
    }

    public ConnectionMonitorResultImpl withAutoStart(Boolean autoStart) {
        this.createParameters.withAutoStart(autoStart);
        return this;
    }

    public ConnectionMonitorResultImpl withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.createParameters.withMonitoringIntervalInSeconds(monitoringIntervalInSeconds);
        return this;
    }

    public ConnectionMonitorResultImpl withEndpoints(List<ConnectionMonitorEndpoint> endpoints) {
        this.createParameters.withEndpoints(endpoints);
        return this;
    }

    public ConnectionMonitorResultImpl withTestConfigurations(
        List<ConnectionMonitorTestConfiguration> testConfigurations) {
        this.createParameters.withTestConfigurations(testConfigurations);
        return this;
    }

    public ConnectionMonitorResultImpl withTestGroups(List<ConnectionMonitorTestGroup> testGroups) {
        this.createParameters.withTestGroups(testGroups);
        return this;
    }

    public ConnectionMonitorResultImpl withOutputs(List<ConnectionMonitorOutput> outputs) {
        this.createParameters.withOutputs(outputs);
        return this;
    }

    public ConnectionMonitorResultImpl withNotes(String notes) {
        this.createParameters.withNotes(notes);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
