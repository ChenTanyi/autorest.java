// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.WebApplicationFirewallPolicyInner;

/** An instance of this class provides access to all the operations defined in PoliciesClient. */
public interface PoliciesClient {
    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner getByResourceGroup(String resourceGroupName, String policyName);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebApplicationFirewallPolicyInner> getByResourceGroupWithResponse(
        String resourceGroupName, String policyName, Context context);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Defines web application firewall policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WebApplicationFirewallPolicyInner>, WebApplicationFirewallPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Defines web application firewall policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WebApplicationFirewallPolicyInner>, WebApplicationFirewallPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters, Context context);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Defines web application firewall policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner createOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Defines web application firewall policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner createOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters, Context context);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String policyName, Context context);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName, Context context);
}
