// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TopicTypePropertiesSupportedScopesForSourceItem. */
public final class TopicTypePropertiesSupportedScopesForSourceItem
    extends ExpandableStringEnum<TopicTypePropertiesSupportedScopesForSourceItem> {
    /** Static value Resource for TopicTypePropertiesSupportedScopesForSourceItem. */
    public static final TopicTypePropertiesSupportedScopesForSourceItem RESOURCE = fromString("Resource");

    /** Static value ResourceGroup for TopicTypePropertiesSupportedScopesForSourceItem. */
    public static final TopicTypePropertiesSupportedScopesForSourceItem RESOURCE_GROUP = fromString("ResourceGroup");

    /** Static value AzureSubscription for TopicTypePropertiesSupportedScopesForSourceItem. */
    public static final TopicTypePropertiesSupportedScopesForSourceItem AZURE_SUBSCRIPTION =
        fromString("AzureSubscription");

    /**
     * Creates or finds a TopicTypePropertiesSupportedScopesForSourceItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TopicTypePropertiesSupportedScopesForSourceItem.
     */
    @JsonCreator
    public static TopicTypePropertiesSupportedScopesForSourceItem fromString(String name) {
        return fromString(name, TopicTypePropertiesSupportedScopesForSourceItem.class);
    }

    /** @return known TopicTypePropertiesSupportedScopesForSourceItem values. */
    public static Collection<TopicTypePropertiesSupportedScopesForSourceItem> values() {
        return values(TopicTypePropertiesSupportedScopesForSourceItem.class);
    }
}
