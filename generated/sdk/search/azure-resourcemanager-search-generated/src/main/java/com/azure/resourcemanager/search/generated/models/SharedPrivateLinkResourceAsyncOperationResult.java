// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SharedPrivateLinkResourceAsyncOperationResult. */
public final class SharedPrivateLinkResourceAsyncOperationResult
    extends ExpandableStringEnum<SharedPrivateLinkResourceAsyncOperationResult> {
    /** Static value Running for SharedPrivateLinkResourceAsyncOperationResult. */
    public static final SharedPrivateLinkResourceAsyncOperationResult RUNNING = fromString("Running");

    /** Static value Succeeded for SharedPrivateLinkResourceAsyncOperationResult. */
    public static final SharedPrivateLinkResourceAsyncOperationResult SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for SharedPrivateLinkResourceAsyncOperationResult. */
    public static final SharedPrivateLinkResourceAsyncOperationResult FAILED = fromString("Failed");

    /**
     * Creates or finds a SharedPrivateLinkResourceAsyncOperationResult from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SharedPrivateLinkResourceAsyncOperationResult.
     */
    @JsonCreator
    public static SharedPrivateLinkResourceAsyncOperationResult fromString(String name) {
        return fromString(name, SharedPrivateLinkResourceAsyncOperationResult.class);
    }

    /** @return known SharedPrivateLinkResourceAsyncOperationResult values. */
    public static Collection<SharedPrivateLinkResourceAsyncOperationResult> values() {
        return values(SharedPrivateLinkResourceAsyncOperationResult.class);
    }
}
