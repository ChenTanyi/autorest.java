// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.resourcemanager.databoxedge.generated.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: Name of the operation.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: Properties displayed for the operation.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the serviceSpecification property: Service specification.
     *
     * @return the serviceSpecification value.
     */
    ServiceSpecification serviceSpecification();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}
