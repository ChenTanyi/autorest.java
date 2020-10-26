// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionResetSharedKeyInner;

/** An immutable client-side representation of ConnectionResetSharedKey. */
@Immutable
public interface ConnectionResetSharedKey {
    /**
     * Gets the keyLength property: The virtual network connection reset shared key length, should between 1 and 128.
     *
     * @return the keyLength value.
     */
    int keyLength();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ConnectionResetSharedKeyInner object.
     *
     * @return the inner object.
     */
    ConnectionResetSharedKeyInner innerModel();
}
