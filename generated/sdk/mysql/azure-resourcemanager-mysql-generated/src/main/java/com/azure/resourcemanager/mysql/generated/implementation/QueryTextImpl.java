// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.resourcemanager.mysql.generated.MySqlManager;
import com.azure.resourcemanager.mysql.generated.fluent.models.QueryTextInner;
import com.azure.resourcemanager.mysql.generated.models.QueryText;

public final class QueryTextImpl implements QueryText {
    private QueryTextInner innerObject;

    private final MySqlManager serviceManager;

    public QueryTextImpl(QueryTextInner innerObject, MySqlManager serviceManager) {
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

    public String queryId() {
        return this.innerModel().queryId();
    }

    public String queryText() {
        return this.innerModel().queryText();
    }

    public QueryTextInner innerModel() {
        return this.innerObject;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}