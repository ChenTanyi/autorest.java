// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Topics. */
public interface Topics {
    /**
     * Get properties of a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a topic.
     */
    Topic getByResourceGroup(String resourceGroupName, String topicName);

    /**
     * Get properties of a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a topic.
     */
    Response<Topic> getByResourceGroupWithResponse(String resourceGroupName, String topicName, Context context);

    /**
     * Delete existing topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String topicName);

    /**
     * Delete existing topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String topicName, Context context);

    /**
     * List all the topics under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Topics operation.
     */
    PagedIterable<Topic> list();

    /**
     * List all the topics under an Azure subscription.
     *
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
     * @return result of the List Topics operation.
     */
    PagedIterable<Topic> list(String filter, Integer top, Context context);

    /**
     * List all the topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Topics operation.
     */
    PagedIterable<Topic> listByResourceGroup(String resourceGroupName);

    /**
     * List all the topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
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
     * @return result of the List Topics operation.
     */
    PagedIterable<Topic> listByResourceGroup(String resourceGroupName, String filter, Integer top, Context context);

    /**
     * List the two keys used to publish to a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys listSharedAccessKeys(String resourceGroupName, String topicName);

    /**
     * List the two keys used to publish to a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    Response<TopicSharedAccessKeys> listSharedAccessKeysWithResponse(
        String resourceGroupName, String topicName, Context context);

    /**
     * Regenerate a shared access key for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(
        String resourceGroupName, String topicName, TopicRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate a shared access key for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(
        String resourceGroupName, String topicName, TopicRegenerateKeyRequest regenerateKeyRequest, Context context);

    /**
     * List event types for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param providerNamespace Namespace of the provider of the topic.
     * @param resourceTypeName Name of the topic type.
     * @param resourceName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Types operation.
     */
    PagedIterable<EventType> listEventTypes(
        String resourceGroupName, String providerNamespace, String resourceTypeName, String resourceName);

    /**
     * List event types for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param providerNamespace Namespace of the provider of the topic.
     * @param resourceTypeName Name of the topic type.
     * @param resourceName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Types operation.
     */
    PagedIterable<EventType> listEventTypes(
        String resourceGroupName,
        String providerNamespace,
        String resourceTypeName,
        String resourceName,
        Context context);

    /**
     * Get properties of a topic.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a topic.
     */
    Topic getById(String id);

    /**
     * Get properties of a topic.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a topic.
     */
    Response<Topic> getByIdWithResponse(String id, Context context);

    /**
     * Delete existing topic.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete existing topic.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Topic resource.
     *
     * @param name resource name.
     * @return the first stage of the new Topic definition.
     */
    Topic.DefinitionStages.Blank define(String name);
}
