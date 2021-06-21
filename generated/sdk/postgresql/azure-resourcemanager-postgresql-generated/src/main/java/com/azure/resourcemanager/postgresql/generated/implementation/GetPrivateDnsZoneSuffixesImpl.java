// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.generated.fluent.GetPrivateDnsZoneSuffixesClient;
import com.azure.resourcemanager.postgresql.generated.models.GetPrivateDnsZoneSuffixes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GetPrivateDnsZoneSuffixesImpl implements GetPrivateDnsZoneSuffixes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GetPrivateDnsZoneSuffixesImpl.class);

    private final GetPrivateDnsZoneSuffixesClient innerClient;

    private final com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager;

    public GetPrivateDnsZoneSuffixesImpl(
        GetPrivateDnsZoneSuffixesClient innerClient,
        com.azure.resourcemanager.postgresql.generated.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public String execute() {
        return this.serviceClient().execute();
    }

    public Response<String> executeWithResponse(Context context) {
        return this.serviceClient().executeWithResponse(context);
    }

    private GetPrivateDnsZoneSuffixesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresql.generated.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
