// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.resourcemanager.postgresql.generated.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.generated.fluent.models.PerformanceTierPropertiesInner;
import com.azure.resourcemanager.postgresql.generated.models.PerformanceTierProperties;
import com.azure.resourcemanager.postgresql.generated.models.PerformanceTierServiceLevelObjectives;
import java.util.Collections;
import java.util.List;

public final class PerformanceTierPropertiesImpl implements PerformanceTierProperties {
    private PerformanceTierPropertiesInner innerObject;

    private final PostgreSqlManager serviceManager;

    public PerformanceTierPropertiesImpl(PerformanceTierPropertiesInner innerObject, PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives() {
        List<PerformanceTierServiceLevelObjectives> inner = this.innerModel().serviceLevelObjectives();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public PerformanceTierPropertiesInner innerModel() {
        return this.innerObject;
    }

    private PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
