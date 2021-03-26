// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.UpdateDomainInner;

/** An instance of this class provides access to all the operations defined in CloudServicesUpdateDomainsClient. */
public interface CloudServicesUpdateDomainsClient {
    /**
     * Updates the role instances in the specified update domain.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param updateDomain Specifies an integer value that identifies the update domain. Update domains are identified
     *     with a zero-based index: the first update domain has an ID of 0, the second has an ID of 1, and so on.
     * @param parameters The update domain object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginWalkUpdateDomain(
        String resourceGroupName, String cloudServiceName, int updateDomain, UpdateDomainInner parameters);

    /**
     * Updates the role instances in the specified update domain.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param updateDomain Specifies an integer value that identifies the update domain. Update domains are identified
     *     with a zero-based index: the first update domain has an ID of 0, the second has an ID of 1, and so on.
     * @param parameters The update domain object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginWalkUpdateDomain(
        String resourceGroupName,
        String cloudServiceName,
        int updateDomain,
        UpdateDomainInner parameters,
        Context context);

    /**
     * Updates the role instances in the specified update domain.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param updateDomain Specifies an integer value that identifies the update domain. Update domains are identified
     *     with a zero-based index: the first update domain has an ID of 0, the second has an ID of 1, and so on.
     * @param parameters The update domain object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void walkUpdateDomain(
        String resourceGroupName, String cloudServiceName, int updateDomain, UpdateDomainInner parameters);

    /**
     * Updates the role instances in the specified update domain.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param updateDomain Specifies an integer value that identifies the update domain. Update domains are identified
     *     with a zero-based index: the first update domain has an ID of 0, the second has an ID of 1, and so on.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void walkUpdateDomain(String resourceGroupName, String cloudServiceName, int updateDomain);

    /**
     * Updates the role instances in the specified update domain.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param updateDomain Specifies an integer value that identifies the update domain. Update domains are identified
     *     with a zero-based index: the first update domain has an ID of 0, the second has an ID of 1, and so on.
     * @param parameters The update domain object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void walkUpdateDomain(
        String resourceGroupName,
        String cloudServiceName,
        int updateDomain,
        UpdateDomainInner parameters,
        Context context);

    /**
     * Gets the specified update domain of a cloud service. Use nextLink property in the response to get the next page
     * of update domains. Do this till nextLink is null to fetch all the update domains.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param updateDomain Specifies an integer value that identifies the update domain. Update domains are identified
     *     with a zero-based index: the first update domain has an ID of 0, the second has an ID of 1, and so on.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified update domain of a cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UpdateDomainInner getUpdateDomain(String resourceGroupName, String cloudServiceName, int updateDomain);

    /**
     * Gets the specified update domain of a cloud service. Use nextLink property in the response to get the next page
     * of update domains. Do this till nextLink is null to fetch all the update domains.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param updateDomain Specifies an integer value that identifies the update domain. Update domains are identified
     *     with a zero-based index: the first update domain has an ID of 0, the second has an ID of 1, and so on.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified update domain of a cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UpdateDomainInner> getUpdateDomainWithResponse(
        String resourceGroupName, String cloudServiceName, int updateDomain, Context context);

    /**
     * Gets a list of all update domains in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update domains in a cloud service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UpdateDomainInner> listUpdateDomains(String resourceGroupName, String cloudServiceName);

    /**
     * Gets a list of all update domains in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all update domains in a cloud service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UpdateDomainInner> listUpdateDomains(
        String resourceGroupName, String cloudServiceName, Context context);
}