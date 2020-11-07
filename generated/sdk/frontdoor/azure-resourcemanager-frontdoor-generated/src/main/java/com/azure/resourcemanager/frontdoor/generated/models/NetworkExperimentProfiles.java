// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NetworkExperimentProfiles. */
public interface NetworkExperimentProfiles {
    /**
     * Gets a list of Network Experiment Profiles under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles under a subscription.
     */
    PagedIterable<Profile> list();

    /**
     * Gets a list of Network Experiment Profiles under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles under a subscription.
     */
    PagedIterable<Profile> list(Context context);

    /**
     * Gets a list of Network Experiment Profiles within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles within a resource group under a subscription.
     */
    PagedIterable<Profile> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Network Experiment Profiles within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles within a resource group under a subscription.
     */
    PagedIterable<Profile> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an NetworkExperiment Profile by ProfileName.
     */
    Profile getByResourceGroup(String resourceGroupName, String profileName);

    /**
     * Gets an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an NetworkExperiment Profile by ProfileName.
     */
    Response<Profile> getByResourceGroupWithResponse(String resourceGroupName, String profileName, Context context);

    /**
     * Deletes an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String profileName);

    /**
     * Deletes an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String profileName, Context context);

    /**
     * Gets an NetworkExperiment Profile by ProfileName.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an NetworkExperiment Profile by ProfileName.
     */
    Profile getById(String id);

    /**
     * Gets an NetworkExperiment Profile by ProfileName.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an NetworkExperiment Profile by ProfileName.
     */
    Response<Profile> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Profile resource.
     *
     * @param name resource name.
     * @return the first stage of the new Profile definition.
     */
    Profile.DefinitionStages.Blank define(String name);
}
