// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;

/** Resource collection API of EventHubs. */
public interface EventHubs {
    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization rules for an Event Hub.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization rules for an Event Hub.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String eventHubName, Context context);

    /**
     * Creates or updates an AuthorizationRule for the specified Event Hub. Creation/update of the AuthorizationRule
     * will take a few seconds to take effect.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Single item in a List or Get AuthorizationRule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation.
     */
    AuthorizationRule createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters);

    /**
     * Creates or updates an AuthorizationRule for the specified Event Hub. Creation/update of the AuthorizationRule
     * will take a few seconds to take effect.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Single item in a List or Get AuthorizationRule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation.
     */
    Response<AuthorizationRule> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters,
        Context context);

    /**
     * Gets an AuthorizationRule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for an Event Hub by rule name.
     */
    AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets an AuthorizationRule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for an Event Hub by rule name.
     */
    Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        Context context);

    /**
     * Deletes an Event Hub AuthorizationRule.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Deletes an Event Hub AuthorizationRule.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        Context context);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ACS and SAS connection strings for the Event Hub.
     */
    AccessKeys listKeys(
        String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ACS and SAS connection strings for the Event Hub.
     */
    Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        Context context);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to the Regenerate Authorization Rule operation, specifies which key needs
     *     to be reset.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/EventHub Connection String.
     */
    AccessKeys regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to the Regenerate Authorization Rule operation, specifies which key needs
     *     to be reset.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/EventHub Connection String.
     */
    Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Gets all the Event Hubs in a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Event Hubs in a Namespace.
     */
    PagedIterable<Eventhub> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Gets all the Event Hubs in a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Event Hubs in a Namespace.
     */
    PagedIterable<Eventhub> listByNamespace(
        String resourceGroupName, String namespaceName, Integer skip, Integer top, Context context);

    /**
     * Deletes an Event Hub from the specified Namespace and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Deletes an Event Hub from the specified Namespace and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String eventHubName, Context context);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Event Hubs description for the specified Event Hub.
     */
    Eventhub get(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Event Hubs description for the specified Event Hub.
     */
    Response<Eventhub> getWithResponse(
        String resourceGroupName, String namespaceName, String eventHubName, Context context);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Event Hubs description for the specified Event Hub.
     */
    Eventhub getById(String id);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Event Hubs description for the specified Event Hub.
     */
    Response<Eventhub> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an Event Hub from the specified Namespace and resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an Event Hub from the specified Namespace and resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Eventhub resource.
     *
     * @param name resource name.
     * @return the first stage of the new Eventhub definition.
     */
    Eventhub.DefinitionStages.Blank define(String name);
}
