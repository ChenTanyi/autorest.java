// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricAlertResourceInner;
import com.azure.resourcemanager.monitor.generated.models.MetricAlertResourcePatch;

/** An instance of this class provides access to all the operations defined in MetricAlertsClient. */
public interface MetricAlertsClient {
    /**
     * Retrieve alert rule definitions in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricAlertResourceInner> list();

    /**
     * Retrieve alert rule definitions in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricAlertResourceInner> list(Context context);

    /**
     * Retrieve alert rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricAlertResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieve alert rule definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricAlertResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetricAlertResourceInner getByResourceGroup(String resourceGroupName, String ruleName);

    /**
     * Retrieve an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetricAlertResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context);

    /**
     * Create or update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The metric alert resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetricAlertResourceInner createOrUpdate(
        String resourceGroupName, String ruleName, MetricAlertResourceInner parameters);

    /**
     * Create or update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The metric alert resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetricAlertResourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String ruleName, MetricAlertResourceInner parameters, Context context);

    /**
     * Update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The metric alert resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetricAlertResourceInner update(String resourceGroupName, String ruleName, MetricAlertResourcePatch parameters);

    /**
     * Update an metric alert definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The metric alert resource for patch operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetricAlertResourceInner> updateWithResponse(
        String resourceGroupName, String ruleName, MetricAlertResourcePatch parameters, Context context);

    /**
     * Delete an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ruleName);

    /**
     * Delete an alert rule definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context);
}