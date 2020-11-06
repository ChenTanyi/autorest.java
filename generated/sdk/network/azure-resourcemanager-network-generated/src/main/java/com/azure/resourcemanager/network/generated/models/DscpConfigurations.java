// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DscpConfigurations. */
public interface DscpConfigurations {
    /**
     * Deletes a DSCP Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dscpConfigurationName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String dscpConfigurationName);

    /**
     * Deletes a DSCP Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dscpConfigurationName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String dscpConfigurationName, Context context);

    /**
     * Gets a DSCP Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dscpConfigurationName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DSCP Configuration.
     */
    DscpConfiguration getByResourceGroup(String resourceGroupName, String dscpConfigurationName);

    /**
     * Gets a DSCP Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dscpConfigurationName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DSCP Configuration.
     */
    Response<DscpConfiguration> getByResourceGroupWithResponse(
        String resourceGroupName, String dscpConfigurationName, Context context);

    /**
     * Gets a DSCP Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DSCP Configuration.
     */
    PagedIterable<DscpConfiguration> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a DSCP Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DSCP Configuration.
     */
    PagedIterable<DscpConfiguration> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all dscp configurations in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all dscp configurations in a subscription.
     */
    PagedIterable<DscpConfiguration> list();

    /**
     * Gets all dscp configurations in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all dscp configurations in a subscription.
     */
    PagedIterable<DscpConfiguration> list(Context context);

    /**
     * Gets a DSCP Configuration.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DSCP Configuration.
     */
    DscpConfiguration getById(String id);

    /**
     * Gets a DSCP Configuration.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DSCP Configuration.
     */
    Response<DscpConfiguration> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DscpConfiguration resource.
     *
     * @param name resource name.
     * @return the first stage of the new DscpConfiguration definition.
     */
    DscpConfiguration.DefinitionStages.Blank define(String name);
}
