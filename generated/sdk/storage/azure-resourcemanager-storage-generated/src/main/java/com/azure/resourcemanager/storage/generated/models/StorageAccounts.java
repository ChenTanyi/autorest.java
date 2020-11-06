// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of StorageAccounts. */
public interface StorageAccounts {
    /**
     * Checks that the storage account name is valid and is not already in use.
     *
     * @param accountName The parameters used to check the availability of the storage account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    CheckNameAvailabilityResult checkNameAvailability(StorageAccountCheckNameAvailabilityParameters accountName);

    /**
     * Checks that the storage account name is valid and is not already in use.
     *
     * @param accountName The parameters used to check the availability of the storage account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        StorageAccountCheckNameAvailabilityParameters accountName, Context context);

    /**
     * Deletes a storage account in Microsoft Azure.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName);

    /**
     * Deletes a storage account in Microsoft Azure.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    StorageAccount getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand May be used to expand the properties within account's properties. By default, data is not included
     *     when fetching properties. Currently we only support geoReplicationStats and blobRestoreStatus.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    Response<StorageAccount> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, StorageAccountExpand expand, Context context);

    /**
     * Lists all the storage accounts available under the subscription. Note that storage keys are not returned; use the
     * ListKeys operation for this.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    PagedIterable<StorageAccount> list();

    /**
     * Lists all the storage accounts available under the subscription. Note that storage keys are not returned; use the
     * ListKeys operation for this.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    PagedIterable<StorageAccount> list(Context context);

    /**
     * Lists all the storage accounts available under the given resource group. Note that storage keys are not returned;
     * use the ListKeys operation for this.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    PagedIterable<StorageAccount> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the storage accounts available under the given resource group. Note that storage keys are not returned;
     * use the ListKeys operation for this.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    PagedIterable<StorageAccount> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    StorageAccountListKeysResult listKeys(String resourceGroupName, String accountName);

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand Specifies type of the key to be listed. Possible value is kerb.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    Response<StorageAccountListKeysResult> listKeysWithResponse(
        String resourceGroupName, String accountName, ListKeyExpand expand, Context context);

    /**
     * Regenerates one of the access keys or Kerberos keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param regenerateKey The parameters used to regenerate the storage account key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    StorageAccountListKeysResult regenerateKey(
        String resourceGroupName, String accountName, StorageAccountRegenerateKeyParameters regenerateKey);

    /**
     * Regenerates one of the access keys or Kerberos keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param regenerateKey The parameters used to regenerate the storage account key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    Response<StorageAccountListKeysResult> regenerateKeyWithResponse(
        String resourceGroupName,
        String accountName,
        StorageAccountRegenerateKeyParameters regenerateKey,
        Context context);

    /**
     * List SAS credentials of a storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list SAS credentials of a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List SAS credentials operation response.
     */
    ListAccountSasResponse listAccountSas(
        String resourceGroupName, String accountName, AccountSasParameters parameters);

    /**
     * List SAS credentials of a storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list SAS credentials of a storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List SAS credentials operation response.
     */
    Response<ListAccountSasResponse> listAccountSasWithResponse(
        String resourceGroupName, String accountName, AccountSasParameters parameters, Context context);

    /**
     * List service SAS credentials of a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list service SAS credentials of a specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List service SAS credentials operation response.
     */
    ListServiceSasResponse listServiceSas(
        String resourceGroupName, String accountName, ServiceSasParameters parameters);

    /**
     * List service SAS credentials of a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list service SAS credentials of a specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List service SAS credentials operation response.
     */
    Response<ListServiceSasResponse> listServiceSasWithResponse(
        String resourceGroupName, String accountName, ServiceSasParameters parameters, Context context);

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void failover(String resourceGroupName, String accountName);

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void failover(String resourceGroupName, String accountName, Context context);

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters Blob restore parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    BlobRestoreStatus restoreBlobRanges(String resourceGroupName, String accountName, BlobRestoreParameters parameters);

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters Blob restore parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    BlobRestoreStatus restoreBlobRanges(
        String resourceGroupName, String accountName, BlobRestoreParameters parameters, Context context);

    /**
     * Revoke user delegation keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeUserDelegationKeys(String resourceGroupName, String accountName);

    /**
     * Revoke user delegation keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> revokeUserDelegationKeysWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    StorageAccount getById(String id);

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param id the id of the resource.
     * @param expand May be used to expand the properties within account's properties. By default, data is not included
     *     when fetching properties. Currently we only support geoReplicationStats and blobRestoreStatus.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    Response<StorageAccount> getByIdWithResponse(String id, StorageAccountExpand expand, Context context);

    /**
     * Begins definition for a new StorageAccount resource.
     *
     * @param name resource name.
     * @return the first stage of the new StorageAccount definition.
     */
    StorageAccount.DefinitionStages.Blank define(String name);
}
