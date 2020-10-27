// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetInner;

/** Resource collection API of Namespaces. */
public interface Namespaces {
    /**
     * Gets a list of IP Filter rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of IP Filter rules for a Namespace.
     */
    PagedIterable<IpFilterRule> listIpFilterRules(String resourceGroupName, String namespaceName);

    /**
     * Gets a list of IP Filter rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of IP Filter rules for a Namespace.
     */
    PagedIterable<IpFilterRule> listIpFilterRules(String resourceGroupName, String namespaceName, Context context);

    /**
     * Deletes an IpFilterRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param ipFilterRuleName The IP Filter Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteIpFilterRule(String resourceGroupName, String namespaceName, String ipFilterRuleName);

    /**
     * Deletes an IpFilterRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param ipFilterRuleName The IP Filter Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteIpFilterRuleWithResponse(
        String resourceGroupName, String namespaceName, String ipFilterRuleName, Context context);

    /**
     * Gets an IpFilterRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param ipFilterRuleName The IP Filter Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an IpFilterRule for a Namespace by rule name.
     */
    IpFilterRule getIpFilterRule(String resourceGroupName, String namespaceName, String ipFilterRuleName);

    /**
     * Gets an IpFilterRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param ipFilterRuleName The IP Filter Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an IpFilterRule for a Namespace by rule name.
     */
    Response<IpFilterRule> getIpFilterRuleWithResponse(
        String resourceGroupName, String namespaceName, String ipFilterRuleName, Context context);

    /**
     * Lists all the available Namespaces within a subscription, irrespective of the resource groups.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    PagedIterable<EHNamespace> list();

    /**
     * Lists all the available Namespaces within a subscription, irrespective of the resource groups.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    PagedIterable<EHNamespace> list(Context context);

    /**
     * Lists the available Namespaces within a resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the available Namespaces within a resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, Context context);

    /**
     * Gets the description of the specified namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the specified namespace.
     */
    EHNamespace getByResourceGroup(String resourceGroupName, String namespaceName);

    /**
     * Gets the description of the specified namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the specified namespace.
     */
    Response<EHNamespace> getByResourceGroupWithResponse(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Gets a list of VirtualNetwork rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of VirtualNetwork rules for a Namespace.
     */
    PagedIterable<VirtualNetworkRule> listVirtualNetworkRules(String resourceGroupName, String namespaceName);

    /**
     * Gets a list of VirtualNetwork rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of VirtualNetwork rules for a Namespace.
     */
    PagedIterable<VirtualNetworkRule> listVirtualNetworkRules(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Deletes an VirtualNetworkRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param virtualNetworkRuleName The Virtual Network Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteVirtualNetworkRule(String resourceGroupName, String namespaceName, String virtualNetworkRuleName);

    /**
     * Deletes an VirtualNetworkRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param virtualNetworkRuleName The Virtual Network Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteVirtualNetworkRuleWithResponse(
        String resourceGroupName, String namespaceName, String virtualNetworkRuleName, Context context);

    /**
     * Gets an VirtualNetworkRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param virtualNetworkRuleName The Virtual Network Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an VirtualNetworkRule for a Namespace by rule name.
     */
    VirtualNetworkRule getVirtualNetworkRule(
        String resourceGroupName, String namespaceName, String virtualNetworkRuleName);

    /**
     * Gets an VirtualNetworkRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param virtualNetworkRuleName The Virtual Network Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an VirtualNetworkRule for a Namespace by rule name.
     */
    Response<VirtualNetworkRule> getVirtualNetworkRuleWithResponse(
        String resourceGroupName, String namespaceName, String virtualNetworkRuleName, Context context);

    /**
     * Create or update NetworkRuleSet for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param parameters Description of topic resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource.
     */
    NetworkRuleSet createOrUpdateNetworkRuleSet(
        String resourceGroupName, String namespaceName, NetworkRuleSetInner parameters);

    /**
     * Create or update NetworkRuleSet for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param parameters Description of topic resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource.
     */
    Response<NetworkRuleSet> createOrUpdateNetworkRuleSetWithResponse(
        String resourceGroupName, String namespaceName, NetworkRuleSetInner parameters, Context context);

    /**
     * Gets NetworkRuleSet for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkRuleSet for a Namespace.
     */
    NetworkRuleSet getNetworkRuleSet(String resourceGroupName, String namespaceName);

    /**
     * Gets NetworkRuleSet for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkRuleSet for a Namespace.
     */
    Response<NetworkRuleSet> getNetworkRuleSetWithResponse(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Gets a list of authorization rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of authorization rules for a Namespace.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName);

    /**
     * Gets a list of authorization rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of authorization rules for a Namespace.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Deletes an AuthorizationRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Deletes an AuthorizationRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name.
     */
    AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name.
     */
    Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace.
     */
    AccessKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace.
     */
    Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Regenerates the primary or secondary connection strings for the specified Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
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
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings for the specified Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
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
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Check the give Namespace name availability.
     *
     * @param parameters Parameter supplied to check Namespace name availability operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation.
     */
    CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailabilityParameter parameters);

    /**
     * Check the give Namespace name availability.
     *
     * @param parameters Parameter supplied to check Namespace name availability operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation.
     */
    Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityParameter parameters, Context context);

    /**
     * Begins definition for a new EHNamespace resource.
     *
     * @param name resource name.
     * @return the first stage of the new EHNamespace definition.
     */
    EHNamespace.DefinitionStages.Blank defineNamespace(String name);

    /**
     * Begins definition for a new IpFilterRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new IpFilterRule definition.
     */
    IpFilterRule.DefinitionStages.Blank defineIpfilterrule(String name);

    /**
     * Begins definition for a new VirtualNetworkRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualNetworkRule definition.
     */
    VirtualNetworkRule.DefinitionStages.Blank defineVirtualnetworkrule(String name);

    /**
     * Begins definition for a new AuthorizationRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    AuthorizationRule.DefinitionStages.Blank defineAuthorizationRule(String name);
}
