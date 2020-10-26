// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.HostKeysInner;
import java.util.Map;

/** An immutable client-side representation of HostKeys. */
@Immutable
public interface HostKeys {
    /**
     * Gets the masterKey property: Secret key.
     *
     * @return the masterKey value.
     */
    String masterKey();

    /**
     * Gets the functionKeys property: Host level function keys.
     *
     * @return the functionKeys value.
     */
    Map<String, String> functionKeys();

    /**
     * Gets the systemKeys property: System keys.
     *
     * @return the systemKeys value.
     */
    Map<String, String> systemKeys();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.HostKeysInner object.
     *
     * @return the inner object.
     */
    HostKeysInner innerModel();
}
