// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ApplicationSecurityGroups. */
public interface ApplicationSecurityGroups {
    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String applicationSecurityGroupName);

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String applicationSecurityGroupName, Context context);

    /**
     * Gets information about the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    ApplicationSecurityGroup getByResourceGroup(String resourceGroupName, String applicationSecurityGroupName);

    /**
     * Gets information about the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    Response<ApplicationSecurityGroup> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationSecurityGroupName, Context context);

    /**
     * Gets all application security groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application security groups in a subscription.
     */
    PagedIterable<ApplicationSecurityGroup> list();

    /**
     * Gets all application security groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application security groups in a subscription.
     */
    PagedIterable<ApplicationSecurityGroup> list(Context context);

    /**
     * Gets all the application security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the application security groups in a resource group.
     */
    PagedIterable<ApplicationSecurityGroup> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the application security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the application security groups in a resource group.
     */
    PagedIterable<ApplicationSecurityGroup> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets information about the specified application security group.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    ApplicationSecurityGroup getById(String id);

    /**
     * Gets information about the specified application security group.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    Response<ApplicationSecurityGroup> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ApplicationSecurityGroup resource.
     *
     * @param name resource name.
     * @return the first stage of the new ApplicationSecurityGroup definition.
     */
    ApplicationSecurityGroup.DefinitionStages.Blank define(String name);
}
