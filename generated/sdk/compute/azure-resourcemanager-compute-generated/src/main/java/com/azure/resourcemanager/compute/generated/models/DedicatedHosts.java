// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DedicatedHosts. */
public interface DedicatedHosts {
    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hostGroupName, String hostname, Context context);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    DedicatedHost get(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    Response<DedicatedHost> getWithResponse(
        String resourceGroupName, String hostGroupName, String hostname, InstanceViewTypes expand, Context context);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list dedicated host operation response.
     */
    PagedIterable<DedicatedHost> listByHostGroup(String resourceGroupName, String hostGroupName);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list dedicated host operation response.
     */
    PagedIterable<DedicatedHost> listByHostGroup(String resourceGroupName, String hostGroupName, Context context);

    /**
     * Begins definition for a new DedicatedHost resource.
     *
     * @param name resource name.
     * @return the first stage of the new DedicatedHost definition.
     */
    DedicatedHost.DefinitionStages.Blank define(String name);
}
