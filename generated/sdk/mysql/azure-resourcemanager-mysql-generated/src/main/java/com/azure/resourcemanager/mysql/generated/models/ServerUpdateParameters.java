// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.credential.TokenCredential;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters allowed to update for a server. */
@JsonFlatten
@Fluent
public class ServerUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerUpdateParameters.class);

    /*
     * The Azure Active Directory identity of the server.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The SKU (pricing tier) of the server.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Application-specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Storage profile of a server.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /*
     * The password of the administrator login.
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private TokenCredential administratorLoginPassword;

    /*
     * The version of a server.
     */
    @JsonProperty(value = "properties.version")
    private ServerVersion version;

    /*
     * Enable ssl enforcement or not when connect to server.
     */
    @JsonProperty(value = "properties.sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /*
     * Enforce a minimal Tls version for the server.
     */
    @JsonProperty(value = "properties.minimalTlsVersion")
    private MinimalTlsVersionEnum minimalTlsVersion;

    /*
     * Whether or not public network access is allowed for this server. Value
     * is optional but if passed in, must be 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccessEnum publicNetworkAccess;

    /*
     * The replication role of the server.
     */
    @JsonProperty(value = "properties.replicationRole")
    private String replicationRole;

    /**
     * Get the identity property: The Azure Active Directory identity of the server.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The Azure Active Directory identity of the server.
     *
     * @param identity the identity value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The SKU (pricing tier) of the server.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU (pricing tier) of the server.
     *
     * @param sku the sku value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @param tags the tags value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the storageProfile property: Storage profile of a server.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Storage profile of a server.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     *
     * @return the administratorLoginPassword value.
     */
    public TokenCredential administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withAdministratorLoginPassword(TokenCredential administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: The version of a server.
     *
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: The version of a server.
     *
     * @param version the version value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     *
     * @return the sslEnforcement value.
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     *
     * @param sslEnforcement the sslEnforcement value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     *
     * @return the minimalTlsVersion value.
     */
    public MinimalTlsVersionEnum minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     *
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessEnum publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the replicationRole property: The replication role of the server.
     *
     * @return the replicationRole value.
     */
    public String replicationRole() {
        return this.replicationRole;
    }

    /**
     * Set the replicationRole property: The replication role of the server.
     *
     * @param replicationRole the replicationRole value to set.
     * @return the ServerUpdateParameters object itself.
     */
    public ServerUpdateParameters withReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }
}
