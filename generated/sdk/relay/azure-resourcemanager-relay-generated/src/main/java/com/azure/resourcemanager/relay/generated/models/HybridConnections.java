// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.generated.fluent.models.AuthorizationRuleInner;

/** Resource collection API of HybridConnections. */
public interface HybridConnections {
    /**
     * Lists the hybrid connection within the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list hybrid connection operation.
     */
    PagedIterable<HybridConnection> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Lists the hybrid connection within the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list hybrid connection operation.
     */
    PagedIterable<HybridConnection> listByNamespace(String resourceGroupName, String namespaceName, Context context);

    /**
     * Deletes a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String hybridConnectionName);

    /**
     * Deletes a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context);

    /**
     * Returns the description for the specified hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource.
     */
    HybridConnection get(String resourceGroupName, String namespaceName, String hybridConnectionName);

    /**
     * Returns the description for the specified hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource.
     */
    Response<HybridConnection> getWithResponse(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context);

    /**
     * Authorization rules for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String hybridConnectionName);

    /**
     * Authorization rules for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String hybridConnectionName, Context context);

    /**
     * Creates or updates an authorization rule for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The authorization rule parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    AuthorizationRule createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters);

    /**
     * Creates or updates an authorization rule for a hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The authorization rule parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    Response<AuthorizationRule> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters,
        Context context);

    /**
     * Deletes a hybrid connection authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName);

    /**
     * Deletes a hybrid connection authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
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
        String hybridConnectionName,
        String authorizationRuleName,
        Context context);

    /**
     * Hybrid connection authorization rule for a hybrid connection by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName);

    /**
     * Hybrid connection authorization rule for a hybrid connection by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context);

    /**
     * Primary and secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    AccessKeys listKeys(
        String resourceGroupName, String namespaceName, String hybridConnectionName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        Context context);

    /**
     * Regenerates the primary or secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    AccessKeys regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings to the hybrid connection.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param hybridConnectionName The hybrid connection name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String hybridConnectionName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Returns the description for the specified hybrid connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource.
     */
    HybridConnection getById(String id);

    /**
     * Returns the description for the specified hybrid connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of hybrid connection resource.
     */
    Response<HybridConnection> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a hybrid connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a hybrid connection.
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
     * Begins definition for a new HybridConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new HybridConnection definition.
     */
    HybridConnection.DefinitionStages.Blank define(String name);
}
