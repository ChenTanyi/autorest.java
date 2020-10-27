// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterMonitoringResponseInner;

/** An immutable client-side representation of ClusterMonitoringResponse. */
@Immutable
public interface ClusterMonitoringResponse {
    /**
     * Gets the clusterMonitoringEnabled property: The status of the Operations Management Suite (OMS) on the HDInsight
     * cluster.
     *
     * @return the clusterMonitoringEnabled value.
     */
    Boolean clusterMonitoringEnabled();

    /**
     * Gets the workspaceId property: The workspace ID of the Operations Management Suite (OMS) on the HDInsight
     * cluster.
     *
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterMonitoringResponseInner object.
     *
     * @return the inner object.
     */
    ClusterMonitoringResponseInner innerModel();
}