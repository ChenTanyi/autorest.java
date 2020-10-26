// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.time.Duration;

/** Resource collection API of MetricBaselines. */
public interface MetricBaselines {
    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    BaselineResponse get(String resourceUri, String metricName);

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    Response<BaselineResponse> getWithResponse(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType,
        Context context);

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    CalculateBaselineResponse calculateBaseline(String resourceUri, TimeSeriesInformation timeSeriesInformation);

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    Response<CalculateBaselineResponse> calculateBaselineWithResponse(
        String resourceUri, TimeSeriesInformation timeSeriesInformation, Context context);
}