// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ContentKeyPolicies. */
public interface ContentKeyPolicies {
    /**
     * Lists the Content Key Policies in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of ContentKeyPolicy items.
     */
    PagedIterable<ContentKeyPolicy> list(String resourceGroupName, String accountName);

    /**
     * Lists the Content Key Policies in the account.
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
     * @return a collection of ContentKeyPolicy items.
     */
    PagedIterable<ContentKeyPolicy> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context);

    /**
     * Get the details of a Content Key Policy in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Content Key Policy in the Media Services account.
     */
    ContentKeyPolicy get(String resourceGroupName, String accountName, String contentKeyPolicyName);

    /**
     * Get the details of a Content Key Policy in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Content Key Policy in the Media Services account.
     */
    Response<ContentKeyPolicy> getWithResponse(
        String resourceGroupName, String accountName, String contentKeyPolicyName, Context context);

    /**
     * Deletes a Content Key Policy in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String contentKeyPolicyName);

    /**
     * Deletes a Content Key Policy in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String contentKeyPolicyName, Context context);

    /**
     * Get a Content Key Policy including secret values.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Content Key Policy including secret values.
     */
    ContentKeyPolicyProperties getPolicyPropertiesWithSecrets(
        String resourceGroupName, String accountName, String contentKeyPolicyName);

    /**
     * Get a Content Key Policy including secret values.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Content Key Policy including secret values.
     */
    Response<ContentKeyPolicyProperties> getPolicyPropertiesWithSecretsWithResponse(
        String resourceGroupName, String accountName, String contentKeyPolicyName, Context context);

    /**
     * Begins definition for a new ContentKeyPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ContentKeyPolicy definition.
     */
    ContentKeyPolicy.DefinitionStages.Blank define(String name);
}
