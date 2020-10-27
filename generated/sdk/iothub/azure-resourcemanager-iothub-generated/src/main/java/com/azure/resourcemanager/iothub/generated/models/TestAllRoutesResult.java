// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.iothub.generated.fluent.models.TestAllRoutesResultInner;
import java.util.List;

/** An immutable client-side representation of TestAllRoutesResult. */
@Immutable
public interface TestAllRoutesResult {
    /**
     * Gets the routes property: JSON-serialized array of matched routes.
     *
     * @return the routes value.
     */
    List<MatchedRoute> routes();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.generated.fluent.models.TestAllRoutesResultInner object.
     *
     * @return the inner object.
     */
    TestAllRoutesResultInner innerModel();
}