// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.ListTableServicesInner;
import com.azure.resourcemanager.storage.generated.fluent.models.TableServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.ListTableServices;
import com.azure.resourcemanager.storage.generated.models.TableServiceProperties;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ListTableServicesImpl implements ListTableServices {
    private ListTableServicesInner innerObject;

    private final StorageManager serviceManager;

    public ListTableServicesImpl(ListTableServicesInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<TableServiceProperties> value() {
        List<TableServicePropertiesInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new TableServicePropertiesImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public ListTableServicesInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}
