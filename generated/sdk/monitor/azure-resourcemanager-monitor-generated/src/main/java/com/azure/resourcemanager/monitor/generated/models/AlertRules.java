// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AlertRules. */
public interface AlertRules {
    /**
     * Deletes a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ruleName);

    /**
     * Deletes a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context);

    /**
     * Gets a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a classic metric alert rule.
     */
    AlertRuleResource getByResourceGroup(String resourceGroupName, String ruleName);

    /**
     * Gets a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a classic metric alert rule.
     */
    Response<AlertRuleResource> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context);

    /**
     * List the classic metric alert rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    PagedIterable<AlertRuleResource> listByResourceGroup(String resourceGroupName);

    /**
     * List the classic metric alert rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    PagedIterable<AlertRuleResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List the classic metric alert rules within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    PagedIterable<AlertRuleResource> list();

    /**
     * List the classic metric alert rules within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    PagedIterable<AlertRuleResource> list(Context context);

    /**
     * Gets a classic metric alert rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a classic metric alert rule.
     */
    AlertRuleResource getById(String id);

    /**
     * Gets a classic metric alert rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a classic metric alert rule.
     */
    Response<AlertRuleResource> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AlertRuleResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new AlertRuleResource definition.
     */
    AlertRuleResource.DefinitionStages.Blank define(String name);
}
