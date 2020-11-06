// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualWans. */
public interface VirtualWans {
    /**
     * Retrieves the details of a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    VirtualWan getByResourceGroup(String resourceGroupName, String virtualWanName);

    /**
     * Retrieves the details of a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    Response<VirtualWan> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualWanName, Context context);

    /**
     * Deletes a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualWanName);

    /**
     * Deletes a VirtualWAN.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWAN being deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualWanName, Context context);

    /**
     * Lists all the VirtualWANs in a resource group.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    PagedIterable<VirtualWan> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the VirtualWANs in a resource group.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    PagedIterable<VirtualWan> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the VirtualWANs in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    PagedIterable<VirtualWan> list();

    /**
     * Lists all the VirtualWANs in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualWANs.
     */
    PagedIterable<VirtualWan> list(Context context);

    /**
     * Retrieves the details of a VirtualWAN.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    VirtualWan getById(String id);

    /**
     * Retrieves the details of a VirtualWAN.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualWAN Resource.
     */
    Response<VirtualWan> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualWan resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualWan definition.
     */
    VirtualWan.DefinitionStages.Blank define(String name);
}
