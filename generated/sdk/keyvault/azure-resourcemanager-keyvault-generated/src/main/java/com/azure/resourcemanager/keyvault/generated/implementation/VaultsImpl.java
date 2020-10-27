// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.Resource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.fluent.VaultsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.keyvault.generated.fluent.models.DeletedVaultInner;
import com.azure.resourcemanager.keyvault.generated.fluent.models.VaultAccessPolicyParametersInner;
import com.azure.resourcemanager.keyvault.generated.fluent.models.VaultInner;
import com.azure.resourcemanager.keyvault.generated.models.AccessPolicyUpdateKind;
import com.azure.resourcemanager.keyvault.generated.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.keyvault.generated.models.DeletedVault;
import com.azure.resourcemanager.keyvault.generated.models.Vault;
import com.azure.resourcemanager.keyvault.generated.models.VaultAccessPolicyParameters;
import com.azure.resourcemanager.keyvault.generated.models.VaultCheckNameAvailabilityParameters;
import com.azure.resourcemanager.keyvault.generated.models.Vaults;

public final class VaultsImpl implements Vaults {
    private final VaultsClient innerClient;

    private final KeyVaultManager serviceManager;

    public VaultsImpl(VaultsClient innerClient, KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String vaultName) {
        this.serviceClient().delete(resourceGroupName, vaultName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String vaultName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, vaultName, context);
    }

    public Vault getByResourceGroup(String resourceGroupName, String vaultName) {
        VaultInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, vaultName);
        if (inner != null) {
            return new VaultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Vault> getByResourceGroupWithResponse(String resourceGroupName, String vaultName, Context context) {
        Response<VaultInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, vaultName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VaultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VaultAccessPolicyParameters updateAccessPolicy(
        String resourceGroupName,
        String vaultName,
        AccessPolicyUpdateKind operationKind,
        VaultAccessPolicyParametersInner parameters) {
        VaultAccessPolicyParametersInner inner =
            this.serviceClient().updateAccessPolicy(resourceGroupName, vaultName, operationKind, parameters);
        if (inner != null) {
            return new VaultAccessPolicyParametersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VaultAccessPolicyParameters> updateAccessPolicyWithResponse(
        String resourceGroupName,
        String vaultName,
        AccessPolicyUpdateKind operationKind,
        VaultAccessPolicyParametersInner parameters,
        Context context) {
        Response<VaultAccessPolicyParametersInner> inner =
            this
                .serviceClient()
                .updateAccessPolicyWithResponse(resourceGroupName, vaultName, operationKind, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VaultAccessPolicyParametersImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Vault> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VaultInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public PagedIterable<Vault> listByResourceGroup(String resourceGroupName, Integer top, Context context) {
        PagedIterable<VaultInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, top, context);
        return inner.mapPage(inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public PagedIterable<Vault> listBySubscription() {
        PagedIterable<VaultInner> inner = this.serviceClient().listBySubscription();
        return inner.mapPage(inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public PagedIterable<Vault> listBySubscription(Integer top, Context context) {
        PagedIterable<VaultInner> inner = this.serviceClient().listBySubscription(top, context);
        return inner.mapPage(inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public PagedIterable<DeletedVault> listDeleted() {
        PagedIterable<DeletedVaultInner> inner = this.serviceClient().listDeleted();
        return inner.mapPage(inner1 -> new DeletedVaultImpl(inner1, this.manager()));
    }

    public PagedIterable<DeletedVault> listDeleted(Context context) {
        PagedIterable<DeletedVaultInner> inner = this.serviceClient().listDeleted(context);
        return inner.mapPage(inner1 -> new DeletedVaultImpl(inner1, this.manager()));
    }

    public DeletedVault getDeleted(String vaultName, String location) {
        DeletedVaultInner inner = this.serviceClient().getDeleted(vaultName, location);
        if (inner != null) {
            return new DeletedVaultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeletedVault> getDeletedWithResponse(String vaultName, String location, Context context) {
        Response<DeletedVaultInner> inner = this.serviceClient().getDeletedWithResponse(vaultName, location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeletedVaultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void purgeDeleted(String vaultName, String location) {
        this.serviceClient().purgeDeleted(vaultName, location);
    }

    public void purgeDeleted(String vaultName, String location, Context context) {
        this.serviceClient().purgeDeleted(vaultName, location, context);
    }

    public PagedIterable<Resource> list() {
        return this.serviceClient().list();
    }

    public PagedIterable<Resource> list(Integer top, Context context) {
        return this.serviceClient().list(top, context);
    }

    public CheckNameAvailabilityResult checkNameAvailability(VaultCheckNameAvailabilityParameters vaultName) {
        CheckNameAvailabilityResultInner inner = this.serviceClient().checkNameAvailability(vaultName);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        VaultCheckNameAvailabilityParameters vaultName, Context context) {
        Response<CheckNameAvailabilityResultInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(vaultName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VaultsClient serviceClient() {
        return this.innerClient;
    }

    private KeyVaultManager manager() {
        return this.serviceManager;
    }

    public VaultImpl define(String name) {
        return new VaultImpl(name, this.manager());
    }
}
