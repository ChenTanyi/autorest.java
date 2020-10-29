// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.authorization.generated.fluent.models.ProviderOperationsMetadataInner;
import java.util.List;

/** An immutable client-side representation of ProviderOperationsMetadata. */
@Immutable
public interface ProviderOperationsMetadata {
    /**
     * Gets the id property: The provider id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The provider name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The provider type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the displayName property: The provider display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the resourceTypes property: The provider resource types.
     *
     * @return the resourceTypes value.
     */
    List<ResourceType> resourceTypes();

    /**
     * Gets the operations property: The provider operations.
     *
     * @return the operations value.
     */
    List<ProviderOperation> operations();

    /**
     * Gets the inner com.azure.resourcemanager.authorization.generated.fluent.models.ProviderOperationsMetadataInner
     * object.
     *
     * @return the inner object.
     */
    ProviderOperationsMetadataInner innerModel();
}
