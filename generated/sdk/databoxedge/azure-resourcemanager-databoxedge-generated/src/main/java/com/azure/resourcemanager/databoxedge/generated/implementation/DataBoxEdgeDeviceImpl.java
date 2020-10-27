// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDeviceInner;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDevice;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDevicePatch;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceType;
import com.azure.resourcemanager.databoxedge.generated.models.RoleTypes;
import com.azure.resourcemanager.databoxedge.generated.models.Sku;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DataBoxEdgeDeviceImpl
    implements DataBoxEdgeDevice, DataBoxEdgeDevice.Definition, DataBoxEdgeDevice.Update {
    private DataBoxEdgeDeviceInner innerObject;

    private final DataBoxEdgeManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus() {
        return this.innerModel().dataBoxEdgeDeviceStatus();
    }

    public String serialNumber() {
        return this.innerModel().serialNumber();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String modelDescription() {
        return this.innerModel().modelDescription();
    }

    public DeviceType deviceType() {
        return this.innerModel().deviceType();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String culture() {
        return this.innerModel().culture();
    }

    public String deviceModel() {
        return this.innerModel().deviceModel();
    }

    public String deviceSoftwareVersion() {
        return this.innerModel().deviceSoftwareVersion();
    }

    public Long deviceLocalCapacity() {
        return this.innerModel().deviceLocalCapacity();
    }

    public String timeZone() {
        return this.innerModel().timeZone();
    }

    public String deviceHcsVersion() {
        return this.innerModel().deviceHcsVersion();
    }

    public List<RoleTypes> configuredRoleTypes() {
        List<RoleTypes> inner = this.innerModel().configuredRoleTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public Integer nodeCount() {
        return this.innerModel().nodeCount();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DataBoxEdgeDeviceInner innerModel() {
        return this.innerObject;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private DataBoxEdgeDevicePatch updateParameters;

    private String deviceName;

    public DataBoxEdgeDeviceImpl withExistingResourceGroup(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public DataBoxEdgeDevice create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevices()
                .createOrUpdate(deviceName, resourceGroupName, innerObject, Context.NONE);
        return this;
    }

    public DataBoxEdgeDevice create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevices()
                .createOrUpdate(deviceName, resourceGroupName, innerObject, context);
        return this;
    }

    public DataBoxEdgeDeviceImpl(String name, DataBoxEdgeManager serviceManager) {
        this.innerObject = new DataBoxEdgeDeviceInner();
        this.serviceManager = serviceManager;
        this.resourceGroupName = name;
    }

    public DataBoxEdgeDeviceImpl update() {
        this.updateParameters = new DataBoxEdgeDevicePatch();
        return this;
    }

    public DataBoxEdgeDevice apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevices()
                .updateWithResponse(deviceName, resourceGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public DataBoxEdgeDevice apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevices()
                .updateWithResponse(deviceName, resourceGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    public DataBoxEdgeDeviceImpl(DataBoxEdgeDeviceInner innerObject, DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
    }

    public DataBoxEdgeDevice refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevices()
                .getByResourceGroupWithResponse(deviceName, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public DataBoxEdgeDevice refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevices()
                .getByResourceGroupWithResponse(deviceName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public DataBoxEdgeDeviceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DataBoxEdgeDeviceImpl withFriendlyName(String friendlyName) {
        this.innerModel().withFriendlyName(friendlyName);
        return this;
    }

    public DataBoxEdgeDeviceImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public DataBoxEdgeDeviceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DataBoxEdgeDeviceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public DataBoxEdgeDeviceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DataBoxEdgeDeviceImpl withModelDescription(String modelDescription) {
        this.innerModel().withModelDescription(modelDescription);
        return this;
    }

    public DataBoxEdgeDeviceImpl withDataBoxEdgeDeviceStatus(DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus) {
        this.innerModel().withDataBoxEdgeDeviceStatus(dataBoxEdgeDeviceStatus);
        return this;
    }

    public DataBoxEdgeDeviceImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
