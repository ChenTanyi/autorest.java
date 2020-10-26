// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.AzureStorageInfoValue;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** AzureStorageInfo dictionary resource. */
@Fluent
public final class AzureStoragePropertyDictionaryResourceInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureStoragePropertyDictionaryResourceInner.class);

    /*
     * Azure storage accounts.
     */
    @JsonProperty(value = "properties")
    private Map<String, AzureStorageInfoValue> properties;

    /**
     * Get the properties property: Azure storage accounts.
     *
     * @return the properties value.
     */
    public Map<String, AzureStorageInfoValue> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Azure storage accounts.
     *
     * @param properties the properties value to set.
     * @return the AzureStoragePropertyDictionaryResourceInner object itself.
     */
    public AzureStoragePropertyDictionaryResourceInner withProperties(Map<String, AzureStorageInfoValue> properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
