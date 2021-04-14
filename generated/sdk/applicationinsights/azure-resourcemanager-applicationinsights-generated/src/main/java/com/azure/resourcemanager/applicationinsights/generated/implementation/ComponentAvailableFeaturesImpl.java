// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.ComponentAvailableFeaturesClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentAvailableFeaturesInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentAvailableFeatures;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentAvailableFeatures;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ComponentAvailableFeaturesImpl implements ComponentAvailableFeatures {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComponentAvailableFeaturesImpl.class);

    private final ComponentAvailableFeaturesClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public ComponentAvailableFeaturesImpl(
        ComponentAvailableFeaturesClient innerClient,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ApplicationInsightsComponentAvailableFeatures get(String resourceGroupName, String resourceName) {
        ApplicationInsightsComponentAvailableFeaturesInner inner =
            this.serviceClient().get(resourceGroupName, resourceName);
        if (inner != null) {
            return new ApplicationInsightsComponentAvailableFeaturesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentAvailableFeatures> getWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<ApplicationInsightsComponentAvailableFeaturesInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentAvailableFeaturesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ComponentAvailableFeaturesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
