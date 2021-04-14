// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Components. */
public interface Components {
    /**
     * Gets a list of all Application Insights components within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Application Insights components within a subscription.
     */
    PagedIterable<ApplicationInsightsComponent> list();

    /**
     * Gets a list of all Application Insights components within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Application Insights components within a subscription.
     */
    PagedIterable<ApplicationInsightsComponent> list(Context context);

    /**
     * Gets a list of Application Insights components within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Application Insights components within a resource group.
     */
    PagedIterable<ApplicationInsightsComponent> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Application Insights components within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Application Insights components within a resource group.
     */
    PagedIterable<ApplicationInsightsComponent> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Deletes an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Deletes an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Returns an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component definition.
     */
    ApplicationInsightsComponent getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Returns an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component definition.
     */
    Response<ApplicationInsightsComponent> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Purges data in an Application Insights component by a set of user-defined filters.
     *
     * <p>In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch
     * the execution of purge requests by sending a single command whose predicate includes all user identities that
     * require purging. Use the in operator to specify multiple identities. You should run the query prior to using for
     * a purge request to verify that the results are expected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param body Describes the body of a request to purge data in a single table of an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    ComponentPurgeResponse purge(String resourceGroupName, String resourceName, ComponentPurgeBody body);

    /**
     * Purges data in an Application Insights component by a set of user-defined filters.
     *
     * <p>In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch
     * the execution of purge requests by sending a single command whose predicate includes all user identities that
     * require purging. Use the in operator to specify multiple identities. You should run the query prior to using for
     * a purge request to verify that the results are expected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param body Describes the body of a request to purge data in a single table of an Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    Response<ComponentPurgeResponse> purgeWithResponse(
        String resourceGroupName, String resourceName, ComponentPurgeBody body, Context context);

    /**
     * Get status for an ongoing purge operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status for an ongoing purge operation.
     */
    ComponentPurgeStatusResponse getPurgeStatus(String resourceGroupName, String resourceName, String purgeId);

    /**
     * Get status for an ongoing purge operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status for an ongoing purge operation.
     */
    Response<ComponentPurgeStatusResponse> getPurgeStatusWithResponse(
        String resourceGroupName, String resourceName, String purgeId, Context context);

    /**
     * Returns an Application Insights component.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component definition.
     */
    ApplicationInsightsComponent getById(String id);

    /**
     * Returns an Application Insights component.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component definition.
     */
    Response<ApplicationInsightsComponent> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an Application Insights component.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an Application Insights component.
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
     * Begins definition for a new ApplicationInsightsComponent resource.
     *
     * @param name resource name.
     * @return the first stage of the new ApplicationInsightsComponent definition.
     */
    ApplicationInsightsComponent.DefinitionStages.Blank define(String name);
}
