// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.UsagesListResultInner;
import java.util.List;

/** An immutable client-side representation of UsagesListResult. */
@Immutable
public interface UsagesListResult {
    /**
     * Gets the value property: The list of usages.
     *
     * @return the value value.
     */
    List<Usage> value();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.generated.fluent.models.UsagesListResultInner object.
     *
     * @return the inner object.
     */
    UsagesListResultInner innerModel();
}
