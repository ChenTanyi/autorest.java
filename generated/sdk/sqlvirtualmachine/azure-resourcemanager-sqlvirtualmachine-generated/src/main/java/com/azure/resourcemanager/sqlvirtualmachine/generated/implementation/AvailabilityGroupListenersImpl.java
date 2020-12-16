// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sqlvirtualmachine.generated.SqlVirtualMachineManager;
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.AvailabilityGroupListenersClient;
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.models.AvailabilityGroupListenerInner;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.AvailabilityGroupListener;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.AvailabilityGroupListeners;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AvailabilityGroupListenersImpl implements AvailabilityGroupListeners {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilityGroupListenersImpl.class);

    private final AvailabilityGroupListenersClient innerClient;

    private final SqlVirtualMachineManager serviceManager;

    public AvailabilityGroupListenersImpl(
        AvailabilityGroupListenersClient innerClient, SqlVirtualMachineManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AvailabilityGroupListener get(
        String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName) {
        AvailabilityGroupListenerInner inner =
            this.serviceClient().get(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName);
        if (inner != null) {
            return new AvailabilityGroupListenerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AvailabilityGroupListener> getWithResponse(
        String resourceGroupName,
        String sqlVirtualMachineGroupName,
        String availabilityGroupListenerName,
        Context context) {
        Response<AvailabilityGroupListenerInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AvailabilityGroupListenerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName) {
        this.serviceClient().delete(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName);
    }

    public void delete(
        String resourceGroupName,
        String sqlVirtualMachineGroupName,
        String availabilityGroupListenerName,
        Context context) {
        this
            .serviceClient()
            .delete(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, context);
    }

    public PagedIterable<AvailabilityGroupListener> listByGroup(
        String resourceGroupName, String sqlVirtualMachineGroupName) {
        PagedIterable<AvailabilityGroupListenerInner> inner =
            this.serviceClient().listByGroup(resourceGroupName, sqlVirtualMachineGroupName);
        return inner.mapPage(inner1 -> new AvailabilityGroupListenerImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilityGroupListener> listByGroup(
        String resourceGroupName, String sqlVirtualMachineGroupName, Context context) {
        PagedIterable<AvailabilityGroupListenerInner> inner =
            this.serviceClient().listByGroup(resourceGroupName, sqlVirtualMachineGroupName, context);
        return inner.mapPage(inner1 -> new AvailabilityGroupListenerImpl(inner1, this.manager()));
    }

    public AvailabilityGroupListener getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlVirtualMachineGroupName = Utils.getValueFromIdByName(id, "sqlVirtualMachineGroups");
        if (sqlVirtualMachineGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachineGroups'.",
                                id)));
        }
        String availabilityGroupListenerName = Utils.getValueFromIdByName(id, "availabilityGroupListeners");
        if (availabilityGroupListenerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilityGroupListeners'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, Context.NONE)
            .getValue();
    }

    public Response<AvailabilityGroupListener> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlVirtualMachineGroupName = Utils.getValueFromIdByName(id, "sqlVirtualMachineGroups");
        if (sqlVirtualMachineGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachineGroups'.",
                                id)));
        }
        String availabilityGroupListenerName = Utils.getValueFromIdByName(id, "availabilityGroupListeners");
        if (availabilityGroupListenerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilityGroupListeners'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlVirtualMachineGroupName = Utils.getValueFromIdByName(id, "sqlVirtualMachineGroups");
        if (sqlVirtualMachineGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachineGroups'.",
                                id)));
        }
        String availabilityGroupListenerName = Utils.getValueFromIdByName(id, "availabilityGroupListeners");
        if (availabilityGroupListenerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilityGroupListeners'.",
                                id)));
        }
        this.delete(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlVirtualMachineGroupName = Utils.getValueFromIdByName(id, "sqlVirtualMachineGroups");
        if (sqlVirtualMachineGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachineGroups'.",
                                id)));
        }
        String availabilityGroupListenerName = Utils.getValueFromIdByName(id, "availabilityGroupListeners");
        if (availabilityGroupListenerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilityGroupListeners'.",
                                id)));
        }
        this.delete(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, context);
    }

    private AvailabilityGroupListenersClient serviceClient() {
        return this.innerClient;
    }

    private SqlVirtualMachineManager manager() {
        return this.serviceManager;
    }

    public AvailabilityGroupListenerImpl define(String name) {
        return new AvailabilityGroupListenerImpl(name, this.manager());
    }
}