// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateOrderActionInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of CertificateOrderAction. */
public interface CertificateOrderAction {
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
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the actionType property: Action type.
     *
     * @return the actionType value.
     */
    CertificateOrderActionType actionType();

    /**
     * Gets the createdAt property: Time at which the certificate action was performed.
     *
     * @return the createdAt value.
     */
    OffsetDateTime createdAt();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.CertificateOrderActionInner object.
     *
     * @return the inner object.
     */
    CertificateOrderActionInner innerModel();
}
