// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.generated.HDInsightManager;
import com.azure.resourcemanager.hdinsight.generated.fluent.ApplicationsClient;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ApplicationInner;
import com.azure.resourcemanager.hdinsight.generated.models.Application;
import com.azure.resourcemanager.hdinsight.generated.models.Applications;

public final class ApplicationsImpl implements Applications {
    private final ApplicationsClient innerClient;

    private final HDInsightManager serviceManager;

    public ApplicationsImpl(ApplicationsClient innerClient, HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Application> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<ApplicationInner> inner = this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return inner.mapPage(inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public PagedIterable<Application> listByCluster(String resourceGroupName, String clusterName, Context context) {
        PagedIterable<ApplicationInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return inner.mapPage(inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public Application get(String resourceGroupName, String clusterName, String applicationName) {
        ApplicationInner inner = this.serviceClient().get(resourceGroupName, clusterName, applicationName);
        if (inner != null) {
            return new ApplicationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Application> getWithResponse(
        String resourceGroupName, String clusterName, String applicationName, Context context) {
        Response<ApplicationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, applicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName);
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName, context);
    }

    private ApplicationsClient serviceClient() {
        return this.innerClient;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }

    public ApplicationImpl define(String name) {
        return new ApplicationImpl(name, this.manager());
    }
}