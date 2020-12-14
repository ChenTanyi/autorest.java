// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.generated.CostManagementManager;
import com.azure.resourcemanager.costmanagement.generated.fluent.QueriesClient;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.QueryResultInner;
import com.azure.resourcemanager.costmanagement.generated.models.ExternalCloudProviderType;
import com.azure.resourcemanager.costmanagement.generated.models.Queries;
import com.azure.resourcemanager.costmanagement.generated.models.QueryDefinition;
import com.azure.resourcemanager.costmanagement.generated.models.QueryResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class QueriesImpl implements Queries {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueriesImpl.class);

    private final QueriesClient innerClient;

    private final CostManagementManager serviceManager;

    public QueriesImpl(QueriesClient innerClient, CostManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QueryResult usage(String scope, QueryDefinition parameters) {
        QueryResultInner inner = this.serviceClient().usage(scope, parameters);
        if (inner != null) {
            return new QueryResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryResult> usageWithResponse(String scope, QueryDefinition parameters, Context context) {
        Response<QueryResultInner> inner = this.serviceClient().usageWithResponse(scope, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public QueryResult usageByExternalCloudProviderType(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        QueryDefinition parameters) {
        QueryResultInner inner =
            this
                .serviceClient()
                .usageByExternalCloudProviderType(externalCloudProviderType, externalCloudProviderId, parameters);
        if (inner != null) {
            return new QueryResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryResult> usageByExternalCloudProviderTypeWithResponse(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        QueryDefinition parameters,
        Context context) {
        Response<QueryResultInner> inner =
            this
                .serviceClient()
                .usageByExternalCloudProviderTypeWithResponse(
                    externalCloudProviderType, externalCloudProviderId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private QueriesClient serviceClient() {
        return this.innerClient;
    }

    private CostManagementManager manager() {
        return this.serviceManager;
    }
}
