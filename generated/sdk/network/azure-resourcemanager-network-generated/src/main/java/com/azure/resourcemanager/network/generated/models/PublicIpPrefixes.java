// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PublicIpPrefixes. */
public interface PublicIpPrefixes {
    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String publicIpPrefixName);

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String publicIpPrefixName, Context context);

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    PublicIpPrefix getByResourceGroup(String resourceGroupName, String publicIpPrefixName);

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    Response<PublicIpPrefix> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpPrefixName, String expand, Context context);

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    PagedIterable<PublicIpPrefix> list();

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    PagedIterable<PublicIpPrefix> list(Context context);

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    PagedIterable<PublicIpPrefix> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    PagedIterable<PublicIpPrefix> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Begins definition for a new PublicIpPrefix resource.
     *
     * @param name resource name.
     * @return the first stage of the new PublicIpPrefix definition.
     */
    PublicIpPrefix.DefinitionStages.Blank define(String name);
}
