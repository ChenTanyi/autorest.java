// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.resourcemanager.costmanagement.generated.fluent.models.QueryResultInner;
import com.azure.resourcemanager.costmanagement.generated.models.QueryColumn;
import com.azure.resourcemanager.costmanagement.generated.models.QueryResult;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class QueryResultImpl implements QueryResult {
    private QueryResultInner innerObject;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    QueryResultImpl(
        QueryResultInner innerObject,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public List<QueryColumn> columns() {
        List<QueryColumn> inner = this.innerModel().columns();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<List<Object>> rows() {
        List<List<Object>> inner = this.innerModel().rows();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public QueryResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }
}
