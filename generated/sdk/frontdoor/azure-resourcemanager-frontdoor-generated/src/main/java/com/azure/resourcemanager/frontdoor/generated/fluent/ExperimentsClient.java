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
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ExperimentInner;
import com.azure.resourcemanager.frontdoor.generated.models.ExperimentUpdateModel;

/** An instance of this class provides access to all the operations defined in ExperimentsClient. */
public interface ExperimentsClient {
    /**
     * Gets a list of Experiments.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentInner> listByProfile(String resourceGroupName, String profileName);

    /**
     * Gets a list of Experiments.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentInner> listByProfile(String resourceGroupName, String profileName, Context context);

    /**
     * Gets an Experiment by ExperimentName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Experiment by ExperimentName.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner get(String resourceGroupName, String profileName, String experimentName);

    /**
     * Gets an Experiment by ExperimentName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Experiment by ExperimentName.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentInner> getWithResponse(
        String resourceGroupName, String profileName, String experimentName, Context context);

    /**
     * Creates or updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExperimentInner>, ExperimentInner> beginCreateOrUpdate(
        String resourceGroupName, String profileName, String experimentName, ExperimentInner parameters);

    /**
     * Creates or updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExperimentInner>, ExperimentInner> beginCreateOrUpdate(
        String resourceGroupName,
        String profileName,
        String experimentName,
        ExperimentInner parameters,
        Context context);

    /**
     * Creates or updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner createOrUpdate(
        String resourceGroupName, String profileName, String experimentName, ExperimentInner parameters);

    /**
     * Creates or updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner createOrUpdate(
        String resourceGroupName,
        String profileName,
        String experimentName,
        ExperimentInner parameters,
        Context context);

    /**
     * Updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment Update Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExperimentInner>, ExperimentInner> beginUpdate(
        String resourceGroupName, String profileName, String experimentName, ExperimentUpdateModel parameters);

    /**
     * Updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment Update Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExperimentInner>, ExperimentInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String experimentName,
        ExperimentUpdateModel parameters,
        Context context);

    /**
     * Updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment Update Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner update(
        String resourceGroupName, String profileName, String experimentName, ExperimentUpdateModel parameters);

    /**
     * Updates an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param parameters The Experiment Update Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the properties of an Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner update(
        String resourceGroupName,
        String profileName,
        String experimentName,
        ExperimentUpdateModel parameters,
        Context context);

    /**
     * Deletes an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String profileName, String experimentName);

    /**
     * Deletes an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String experimentName, Context context);

    /**
     * Deletes an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String experimentName);

    /**
     * Deletes an Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String experimentName, Context context);
}
