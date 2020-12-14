// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Set disk storage settings for SQL Server. */
@Fluent
public final class SqlStorageSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlStorageSettings.class);

    /*
     * Logical Unit Numbers for the disks.
     */
    @JsonProperty(value = "luns")
    private List<Integer> luns;

    /*
     * SQL Server default file path
     */
    @JsonProperty(value = "defaultFilePath")
    private String defaultFilePath;

    /**
     * Get the luns property: Logical Unit Numbers for the disks.
     *
     * @return the luns value.
     */
    public List<Integer> luns() {
        return this.luns;
    }

    /**
     * Set the luns property: Logical Unit Numbers for the disks.
     *
     * @param luns the luns value to set.
     * @return the SqlStorageSettings object itself.
     */
    public SqlStorageSettings withLuns(List<Integer> luns) {
        this.luns = luns;
        return this;
    }

    /**
     * Get the defaultFilePath property: SQL Server default file path.
     *
     * @return the defaultFilePath value.
     */
    public String defaultFilePath() {
        return this.defaultFilePath;
    }

    /**
     * Set the defaultFilePath property: SQL Server default file path.
     *
     * @param defaultFilePath the defaultFilePath value to set.
     * @return the SqlStorageSettings object itself.
     */
    public SqlStorageSettings withDefaultFilePath(String defaultFilePath) {
        this.defaultFilePath = defaultFilePath;
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
