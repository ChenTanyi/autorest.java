// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.QueueServicesClient;
import com.azure.resourcemanager.storage.generated.fluent.models.ListQueueServicesInner;
import com.azure.resourcemanager.storage.generated.fluent.models.QueueServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.ListQueueServices;
import com.azure.resourcemanager.storage.generated.models.QueueServiceProperties;
import com.azure.resourcemanager.storage.generated.models.QueueServices;

public final class QueueServicesImpl implements QueueServices {
    private final QueueServicesClient innerClient;

    private final StorageManager serviceManager;

    public QueueServicesImpl(QueueServicesClient innerClient, StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ListQueueServices list(String resourceGroupName, String accountName) {
        ListQueueServicesInner inner = this.serviceClient().list(resourceGroupName, accountName);
        if (inner != null) {
            return new ListQueueServicesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListQueueServices> listWithResponse(String resourceGroupName, String accountName, Context context) {
        Response<ListQueueServicesInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListQueueServicesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public QueueServiceProperties getServiceProperties(String resourceGroupName, String accountName) {
        QueueServicePropertiesInner inner = this.serviceClient().getServiceProperties(resourceGroupName, accountName);
        if (inner != null) {
            return new QueueServicePropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueueServiceProperties> getServicePropertiesWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<QueueServicePropertiesInner> inner =
            this.serviceClient().getServicePropertiesWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueueServicePropertiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private QueueServicesClient serviceClient() {
        return this.innerClient;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    public QueueServicePropertiesImpl define(String name) {
        return new QueueServicePropertiesImpl(name, this.manager());
    }
}
