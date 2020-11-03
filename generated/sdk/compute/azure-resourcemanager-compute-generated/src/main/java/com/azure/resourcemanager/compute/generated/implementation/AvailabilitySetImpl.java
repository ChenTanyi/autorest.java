// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetInner;
import com.azure.resourcemanager.compute.generated.models.AvailabilitySet;
import com.azure.resourcemanager.compute.generated.models.AvailabilitySetUpdate;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.Sku;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AvailabilitySetImpl implements AvailabilitySet, AvailabilitySet.Definition, AvailabilitySet.Update {
    private AvailabilitySetInner innerObject;

    private final ComputeManager serviceManager;

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

    public Integer platformUpdateDomainCount() {
        return this.innerModel().platformUpdateDomainCount();
    }

    public Integer platformFaultDomainCount() {
        return this.innerModel().platformFaultDomainCount();
    }

    public List<SubResource> virtualMachines() {
        List<SubResource> inner = this.innerModel().virtualMachines();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public List<InstanceViewStatus> statuses() {
        List<InstanceViewStatus> inner = this.innerModel().statuses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AvailabilitySetInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String availabilitySetName;

    private AvailabilitySetUpdate updateParameters;

    public AvailabilitySetImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AvailabilitySet create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilitySets()
                .createOrUpdateWithResponse(resourceGroupName, availabilitySetName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public AvailabilitySet create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilitySets()
                .createOrUpdateWithResponse(resourceGroupName, availabilitySetName, innerObject, context)
                .getValue();
        return this;
    }

    public AvailabilitySetImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new AvailabilitySetInner();
        this.serviceManager = serviceManager;
        this.availabilitySetName = name;
    }

    public AvailabilitySetImpl update() {
        this.updateParameters = new AvailabilitySetUpdate();
        return this;
    }

    public AvailabilitySet apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilitySets()
                .updateWithResponse(resourceGroupName, availabilitySetName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public AvailabilitySet apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilitySets()
                .updateWithResponse(resourceGroupName, availabilitySetName, updateParameters, context)
                .getValue();
        return this;
    }

    public AvailabilitySetImpl(AvailabilitySetInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.availabilitySetName = Utils.getValueFromIdByName(innerObject.id(), "availabilitySets");
    }

    public AvailabilitySet refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilitySets()
                .getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, Context.NONE)
                .getValue();
        return this;
    }

    public AvailabilitySet refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilitySets()
                .getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, context)
                .getValue();
        return this;
    }

    public AvailabilitySetImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AvailabilitySetImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AvailabilitySetImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public AvailabilitySetImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public AvailabilitySetImpl withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        if (isInCreateMode()) {
            this.innerModel().withPlatformUpdateDomainCount(platformUpdateDomainCount);
            return this;
        } else {
            this.updateParameters.withPlatformUpdateDomainCount(platformUpdateDomainCount);
            return this;
        }
    }

    public AvailabilitySetImpl withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        if (isInCreateMode()) {
            this.innerModel().withPlatformFaultDomainCount(platformFaultDomainCount);
            return this;
        } else {
            this.updateParameters.withPlatformFaultDomainCount(platformFaultDomainCount);
            return this;
        }
    }

    public AvailabilitySetImpl withVirtualMachines(List<SubResource> virtualMachines) {
        if (isInCreateMode()) {
            this.innerModel().withVirtualMachines(virtualMachines);
            return this;
        } else {
            this.updateParameters.withVirtualMachines(virtualMachines);
            return this;
        }
    }

    public AvailabilitySetImpl withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        } else {
            this.updateParameters.withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
