// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DdosProtectionPlans. */
public interface DdosProtectionPlans {
    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ddosProtectionPlanName);

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ddosProtectionPlanName, Context context);

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan.
     */
    DdosProtectionPlan getByResourceGroup(String resourceGroupName, String ddosProtectionPlanName);

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan.
     */
    Response<DdosProtectionPlan> getByResourceGroupWithResponse(
        String resourceGroupName, String ddosProtectionPlanName, Context context);

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all DDoS protection plans in a subscription.
     */
    PagedIterable<DdosProtectionPlan> list();

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all DDoS protection plans in a subscription.
     */
    PagedIterable<DdosProtectionPlan> list(Context context);

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DDoS protection plans in a resource group.
     */
    PagedIterable<DdosProtectionPlan> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DDoS protection plans in a resource group.
     */
    PagedIterable<DdosProtectionPlan> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan.
     */
    DdosProtectionPlan getById(String id);

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan.
     */
    Response<DdosProtectionPlan> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DdosProtectionPlan resource.
     *
     * @param name resource name.
     * @return the first stage of the new DdosProtectionPlan definition.
     */
    DdosProtectionPlan.DefinitionStages.Blank define(String name);
}
