// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.fluent.models.VaultInner;
import com.azure.resourcemanager.keyvault.generated.models.Vault;
import com.azure.resourcemanager.keyvault.generated.models.VaultCreateOrUpdateParameters;
import com.azure.resourcemanager.keyvault.generated.models.VaultPatchParameters;
import com.azure.resourcemanager.keyvault.generated.models.VaultPatchProperties;
import com.azure.resourcemanager.keyvault.generated.models.VaultProperties;
import java.util.Collections;
import java.util.Map;

public final class VaultImpl implements Vault, Vault.Definition, Vault.Update {
    private VaultInner innerObject;

    private final KeyVaultManager serviceManager;

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

    public VaultProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VaultInner innerModel() {
        return this.innerObject;
    }

    private KeyVaultManager manager() {
        return this.serviceManager;
    }

    private VaultCreateOrUpdateParameters createParameters;

    private String resourceGroupName;

    private String vaultName;

    private VaultPatchParameters updateParameters;

    public VaultImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Vault create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaults()
                .createOrUpdate(resourceGroupName, vaultName, createParameters, Context.NONE);
        return this;
    }

    public Vault create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaults()
                .createOrUpdate(resourceGroupName, vaultName, createParameters, context);
        return this;
    }

    public VaultImpl(String name, KeyVaultManager serviceManager) {
        this.innerObject = new VaultInner();
        this.serviceManager = serviceManager;
        this.vaultName = name;
        this.createParameters = new VaultCreateOrUpdateParameters();
    }

    public VaultImpl update() {
        this.updateParameters = new VaultPatchParameters();
        return this;
    }

    public Vault apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaults()
                .updateWithResponse(resourceGroupName, vaultName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Vault apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaults()
                .updateWithResponse(resourceGroupName, vaultName, updateParameters, context)
                .getValue();
        return this;
    }

    public VaultImpl(VaultInner innerObject, KeyVaultManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
    }

    public Vault refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaults()
                .getByResourceGroupWithResponse(resourceGroupName, vaultName, Context.NONE)
                .getValue();
        return this;
    }

    public Vault refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaults()
                .getByResourceGroupWithResponse(resourceGroupName, vaultName, context)
                .getValue();
        return this;
    }

    public VaultImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VaultImpl withProperties(VaultProperties properties) {
        this.createParameters.withProperties(properties);
        return this;
    }

    public VaultImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public VaultImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public VaultImpl withProperties(VaultPatchProperties properties) {
        this.updateParameters.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}