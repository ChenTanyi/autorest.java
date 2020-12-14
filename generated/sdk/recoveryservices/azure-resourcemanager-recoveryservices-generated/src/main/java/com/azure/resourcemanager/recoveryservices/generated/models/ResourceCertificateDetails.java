// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Certificate details representing the Vault credentials. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "authType",
    defaultImpl = ResourceCertificateDetails.class)
@JsonTypeName("ResourceCertificateDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureActiveDirectory", value = ResourceCertificateAndAadDetails.class),
    @JsonSubTypes.Type(name = "AccessControlService", value = ResourceCertificateAndAcsDetails.class)
})
@Fluent
public class ResourceCertificateDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceCertificateDetails.class);

    /*
     * The base64 encoded certificate raw data string.
     */
    @JsonProperty(value = "certificate")
    private byte[] certificate;

    /*
     * Certificate friendly name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Certificate issuer.
     */
    @JsonProperty(value = "issuer")
    private String issuer;

    /*
     * Resource ID of the vault.
     */
    @JsonProperty(value = "resourceId")
    private Long resourceId;

    /*
     * Certificate Subject Name.
     */
    @JsonProperty(value = "subject")
    private String subject;

    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * Certificate Validity start Date time.
     */
    @JsonProperty(value = "validFrom")
    private OffsetDateTime validFrom;

    /*
     * Certificate Validity End Date time.
     */
    @JsonProperty(value = "validTo")
    private OffsetDateTime validTo;

    /**
     * Get the certificate property: The base64 encoded certificate raw data string.
     *
     * @return the certificate value.
     */
    public byte[] certificate() {
        return CoreUtils.clone(this.certificate);
    }

    /**
     * Set the certificate property: The base64 encoded certificate raw data string.
     *
     * @param certificate the certificate value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withCertificate(byte[] certificate) {
        this.certificate = CoreUtils.clone(certificate);
        return this;
    }

    /**
     * Get the friendlyName property: Certificate friendly name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Certificate friendly name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the issuer property: Certificate issuer.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: Certificate issuer.
     *
     * @param issuer the issuer value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the resourceId property: Resource ID of the vault.
     *
     * @return the resourceId value.
     */
    public Long resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource ID of the vault.
     *
     * @param resourceId the resourceId value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the subject property: Certificate Subject Name.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Certificate Subject Name.
     *
     * @param subject the subject value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the validFrom property: Certificate Validity start Date time.
     *
     * @return the validFrom value.
     */
    public OffsetDateTime validFrom() {
        return this.validFrom;
    }

    /**
     * Set the validFrom property: Certificate Validity start Date time.
     *
     * @param validFrom the validFrom value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Get the validTo property: Certificate Validity End Date time.
     *
     * @return the validTo value.
     */
    public OffsetDateTime validTo() {
        return this.validTo;
    }

    /**
     * Set the validTo property: Certificate Validity End Date time.
     *
     * @param validTo the validTo value to set.
     * @return the ResourceCertificateDetails object itself.
     */
    public ResourceCertificateDetails withValidTo(OffsetDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
