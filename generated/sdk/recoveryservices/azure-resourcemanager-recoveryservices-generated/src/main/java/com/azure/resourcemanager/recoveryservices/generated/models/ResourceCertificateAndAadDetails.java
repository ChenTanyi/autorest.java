// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Certificate details representing the Vault credentials for AAD. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authType")
@JsonTypeName("AzureActiveDirectory")
@Fluent
public final class ResourceCertificateAndAadDetails extends ResourceCertificateDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceCertificateAndAadDetails.class);

    /*
     * AAD tenant authority.
     */
    @JsonProperty(value = "aadAuthority", required = true)
    private String aadAuthority;

    /*
     * AAD tenant Id.
     */
    @JsonProperty(value = "aadTenantId", required = true)
    private String aadTenantId;

    /*
     * AAD service principal clientId.
     */
    @JsonProperty(value = "servicePrincipalClientId", required = true)
    private String servicePrincipalClientId;

    /*
     * AAD service principal ObjectId.
     */
    @JsonProperty(value = "servicePrincipalObjectId", required = true)
    private String servicePrincipalObjectId;

    /*
     * Azure Management Endpoint Audience.
     */
    @JsonProperty(value = "azureManagementEndpointAudience", required = true)
    private String azureManagementEndpointAudience;

    /*
     * Service Resource Id.
     */
    @JsonProperty(value = "serviceResourceId")
    private String serviceResourceId;

    /**
     * Get the aadAuthority property: AAD tenant authority.
     *
     * @return the aadAuthority value.
     */
    public String aadAuthority() {
        return this.aadAuthority;
    }

    /**
     * Set the aadAuthority property: AAD tenant authority.
     *
     * @param aadAuthority the aadAuthority value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withAadAuthority(String aadAuthority) {
        this.aadAuthority = aadAuthority;
        return this;
    }

    /**
     * Get the aadTenantId property: AAD tenant Id.
     *
     * @return the aadTenantId value.
     */
    public String aadTenantId() {
        return this.aadTenantId;
    }

    /**
     * Set the aadTenantId property: AAD tenant Id.
     *
     * @param aadTenantId the aadTenantId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withAadTenantId(String aadTenantId) {
        this.aadTenantId = aadTenantId;
        return this;
    }

    /**
     * Get the servicePrincipalClientId property: AAD service principal clientId.
     *
     * @return the servicePrincipalClientId value.
     */
    public String servicePrincipalClientId() {
        return this.servicePrincipalClientId;
    }

    /**
     * Set the servicePrincipalClientId property: AAD service principal clientId.
     *
     * @param servicePrincipalClientId the servicePrincipalClientId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withServicePrincipalClientId(String servicePrincipalClientId) {
        this.servicePrincipalClientId = servicePrincipalClientId;
        return this;
    }

    /**
     * Get the servicePrincipalObjectId property: AAD service principal ObjectId.
     *
     * @return the servicePrincipalObjectId value.
     */
    public String servicePrincipalObjectId() {
        return this.servicePrincipalObjectId;
    }

    /**
     * Set the servicePrincipalObjectId property: AAD service principal ObjectId.
     *
     * @param servicePrincipalObjectId the servicePrincipalObjectId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withServicePrincipalObjectId(String servicePrincipalObjectId) {
        this.servicePrincipalObjectId = servicePrincipalObjectId;
        return this;
    }

    /**
     * Get the azureManagementEndpointAudience property: Azure Management Endpoint Audience.
     *
     * @return the azureManagementEndpointAudience value.
     */
    public String azureManagementEndpointAudience() {
        return this.azureManagementEndpointAudience;
    }

    /**
     * Set the azureManagementEndpointAudience property: Azure Management Endpoint Audience.
     *
     * @param azureManagementEndpointAudience the azureManagementEndpointAudience value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withAzureManagementEndpointAudience(
        String azureManagementEndpointAudience) {
        this.azureManagementEndpointAudience = azureManagementEndpointAudience;
        return this;
    }

    /**
     * Get the serviceResourceId property: Service Resource Id.
     *
     * @return the serviceResourceId value.
     */
    public String serviceResourceId() {
        return this.serviceResourceId;
    }

    /**
     * Set the serviceResourceId property: Service Resource Id.
     *
     * @param serviceResourceId the serviceResourceId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withServiceResourceId(String serviceResourceId) {
        this.serviceResourceId = serviceResourceId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withCertificate(byte[] certificate) {
        super.withCertificate(certificate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withIssuer(String issuer) {
        super.withIssuer(issuer);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withResourceId(Long resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withSubject(String subject) {
        super.withSubject(subject);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withThumbprint(String thumbprint) {
        super.withThumbprint(thumbprint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withValidFrom(OffsetDateTime validFrom) {
        super.withValidFrom(validFrom);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceCertificateAndAadDetails withValidTo(OffsetDateTime validTo) {
        super.withValidTo(validTo);
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
        if (aadAuthority() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aadAuthority in model ResourceCertificateAndAadDetails"));
        }
        if (aadTenantId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aadTenantId in model ResourceCertificateAndAadDetails"));
        }
        if (servicePrincipalClientId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property servicePrincipalClientId in model"
                            + " ResourceCertificateAndAadDetails"));
        }
        if (servicePrincipalObjectId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property servicePrincipalObjectId in model"
                            + " ResourceCertificateAndAadDetails"));
        }
        if (azureManagementEndpointAudience() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property azureManagementEndpointAudience in model"
                            + " ResourceCertificateAndAadDetails"));
        }
    }
}
