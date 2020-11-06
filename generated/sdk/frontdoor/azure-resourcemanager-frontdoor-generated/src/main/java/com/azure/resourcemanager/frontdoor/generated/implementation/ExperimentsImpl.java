// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.generated.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.generated.fluent.ExperimentsClient;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ExperimentInner;
import com.azure.resourcemanager.frontdoor.generated.models.Experiment;
import com.azure.resourcemanager.frontdoor.generated.models.Experiments;

public final class ExperimentsImpl implements Experiments {
    private final ExperimentsClient innerClient;

    private final FrontDoorManager serviceManager;

    public ExperimentsImpl(ExperimentsClient innerClient, FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Experiment> listByProfile(String resourceGroupName, String profileName) {
        PagedIterable<ExperimentInner> inner = this.serviceClient().listByProfile(resourceGroupName, profileName);
        return inner.mapPage(inner1 -> new ExperimentImpl(inner1, this.manager()));
    }

    public PagedIterable<Experiment> listByProfile(String resourceGroupName, String profileName, Context context) {
        PagedIterable<ExperimentInner> inner =
            this.serviceClient().listByProfile(resourceGroupName, profileName, context);
        return inner.mapPage(inner1 -> new ExperimentImpl(inner1, this.manager()));
    }

    public Experiment get(String resourceGroupName, String profileName, String experimentName) {
        ExperimentInner inner = this.serviceClient().get(resourceGroupName, profileName, experimentName);
        if (inner != null) {
            return new ExperimentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Experiment> getWithResponse(
        String resourceGroupName, String profileName, String experimentName, Context context) {
        Response<ExperimentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, profileName, experimentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExperimentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName, String experimentName) {
        this.serviceClient().delete(resourceGroupName, profileName, experimentName);
    }

    public void delete(String resourceGroupName, String profileName, String experimentName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, experimentName, context);
    }

    public Experiment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String profileName = Utils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        String experimentName = Utils.getValueFromIdByName(id, "Experiments");
        return this.getWithResponse(resourceGroupName, profileName, experimentName, Context.NONE).getValue();
    }

    public Response<Experiment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String profileName = Utils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        String experimentName = Utils.getValueFromIdByName(id, "Experiments");
        return this.getWithResponse(resourceGroupName, profileName, experimentName, context);
    }

    private ExperimentsClient serviceClient() {
        return this.innerClient;
    }

    private FrontDoorManager manager() {
        return this.serviceManager;
    }

    public ExperimentImpl define(String name) {
        return new ExperimentImpl(name, this.manager());
    }
}
