// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databoxedge.generated.models.TriggerSupportPackageRequest;

/** An instance of this class provides access to all the operations defined in SupportPackagesClient. */
public interface SupportPackagesClient {
    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginTriggerSupportPackage(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest);

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginTriggerSupportPackage(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context);

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void triggerSupportPackage(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest);

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void triggerSupportPackage(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context);
}