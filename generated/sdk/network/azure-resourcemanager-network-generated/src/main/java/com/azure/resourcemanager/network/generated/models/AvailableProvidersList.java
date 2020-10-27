// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.fluent.models.AvailableProvidersListInner;
import java.util.List;

/** An immutable client-side representation of AvailableProvidersList. */
@Immutable
public interface AvailableProvidersList {
    /**
     * Gets the countries property: List of available countries.
     *
     * @return the countries value.
     */
    List<AvailableProvidersListCountry> countries();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.AvailableProvidersListInner object.
     *
     * @return the inner object.
     */
    AvailableProvidersListInner innerModel();
}
