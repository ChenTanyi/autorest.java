// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The storage profile. */
@Fluent
public final class StorageProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageProfile.class);

    /*
     * The list of storage accounts in the cluster.
     */
    @JsonProperty(value = "storageaccounts")
    private List<StorageAccount> storageaccounts;

    /**
     * Get the storageaccounts property: The list of storage accounts in the cluster.
     *
     * @return the storageaccounts value.
     */
    public List<StorageAccount> storageaccounts() {
        return this.storageaccounts;
    }

    /**
     * Set the storageaccounts property: The list of storage accounts in the cluster.
     *
     * @param storageaccounts the storageaccounts value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withStorageaccounts(List<StorageAccount> storageaccounts) {
        this.storageaccounts = storageaccounts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageaccounts() != null) {
            storageaccounts().forEach(e -> e.validate());
        }
    }
}
