// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The top level Log Analytics cluster resource container. */
@JsonFlatten
@Fluent
public class ClusterPatch {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterPatch.class);

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The sku properties.
     */
    @JsonProperty(value = "sku")
    private ClusterSku sku;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The associated key properties.
     */
    @JsonProperty(value = "properties.keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /*
     * The cluster's billing type.
     */
    @JsonProperty(value = "properties.billingType")
    private BillingType billingType;

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The sku properties.
     *
     * @return the sku value.
     */
    public ClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku properties.
     *
     * @param sku the sku value to set.
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withSku(ClusterSku sku) {
        this.sku = sku;
        return this;
    }

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
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the keyVaultProperties property: The associated key properties.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The associated key properties.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the billingType property: The cluster's billing type.
     *
     * @return the billingType value.
     */
    public BillingType billingType() {
        return this.billingType;
    }

    /**
     * Set the billingType property: The cluster's billing type.
     *
     * @param billingType the billingType value to set.
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withBillingType(BillingType billingType) {
        this.billingType = billingType;
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
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
    }
}
