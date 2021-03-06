// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.resourcemanager.mysql.generated.fluent.models.QueryPerformanceInsightResetDataResultInner;
import com.azure.resourcemanager.mysql.generated.models.QueryPerformanceInsightResetDataResult;
import com.azure.resourcemanager.mysql.generated.models.QueryPerformanceInsightResetDataResultState;

public final class QueryPerformanceInsightResetDataResultImpl implements QueryPerformanceInsightResetDataResult {
    private QueryPerformanceInsightResetDataResultInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    QueryPerformanceInsightResetDataResultImpl(
        QueryPerformanceInsightResetDataResultInner innerObject,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public QueryPerformanceInsightResetDataResultState status() {
        return this.innerModel().status();
    }

    public String message() {
        return this.innerModel().message();
    }

    public QueryPerformanceInsightResetDataResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
