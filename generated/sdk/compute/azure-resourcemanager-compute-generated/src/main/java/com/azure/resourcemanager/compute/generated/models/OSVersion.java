// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.OSVersionInner;

/** An immutable client-side representation of OSVersion. */
public interface OSVersion {
    /**
     * Gets the id property: Resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
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
     * Gets the properties property: OS version properties.
     *
     * @return the properties value.
     */
    OSVersionProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.OSVersionInner object.
     *
     * @return the inner object.
     */
    OSVersionInner innerModel();
}