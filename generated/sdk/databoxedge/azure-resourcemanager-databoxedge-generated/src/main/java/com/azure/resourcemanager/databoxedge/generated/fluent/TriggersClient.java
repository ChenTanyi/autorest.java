// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.TriggerInner;

/** An instance of this class provides access to all the operations defined in TriggersClient. */
public interface TriggersClient {
    /**
     * Lists all the triggers configured in the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all trigger on the data box edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TriggerInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Lists all the triggers configured in the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param filter Specify $filter='CustomContextTag eq &lt;tag&gt;' to filter on custom context tag property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all trigger on the data box edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TriggerInner> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, String filter, Context context);

    /**
     * Get a specific trigger by name.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific trigger by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TriggerInner get(String deviceName, String name, String resourceGroupName);

    /**
     * Get a specific trigger by name.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific trigger by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TriggerInner> getWithResponse(String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Creates or updates a trigger.
     *
     * @param deviceName Creates or updates a trigger.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @param trigger The trigger.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return trigger details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<TriggerInner>, TriggerInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, TriggerInner trigger);

    /**
     * Creates or updates a trigger.
     *
     * @param deviceName Creates or updates a trigger.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @param trigger The trigger.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return trigger details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<TriggerInner>, TriggerInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, TriggerInner trigger, Context context);

    /**
     * Creates or updates a trigger.
     *
     * @param deviceName Creates or updates a trigger.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @param trigger The trigger.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return trigger details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TriggerInner createOrUpdate(String deviceName, String name, String resourceGroupName, TriggerInner trigger);

    /**
     * Creates or updates a trigger.
     *
     * @param deviceName Creates or updates a trigger.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @param trigger The trigger.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return trigger details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TriggerInner createOrUpdate(
        String deviceName, String name, String resourceGroupName, TriggerInner trigger, Context context);

    /**
     * Deletes the trigger on the gateway device.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the trigger on the gateway device.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Deletes the trigger on the gateway device.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the trigger on the gateway device.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName, Context context);
}
