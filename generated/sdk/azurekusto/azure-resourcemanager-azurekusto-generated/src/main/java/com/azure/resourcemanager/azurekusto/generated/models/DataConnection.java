// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.resourcemanager.azurekusto.generated.fluent.models.DataConnectionInner;

/** An immutable client-side representation of DataConnection. */
public interface DataConnection {
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
     * Gets the location property: Resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the inner com.azure.resourcemanager.azurekusto.generated.fluent.models.DataConnectionInner object.
     *
     * @return the inner object.
     */
    DataConnectionInner innerModel();
}
