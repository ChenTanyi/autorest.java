// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.OperationCollectionInner;
import java.util.List;

/** An immutable client-side representation of OperationCollection. */
public interface OperationCollection {
    /**
     * Gets the value property: A collection of Operation items.
     *
     * @return the value value.
     */
    List<Operation> value();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.generated.fluent.models.OperationCollectionInner object.
     *
     * @return the inner object.
     */
    OperationCollectionInner innerModel();
}
