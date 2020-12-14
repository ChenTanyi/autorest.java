// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager;
import com.azure.resourcemanager.operationalinsights.generated.fluent.ManagementGroupsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.ManagementGroupInner;
import com.azure.resourcemanager.operationalinsights.generated.models.ManagementGroup;
import com.azure.resourcemanager.operationalinsights.generated.models.ManagementGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagementGroupsImpl implements ManagementGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementGroupsImpl.class);

    private final ManagementGroupsClient innerClient;

    private final LogAnalyticsManager serviceManager;

    public ManagementGroupsImpl(ManagementGroupsClient innerClient, LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagementGroup> list(String resourceGroupName, String workspaceName) {
        PagedIterable<ManagementGroupInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new ManagementGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagementGroup> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<ManagementGroupInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return inner.mapPage(inner1 -> new ManagementGroupImpl(inner1, this.manager()));
    }

    private ManagementGroupsClient serviceClient() {
        return this.innerClient;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
