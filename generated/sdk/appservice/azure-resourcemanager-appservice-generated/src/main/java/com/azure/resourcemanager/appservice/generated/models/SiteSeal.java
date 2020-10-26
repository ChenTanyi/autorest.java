// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteSealInner;

/** An immutable client-side representation of SiteSeal. */
@Immutable
public interface SiteSeal {
    /**
     * Gets the html property: HTML snippet.
     *
     * @return the html value.
     */
    String html();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SiteSealInner object.
     *
     * @return the inner object.
     */
    SiteSealInner innerModel();
}
