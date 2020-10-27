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
import com.azure.resourcemanager.databoxedge.generated.fluent.models.BandwidthScheduleInner;

/** An instance of this class provides access to all the operations defined in BandwidthSchedulesClient. */
public interface BandwidthSchedulesClient {
    /**
     * Gets all the bandwidth schedules for a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the bandwidth schedules for a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BandwidthScheduleInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Gets all the bandwidth schedules for a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the bandwidth schedules for a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BandwidthScheduleInner> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified bandwidth schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BandwidthScheduleInner get(String deviceName, String name, String resourceGroupName);

    /**
     * Gets the properties of the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified bandwidth schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BandwidthScheduleInner> getWithResponse(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Creates or updates a bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name which needs to be added/updated.
     * @param resourceGroupName The resource group name.
     * @param parameters The bandwidth schedule details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the bandwidth schedule details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BandwidthScheduleInner>, BandwidthScheduleInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, BandwidthScheduleInner parameters);

    /**
     * Creates or updates a bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name which needs to be added/updated.
     * @param resourceGroupName The resource group name.
     * @param parameters The bandwidth schedule details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the bandwidth schedule details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BandwidthScheduleInner>, BandwidthScheduleInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, BandwidthScheduleInner parameters, Context context);

    /**
     * Creates or updates a bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name which needs to be added/updated.
     * @param resourceGroupName The resource group name.
     * @param parameters The bandwidth schedule details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the bandwidth schedule details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BandwidthScheduleInner createOrUpdate(
        String deviceName, String name, String resourceGroupName, BandwidthScheduleInner parameters);

    /**
     * Creates or updates a bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name which needs to be added/updated.
     * @param resourceGroupName The resource group name.
     * @param parameters The bandwidth schedule details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the bandwidth schedule details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BandwidthScheduleInner createOrUpdate(
        String deviceName, String name, String resourceGroupName, BandwidthScheduleInner parameters, Context context);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
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
     * Deletes the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName, Context context);
}