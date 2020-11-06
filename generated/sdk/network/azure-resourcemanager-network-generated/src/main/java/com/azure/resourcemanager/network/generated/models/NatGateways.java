// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NatGateways. */
public interface NatGateways {
    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String natGatewayName);

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String natGatewayName, Context context);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    NatGateway getByResourceGroup(String resourceGroupName, String natGatewayName);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    Response<NatGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String natGatewayName, String expand, Context context);

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    PagedIterable<NatGateway> list();

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    PagedIterable<NatGateway> list(Context context);

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    PagedIterable<NatGateway> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    PagedIterable<NatGateway> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    NatGateway getById(String id);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param id the id of the resource.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    Response<NatGateway> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Begins definition for a new NatGateway resource.
     *
     * @param name resource name.
     * @return the first stage of the new NatGateway definition.
     */
    NatGateway.DefinitionStages.Blank define(String name);
}
