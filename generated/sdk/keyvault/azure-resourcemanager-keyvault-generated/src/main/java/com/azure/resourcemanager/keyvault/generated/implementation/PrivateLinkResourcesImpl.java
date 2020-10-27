// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.keyvault.generated.models.PrivateLinkResourceListResult;
import com.azure.resourcemanager.keyvault.generated.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private final PrivateLinkResourcesClient innerClient;

    private final KeyVaultManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient, KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateLinkResourceListResult listByVault(String resourceGroupName, String vaultName) {
        PrivateLinkResourceListResultInner inner = this.serviceClient().listByVault(resourceGroupName, vaultName);
        if (inner != null) {
            return new PrivateLinkResourceListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResourceListResult> listByVaultWithResponse(
        String resourceGroupName, String vaultName, Context context) {
        Response<PrivateLinkResourceListResultInner> inner =
            this.serviceClient().listByVaultWithResponse(resourceGroupName, vaultName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private KeyVaultManager manager() {
        return this.serviceManager;
    }
}