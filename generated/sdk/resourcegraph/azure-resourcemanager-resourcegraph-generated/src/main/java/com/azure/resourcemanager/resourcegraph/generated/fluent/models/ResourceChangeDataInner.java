// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcegraph.generated.models.ChangeType;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourcePropertyChange;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourceSnapshotData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Data on a specific change, represented by a pair of before and after resource snapshots. */
@Fluent
public final class ResourceChangeDataInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceChangeDataInner.class);

    /*
     * The change ID. Valid and unique within the specified resource only.
     */
    @JsonProperty(value = "changeId", required = true)
    private String changeId;

    /*
     * The snapshot before the change.
     */
    @JsonProperty(value = "beforeSnapshot", required = true)
    private ResourceSnapshotData beforeSnapshot;

    /*
     * The snapshot after the change.
     */
    @JsonProperty(value = "afterSnapshot", required = true)
    private ResourceSnapshotData afterSnapshot;

    /*
     * The change type for snapshot. PropertyChanges will be provided in case
     * of Update change type
     */
    @JsonProperty(value = "changeType")
    private ChangeType changeType;

    /*
     * An array of resource property change
     */
    @JsonProperty(value = "propertyChanges")
    private List<ResourcePropertyChange> propertyChanges;

    /**
     * Get the changeId property: The change ID. Valid and unique within the specified resource only.
     *
     * @return the changeId value.
     */
    public String changeId() {
        return this.changeId;
    }

    /**
     * Set the changeId property: The change ID. Valid and unique within the specified resource only.
     *
     * @param changeId the changeId value to set.
     * @return the ResourceChangeDataInner object itself.
     */
    public ResourceChangeDataInner withChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }

    /**
     * Get the beforeSnapshot property: The snapshot before the change.
     *
     * @return the beforeSnapshot value.
     */
    public ResourceSnapshotData beforeSnapshot() {
        return this.beforeSnapshot;
    }

    /**
     * Set the beforeSnapshot property: The snapshot before the change.
     *
     * @param beforeSnapshot the beforeSnapshot value to set.
     * @return the ResourceChangeDataInner object itself.
     */
    public ResourceChangeDataInner withBeforeSnapshot(ResourceSnapshotData beforeSnapshot) {
        this.beforeSnapshot = beforeSnapshot;
        return this;
    }

    /**
     * Get the afterSnapshot property: The snapshot after the change.
     *
     * @return the afterSnapshot value.
     */
    public ResourceSnapshotData afterSnapshot() {
        return this.afterSnapshot;
    }

    /**
     * Set the afterSnapshot property: The snapshot after the change.
     *
     * @param afterSnapshot the afterSnapshot value to set.
     * @return the ResourceChangeDataInner object itself.
     */
    public ResourceChangeDataInner withAfterSnapshot(ResourceSnapshotData afterSnapshot) {
        this.afterSnapshot = afterSnapshot;
        return this;
    }

    /**
     * Get the changeType property: The change type for snapshot. PropertyChanges will be provided in case of Update
     * change type.
     *
     * @return the changeType value.
     */
    public ChangeType changeType() {
        return this.changeType;
    }

    /**
     * Set the changeType property: The change type for snapshot. PropertyChanges will be provided in case of Update
     * change type.
     *
     * @param changeType the changeType value to set.
     * @return the ResourceChangeDataInner object itself.
     */
    public ResourceChangeDataInner withChangeType(ChangeType changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * Get the propertyChanges property: An array of resource property change.
     *
     * @return the propertyChanges value.
     */
    public List<ResourcePropertyChange> propertyChanges() {
        return this.propertyChanges;
    }

    /**
     * Set the propertyChanges property: An array of resource property change.
     *
     * @param propertyChanges the propertyChanges value to set.
     * @return the ResourceChangeDataInner object itself.
     */
    public ResourceChangeDataInner withPropertyChanges(List<ResourcePropertyChange> propertyChanges) {
        this.propertyChanges = propertyChanges;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (changeId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property changeId in model ResourceChangeDataInner"));
        }
        if (beforeSnapshot() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property beforeSnapshot in model ResourceChangeDataInner"));
        } else {
            beforeSnapshot().validate();
        }
        if (afterSnapshot() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property afterSnapshot in model ResourceChangeDataInner"));
        } else {
            afterSnapshot().validate();
        }
        if (propertyChanges() != null) {
            propertyChanges().forEach(e -> e.validate());
        }
    }
}
