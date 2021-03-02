// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.resourcemanager.iothub.generated.fluent.models.IotHubQuotaMetricInfoInner;
import com.azure.resourcemanager.iothub.generated.models.IotHubQuotaMetricInfo;

public final class IotHubQuotaMetricInfoImpl implements IotHubQuotaMetricInfo {
    private IotHubQuotaMetricInfoInner innerObject;

    private final com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager;

    IotHubQuotaMetricInfoImpl(
        IotHubQuotaMetricInfoInner innerObject,
        com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public Long maxValue() {
        return this.innerModel().maxValue();
    }

    public IotHubQuotaMetricInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iothub.generated.IotHubManager manager() {
        return this.serviceManager;
    }
}
