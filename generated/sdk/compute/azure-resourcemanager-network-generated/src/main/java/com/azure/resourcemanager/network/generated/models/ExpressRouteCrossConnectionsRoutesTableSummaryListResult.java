// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner;
import java.util.List;

/** An immutable client-side representation of ExpressRouteCrossConnectionsRoutesTableSummaryListResult. */
@Immutable
public interface ExpressRouteCrossConnectionsRoutesTableSummaryListResult {
    /**
     * Gets the value property: A list of the routes table.
     *
     * @return the value value.
     */
    List<ExpressRouteCrossConnectionRoutesTableSummary> value();

    /**
     * Gets the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner
     * object.
     *
     * @return the inner object.
     */
    ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner innerModel();
}
