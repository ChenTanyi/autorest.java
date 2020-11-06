// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PublicIpAddresses. */
public interface PublicIpAddresses {
    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String publicIpAddressName);

    /**
     * Deletes the specified public IP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String publicIpAddressName, Context context);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group.
     */
    PublicIpAddress getByResourceGroup(String resourceGroupName, String publicIpAddressName);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the public IP address.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group.
     */
    Response<PublicIpAddress> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpAddressName, String expand, Context context);

    /**
     * Gets all the public IP addresses in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP addresses in a subscription.
     */
    PagedIterable<PublicIpAddress> list();

    /**
     * Gets all the public IP addresses in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP addresses in a subscription.
     */
    PagedIterable<PublicIpAddress> list(Context context);

    /**
     * Gets all public IP addresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP addresses in a resource group.
     */
    PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all public IP addresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP addresses in a resource group.
     */
    PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets information about all public IP addresses on a virtual machine scale set level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses on a virtual machine scale set level.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName);

    /**
     * Gets information about all public IP addresses on a virtual machine scale set level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses on a virtual machine scale set level.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName, Context context);

    /**
     * Gets information about all public IP addresses in a virtual machine IP configuration in a virtual machine scale
     * set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The network interface name.
     * @param ipConfigurationName The IP configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses in a virtual machine IP configuration in a virtual machine
     *     scale set.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName);

    /**
     * Gets information about all public IP addresses in a virtual machine IP configuration in a virtual machine scale
     * set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The network interface name.
     * @param ipConfigurationName The IP configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all public IP addresses in a virtual machine IP configuration in a virtual machine
     *     scale set.
     */
    PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        Context context);

    /**
     * Get the specified public IP address in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the IP configuration.
     * @param publicIpAddressName The name of the public IP Address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a virtual machine scale set.
     */
    PublicIpAddress getVirtualMachineScaleSetPublicIpAddress(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName);

    /**
     * Get the specified public IP address in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the IP configuration.
     * @param publicIpAddressName The name of the public IP Address.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a virtual machine scale set.
     */
    Response<PublicIpAddress> getVirtualMachineScaleSetPublicIpAddressWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName,
        String expand,
        Context context);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group.
     */
    PublicIpAddress getById(String id);

    /**
     * Gets the specified public IP address in a specified resource group.
     *
     * @param id the id of the resource.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP address in a specified resource group.
     */
    Response<PublicIpAddress> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Begins definition for a new PublicIpAddress resource.
     *
     * @param name resource name.
     * @return the first stage of the new PublicIpAddress definition.
     */
    PublicIpAddress.DefinitionStages.Blank define(String name);
}
