// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of FrontDoors. */
public interface FrontDoors {
    /**
     * Lists all of the Front Doors within an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors.
     */
    PagedIterable<FrontDoor> list();

    /**
     * Lists all of the Front Doors within an Azure subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors.
     */
    PagedIterable<FrontDoor> list(Context context);

    /**
     * Lists all of the Front Doors within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors.
     */
    PagedIterable<FrontDoor> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the Front Doors within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors.
     */
    PagedIterable<FrontDoor> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a Front Door with the specified Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Front Door with the specified Front Door name under the specified subscription and resource group.
     */
    FrontDoor getByResourceGroup(String resourceGroupName, String frontDoorName);

    /**
     * Gets a Front Door with the specified Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Front Door with the specified Front Door name under the specified subscription and resource group.
     */
    Response<FrontDoor> getByResourceGroupWithResponse(String resourceGroupName, String frontDoorName, Context context);

    /**
     * Deletes an existing Front Door with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String frontDoorName);

    /**
     * Deletes an existing Front Door with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String frontDoorName, Context context);

    /**
     * Validates the custom domain mapping to ensure it maps to the correct Front Door endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param customDomainProperties Input of the custom domain to be validated for DNS mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of custom domain validation.
     */
    ValidateCustomDomainOutput validateCustomDomain(
        String resourceGroupName, String frontDoorName, ValidateCustomDomainInput customDomainProperties);

    /**
     * Validates the custom domain mapping to ensure it maps to the correct Front Door endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param customDomainProperties Input of the custom domain to be validated for DNS mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of custom domain validation.
     */
    Response<ValidateCustomDomainOutput> validateCustomDomainWithResponse(
        String resourceGroupName,
        String frontDoorName,
        ValidateCustomDomainInput customDomainProperties,
        Context context);

    /**
     * Begins definition for a new FrontDoor resource.
     *
     * @param name resource name.
     * @return the first stage of the new FrontDoor definition.
     */
    FrontDoor.DefinitionStages.Blank define(String name);
}
