// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NetworkInterfaceTapConfigurations. */
public interface NetworkInterfaceTapConfigurations {
    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkInterfaceName, String tapConfigurationName, Context context);

    /**
     * Get the specified tap configuration on a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified tap configuration on a network interface.
     */
    NetworkInterfaceTapConfiguration get(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Get the specified tap configuration on a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified tap configuration on a network interface.
     */
    Response<NetworkInterfaceTapConfiguration> getWithResponse(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName, Context context);

    /**
     * Get all Tap configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Tap configurations in a network interface.
     */
    PagedIterable<NetworkInterfaceTapConfiguration> list(String resourceGroupName, String networkInterfaceName);

    /**
     * Get all Tap configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Tap configurations in a network interface.
     */
    PagedIterable<NetworkInterfaceTapConfiguration> list(
        String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Begins definition for a new NetworkInterfaceTapConfiguration resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkInterfaceTapConfiguration definition.
     */
    NetworkInterfaceTapConfiguration.DefinitionStages.Blank define(String name);
}
