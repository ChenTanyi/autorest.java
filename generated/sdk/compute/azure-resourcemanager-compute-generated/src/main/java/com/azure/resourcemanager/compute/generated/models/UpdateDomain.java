// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.UpdateDomainInner;

/** An immutable client-side representation of UpdateDomain. */
public interface UpdateDomain {
    /**
     * Gets the id property: Resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource Name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.UpdateDomainInner object.
     *
     * @return the inner object.
     */
    UpdateDomainInner innerModel();
}