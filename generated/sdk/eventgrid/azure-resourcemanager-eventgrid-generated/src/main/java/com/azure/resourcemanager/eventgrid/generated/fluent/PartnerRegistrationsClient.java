// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerRegistrationInner;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationUpdateParameters;

/** An instance of this class provides access to all the operations defined in PartnerRegistrationsClient. */
public interface PartnerRegistrationsClient {
    /**
     * Gets a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a partner registration with the specified parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerRegistrationInner getByResourceGroup(String resourceGroupName, String partnerRegistrationName);

    /**
     * Gets a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a partner registration with the specified parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerRegistrationInner> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerRegistrationName, Context context);

    /**
     * Creates a new partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param partnerRegistrationInfo PartnerRegistration information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a partner registration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerRegistrationInner createOrUpdate(
        String resourceGroupName, String partnerRegistrationName, PartnerRegistrationInner partnerRegistrationInfo);

    /**
     * Creates a new partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param partnerRegistrationInfo PartnerRegistration information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a partner registration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerRegistrationInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String partnerRegistrationName,
        PartnerRegistrationInner partnerRegistrationInfo,
        Context context);

    /**
     * Deletes a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerRegistrationName);

    /**
     * Deletes a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String partnerRegistrationName, Context context);

    /**
     * Updates a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param partnerRegistrationUpdateParameters Partner registration update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerRegistrationInner update(
        String resourceGroupName,
        String partnerRegistrationName,
        PartnerRegistrationUpdateParameters partnerRegistrationUpdateParameters);

    /**
     * Updates a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param partnerRegistrationUpdateParameters Partner registration update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerRegistrationInner> updateWithResponse(
        String resourceGroupName,
        String partnerRegistrationName,
        PartnerRegistrationUpdateParameters partnerRegistrationUpdateParameters,
        Context context);

    /**
     * List all the partner registrations under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerRegistrationInner> listBySubscription();

    /**
     * List all the partner registrations under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerRegistrationInner> listBySubscription(String filter, Integer top, Context context);

    /**
     * List all the partner registrations under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerRegistrationInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all the partner registrations under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerRegistrationInner> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * List all partners registrations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerRegistrationInner> list();

    /**
     * List all partners registrations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerRegistrationInner> list(Context context);
}
