// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ExtensionInner;

/** An immutable client-side representation of Extension. */
@Immutable
public interface Extension {
    /**
     * Gets the workspaceId property: The workspace ID for the cluster monitoring extension.
     *
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the primaryKey property: The certificate for the cluster monitoring extensions.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.generated.fluent.models.ExtensionInner object.
     *
     * @return the inner object.
     */
    ExtensionInner innerModel();
}