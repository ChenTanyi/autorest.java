// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.EntityNameAvailabilityCheckOutputInner;
import com.azure.resourcemanager.mediaservices.generated.models.CheckNameAvailabilityInput;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public interface LocationsClient {
    /**
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName The name of the location.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EntityNameAvailabilityCheckOutputInner checkNameAvailability(
        String locationName, CheckNameAvailabilityInput parameters);

    /**
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName The name of the location.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EntityNameAvailabilityCheckOutputInner> checkNameAvailabilityWithResponse(
        String locationName, CheckNameAvailabilityInput parameters, Context context);
}
