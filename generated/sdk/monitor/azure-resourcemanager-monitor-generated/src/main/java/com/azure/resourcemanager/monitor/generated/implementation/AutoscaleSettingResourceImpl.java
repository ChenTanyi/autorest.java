// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.models.AutoscaleSettingResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleNotification;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleProfile;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleSettingResource;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleSettingResourcePatch;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AutoscaleSettingResourceImpl
    implements AutoscaleSettingResource, AutoscaleSettingResource.Definition, AutoscaleSettingResource.Update {
    private AutoscaleSettingResourceInner innerObject;

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

    public List<AutoscaleProfile> profiles() {
        List<AutoscaleProfile> inner = this.innerModel().profiles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<AutoscaleNotification> notifications() {
        List<AutoscaleNotification> inner = this.innerModel().notifications();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String targetResourceUri() {
        return this.innerModel().targetResourceUri();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AutoscaleSettingResourceInner innerModel() {
        return this.innerObject;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String autoscaleSettingName;

    private AutoscaleSettingResourcePatch updateAutoscaleSettingResource;

    public AutoscaleSettingResourceImpl withExistingResourcegroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AutoscaleSettingResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutoscaleSettings()
                .createOrUpdateWithResponse(resourceGroupName, autoscaleSettingName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public AutoscaleSettingResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutoscaleSettings()
                .createOrUpdateWithResponse(resourceGroupName, autoscaleSettingName, innerObject, context)
                .getValue();
        return this;
    }

    public AutoscaleSettingResourceImpl(String name, MonitorManager serviceManager) {
        this.innerObject = new AutoscaleSettingResourceInner();
        this.serviceManager = serviceManager;
        this.autoscaleSettingName = name;
    }

    public AutoscaleSettingResourceImpl update() {
        this.updateAutoscaleSettingResource = new AutoscaleSettingResourcePatch();
        return this;
    }

    public AutoscaleSettingResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutoscaleSettings()
                .updateWithResponse(
                    resourceGroupName, autoscaleSettingName, updateAutoscaleSettingResource, Context.NONE)
                .getValue();
        return this;
    }

    public AutoscaleSettingResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutoscaleSettings()
                .updateWithResponse(resourceGroupName, autoscaleSettingName, updateAutoscaleSettingResource, context)
                .getValue();
        return this;
    }

    public AutoscaleSettingResourceImpl(AutoscaleSettingResourceInner innerObject, MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.autoscaleSettingName = Utils.getValueFromIdByName(innerObject.id(), "autoscalesettings");
    }

    public AutoscaleSettingResourceImpl withTargetResourceUri(String targetResourceUri) {
        if (isInCreateMode()) {
            this.innerModel().withTargetResourceUri(targetResourceUri);
            return this;
        } else {
            this.updateAutoscaleSettingResource.withTargetResourceUri(targetResourceUri);
            return this;
        }
    }

    public AutoscaleSettingResourceImpl withProfiles(List<AutoscaleProfile> profiles) {
        if (isInCreateMode()) {
            this.innerModel().withProfiles(profiles);
            return this;
        } else {
            this.updateAutoscaleSettingResource.withProfiles(profiles);
            return this;
        }
    }

    public AutoscaleSettingResourceImpl withNotifications(List<AutoscaleNotification> notifications) {
        if (isInCreateMode()) {
            this.innerModel().withNotifications(notifications);
            return this;
        } else {
            this.updateAutoscaleSettingResource.withNotifications(notifications);
            return this;
        }
    }

    public AutoscaleSettingResourceImpl withNamePropertiesName(String namePropertiesName) {
        this.innerModel().withNamePropertiesName(namePropertiesName);
        return this;
    }

    public AutoscaleSettingResourceImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.innerModel().withEnabled(enabled);
            return this;
        } else {
            this.updateAutoscaleSettingResource.withEnabled(enabled);
            return this;
        }
    }

    public AutoscaleSettingResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AutoscaleSettingResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateAutoscaleSettingResource.withTags(tags);
            return this;
        }
    }

    public AutoscaleSettingResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AutoscaleSettingResourceImpl withName(String name) {
        this.updateAutoscaleSettingResource.withName(name);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}