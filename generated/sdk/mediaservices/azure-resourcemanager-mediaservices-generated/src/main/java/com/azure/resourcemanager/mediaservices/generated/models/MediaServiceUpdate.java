// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** A Media Services account update. */
@JsonFlatten
@Fluent
public class MediaServiceUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MediaServiceUpdate.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The Managed Identity for the Media Services account.
     */
    @JsonProperty(value = "identity")
    private MediaServiceIdentity identity;

    /*
     * The Media Services account ID.
     */
    @JsonProperty(value = "properties.mediaServiceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID mediaServiceId;

    /*
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<StorageAccount> storageAccounts;

    /*
     * The storageAuthentication property.
     */
    @JsonProperty(value = "properties.storageAuthentication")
    private StorageAuthentication storageAuthentication;

    /*
     * The account encryption properties.
     */
    @JsonProperty(value = "properties.encryption")
    private AccountEncryption encryption;

    /*
     * The Key Delivery properties for Media Services account.
     */
    @JsonProperty(value = "properties.keyDelivery")
    private KeyDelivery keyDelivery;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The Managed Identity for the Media Services account.
     *
     * @return the identity value.
     */
    public MediaServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The Managed Identity for the Media Services account.
     *
     * @param identity the identity value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withIdentity(MediaServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the mediaServiceId property: The Media Services account ID.
     *
     * @return the mediaServiceId value.
     */
    public UUID mediaServiceId() {
        return this.mediaServiceId;
    }

    /**
     * Get the storageAccounts property: The storage accounts for this resource.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts property: The storage accounts for this resource.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the storageAuthentication property: The storageAuthentication property.
     *
     * @return the storageAuthentication value.
     */
    public StorageAuthentication storageAuthentication() {
        return this.storageAuthentication;
    }

    /**
     * Set the storageAuthentication property: The storageAuthentication property.
     *
     * @param storageAuthentication the storageAuthentication value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withStorageAuthentication(StorageAuthentication storageAuthentication) {
        this.storageAuthentication = storageAuthentication;
        return this;
    }

    /**
     * Get the encryption property: The account encryption properties.
     *
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The account encryption properties.
     *
     * @param encryption the encryption value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withEncryption(AccountEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the keyDelivery property: The Key Delivery properties for Media Services account.
     *
     * @return the keyDelivery value.
     */
    public KeyDelivery keyDelivery() {
        return this.keyDelivery;
    }

    /**
     * Set the keyDelivery property: The Key Delivery properties for Media Services account.
     *
     * @param keyDelivery the keyDelivery value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withKeyDelivery(KeyDelivery keyDelivery) {
        this.keyDelivery = keyDelivery;
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
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (keyDelivery() != null) {
            keyDelivery().validate();
        }
    }
}
