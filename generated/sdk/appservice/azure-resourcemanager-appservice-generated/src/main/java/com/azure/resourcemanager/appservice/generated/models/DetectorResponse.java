// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner;
import java.util.List;

/** An immutable client-side representation of DetectorResponse. */
@Immutable
public interface DetectorResponse {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the metadata property: metadata for the detector.
     *
     * @return the metadata value.
     */
    DetectorInfo metadata();

    /**
     * Gets the dataset property: Data Set.
     *
     * @return the dataset value.
     */
    List<DiagnosticData> dataset();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner object.
     *
     * @return the inner object.
     */
    DetectorResponseInner innerModel();
}