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
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.SqlVirtualMachinesClient;
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.models.SqlVirtualMachineInner;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.SqlVirtualMachine;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.SqlVirtualMachines;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlVirtualMachinesImpl implements SqlVirtualMachines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlVirtualMachinesImpl.class);

    private final SqlVirtualMachinesClient innerClient;

    private final SqlVirtualMachineManager serviceManager;

    public SqlVirtualMachinesImpl(SqlVirtualMachinesClient innerClient, SqlVirtualMachineManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SqlVirtualMachine> listBySqlVmGroup(
        String resourceGroupName, String sqlVirtualMachineGroupName) {
        PagedIterable<SqlVirtualMachineInner> inner =
            this.serviceClient().listBySqlVmGroup(resourceGroupName, sqlVirtualMachineGroupName);
        return Utils.mapPage(inner, inner1 -> new SqlVirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlVirtualMachine> listBySqlVmGroup(
        String resourceGroupName, String sqlVirtualMachineGroupName, Context context) {
        PagedIterable<SqlVirtualMachineInner> inner =
            this.serviceClient().listBySqlVmGroup(resourceGroupName, sqlVirtualMachineGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SqlVirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlVirtualMachine> list() {
        PagedIterable<SqlVirtualMachineInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SqlVirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlVirtualMachine> list(Context context) {
        PagedIterable<SqlVirtualMachineInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SqlVirtualMachineImpl(inner1, this.manager()));
    }

    public SqlVirtualMachine getByResourceGroup(String resourceGroupName, String sqlVirtualMachineName) {
        SqlVirtualMachineInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, sqlVirtualMachineName);
        if (inner != null) {
            return new SqlVirtualMachineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SqlVirtualMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlVirtualMachineName, String expand, Context context) {
        Response<SqlVirtualMachineInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, sqlVirtualMachineName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SqlVirtualMachineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String sqlVirtualMachineName) {
        this.serviceClient().delete(resourceGroupName, sqlVirtualMachineName);
    }

    public void delete(String resourceGroupName, String sqlVirtualMachineName, Context context) {
        this.serviceClient().delete(resourceGroupName, sqlVirtualMachineName, context);
    }

    public PagedIterable<SqlVirtualMachine> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SqlVirtualMachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SqlVirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlVirtualMachine> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SqlVirtualMachineInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SqlVirtualMachineImpl(inner1, this.manager()));
    }

    public SqlVirtualMachine getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlVirtualMachineName = Utils.getValueFromIdByName(id, "sqlVirtualMachines");
        if (sqlVirtualMachineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachines'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, sqlVirtualMachineName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<SqlVirtualMachine> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlVirtualMachineName = Utils.getValueFromIdByName(id, "sqlVirtualMachines");
        if (sqlVirtualMachineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, sqlVirtualMachineName, expand, context);
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
        String sqlVirtualMachineName = Utils.getValueFromIdByName(id, "sqlVirtualMachines");
        if (sqlVirtualMachineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachines'.", id)));
        }
        this.delete(resourceGroupName, sqlVirtualMachineName, Context.NONE);
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
        String sqlVirtualMachineName = Utils.getValueFromIdByName(id, "sqlVirtualMachines");
        if (sqlVirtualMachineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlVirtualMachines'.", id)));
        }
        this.delete(resourceGroupName, sqlVirtualMachineName, context);
    }

    private SqlVirtualMachinesClient serviceClient() {
        return this.innerClient;
    }

    private SqlVirtualMachineManager manager() {
        return this.serviceManager;
    }

    public SqlVirtualMachineImpl define(String name) {
        return new SqlVirtualMachineImpl(name, this.manager());
    }
}
