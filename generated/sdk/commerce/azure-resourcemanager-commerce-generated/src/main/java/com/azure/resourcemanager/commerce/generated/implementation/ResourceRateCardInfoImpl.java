// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated.implementation;

import com.azure.resourcemanager.commerce.generated.fluent.models.ResourceRateCardInfoInner;
import com.azure.resourcemanager.commerce.generated.models.MeterInfo;
import com.azure.resourcemanager.commerce.generated.models.OfferTermInfo;
import com.azure.resourcemanager.commerce.generated.models.ResourceRateCardInfo;
import java.util.Collections;
import java.util.List;

public final class ResourceRateCardInfoImpl implements ResourceRateCardInfo {
    private ResourceRateCardInfoInner innerObject;

    private final com.azure.resourcemanager.commerce.generated.UsageManager serviceManager;

    ResourceRateCardInfoImpl(
        ResourceRateCardInfoInner innerObject,
        com.azure.resourcemanager.commerce.generated.UsageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String currency() {
        return this.innerModel().currency();
    }

    public String locale() {
        return this.innerModel().locale();
    }

    public Boolean isTaxIncluded() {
        return this.innerModel().isTaxIncluded();
    }

    public List<OfferTermInfo> offerTerms() {
        List<OfferTermInfo> inner = this.innerModel().offerTerms();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<MeterInfo> meters() {
        List<MeterInfo> inner = this.innerModel().meters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceRateCardInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.commerce.generated.UsageManager manager() {
        return this.serviceManager;
    }
}
