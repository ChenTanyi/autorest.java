// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.TableServicesClient;
import com.azure.resourcemanager.storage.generated.fluent.models.ListTableServicesInner;
import com.azure.resourcemanager.storage.generated.fluent.models.TableServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.ListTableServices;
import com.azure.resourcemanager.storage.generated.models.TableServiceProperties;
import com.azure.resourcemanager.storage.generated.models.TableServices;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TableServicesImpl implements TableServices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TableServicesImpl.class);

    private final TableServicesClient innerClient;

    private final StorageManager serviceManager;

    public TableServicesImpl(TableServicesClient innerClient, StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ListTableServices list(String resourceGroupName, String accountName) {
        ListTableServicesInner inner = this.serviceClient().list(resourceGroupName, accountName);
        if (inner != null) {
            return new ListTableServicesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListTableServices> listWithResponse(String resourceGroupName, String accountName, Context context) {
        Response<ListTableServicesInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListTableServicesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TableServiceProperties getServiceProperties(String resourceGroupName, String accountName) {
        TableServicePropertiesInner inner = this.serviceClient().getServiceProperties(resourceGroupName, accountName);
        if (inner != null) {
            return new TableServicePropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TableServiceProperties> getServicePropertiesWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<TableServicePropertiesInner> inner =
            this.serviceClient().getServicePropertiesWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TableServicePropertiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TableServiceProperties getServicePropertiesById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        return this.getServicePropertiesWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<TableServiceProperties> getServicePropertiesByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        return this.getServicePropertiesWithResponse(resourceGroupName, accountName, context);
    }

    private TableServicesClient serviceClient() {
        return this.innerClient;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    public TableServicePropertiesImpl define() {
        return new TableServicePropertiesImpl(this.manager());
    }
}
