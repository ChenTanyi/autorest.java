// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.resourcemanager.resourcegraph.generated.fluent.models.ResourceChangeDataInner;
import java.util.List;

/** An immutable client-side representation of ResourceChangeData. */
public interface ResourceChangeData {
    /**
     * Gets the resourceId property: The ID of the resource.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the changeId property: The change ID. Valid and unique within the specified resource only.
     *
     * @return the changeId value.
     */
    String changeId();

    /**
     * Gets the beforeSnapshot property: The snapshot before the change.
     *
     * @return the beforeSnapshot value.
     */
    ResourceSnapshotData beforeSnapshot();

    /**
     * Gets the afterSnapshot property: The snapshot after the change.
     *
     * @return the afterSnapshot value.
     */
    ResourceSnapshotData afterSnapshot();

    /**
     * Gets the changeType property: The change type for snapshot. PropertyChanges will be provided in case of Update
     * change type.
     *
     * @return the changeType value.
     */
    ChangeType changeType();

    /**
     * Gets the propertyChanges property: An array of resource property change.
     *
     * @return the propertyChanges value.
     */
    List<ResourcePropertyChange> propertyChanges();

    /**
     * Gets the inner com.azure.resourcemanager.resourcegraph.generated.fluent.models.ResourceChangeDataInner object.
     *
     * @return the inner object.
     */
    ResourceChangeDataInner innerModel();
}
