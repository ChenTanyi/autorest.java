// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.generated.SearchManager;
import com.azure.resourcemanager.search.generated.fluent.QueryKeysClient;
import com.azure.resourcemanager.search.generated.fluent.models.QueryKeyInner;
import com.azure.resourcemanager.search.generated.models.QueryKey;
import com.azure.resourcemanager.search.generated.models.QueryKeys;
import java.util.UUID;

public final class QueryKeysImpl implements QueryKeys {
    private final QueryKeysClient innerClient;

    private final SearchManager serviceManager;

    public QueryKeysImpl(QueryKeysClient innerClient, SearchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QueryKey create(String resourceGroupName, String searchServiceName, String name) {
        QueryKeyInner inner = this.serviceClient().create(resourceGroupName, searchServiceName, name);
        if (inner != null) {
            return new QueryKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryKey> createWithResponse(
        String resourceGroupName, String searchServiceName, String name, UUID clientRequestId, Context context) {
        Response<QueryKeyInner> inner =
            this
                .serviceClient()
                .createWithResponse(resourceGroupName, searchServiceName, name, clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<QueryKey> listBySearchService(String resourceGroupName, String searchServiceName) {
        PagedIterable<QueryKeyInner> inner =
            this.serviceClient().listBySearchService(resourceGroupName, searchServiceName);
        return inner.mapPage(inner1 -> new QueryKeyImpl(inner1, this.manager()));
    }

    public PagedIterable<QueryKey> listBySearchService(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context) {
        PagedIterable<QueryKeyInner> inner =
            this.serviceClient().listBySearchService(resourceGroupName, searchServiceName, clientRequestId, context);
        return inner.mapPage(inner1 -> new QueryKeyImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String searchServiceName, String key) {
        this.serviceClient().delete(resourceGroupName, searchServiceName, key);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String searchServiceName, String key, UUID clientRequestId, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, searchServiceName, key, clientRequestId, context);
    }

    private QueryKeysClient serviceClient() {
        return this.innerClient;
    }

    private SearchManager manager() {
        return this.serviceManager;
    }
}
