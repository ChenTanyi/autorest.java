// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.ReservationRecommendationsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationRecommendationInner;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendation;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReservationRecommendationsImpl implements ReservationRecommendations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReservationRecommendationsImpl.class);

    private final ReservationRecommendationsClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public ReservationRecommendationsImpl(
        ReservationRecommendationsClient innerClient,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReservationRecommendation> list(String scope) {
        PagedIterable<ReservationRecommendationInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new ReservationRecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationRecommendation> list(String scope, String filter, Context context) {
        PagedIterable<ReservationRecommendationInner> inner = this.serviceClient().list(scope, filter, context);
        return Utils.mapPage(inner, inner1 -> new ReservationRecommendationImpl(inner1, this.manager()));
    }

    private ReservationRecommendationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}