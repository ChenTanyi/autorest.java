// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExternalCloudProviderType. */
public final class ExternalCloudProviderType extends ExpandableStringEnum<ExternalCloudProviderType> {
    /** Static value externalSubscriptions for ExternalCloudProviderType. */
    public static final ExternalCloudProviderType EXTERNAL_SUBSCRIPTIONS = fromString("externalSubscriptions");

    /** Static value externalBillingAccounts for ExternalCloudProviderType. */
    public static final ExternalCloudProviderType EXTERNAL_BILLING_ACCOUNTS = fromString("externalBillingAccounts");

    /**
     * Creates or finds a ExternalCloudProviderType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExternalCloudProviderType.
     */
    @JsonCreator
    public static ExternalCloudProviderType fromString(String name) {
        return fromString(name, ExternalCloudProviderType.class);
    }

    /** @return known ExternalCloudProviderType values. */
    public static Collection<ExternalCloudProviderType> values() {
        return values(ExternalCloudProviderType.class);
    }
}