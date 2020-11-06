// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualMachineScaleSetVMExtensions. */
public interface VirtualMachineScaleSetVMExtensions {
    /**
     * The operation to delete the VMSS VM extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName);

    /**
     * The operation to delete the VMSS VM extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName, Context context);

    /**
     * The operation to get the VMSS VM extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a VMSS VM Extension.
     */
    VirtualMachineScaleSetVMExtension get(
        String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName);

    /**
     * The operation to get the VMSS VM extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a VMSS VM Extension.
     */
    Response<VirtualMachineScaleSetVMExtension> getWithResponse(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String vmExtensionName,
        String expand,
        Context context);

    /**
     * The operation to get all extensions of an instance in Virtual Machine Scaleset.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List VMSS VM Extension operation response.
     */
    VirtualMachineScaleSetVMExtensionsListResult list(
        String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * The operation to get all extensions of an instance in Virtual Machine Scaleset.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List VMSS VM Extension operation response.
     */
    Response<VirtualMachineScaleSetVMExtensionsListResult> listWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, String expand, Context context);

    /**
     * The operation to get the VMSS VM extension.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a VMSS VM Extension.
     */
    VirtualMachineScaleSetVMExtension getById(String id);

    /**
     * The operation to get the VMSS VM extension.
     *
     * @param id the id of the resource.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a VMSS VM Extension.
     */
    Response<VirtualMachineScaleSetVMExtension> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Begins definition for a new VirtualMachineScaleSetVMExtension resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualMachineScaleSetVMExtension definition.
     */
    VirtualMachineScaleSetVMExtension.DefinitionStages.Blank define(String name);
}
