// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.iothub.generated.fluent.models.PrivateLinkResourcesInner;
import java.util.List;

/** An immutable client-side representation of PrivateLinkResources. */
@Immutable
public interface PrivateLinkResources {
    /**
     * Gets the value property: The list of available private link resources for an IotHub.
     *
     * @return the value value.
     */
    List<GroupIdInformation> value();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.generated.fluent.models.PrivateLinkResourcesInner object.
     *
     * @return the inner object.
     */
    PrivateLinkResourcesInner innerModel();
}
