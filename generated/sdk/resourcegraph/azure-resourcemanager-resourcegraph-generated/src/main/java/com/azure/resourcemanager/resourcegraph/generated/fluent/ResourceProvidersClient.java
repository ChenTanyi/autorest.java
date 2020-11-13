// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcegraph.generated.fluent.models.QueryResponseInner;
import com.azure.resourcemanager.resourcegraph.generated.fluent.models.ResourceChangeDataInner;
import com.azure.resourcemanager.resourcegraph.generated.fluent.models.ResourceChangeListInner;
import com.azure.resourcemanager.resourcegraph.generated.models.QueryRequest;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourceChangeDetailsRequestParameters;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourceChangesRequestParameters;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Describes a query to be executed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QueryResponseInner resources(QueryRequest query);

    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Describes a query to be executed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QueryResponseInner> resourcesWithResponse(QueryRequest query, Context context);

    /**
     * List changes to a resource for a given time interval.
     *
     * @param parameters The parameters for a specific changes request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of changes associated with a resource over a specific time interval.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceChangeListInner resourceChanges(ResourceChangesRequestParameters parameters);

    /**
     * List changes to a resource for a given time interval.
     *
     * @param parameters The parameters for a specific changes request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of changes associated with a resource over a specific time interval.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceChangeListInner> resourceChangesWithResponse(
        ResourceChangesRequestParameters parameters, Context context);

    /**
     * Get resource change details.
     *
     * @param parameters The parameters for a specific change details request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource change details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceChangeDataInner resourceChangeDetails(ResourceChangeDetailsRequestParameters parameters);

    /**
     * Get resource change details.
     *
     * @param parameters The parameters for a specific change details request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource change details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceChangeDataInner> resourceChangeDetailsWithResponse(
        ResourceChangeDetailsRequestParameters parameters, Context context);
}
