// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.AssetContainerSasInner;
import java.util.List;

/** An immutable client-side representation of AssetContainerSas. */
@Immutable
public interface AssetContainerSas {
    /**
     * Gets the assetContainerSasUrls property: The list of Asset container SAS URLs.
     *
     * @return the assetContainerSasUrls value.
     */
    List<String> assetContainerSasUrls();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.generated.fluent.models.AssetContainerSasInner object.
     *
     * @return the inner object.
     */
    AssetContainerSasInner innerModel();
}
