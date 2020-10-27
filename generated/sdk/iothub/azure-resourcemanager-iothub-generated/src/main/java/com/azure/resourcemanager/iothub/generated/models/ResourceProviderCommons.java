// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviderCommons. */
public interface ResourceProviderCommons {
    /**
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of free and paid iot hubs in the subscription.
     */
    UserSubscriptionQuotaListResult getSubscriptionQuota();

    /**
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of free and paid iot hubs in the subscription.
     */
    Response<UserSubscriptionQuotaListResult> getSubscriptionQuotaWithResponse(Context context);
}
