// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Slot Config names azure resource. */
@JsonFlatten
@Fluent
public class SlotConfigNamesResourceInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SlotConfigNamesResourceInner.class);

    /*
     * List of connection string names.
     */
    @JsonProperty(value = "properties.connectionStringNames")
    private List<String> connectionStringNames;

    /*
     * List of application settings names.
     */
    @JsonProperty(value = "properties.appSettingNames")
    private List<String> appSettingNames;

    /*
     * List of external Azure storage account identifiers.
     */
    @JsonProperty(value = "properties.azureStorageConfigNames")
    private List<String> azureStorageConfigNames;

    /**
     * Get the connectionStringNames property: List of connection string names.
     *
     * @return the connectionStringNames value.
     */
    public List<String> connectionStringNames() {
        return this.connectionStringNames;
    }

    /**
     * Set the connectionStringNames property: List of connection string names.
     *
     * @param connectionStringNames the connectionStringNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withConnectionStringNames(List<String> connectionStringNames) {
        this.connectionStringNames = connectionStringNames;
        return this;
    }

    /**
     * Get the appSettingNames property: List of application settings names.
     *
     * @return the appSettingNames value.
     */
    public List<String> appSettingNames() {
        return this.appSettingNames;
    }

    /**
     * Set the appSettingNames property: List of application settings names.
     *
     * @param appSettingNames the appSettingNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withAppSettingNames(List<String> appSettingNames) {
        this.appSettingNames = appSettingNames;
        return this;
    }

    /**
     * Get the azureStorageConfigNames property: List of external Azure storage account identifiers.
     *
     * @return the azureStorageConfigNames value.
     */
    public List<String> azureStorageConfigNames() {
        return this.azureStorageConfigNames;
    }

    /**
     * Set the azureStorageConfigNames property: List of external Azure storage account identifiers.
     *
     * @param azureStorageConfigNames the azureStorageConfigNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withAzureStorageConfigNames(List<String> azureStorageConfigNames) {
        this.azureStorageConfigNames = azureStorageConfigNames;
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
    }
}
