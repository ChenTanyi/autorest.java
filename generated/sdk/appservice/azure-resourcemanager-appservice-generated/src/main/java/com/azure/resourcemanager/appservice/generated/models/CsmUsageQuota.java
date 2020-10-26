// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmUsageQuotaInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of CsmUsageQuota. */
@Immutable
public interface CsmUsageQuota {
    /**
     * Gets the unit property: Units of measurement for the quota resource.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the nextResetTime property: Next reset time for the resource counter.
     *
     * @return the nextResetTime value.
     */
    OffsetDateTime nextResetTime();

    /**
     * Gets the currentValue property: The current value of the resource counter.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the limit property: The resource limit.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the name property: Quota name.
     *
     * @return the name value.
     */
    LocalizableString name();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.CsmUsageQuotaInner object.
     *
     * @return the inner object.
     */
    CsmUsageQuotaInner innerModel();
}
