// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresql.generated.fluent.models.FirewallRuleInner;

/** An instance of this class provides access to all the operations defined in FirewallRulesClient. */
public interface FirewallRulesClient {
    /**
     * Creates a new firewall rule or updates an existing firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<FirewallRuleInner>, FirewallRuleInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters);

    /**
     * Creates a new firewall rule or updates an existing firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<FirewallRuleInner>, FirewallRuleInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        String firewallRuleName,
        FirewallRuleInner parameters,
        Context context);

    /**
     * Creates a new firewall rule or updates an existing firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner createOrUpdate(
        String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters);

    /**
     * Creates a new firewall rule or updates an existing firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String firewallRuleName,
        FirewallRuleInner parameters,
        Context context);

    /**
     * Deletes a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Deletes a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serverName, String firewallRuleName, Context context);

    /**
     * Deletes a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Deletes a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String firewallRuleName, Context context);

    /**
     * Gets information about a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner get(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Gets information about a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallRuleInner> getWithResponse(
        String resourceGroupName, String serverName, String firewallRuleName, Context context);

    /**
     * List all the firewall rules in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of firewall rules.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallRuleInner> listByServer(String resourceGroupName, String serverName);

    /**
     * List all the firewall rules in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of firewall rules.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallRuleInner> listByServer(String resourceGroupName, String serverName, Context context);
}
