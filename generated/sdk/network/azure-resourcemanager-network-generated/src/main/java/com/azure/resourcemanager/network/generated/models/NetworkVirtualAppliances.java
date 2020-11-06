// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NetworkVirtualAppliances. */
public interface NetworkVirtualAppliances {
    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkVirtualApplianceName, Context context);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    NetworkVirtualAppliance getByResourceGroup(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    Response<NetworkVirtualAppliance> getByResourceGroupWithResponse(
        String resourceGroupName, String networkVirtualApplianceName, String expand, Context context);

    /**
     * Lists all Network Virtual Appliances in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualAppliances API service call.
     */
    PagedIterable<NetworkVirtualAppliance> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Network Virtual Appliances in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualAppliances API service call.
     */
    PagedIterable<NetworkVirtualAppliance> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all Network Virtual Appliances in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Network Virtual Appliances in a subscription.
     */
    PagedIterable<NetworkVirtualAppliance> list();

    /**
     * Gets all Network Virtual Appliances in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Network Virtual Appliances in a subscription.
     */
    PagedIterable<NetworkVirtualAppliance> list(Context context);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    NetworkVirtualAppliance getById(String id);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param id the id of the resource.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    Response<NetworkVirtualAppliance> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Begins definition for a new NetworkVirtualAppliance resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkVirtualAppliance definition.
     */
    NetworkVirtualAppliance.DefinitionStages.Blank define(String name);
}
