// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.generated.models.CacheItem;
import com.azure.resourcemanager.costmanagement.generated.models.ProxySettingResource;
import com.azure.resourcemanager.costmanagement.generated.models.SettingsPropertiesStartOn;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** State of the myscope setting. */
@JsonFlatten
@Fluent
public class SettingInner extends ProxySettingResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SettingInner.class);

    /*
     * Sets the default scope the current user will see when they sign into
     * Azure Cost Management in the Azure portal.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /*
     * Indicates what scope Cost Management in the Azure portal should default
     * to. Allowed values: LastUsed.
     */
    @JsonProperty(value = "properties.startOn")
    private SettingsPropertiesStartOn startOn;

    /*
     * Array of scopes with additional details used by Cost Management in the
     * Azure portal.
     */
    @JsonProperty(value = "properties.cache")
    private List<CacheItem> cache;

    /**
     * Get the scope property: Sets the default scope the current user will see when they sign into Azure Cost
     * Management in the Azure portal.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Sets the default scope the current user will see when they sign into Azure Cost
     * Management in the Azure portal.
     *
     * @param scope the scope value to set.
     * @return the SettingInner object itself.
     */
    public SettingInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the startOn property: Indicates what scope Cost Management in the Azure portal should default to. Allowed
     * values: LastUsed.
     *
     * @return the startOn value.
     */
    public SettingsPropertiesStartOn startOn() {
        return this.startOn;
    }

    /**
     * Set the startOn property: Indicates what scope Cost Management in the Azure portal should default to. Allowed
     * values: LastUsed.
     *
     * @param startOn the startOn value to set.
     * @return the SettingInner object itself.
     */
    public SettingInner withStartOn(SettingsPropertiesStartOn startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Get the cache property: Array of scopes with additional details used by Cost Management in the Azure portal.
     *
     * @return the cache value.
     */
    public List<CacheItem> cache() {
        return this.cache;
    }

    /**
     * Set the cache property: Array of scopes with additional details used by Cost Management in the Azure portal.
     *
     * @param cache the cache value to set.
     * @return the SettingInner object itself.
     */
    public SettingInner withCache(List<CacheItem> cache) {
        this.cache = cache;
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
        if (cache() != null) {
            cache().forEach(e -> e.validate());
        }
    }
}