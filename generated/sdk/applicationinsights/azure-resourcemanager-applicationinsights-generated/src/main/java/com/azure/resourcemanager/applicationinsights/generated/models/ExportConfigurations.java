// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of ExportConfigurations. */
public interface ExportConfigurations {
    /**
     * Gets a list of Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Continuous Export configuration of an Application Insights component.
     */
    List<ApplicationInsightsComponentExportConfiguration> list(String resourceGroupName, String resourceName);

    /**
     * Gets a list of Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Continuous Export configuration of an Application Insights component.
     */
    Response<List<ApplicationInsightsComponentExportConfiguration>> listWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Create a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportProperties Properties that need to be specified to create a Continuous Export configuration of a
     *     Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Continuous Export configurations.
     */
    List<ApplicationInsightsComponentExportConfiguration> create(
        String resourceGroupName, String resourceName, ApplicationInsightsComponentExportRequest exportProperties);

    /**
     * Create a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportProperties Properties that need to be specified to create a Continuous Export configuration of a
     *     Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Continuous Export configurations.
     */
    Response<List<ApplicationInsightsComponentExportConfiguration>> createWithResponse(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentExportRequest exportProperties,
        Context context);

    /**
     * Delete a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a Continuous Export configuration.
     */
    ApplicationInsightsComponentExportConfiguration delete(
        String resourceGroupName, String resourceName, String exportId);

    /**
     * Delete a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a Continuous Export configuration.
     */
    Response<ApplicationInsightsComponentExportConfiguration> deleteWithResponse(
        String resourceGroupName, String resourceName, String exportId, Context context);

    /**
     * Get the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Continuous Export configuration for this export id.
     */
    ApplicationInsightsComponentExportConfiguration get(String resourceGroupName, String resourceName, String exportId);

    /**
     * Get the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Continuous Export configuration for this export id.
     */
    Response<ApplicationInsightsComponentExportConfiguration> getWithResponse(
        String resourceGroupName, String resourceName, String exportId, Context context);

    /**
     * Update the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param exportProperties Properties that need to be specified to update the Continuous Export configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a Continuous Export configuration.
     */
    ApplicationInsightsComponentExportConfiguration update(
        String resourceGroupName,
        String resourceName,
        String exportId,
        ApplicationInsightsComponentExportRequest exportProperties);

    /**
     * Update the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param exportProperties Properties that need to be specified to update the Continuous Export configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a Continuous Export configuration.
     */
    Response<ApplicationInsightsComponentExportConfiguration> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        String exportId,
        ApplicationInsightsComponentExportRequest exportProperties,
        Context context);
}
