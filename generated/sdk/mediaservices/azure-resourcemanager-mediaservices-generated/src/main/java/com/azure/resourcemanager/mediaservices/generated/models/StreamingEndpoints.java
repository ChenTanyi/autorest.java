// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of StreamingEndpoints. */
public interface StreamingEndpoints {
    /**
     * Lists the streaming endpoints in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint list result.
     */
    PagedIterable<StreamingEndpoint> list(String resourceGroupName, String accountName);

    /**
     * Lists the streaming endpoints in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint list result.
     */
    PagedIterable<StreamingEndpoint> list(String resourceGroupName, String accountName, Context context);

    /**
     * Gets a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a streaming endpoint.
     */
    StreamingEndpoint get(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Gets a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a streaming endpoint.
     */
    Response<StreamingEndpoint> getWithResponse(
        String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Deletes a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Deletes a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Starts an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Starts an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Stops an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Stops an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Scales an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters scale units definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void scale(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEntityScaleUnit parameters);

    /**
     * Scales an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters scale units definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void scale(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEntityScaleUnit parameters,
        Context context);

    /**
     * Gets a streaming endpoint.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a streaming endpoint.
     */
    StreamingEndpoint getById(String id);

    /**
     * Gets a streaming endpoint.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a streaming endpoint.
     */
    Response<StreamingEndpoint> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new StreamingEndpoint resource.
     *
     * @param name resource name.
     * @return the first stage of the new StreamingEndpoint definition.
     */
    StreamingEndpoint.DefinitionStages.Blank define(String name);
}
