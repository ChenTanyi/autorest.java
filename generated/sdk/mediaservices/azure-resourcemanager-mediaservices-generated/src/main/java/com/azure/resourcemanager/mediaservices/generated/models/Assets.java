// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Assets. */
public interface Assets {
    /**
     * List Assets in the Media Services account with optional filtering and ordering.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Asset items.
     */
    PagedIterable<Asset> list(String resourceGroupName, String accountName);

    /**
     * List Assets in the Media Services account with optional filtering and ordering.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filter Restricts the set of items returned.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param orderby Specifies the key by which the result collection should be ordered.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Asset items.
     */
    PagedIterable<Asset> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context);

    /**
     * Get the details of an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account.
     */
    Asset get(String resourceGroupName, String accountName, String assetName);

    /**
     * Get the details of an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account.
     */
    Response<Asset> getWithResponse(String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Deletes an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String assetName);

    /**
     * Deletes an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Lists storage container URLs with shared access signatures (SAS) for uploading and downloading Asset content. The
     * signatures are derived from the storage account keys.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The parameters to the list SAS request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset Storage container SAS URLs.
     */
    AssetContainerSas listContainerSas(
        String resourceGroupName, String accountName, String assetName, ListContainerSasInput parameters);

    /**
     * Lists storage container URLs with shared access signatures (SAS) for uploading and downloading Asset content. The
     * signatures are derived from the storage account keys.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The parameters to the list SAS request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset Storage container SAS URLs.
     */
    Response<AssetContainerSas> listContainerSasWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        ListContainerSasInput parameters,
        Context context);

    /**
     * Gets the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     */
    StorageEncryptedAssetDecryptionData getEncryptionKey(
        String resourceGroupName, String accountName, String assetName);

    /**
     * Gets the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     */
    Response<StorageEncryptedAssetDecryptionData> getEncryptionKeyWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Lists Streaming Locators which are associated with this asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Streaming Locators associated with this Asset.
     */
    ListStreamingLocatorsResponse listStreamingLocators(String resourceGroupName, String accountName, String assetName);

    /**
     * Lists Streaming Locators which are associated with this asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Streaming Locators associated with this Asset.
     */
    Response<ListStreamingLocatorsResponse> listStreamingLocatorsWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Get the details of an Asset in the Media Services account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account.
     */
    Asset getById(String id);

    /**
     * Get the details of an Asset in the Media Services account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account.
     */
    Response<Asset> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Asset resource.
     *
     * @param name resource name.
     * @return the first stage of the new Asset definition.
     */
    Asset.DefinitionStages.Blank define(String name);
}
