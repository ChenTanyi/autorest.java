// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.iothub.generated.fluent.models.EndpointHealthDataInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of EndpointHealthData. */
@Immutable
public interface EndpointHealthData {
    /**
     * Gets the endpointId property: Id of the endpoint.
     *
     * @return the endpointId value.
     */
    String endpointId();

    /**
     * Gets the healthStatus property: Health statuses have following meanings. The 'healthy' status shows that the
     * endpoint is accepting messages as expected. The 'unhealthy' status shows that the endpoint is not accepting
     * messages as expected and IoT Hub is retrying to send data to this endpoint. The status of an unhealthy endpoint
     * will be updated to healthy when IoT Hub has established an eventually consistent state of health. The 'dead'
     * status shows that the endpoint is not accepting messages, after IoT Hub retried sending messages for the retrial
     * period. See IoT Hub metrics to identify errors and monitor issues with endpoints. The 'unknown' status shows that
     * the IoT Hub has not established a connection with the endpoint. No messages have been delivered to or rejected
     * from this endpoint.
     *
     * @return the healthStatus value.
     */
    EndpointHealthStatus healthStatus();

    /**
     * Gets the lastKnownError property: Last error obtained when a message failed to be delivered to iot hub.
     *
     * @return the lastKnownError value.
     */
    String lastKnownError();

    /**
     * Gets the lastKnownErrorTime property: Time at which the last known error occurred.
     *
     * @return the lastKnownErrorTime value.
     */
    OffsetDateTime lastKnownErrorTime();

    /**
     * Gets the lastSuccessfulSendAttemptTime property: Last time iot hub successfully sent a message to the endpoint.
     *
     * @return the lastSuccessfulSendAttemptTime value.
     */
    OffsetDateTime lastSuccessfulSendAttemptTime();

    /**
     * Gets the lastSendAttemptTime property: Last time iot hub tried to send a message to the endpoint.
     *
     * @return the lastSendAttemptTime value.
     */
    OffsetDateTime lastSendAttemptTime();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.generated.fluent.models.EndpointHealthDataInner object.
     *
     * @return the inner object.
     */
    EndpointHealthDataInner innerModel();
}