// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.OffsetDateTime;

/** The snapshot after the change. */
@Immutable
public final class ResourceChangeDataAfterSnapshot extends ResourceSnapshotData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceChangeDataAfterSnapshot.class);

    /** {@inheritDoc} */
    @Override
    public ResourceChangeDataAfterSnapshot withSnapshotId(String snapshotId) {
        super.withSnapshotId(snapshotId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceChangeDataAfterSnapshot withTimestamp(OffsetDateTime timestamp) {
        super.withTimestamp(timestamp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceChangeDataAfterSnapshot withContent(Object content) {
        super.withContent(content);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
