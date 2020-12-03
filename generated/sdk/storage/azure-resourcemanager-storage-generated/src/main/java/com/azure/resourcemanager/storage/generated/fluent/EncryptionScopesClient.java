// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.EncryptionScopeInner;

/** An instance of this class provides access to all the operations defined in EncryptionScopesClient. */
public interface EncryptionScopesClient {
    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope Encryption scope properties to be used for the create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionScopeInner put(
        String resourceGroupName, String accountName, String encryptionScopeName, EncryptionScopeInner encryptionScope);

    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope Encryption scope properties to be used for the create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EncryptionScopeInner> putWithResponse(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope,
        Context context);

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope Encryption scope properties to be used for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionScopeInner patch(
        String resourceGroupName, String accountName, String encryptionScopeName, EncryptionScopeInner encryptionScope);

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope Encryption scope properties to be used for the update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EncryptionScopeInner> patchWithResponse(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope,
        Context context);

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionScopeInner get(String resourceGroupName, String accountName, String encryptionScopeName);

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EncryptionScopeInner> getWithResponse(
        String resourceGroupName, String accountName, String encryptionScopeName, Context context);

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EncryptionScopeInner> list(String resourceGroupName, String accountName);

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EncryptionScopeInner> list(String resourceGroupName, String accountName, Context context);
}
