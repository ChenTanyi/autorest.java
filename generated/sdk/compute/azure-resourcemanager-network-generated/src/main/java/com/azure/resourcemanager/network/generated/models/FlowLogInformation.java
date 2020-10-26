// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner;

/** An immutable client-side representation of FlowLogInformation. */
@Immutable
public interface FlowLogInformation {
    /**
     * Gets the targetResourceId property: The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     *
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * Gets the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @return the flowAnalyticsConfiguration value.
     */
    TrafficAnalyticsProperties flowAnalyticsConfiguration();

    /**
     * Gets the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @return the storageId value.
     */
    String storageId();

    /**
     * Gets the enabled property: Flag to enable/disable flow logging.
     *
     * @return the enabled value.
     */
    boolean enabled();

    /**
     * Gets the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @return the retentionPolicy value.
     */
    RetentionPolicyParameters retentionPolicy();

    /**
     * Gets the format property: Parameters that define the flow log format.
     *
     * @return the format value.
     */
    FlowLogFormatParameters format();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner object.
     *
     * @return the inner object.
     */
    FlowLogInformationInner innerModel();
}
