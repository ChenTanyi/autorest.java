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
import com.azure.resourcemanager.databoxedge.generated.fluent.RolesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.RoleInner;
import com.azure.resourcemanager.databoxedge.generated.models.Role;
import com.azure.resourcemanager.databoxedge.generated.models.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RolesImpl implements Roles {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RolesImpl.class);

    private final RolesClient innerClient;

    private final DataBoxEdgeManager serviceManager;

    public RolesImpl(RolesClient innerClient, DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Role> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<RoleInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return inner.mapPage(inner1 -> new RoleImpl(inner1, this.manager()));
    }

    public PagedIterable<Role> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context) {
        PagedIterable<RoleInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return inner.mapPage(inner1 -> new RoleImpl(inner1, this.manager()));
    }

    public Role get(String deviceName, String name, String resourceGroupName) {
        RoleInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new RoleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Role> getWithResponse(String deviceName, String name, String resourceGroupName, Context context) {
        Response<RoleInner> inner = this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Role createOrUpdate(String deviceName, String name, String resourceGroupName, RoleInner role) {
        RoleInner inner = this.serviceClient().createOrUpdate(deviceName, name, resourceGroupName, role);
        if (inner != null) {
            return new RoleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Role createOrUpdate(
        String deviceName, String name, String resourceGroupName, RoleInner role, Context context) {
        RoleInner inner = this.serviceClient().createOrUpdate(deviceName, name, resourceGroupName, role, context);
        if (inner != null) {
            return new RoleImpl(inner, this.manager());
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

    private RolesClient serviceClient() {
        return this.innerClient;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
