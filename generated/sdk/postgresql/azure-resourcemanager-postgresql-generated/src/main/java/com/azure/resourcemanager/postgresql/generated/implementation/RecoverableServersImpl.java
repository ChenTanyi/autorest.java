// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.generated.fluent.RecoverableServersClient;
import com.azure.resourcemanager.postgresql.generated.fluent.models.RecoverableServerResourceInner;
import com.azure.resourcemanager.postgresql.generated.models.RecoverableServerResource;
import com.azure.resourcemanager.postgresql.generated.models.RecoverableServers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RecoverableServersImpl implements RecoverableServers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoverableServersImpl.class);

    private final RecoverableServersClient innerClient;

    private final com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager;

    public RecoverableServersImpl(
        RecoverableServersClient innerClient,
        com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RecoverableServerResource get(String resourceGroupName, String serverName) {
        RecoverableServerResourceInner inner = this.serviceClient().get(resourceGroupName, serverName);
        if (inner != null) {
            return new RecoverableServerResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecoverableServerResource> getWithResponse(
        String resourceGroupName, String serverName, Context context) {
        Response<RecoverableServerResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecoverableServerResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private RecoverableServersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresql.generated.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
