// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.UsageDetailsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.UsageDetailInner;
import com.azure.resourcemanager.consumption.generated.models.Metrictype;
import com.azure.resourcemanager.consumption.generated.models.UsageDetail;
import com.azure.resourcemanager.consumption.generated.models.UsageDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsageDetailsImpl implements UsageDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsageDetailsImpl.class);

    private final UsageDetailsClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public UsageDetailsImpl(
        UsageDetailsClient innerClient,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<UsageDetail> list(String scope) {
        PagedIterable<UsageDetailInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new UsageDetailImpl(inner1, this.manager()));
    }

    public PagedIterable<UsageDetail> list(
        String scope, String expand, String filter, String skiptoken, Integer top, Metrictype metric, Context context) {
        PagedIterable<UsageDetailInner> inner =
            this.serviceClient().list(scope, expand, filter, skiptoken, top, metric, context);
        return Utils.mapPage(inner, inner1 -> new UsageDetailImpl(inner1, this.manager()));
    }

    private UsageDetailsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}