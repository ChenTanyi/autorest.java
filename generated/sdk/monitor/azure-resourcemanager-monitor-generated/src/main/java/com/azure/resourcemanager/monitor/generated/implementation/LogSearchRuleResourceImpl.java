// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.models.LogSearchRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.Action;
import com.azure.resourcemanager.monitor.generated.models.Enabled;
import com.azure.resourcemanager.monitor.generated.models.LogSearchRuleResource;
import com.azure.resourcemanager.monitor.generated.models.LogSearchRuleResourcePatch;
import com.azure.resourcemanager.monitor.generated.models.ProvisioningState;
import com.azure.resourcemanager.monitor.generated.models.Schedule;
import com.azure.resourcemanager.monitor.generated.models.Source;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class LogSearchRuleResourceImpl
    implements LogSearchRuleResource, LogSearchRuleResource.Definition, LogSearchRuleResource.Update {
    private LogSearchRuleResourceInner innerObject;

    private final MonitorManager serviceManager;

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

    public String description() {
        return this.innerModel().description();
    }

    public Enabled enabled() {
        return this.innerModel().enabled();
    }

    public OffsetDateTime lastUpdatedTime() {
        return this.innerModel().lastUpdatedTime();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Source source() {
        return this.innerModel().source();
    }

    public Schedule schedule() {
        return this.innerModel().schedule();
    }

    public Action action() {
        return this.innerModel().action();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public LogSearchRuleResourceInner innerModel() {
        return this.innerObject;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private LogSearchRuleResourcePatch updateParameters;

    private String ruleName;

    public LogSearchRuleResourceImpl withExistingResourcegroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public LogSearchRuleResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScheduledQueryRules()
                .createOrUpdateWithResponse(resourceGroupName, ruleName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public LogSearchRuleResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScheduledQueryRules()
                .createOrUpdateWithResponse(resourceGroupName, ruleName, innerObject, context)
                .getValue();
        return this;
    }

    public LogSearchRuleResourceImpl(String name, MonitorManager serviceManager) {
        this.innerObject = new LogSearchRuleResourceInner();
        this.serviceManager = serviceManager;
        this.ruleName = name;
    }

    public LogSearchRuleResourceImpl update() {
        this.updateParameters = new LogSearchRuleResourcePatch();
        return this;
    }

    public LogSearchRuleResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScheduledQueryRules()
                .updateWithResponse(resourceGroupName, ruleName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public LogSearchRuleResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScheduledQueryRules()
                .updateWithResponse(resourceGroupName, ruleName, updateParameters, context)
                .getValue();
        return this;
    }

    public LogSearchRuleResourceImpl(LogSearchRuleResourceInner innerObject, MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.ruleName = Utils.getValueFromIdByName(innerObject.id(), "scheduledQueryRules");
    }

    public LogSearchRuleResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScheduledQueryRules()
                .getByResourceGroupWithResponse(resourceGroupName, ruleName, Context.NONE)
                .getValue();
        return this;
    }

    public LogSearchRuleResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScheduledQueryRules()
                .getByResourceGroupWithResponse(resourceGroupName, ruleName, context)
                .getValue();
        return this;
    }

    public LogSearchRuleResourceImpl withSource(Source source) {
        this.innerModel().withSource(source);
        return this;
    }

    public LogSearchRuleResourceImpl withAction(Action action) {
        this.innerModel().withAction(action);
        return this;
    }

    public LogSearchRuleResourceImpl withSchedule(Schedule schedule) {
        this.innerModel().withSchedule(schedule);
        return this;
    }

    public LogSearchRuleResourceImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public LogSearchRuleResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public LogSearchRuleResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public LogSearchRuleResourceImpl withEnabled(Enabled enabled) {
        if (isInCreateMode()) {
            this.innerModel().withEnabled(enabled);
            return this;
        } else {
            this.updateParameters.withEnabled(enabled);
            return this;
        }
    }

    public LogSearchRuleResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
