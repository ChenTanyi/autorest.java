// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.QueryTextsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.QueryTextInner;
import com.azure.resourcemanager.mysql.generated.models.QueryText;
import com.azure.resourcemanager.mysql.generated.models.QueryTexts;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

public final class QueryTextsImpl implements QueryTexts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryTextsImpl.class);

    private final QueryTextsClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public QueryTextsImpl(
        QueryTextsClient innerClient, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QueryText get(String resourceGroupName, String serverName, String queryId) {
        QueryTextInner inner = this.serviceClient().get(resourceGroupName, serverName, queryId);
        if (inner != null) {
            return new QueryTextImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryText> getWithResponse(
        String resourceGroupName, String serverName, String queryId, Context context) {
        Response<QueryTextInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, queryId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryTextImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<QueryText> listByServer(String resourceGroupName, String serverName, List<String> queryIds) {
        PagedIterable<QueryTextInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, queryIds);
        return Utils.mapPage(inner, inner1 -> new QueryTextImpl(inner1, this.manager()));
    }

    public PagedIterable<QueryText> listByServer(
        String resourceGroupName, String serverName, List<String> queryIds, Context context) {
        PagedIterable<QueryTextInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, queryIds, context);
        return Utils.mapPage(inner, inner1 -> new QueryTextImpl(inner1, this.manager()));
    }

    private QueryTextsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
