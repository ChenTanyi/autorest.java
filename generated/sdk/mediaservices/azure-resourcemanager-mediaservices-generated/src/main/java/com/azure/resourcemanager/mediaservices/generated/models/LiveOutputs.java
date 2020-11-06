// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LiveOutputs. */
public interface LiveOutputs {
    /**
     * Lists the live outputs of a live event.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LiveOutput list result.
     */
    PagedIterable<LiveOutput> list(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Lists the live outputs of a live event.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LiveOutput list result.
     */
    PagedIterable<LiveOutput> list(String resourceGroupName, String accountName, String liveEventName, Context context);

    /**
     * Gets a live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live output.
     */
    LiveOutput get(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

    /**
     * Gets a live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live output.
     */
    Response<LiveOutput> getWithResponse(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, Context context);

    /**
     * Deletes a live output. Deleting a live output does not delete the asset the live output is writing to.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

    /**
     * Deletes a live output. Deleting a live output does not delete the asset the live output is writing to.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, Context context);

    /**
     * Gets a live output.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live output.
     */
    LiveOutput getById(String id);

    /**
     * Gets a live output.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live output.
     */
    Response<LiveOutput> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LiveOutput resource.
     *
     * @param name resource name.
     * @return the first stage of the new LiveOutput definition.
     */
    LiveOutput.DefinitionStages.Blank define(String name);
}
