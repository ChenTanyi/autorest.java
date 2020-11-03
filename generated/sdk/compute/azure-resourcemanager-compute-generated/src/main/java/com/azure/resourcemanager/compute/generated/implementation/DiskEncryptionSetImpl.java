// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskEncryptionSetInner;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSet;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetUpdate;
import com.azure.resourcemanager.compute.generated.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.generated.models.KeyVaultAndKeyReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DiskEncryptionSetImpl
    implements DiskEncryptionSet, DiskEncryptionSet.Definition, DiskEncryptionSet.Update {
    private DiskEncryptionSetInner innerObject;

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

    public EncryptionSetIdentity identity() {
        return this.innerModel().identity();
    }

    public DiskEncryptionSetType encryptionType() {
        return this.innerModel().encryptionType();
    }

    public KeyVaultAndKeyReference activeKey() {
        return this.innerModel().activeKey();
    }

    public List<KeyVaultAndKeyReference> previousKeys() {
        List<KeyVaultAndKeyReference> inner = this.innerModel().previousKeys();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DiskEncryptionSetInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String diskEncryptionSetName;

    private DiskEncryptionSetUpdate updateDiskEncryptionSet;

    public DiskEncryptionSetImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DiskEncryptionSet create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiskEncryptionSets()
                .createOrUpdate(resourceGroupName, diskEncryptionSetName, innerObject, Context.NONE);
        return this;
    }

    public DiskEncryptionSet create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiskEncryptionSets()
                .createOrUpdate(resourceGroupName, diskEncryptionSetName, innerObject, context);
        return this;
    }

    public DiskEncryptionSetImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new DiskEncryptionSetInner();
        this.serviceManager = serviceManager;
        this.diskEncryptionSetName = name;
    }

    public DiskEncryptionSetImpl update() {
        this.updateDiskEncryptionSet = new DiskEncryptionSetUpdate();
        return this;
    }

    public DiskEncryptionSet apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiskEncryptionSets()
                .update(resourceGroupName, diskEncryptionSetName, updateDiskEncryptionSet, Context.NONE);
        return this;
    }

    public DiskEncryptionSet apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiskEncryptionSets()
                .update(resourceGroupName, diskEncryptionSetName, updateDiskEncryptionSet, context);
        return this;
    }

    public DiskEncryptionSetImpl(DiskEncryptionSetInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.diskEncryptionSetName = Utils.getValueFromIdByName(innerObject.id(), "diskEncryptionSets");
    }

    public DiskEncryptionSet refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiskEncryptionSets()
                .getByResourceGroupWithResponse(resourceGroupName, diskEncryptionSetName, Context.NONE)
                .getValue();
        return this;
    }

    public DiskEncryptionSet refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiskEncryptionSets()
                .getByResourceGroupWithResponse(resourceGroupName, diskEncryptionSetName, context)
                .getValue();
        return this;
    }

    public DiskEncryptionSetImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DiskEncryptionSetImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DiskEncryptionSetImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateDiskEncryptionSet.withTags(tags);
            return this;
        }
    }

    public DiskEncryptionSetImpl withIdentity(EncryptionSetIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public DiskEncryptionSetImpl withEncryptionType(DiskEncryptionSetType encryptionType) {
        if (isInCreateMode()) {
            this.innerModel().withEncryptionType(encryptionType);
            return this;
        } else {
            this.updateDiskEncryptionSet.withEncryptionType(encryptionType);
            return this;
        }
    }

    public DiskEncryptionSetImpl withActiveKey(KeyVaultAndKeyReference activeKey) {
        if (isInCreateMode()) {
            this.innerModel().withActiveKey(activeKey);
            return this;
        } else {
            this.updateDiskEncryptionSet.withActiveKey(activeKey);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
