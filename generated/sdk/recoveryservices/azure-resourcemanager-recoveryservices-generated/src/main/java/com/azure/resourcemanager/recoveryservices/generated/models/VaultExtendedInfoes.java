// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner;

/** Resource collection API of VaultExtendedInfoes. */
public interface VaultExtendedInfoes {
    /**
     * Get the vault extended info.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault extended info.
     */
    VaultExtendedInfoResource get(String resourceGroupName, String vaultName);

    /**
     * Get the vault extended info.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault extended info.
     */
    Response<VaultExtendedInfoResource> getWithResponse(String resourceGroupName, String vaultName, Context context);

    /**
     * Create vault extended info.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param resourceExtendedInfoDetails Details of ResourceExtendedInfo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault extended information.
     */
    VaultExtendedInfoResource createOrUpdate(
        String resourceGroupName, String vaultName, VaultExtendedInfoResourceInner resourceExtendedInfoDetails);

    /**
     * Create vault extended info.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param resourceExtendedInfoDetails Details of ResourceExtendedInfo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault extended information.
     */
    Response<VaultExtendedInfoResource> createOrUpdateWithResponse(
        String resourceGroupName,
        String vaultName,
        VaultExtendedInfoResourceInner resourceExtendedInfoDetails,
        Context context);

    /**
     * Update vault extended info.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param resourceExtendedInfoDetails Details of ResourceExtendedInfo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault extended information.
     */
    VaultExtendedInfoResource update(
        String resourceGroupName, String vaultName, VaultExtendedInfoResourceInner resourceExtendedInfoDetails);

    /**
     * Update vault extended info.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param resourceExtendedInfoDetails Details of ResourceExtendedInfo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault extended information.
     */
    Response<VaultExtendedInfoResource> updateWithResponse(
        String resourceGroupName,
        String vaultName,
        VaultExtendedInfoResourceInner resourceExtendedInfoDetails,
        Context context);
}