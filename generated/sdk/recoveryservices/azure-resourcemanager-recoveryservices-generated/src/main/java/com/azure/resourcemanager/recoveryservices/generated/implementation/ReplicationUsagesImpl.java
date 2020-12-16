// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.generated.fluent.ReplicationUsagesClient;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.ReplicationUsageInner;
import com.azure.resourcemanager.recoveryservices.generated.models.ReplicationUsage;
import com.azure.resourcemanager.recoveryservices.generated.models.ReplicationUsages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationUsagesImpl implements ReplicationUsages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationUsagesImpl.class);

    private final ReplicationUsagesClient innerClient;

    private final RecoveryServicesManager serviceManager;

    public ReplicationUsagesImpl(ReplicationUsagesClient innerClient, RecoveryServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReplicationUsage> list(String resourceGroupName, String vaultName) {
        PagedIterable<ReplicationUsageInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return inner.mapPage(inner1 -> new ReplicationUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<ReplicationUsage> list(String resourceGroupName, String vaultName, Context context) {
        PagedIterable<ReplicationUsageInner> inner = this.serviceClient().list(resourceGroupName, vaultName, context);
        return inner.mapPage(inner1 -> new ReplicationUsageImpl(inner1, this.manager()));
    }

    private ReplicationUsagesClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}