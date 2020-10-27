// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.resourcemanager.search.generated.SearchManager;
import com.azure.resourcemanager.search.generated.fluent.models.AdminKeyResultInner;
import com.azure.resourcemanager.search.generated.models.AdminKeyResult;

public final class AdminKeyResultImpl implements AdminKeyResult {
    private AdminKeyResultInner innerObject;

    private final SearchManager serviceManager;

    public AdminKeyResultImpl(AdminKeyResultInner innerObject, SearchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public AdminKeyResultInner innerModel() {
        return this.innerObject;
    }

    private SearchManager manager() {
        return this.serviceManager;
    }
}