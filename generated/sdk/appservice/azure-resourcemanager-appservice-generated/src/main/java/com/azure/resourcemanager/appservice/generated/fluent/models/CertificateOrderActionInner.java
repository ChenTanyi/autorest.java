// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderActionType;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Certificate order action. */
@JsonFlatten
@Immutable
public class CertificateOrderActionInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateOrderActionInner.class);

    /*
     * Action type.
     */
    @JsonProperty(value = "properties.actionType", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateOrderActionType actionType;

    /*
     * Time at which the certificate action was performed.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /**
     * Get the actionType property: Action type.
     *
     * @return the actionType value.
     */
    public CertificateOrderActionType actionType() {
        return this.actionType;
    }

    /**
     * Get the createdAt property: Time at which the certificate action was performed.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
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
