// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteCircuitAuthorizationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitAuthorizationInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitAuthorization;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitAuthorizations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExpressRouteCircuitAuthorizationsImpl implements ExpressRouteCircuitAuthorizations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitAuthorizationsImpl.class);

    private final ExpressRouteCircuitAuthorizationsClient innerClient;

    private final NetworkManager serviceManager;

    public ExpressRouteCircuitAuthorizationsImpl(
        ExpressRouteCircuitAuthorizationsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String circuitName, String authorizationName) {
        this.serviceClient().delete(resourceGroupName, circuitName, authorizationName);
    }

    public void delete(String resourceGroupName, String circuitName, String authorizationName, Context context) {
        this.serviceClient().delete(resourceGroupName, circuitName, authorizationName, context);
    }

    public ExpressRouteCircuitAuthorization get(
        String resourceGroupName, String circuitName, String authorizationName) {
        ExpressRouteCircuitAuthorizationInner inner =
            this.serviceClient().get(resourceGroupName, circuitName, authorizationName);
        if (inner != null) {
            return new ExpressRouteCircuitAuthorizationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteCircuitAuthorization> getWithResponse(
        String resourceGroupName, String circuitName, String authorizationName, Context context) {
        Response<ExpressRouteCircuitAuthorizationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, circuitName, authorizationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteCircuitAuthorizationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressRouteCircuitAuthorization> list(String resourceGroupName, String circuitName) {
        PagedIterable<ExpressRouteCircuitAuthorizationInner> inner =
            this.serviceClient().list(resourceGroupName, circuitName);
        return inner.mapPage(inner1 -> new ExpressRouteCircuitAuthorizationImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCircuitAuthorization> list(
        String resourceGroupName, String circuitName, Context context) {
        PagedIterable<ExpressRouteCircuitAuthorizationInner> inner =
            this.serviceClient().list(resourceGroupName, circuitName, context);
        return inner.mapPage(inner1 -> new ExpressRouteCircuitAuthorizationImpl(inner1, this.manager()));
    }

    public ExpressRouteCircuitAuthorization getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.",
                                id)));
        }
        String authorizationName = Utils.getValueFromIdByName(id, "authorizations");
        if (authorizationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'authorizations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, circuitName, authorizationName, Context.NONE).getValue();
    }

    public Response<ExpressRouteCircuitAuthorization> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.",
                                id)));
        }
        String authorizationName = Utils.getValueFromIdByName(id, "authorizations");
        if (authorizationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'authorizations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, circuitName, authorizationName, context);
    }

    private ExpressRouteCircuitAuthorizationsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRouteCircuitAuthorizationImpl define(String name) {
        return new ExpressRouteCircuitAuthorizationImpl(name, this.manager());
    }
}
