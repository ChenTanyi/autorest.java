// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.locks.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.locks.generated.LocksManager;
import com.azure.resourcemanager.locks.generated.fluent.AuthorizationOperationsClient;
import com.azure.resourcemanager.locks.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.locks.generated.models.AuthorizationOperations;
import com.azure.resourcemanager.locks.generated.models.Operation;

public final class AuthorizationOperationsImpl implements AuthorizationOperations {
    private final AuthorizationOperationsClient innerClient;

    private final LocksManager serviceManager;

    public AuthorizationOperationsImpl(AuthorizationOperationsClient innerClient, LocksManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Operation> list() {
        PagedIterable<OperationInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new OperationImpl(inner1, this.manager()));
    }

    public PagedIterable<Operation> list(Context context) {
        PagedIterable<OperationInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new OperationImpl(inner1, this.manager()));
    }

    private AuthorizationOperationsClient serviceClient() {
        return this.innerClient;
    }

    private LocksManager manager() {
        return this.serviceManager;
    }
}