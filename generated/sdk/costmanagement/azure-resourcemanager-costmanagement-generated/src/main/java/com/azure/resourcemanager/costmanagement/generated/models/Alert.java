// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.resourcemanager.costmanagement.generated.fluent.models.AlertInner;
import java.util.Map;

/** An immutable client-side representation of Alert. */
public interface Alert {
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
     * Gets the definition property: defines the type of alert.
     *
     * @return the definition value.
     */
    AlertPropertiesDefinition definition();

    /**
     * Gets the description property: Alert description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the source property: Source of alert.
     *
     * @return the source value.
     */
    AlertSource source();

    /**
     * Gets the details property: Alert details.
     *
     * @return the details value.
     */
    AlertPropertiesDetails details();

    /**
     * Gets the costEntityId property: related budget.
     *
     * @return the costEntityId value.
     */
    String costEntityId();

    /**
     * Gets the status property: alert status.
     *
     * @return the status value.
     */
    AlertStatus status();

    /**
     * Gets the creationTime property: dateTime in which alert was created.
     *
     * @return the creationTime value.
     */
    String creationTime();

    /**
     * Gets the closeTime property: dateTime in which alert was closed.
     *
     * @return the closeTime value.
     */
    String closeTime();

    /**
     * Gets the modificationTime property: dateTime in which alert was last modified.
     *
     * @return the modificationTime value.
     */
    String modificationTime();

    /**
     * Gets the statusModificationUsername property: The statusModificationUserName property.
     *
     * @return the statusModificationUsername value.
     */
    String statusModificationUsername();

    /**
     * Gets the statusModificationTime property: dateTime in which the alert status was last modified.
     *
     * @return the statusModificationTime value.
     */
    String statusModificationTime();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.costmanagement.generated.fluent.models.AlertInner object.
     *
     * @return the inner object.
     */
    AlertInner innerModel();
}