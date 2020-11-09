// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IpAllocations. */
public interface IpAllocations {
    /**
     * Deletes the specified IpAllocation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ipAllocationName);

    /**
     * Deletes the specified IpAllocation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ipAllocationName, Context context);

    /**
     * Gets the specified IpAllocation by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified IpAllocation by resource group.
     */
    IpAllocation getByResourceGroup(String resourceGroupName, String ipAllocationName);

    /**
     * Gets the specified IpAllocation by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified IpAllocation by resource group.
     */
    Response<IpAllocation> getByResourceGroupWithResponse(
        String resourceGroupName, String ipAllocationName, String expand, Context context);

    /**
     * Gets all IpAllocations in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a subscription.
     */
    PagedIterable<IpAllocation> list();

    /**
     * Gets all IpAllocations in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a subscription.
     */
    PagedIterable<IpAllocation> list(Context context);

    /**
     * Gets all IpAllocations in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a resource group.
     */
    PagedIterable<IpAllocation> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all IpAllocations in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a resource group.
     */
    PagedIterable<IpAllocation> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the specified IpAllocation by resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified IpAllocation by resource group.
     */
    IpAllocation getById(String id);

    /**
     * Gets the specified IpAllocation by resource group.
     *
     * @param id the resource ID.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified IpAllocation by resource group.
     */
    Response<IpAllocation> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes the specified IpAllocation.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified IpAllocation.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IpAllocation resource.
     *
     * @param name resource name.
     * @return the first stage of the new IpAllocation definition.
     */
    IpAllocation.DefinitionStages.Blank define(String name);
}
