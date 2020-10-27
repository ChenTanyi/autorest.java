// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.generated.fluent.models.PrivateEndpointConnectionInner;
import java.util.UUID;

/** Resource collection API of PrivateEndpointConnections. */
public interface PrivateEndpointConnections {
    /**
     * Updates a Private Endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param privateEndpointConnection Describes an existing Private Endpoint connection to the Azure Cognitive Search
     *     service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    PrivateEndpointConnection update(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Updates a Private Endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param privateEndpointConnection Describes an existing Private Endpoint connection to the Azure Cognitive Search
     *     service.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    Response<PrivateEndpointConnection> updateWithResponse(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        UUID clientRequestId,
        Context context);

    /**
     * Gets the details of the private endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the private endpoint connection to the search service in the given resource group.
     */
    PrivateEndpointConnection get(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Gets the details of the private endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the private endpoint connection to the search service in the given resource group.
     */
    Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        UUID clientRequestId,
        Context context);

    /**
     * Disconnects the private endpoint connection and deletes it from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    PrivateEndpointConnection delete(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Disconnects the private endpoint connection and deletes it from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    Response<PrivateEndpointConnection> deleteWithResponse(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        UUID clientRequestId,
        Context context);

    /**
     * Gets a list of all private endpoint connections in the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all private endpoint connections in the given service.
     */
    PagedIterable<PrivateEndpointConnection> listByService(String resourceGroupName, String searchServiceName);

    /**
     * Gets a list of all private endpoint connections in the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all private endpoint connections in the given service.
     */
    PagedIterable<PrivateEndpointConnection> listByService(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);
}