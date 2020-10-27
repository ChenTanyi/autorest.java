// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.ClustersClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AvailableClustersListInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ClusterInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EHNamespaceIdListResultInner;
import com.azure.resourcemanager.eventhubs.generated.models.AvailableClustersList;
import com.azure.resourcemanager.eventhubs.generated.models.Cluster;
import com.azure.resourcemanager.eventhubs.generated.models.Clusters;
import com.azure.resourcemanager.eventhubs.generated.models.EHNamespaceIdListResult;

public final class ClustersImpl implements Clusters {
    private final ClustersClient innerClient;

    private final EventHubManager serviceManager;

    public ClustersImpl(ClustersClient innerClient, EventHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AvailableClustersList listAvailableClusterRegion() {
        AvailableClustersListInner inner = this.serviceClient().listAvailableClusterRegion();
        if (inner != null) {
            return new AvailableClustersListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AvailableClustersList> listAvailableClusterRegionWithResponse(Context context) {
        Response<AvailableClustersListInner> inner =
            this.serviceClient().listAvailableClusterRegionWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AvailableClustersListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public Cluster getByResourceGroup(String resourceGroupName, String clusterName) {
        ClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, clusterName);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Cluster> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<ClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public void delete(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, context);
    }

    public EHNamespaceIdListResult listNamespaces(String resourceGroupName, String clusterName) {
        EHNamespaceIdListResultInner inner = this.serviceClient().listNamespaces(resourceGroupName, clusterName);
        if (inner != null) {
            return new EHNamespaceIdListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EHNamespaceIdListResult> listNamespacesWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<EHNamespaceIdListResultInner> inner =
            this.serviceClient().listNamespacesWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EHNamespaceIdListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ClustersClient serviceClient() {
        return this.innerClient;
    }

    private EventHubManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}
