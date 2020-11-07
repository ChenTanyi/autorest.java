// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.generated.fluent.BandwidthSchedulesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.BandwidthScheduleInner;
import com.azure.resourcemanager.databoxedge.generated.models.BandwidthSchedule;
import com.azure.resourcemanager.databoxedge.generated.models.BandwidthSchedules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BandwidthSchedulesImpl implements BandwidthSchedules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BandwidthSchedulesImpl.class);

    private final BandwidthSchedulesClient innerClient;

    private final DataBoxEdgeManager serviceManager;

    public BandwidthSchedulesImpl(BandwidthSchedulesClient innerClient, DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BandwidthSchedule> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<BandwidthScheduleInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return inner.mapPage(inner1 -> new BandwidthScheduleImpl(inner1, this.manager()));
    }

    public PagedIterable<BandwidthSchedule> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context) {
        PagedIterable<BandwidthScheduleInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return inner.mapPage(inner1 -> new BandwidthScheduleImpl(inner1, this.manager()));
    }

    public BandwidthSchedule get(String deviceName, String name, String resourceGroupName) {
        BandwidthScheduleInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new BandwidthScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BandwidthSchedule> getWithResponse(
        String deviceName, String name, String resourceGroupName, Context context) {
        Response<BandwidthScheduleInner> inner =
            this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BandwidthScheduleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String name, String resourceGroupName) {
        this.serviceClient().delete(deviceName, name, resourceGroupName);
    }

    public void delete(String deviceName, String name, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, name, resourceGroupName, context);
    }

    public BandwidthSchedule getById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "bandwidthSchedules");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bandwidthSchedules'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, Context.NONE).getValue();
    }

    public Response<BandwidthSchedule> getByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "bandwidthSchedules");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bandwidthSchedules'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, context);
    }

    private BandwidthSchedulesClient serviceClient() {
        return this.innerClient;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public BandwidthScheduleImpl define(String name) {
        return new BandwidthScheduleImpl(name, this.manager());
    }
}
