// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.AuthorizationManager;
import com.azure.resourcemanager.authorization.generated.fluent.ClassicAdministratorsClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.ClassicAdministratorInner;
import com.azure.resourcemanager.authorization.generated.models.ClassicAdministrator;
import com.azure.resourcemanager.authorization.generated.models.ClassicAdministrators;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ClassicAdministratorsImpl implements ClassicAdministrators {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClassicAdministratorsImpl.class);

    private final ClassicAdministratorsClient innerClient;

    private final AuthorizationManager serviceManager;

    public ClassicAdministratorsImpl(ClassicAdministratorsClient innerClient, AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ClassicAdministrator> list() {
        PagedIterable<ClassicAdministratorInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ClassicAdministratorImpl(inner1, this.manager()));
    }

    public PagedIterable<ClassicAdministrator> list(Context context) {
        PagedIterable<ClassicAdministratorInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ClassicAdministratorImpl(inner1, this.manager()));
    }

    private ClassicAdministratorsClient serviceClient() {
        return this.innerClient;
    }

    private AuthorizationManager manager() {
        return this.serviceManager;
    }
}
