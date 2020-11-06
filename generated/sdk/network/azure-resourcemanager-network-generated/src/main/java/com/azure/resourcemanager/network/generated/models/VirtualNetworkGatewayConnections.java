// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionResetSharedKeyInner;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionSharedKeyInner;

/** Resource collection API of VirtualNetworkGatewayConnections. */
public interface VirtualNetworkGatewayConnections {
    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    VirtualNetworkGatewayConnection getByResourceGroup(
        String resourceGroupName, String virtualNetworkGatewayConnectionName);

    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    Response<VirtualNetworkGatewayConnection> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context);

    /**
     * Deletes the specified virtual network Gateway connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkGatewayConnectionName);

    /**
     * Deletes the specified virtual network Gateway connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context);

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key
     * for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param parameters Response for GetConnectionSharedKey API service call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    ConnectionSharedKey setSharedKey(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionSharedKeyInner parameters);

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key
     * for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param parameters Response for GetConnectionSharedKey API service call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    ConnectionSharedKey setSharedKey(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        ConnectionSharedKeyInner parameters,
        Context context);

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual
     * network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection shared key name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    ConnectionSharedKey getSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName);

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual
     * network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection shared key name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    Response<ConnectionSharedKey> getSharedKeyWithResponse(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context);

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections
     * created.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListVirtualNetworkGatewayConnections API service call.
     */
    PagedIterable<VirtualNetworkGatewayConnection> listByResourceGroup(String resourceGroupName);

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections
     * created.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListVirtualNetworkGatewayConnections API service call.
     */
    PagedIterable<VirtualNetworkGatewayConnection> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared
     * key for passed virtual network gateway connection in the specified resource group through Network resource
     * provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param parameters The virtual network connection reset shared key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual network connection reset shared key.
     */
    ConnectionResetSharedKey resetSharedKey(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionResetSharedKeyInner parameters);

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared
     * key for passed virtual network gateway connection in the specified resource group through Network resource
     * provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param parameters The virtual network connection reset shared key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual network connection reset shared key.
     */
    ConnectionResetSharedKey resetSharedKey(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        ConnectionResetSharedKeyInner parameters,
        Context context);

    /**
     * Starts packet capture on virtual network gateway connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param parameters Start packet capture parameters on virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStartParameters parameters);

    /**
     * Starts packet capture on virtual network gateway connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture(String resourceGroupName, String virtualNetworkGatewayConnectionName);

    /**
     * Starts packet capture on virtual network gateway connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param parameters Start packet capture parameters on virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStartParameters parameters,
        Context context);

    /**
     * Stops packet capture on virtual network gateway connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway Connection.
     * @param parameters Stop packet capture parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String stopPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStopParameters parameters);

    /**
     * Stops packet capture on virtual network gateway connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway Connection.
     * @param parameters Stop packet capture parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String stopPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnPacketCaptureStopParameters parameters,
        Context context);

    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    VirtualNetworkGatewayConnection getById(String id);

    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    Response<VirtualNetworkGatewayConnection> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualNetworkGatewayConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualNetworkGatewayConnection definition.
     */
    VirtualNetworkGatewayConnection.DefinitionStages.Blank define(String name);
}
