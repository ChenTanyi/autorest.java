// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.RegionsClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.MessagingRegionsInner;
import com.azure.resourcemanager.eventhubs.generated.models.MessagingRegions;
import com.azure.resourcemanager.eventhubs.generated.models.Regions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RegionsImpl implements Regions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegionsImpl.class);

    private final RegionsClient innerClient;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    public RegionsImpl(
        RegionsClient innerClient, com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MessagingRegions> listBySku(String sku) {
        PagedIterable<MessagingRegionsInner> inner = this.serviceClient().listBySku(sku);
        return Utils.mapPage(inner, inner1 -> new MessagingRegionsImpl(inner1, this.manager()));
    }

    public PagedIterable<MessagingRegions> listBySku(String sku, Context context) {
        PagedIterable<MessagingRegionsInner> inner = this.serviceClient().listBySku(sku, context);
        return Utils.mapPage(inner, inner1 -> new MessagingRegionsImpl(inner1, this.manager()));
    }

    private RegionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }
}
