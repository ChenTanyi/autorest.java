// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Https settings for a domain. */
@JsonFlatten
@Fluent
public class CustomHttpsConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomHttpsConfiguration.class);

    /*
     * Defines the source of the SSL certificate
     */
    @JsonProperty(value = "certificateSource", required = true)
    private FrontDoorCertificateSource certificateSource;

    /*
     * Defines the TLS extension protocol that is used for secure delivery
     */
    @JsonProperty(value = "protocolType", required = true)
    private FrontDoorTlsProtocolType protocolType;

    /*
     * The minimum TLS version required from the clients to establish an SSL
     * handshake with Front Door.
     */
    @JsonProperty(value = "minimumTlsVersion", required = true)
    private MinimumTlsVersion minimumTlsVersion;

    /*
     * Defines the type of the certificate used for secure connections to a
     * frontendEndpoint
     */
    @JsonProperty(value = "frontDoorCertificateSourceParameters.certificateType")
    private FrontDoorCertificateType certificateType;

    /*
     * The Key Vault containing the SSL certificate
     */
    @JsonProperty(value = "keyVaultCertificateSourceParameters.vault")
    private KeyVaultCertificateSourceParametersVault vault;

    /*
     * The name of the Key Vault secret representing the full certificate PFX
     */
    @JsonProperty(value = "keyVaultCertificateSourceParameters.secretName")
    private String secretName;

    /*
     * The version of the Key Vault secret representing the full certificate
     * PFX
     */
    @JsonProperty(value = "keyVaultCertificateSourceParameters.secretVersion")
    private String secretVersion;

    /**
     * Get the certificateSource property: Defines the source of the SSL certificate.
     *
     * @return the certificateSource value.
     */
    public FrontDoorCertificateSource certificateSource() {
        return this.certificateSource;
    }

    /**
     * Set the certificateSource property: Defines the source of the SSL certificate.
     *
     * @param certificateSource the certificateSource value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withCertificateSource(FrontDoorCertificateSource certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }

    /**
     * Get the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     *
     * @return the protocolType value.
     */
    public FrontDoorTlsProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     *
     * @param protocolType the protocolType value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withProtocolType(FrontDoorTlsProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: The minimum TLS version required from the clients to establish an SSL
     * handshake with Front Door.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: The minimum TLS version required from the clients to establish an SSL
     * handshake with Front Door.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the certificateType property: Defines the type of the certificate used for secure connections to a
     * frontendEndpoint.
     *
     * @return the certificateType value.
     */
    public FrontDoorCertificateType certificateType() {
        return this.certificateType;
    }

    /**
     * Set the certificateType property: Defines the type of the certificate used for secure connections to a
     * frontendEndpoint.
     *
     * @param certificateType the certificateType value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withCertificateType(FrontDoorCertificateType certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * Get the vault property: The Key Vault containing the SSL certificate.
     *
     * @return the vault value.
     */
    public KeyVaultCertificateSourceParametersVault vault() {
        return this.vault;
    }

    /**
     * Set the vault property: The Key Vault containing the SSL certificate.
     *
     * @param vault the vault value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withVault(KeyVaultCertificateSourceParametersVault vault) {
        this.vault = vault;
        return this;
    }

    /**
     * Get the secretName property: The name of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The name of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretName the secretName value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: The version of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: The version of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateSource() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateSource in model CustomHttpsConfiguration"));
        }
        if (protocolType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocolType in model CustomHttpsConfiguration"));
        }
        if (minimumTlsVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property minimumTlsVersion in model CustomHttpsConfiguration"));
        }
        if (vault() != null) {
            vault().validate();
        }
    }
}
