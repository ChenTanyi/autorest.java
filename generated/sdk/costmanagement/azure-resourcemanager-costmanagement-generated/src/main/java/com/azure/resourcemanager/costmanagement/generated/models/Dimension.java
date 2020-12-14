// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.resourcemanager.costmanagement.generated.fluent.models.DimensionInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Dimension. */
public interface Dimension {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the description property: Dimension description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the filterEnabled property: Filter enabled.
     *
     * @return the filterEnabled value.
     */
    Boolean filterEnabled();

    /**
     * Gets the groupingEnabled property: Grouping enabled.
     *
     * @return the groupingEnabled value.
     */
    Boolean groupingEnabled();

    /**
     * Gets the data property: The data property.
     *
     * @return the data value.
     */
    List<String> data();

    /**
     * Gets the total property: Total number of data for the dimension.
     *
     * @return the total value.
     */
    Integer total();

    /**
     * Gets the category property: Dimension category.
     *
     * @return the category value.
     */
    String category();

    /**
     * Gets the usageStart property: Usage start.
     *
     * @return the usageStart value.
     */
    OffsetDateTime usageStart();

    /**
     * Gets the usageEnd property: Usage end.
     *
     * @return the usageEnd value.
     */
    OffsetDateTime usageEnd();

    /**
     * Gets the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.costmanagement.generated.fluent.models.DimensionInner object.
     *
     * @return the inner object.
     */
    DimensionInner innerModel();
}
