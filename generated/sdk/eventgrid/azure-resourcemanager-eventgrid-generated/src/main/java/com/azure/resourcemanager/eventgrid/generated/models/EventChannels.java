// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of EventChannels. */
public interface EventChannels {
    /**
     * Get properties of an event channel.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param eventChannelName Name of the event channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event channel.
     */
    EventChannel get(String resourceGroupName, String partnerNamespaceName, String eventChannelName);

    /**
     * Get properties of an event channel.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param eventChannelName Name of the event channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event channel.
     */
    Response<EventChannel> getWithResponse(
        String resourceGroupName, String partnerNamespaceName, String eventChannelName, Context context);

    /**
     * Delete existing event channel.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param eventChannelName Name of the event channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String partnerNamespaceName, String eventChannelName);

    /**
     * Delete existing event channel.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param eventChannelName Name of the event channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String partnerNamespaceName, String eventChannelName, Context context);

    /**
     * List all the event channels in a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Channels operation.
     */
    PagedIterable<EventChannel> listByPartnerNamespace(String resourceGroupName, String partnerNamespaceName);

    /**
     * List all the event channels in a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Channels operation.
     */
    PagedIterable<EventChannel> listByPartnerNamespace(
        String resourceGroupName, String partnerNamespaceName, String filter, Integer top, Context context);

    /**
     * Get properties of an event channel.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event channel.
     */
    EventChannel getById(String id);

    /**
     * Get properties of an event channel.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event channel.
     */
    Response<EventChannel> getByIdWithResponse(String id, Context context);

    /**
     * Delete existing event channel.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete existing event channel.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new EventChannel resource.
     *
     * @param name resource name.
     * @return the first stage of the new EventChannel definition.
     */
    EventChannel.DefinitionStages.Blank define(String name);
}
