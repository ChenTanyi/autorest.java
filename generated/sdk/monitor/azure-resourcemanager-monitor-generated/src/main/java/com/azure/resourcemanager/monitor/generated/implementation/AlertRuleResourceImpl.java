// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.models.AlertRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AlertRuleResource;
import com.azure.resourcemanager.monitor.generated.models.AlertRuleResourcePatch;
import com.azure.resourcemanager.monitor.generated.models.RuleAction;
import com.azure.resourcemanager.monitor.generated.models.RuleCondition;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AlertRuleResourceImpl
    implements AlertRuleResource, AlertRuleResource.Definition, AlertRuleResource.Update {
    private AlertRuleResourceInner innerObject;

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

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public boolean isEnabled() {
        return this.innerModel().isEnabled();
    }

    public RuleCondition condition() {
        return this.innerModel().condition();
    }

    public List<RuleAction> actions() {
        List<RuleAction> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public OffsetDateTime lastUpdatedTime() {
        return this.innerModel().lastUpdatedTime();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AlertRuleResourceInner innerModel() {
        return this.innerObject;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String ruleName;

    private AlertRuleResourcePatch updateAlertRulesResource;

    public AlertRuleResourceImpl withExistingResourcegroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AlertRuleResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAlertRules()
                .createOrUpdateWithResponse(resourceGroupName, ruleName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public AlertRuleResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAlertRules()
                .createOrUpdateWithResponse(resourceGroupName, ruleName, innerObject, context)
                .getValue();
        return this;
    }

    public AlertRuleResourceImpl(String name, MonitorManager serviceManager) {
        this.innerObject = new AlertRuleResourceInner();
        this.serviceManager = serviceManager;
        this.ruleName = name;
    }

    public AlertRuleResourceImpl update() {
        this.updateAlertRulesResource = new AlertRuleResourcePatch();
        return this;
    }

    public AlertRuleResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAlertRules()
                .updateWithResponse(resourceGroupName, ruleName, updateAlertRulesResource, Context.NONE)
                .getValue();
        return this;
    }

    public AlertRuleResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAlertRules()
                .updateWithResponse(resourceGroupName, ruleName, updateAlertRulesResource, context)
                .getValue();
        return this;
    }

    public AlertRuleResourceImpl(AlertRuleResourceInner innerObject, MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.ruleName = Utils.getValueFromIdByName(innerObject.id(), "alertrules");
    }

    public AlertRuleResourceImpl withCondition(RuleCondition condition) {
        if (isInCreateMode()) {
            this.innerModel().withCondition(condition);
            return this;
        } else {
            this.updateAlertRulesResource.withCondition(condition);
            return this;
        }
    }

    public AlertRuleResourceImpl withIsEnabled(boolean isEnabled) {
        this.innerModel().withIsEnabled(isEnabled);
        return this;
    }

    public AlertRuleResourceImpl withName(String name) {
        this.updateAlertRulesResource.withName(name);
        return this;
    }

    public AlertRuleResourceImpl withIsEnabled(Boolean isEnabled) {
        this.updateAlertRulesResource.withIsEnabled(isEnabled);
        return this;
    }

    public AlertRuleResourceImpl withActions(List<RuleAction> actions) {
        if (isInCreateMode()) {
            this.innerModel().withActions(actions);
            return this;
        } else {
            this.updateAlertRulesResource.withActions(actions);
            return this;
        }
    }

    public AlertRuleResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AlertRuleResourceImpl withNamePropertiesName(String namePropertiesName) {
        this.innerModel().withNamePropertiesName(namePropertiesName);
        return this;
    }

    public AlertRuleResourceImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateAlertRulesResource.withDescription(description);
            return this;
        }
    }

    public AlertRuleResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateAlertRulesResource.withTags(tags);
            return this;
        }
    }

    public AlertRuleResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}