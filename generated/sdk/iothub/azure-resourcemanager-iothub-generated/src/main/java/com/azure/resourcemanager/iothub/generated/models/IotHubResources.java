// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IotHubResources. */
public interface IotHubResources {
    /**
     * Get the non-security related metadata of an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the non-security related metadata of an IoT hub.
     */
    IotHubDescription getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Get the non-security related metadata of an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the non-security related metadata of an IoT hub.
     */
    Response<IotHubDescription> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Delete an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the IoT hub.
     */
    IotHubDescription delete(String resourceGroupName, String resourceName);

    /**
     * Delete an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the IoT hub.
     */
    IotHubDescription delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Get all the IoT hubs in a subscription.
     *
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the IoT hubs in a subscription.
     */
    PagedIterable<IotHubDescription> list();

    /**
     * Get all the IoT hubs in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the IoT hubs in a subscription.
     */
    PagedIterable<IotHubDescription> list(Context context);

    /**
     * Get all the IoT hubs in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the IoT hubs in a resource group.
     */
    PagedIterable<IotHubDescription> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the IoT hubs in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the IoT hubs in a resource group.
     */
    PagedIterable<IotHubDescription> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the statistics from an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the statistics from an IoT hub.
     */
    RegistryStatistics getStats(String resourceGroupName, String resourceName);

    /**
     * Get the statistics from an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the statistics from an IoT hub.
     */
    Response<RegistryStatistics> getStatsWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Get the list of valid SKUs for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of valid SKUs for an IoT hub.
     */
    PagedIterable<IotHubSkuDescription> getValidSkus(String resourceGroupName, String resourceName);

    /**
     * Get the list of valid SKUs for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of valid SKUs for an IoT hub.
     */
    PagedIterable<IotHubSkuDescription> getValidSkus(String resourceGroupName, String resourceName, Context context);

    /**
     * Get a list of the consumer groups in the Event Hub-compatible device-to-cloud endpoint in an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the consumer groups in the Event Hub-compatible device-to-cloud endpoint in an IoT hub.
     */
    PagedIterable<EventHubConsumerGroupInfo> listEventHubConsumerGroups(
        String resourceGroupName, String resourceName, String eventHubEndpointName);

    /**
     * Get a list of the consumer groups in the Event Hub-compatible device-to-cloud endpoint in an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the consumer groups in the Event Hub-compatible device-to-cloud endpoint in an IoT hub.
     */
    PagedIterable<EventHubConsumerGroupInfo> listEventHubConsumerGroups(
        String resourceGroupName, String resourceName, String eventHubEndpointName, Context context);

    /**
     * Get a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub.
     * @param name The name of the consumer group to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     */
    EventHubConsumerGroupInfo getEventHubConsumerGroup(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name);

    /**
     * Get a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub.
     * @param name The name of the consumer group to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     */
    Response<EventHubConsumerGroupInfo> getEventHubConsumerGroupWithResponse(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name, Context context);

    /**
     * Delete a consumer group from an Event Hub-compatible endpoint in an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub.
     * @param name The name of the consumer group to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteEventHubConsumerGroup(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name);

    /**
     * Delete a consumer group from an Event Hub-compatible endpoint in an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub.
     * @param name The name of the consumer group to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteEventHubConsumerGroupWithResponse(
        String resourceGroupName, String resourceName, String eventHubEndpointName, String name, Context context);

    /**
     * Get a list of all the jobs in an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the jobs in an IoT hub.
     */
    PagedIterable<JobResponse> listJobs(String resourceGroupName, String resourceName);

    /**
     * Get a list of all the jobs in an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the jobs in an IoT hub.
     */
    PagedIterable<JobResponse> listJobs(String resourceGroupName, String resourceName, Context context);

    /**
     * Get the details of a job from an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param jobId The job identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a job from an IoT hub.
     */
    JobResponse getJob(String resourceGroupName, String resourceName, String jobId);

    /**
     * Get the details of a job from an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param jobId The job identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a job from an IoT hub.
     */
    Response<JobResponse> getJobWithResponse(
        String resourceGroupName, String resourceName, String jobId, Context context);

    /**
     * Get the quota metrics for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota metrics for an IoT hub.
     */
    PagedIterable<IotHubQuotaMetricInfo> getQuotaMetrics(String resourceGroupName, String resourceName);

    /**
     * Get the quota metrics for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota metrics for an IoT hub.
     */
    PagedIterable<IotHubQuotaMetricInfo> getQuotaMetrics(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get the health for routing endpoints.
     *
     * @param resourceGroupName The resourceGroupName parameter.
     * @param iotHubName The iotHubName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the health for routing endpoints.
     */
    PagedIterable<EndpointHealthData> getEndpointHealth(String resourceGroupName, String iotHubName);

    /**
     * Get the health for routing endpoints.
     *
     * @param resourceGroupName The resourceGroupName parameter.
     * @param iotHubName The iotHubName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the health for routing endpoints.
     */
    PagedIterable<EndpointHealthData> getEndpointHealth(String resourceGroupName, String iotHubName, Context context);

    /**
     * Check if an IoT hub name is available.
     *
     * @param operationInputs Input values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given IoT hub name is available.
     */
    IotHubNameAvailabilityInfo checkNameAvailability(OperationInputs operationInputs);

    /**
     * Check if an IoT hub name is available.
     *
     * @param operationInputs Input values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given IoT hub name is available.
     */
    Response<IotHubNameAvailabilityInfo> checkNameAvailabilityWithResponse(
        OperationInputs operationInputs, Context context);

    /**
     * Test all routes configured in this Iot Hub.
     *
     * @param iotHubName IotHub to be tested.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param input Input for testing all routes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of testing all routes.
     */
    TestAllRoutesResult testAllRoutes(String iotHubName, String resourceGroupName, TestAllRoutesInput input);

    /**
     * Test all routes configured in this Iot Hub.
     *
     * @param iotHubName IotHub to be tested.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param input Input for testing all routes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of testing all routes.
     */
    Response<TestAllRoutesResult> testAllRoutesWithResponse(
        String iotHubName, String resourceGroupName, TestAllRoutesInput input, Context context);

    /**
     * Test the new route for this Iot Hub.
     *
     * @param iotHubName IotHub to be tested.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param input Input for testing route.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of testing one route.
     */
    TestRouteResult testRoute(String iotHubName, String resourceGroupName, TestRouteInput input);

    /**
     * Test the new route for this Iot Hub.
     *
     * @param iotHubName IotHub to be tested.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param input Input for testing route.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of testing one route.
     */
    Response<TestRouteResult> testRouteWithResponse(
        String iotHubName, String resourceGroupName, TestRouteInput input, Context context);

    /**
     * Get the security metadata for an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security metadata for an IoT hub.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(String resourceGroupName, String resourceName);

    /**
     * Get the security metadata for an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security metadata for an IoT hub.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get a shared access policy by name from an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param keyName The name of the shared access policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared access policy by name from an IoT hub.
     */
    SharedAccessSignatureAuthorizationRule getKeysForKeyName(
        String resourceGroupName, String resourceName, String keyName);

    /**
     * Get a shared access policy by name from an IoT hub. For more information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-security.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param keyName The name of the shared access policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared access policy by name from an IoT hub.
     */
    Response<SharedAccessSignatureAuthorizationRule> getKeysForKeyNameWithResponse(
        String resourceGroupName, String resourceName, String keyName, Context context);

    /**
     * Exports all the device identities in the IoT hub identity registry to an Azure Storage blob container. For more
     * information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param exportDevicesParameters Use to provide parameters when requesting an export of all devices in the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object.
     */
    JobResponse exportDevices(
        String resourceGroupName, String resourceName, ExportDevicesRequest exportDevicesParameters);

    /**
     * Exports all the device identities in the IoT hub identity registry to an Azure Storage blob container. For more
     * information, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param exportDevicesParameters Use to provide parameters when requesting an export of all devices in the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object.
     */
    Response<JobResponse> exportDevicesWithResponse(
        String resourceGroupName, String resourceName, ExportDevicesRequest exportDevicesParameters, Context context);

    /**
     * Import, update, or delete device identities in the IoT hub identity registry from a blob. For more information,
     * see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param importDevicesParameters Use to provide parameters when requesting an import of all devices in the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object.
     */
    JobResponse importDevices(
        String resourceGroupName, String resourceName, ImportDevicesRequest importDevicesParameters);

    /**
     * Import, update, or delete device identities in the IoT hub identity registry from a blob. For more information,
     * see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-identity-registry#import-and-export-device-identities.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param importDevicesParameters Use to provide parameters when requesting an import of all devices in the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Job Response object.
     */
    Response<JobResponse> importDevicesWithResponse(
        String resourceGroupName, String resourceName, ImportDevicesRequest importDevicesParameters, Context context);

    /**
     * Get the non-security related metadata of an IoT hub.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the non-security related metadata of an IoT hub.
     */
    IotHubDescription getById(String id);

    /**
     * Get the non-security related metadata of an IoT hub.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the non-security related metadata of an IoT hub.
     */
    Response<IotHubDescription> getByIdWithResponse(String id, Context context);

    /**
     * Get a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     *
     * @param id the id of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     */
    EventHubConsumerGroupInfo getEventHubConsumerGroupById(String id);

    /**
     * Get a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     *
     * @param id the id of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a consumer group from the Event Hub-compatible device-to-cloud endpoint for an IoT hub.
     */
    Response<EventHubConsumerGroupInfo> getEventHubConsumerGroupByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IotHubDescription resource.
     *
     * @param name resource name.
     * @return the first stage of the new IotHubDescription definition.
     */
    IotHubDescription.DefinitionStages.Blank define(String name);

    /**
     * Begins definition for a new EventHubConsumerGroupInfo resource.
     *
     * @param name resource name.
     * @return the first stage of the new EventHubConsumerGroupInfo definition.
     */
    EventHubConsumerGroupInfo.DefinitionStages.Blank defineEventHubConsumerGroup(String name);
}
