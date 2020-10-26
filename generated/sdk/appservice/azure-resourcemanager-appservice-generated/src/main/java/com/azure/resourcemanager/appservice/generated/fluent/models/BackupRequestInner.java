// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.BackupSchedule;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a backup which will be performed. */
@JsonFlatten
@Fluent
public class BackupRequestInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupRequestInner.class);

    /*
     * Name of the backup.
     */
    @JsonProperty(value = "properties.backupName")
    private String backupName;

    /*
     * True if the backup schedule is enabled (must be included in that case),
     * false if the backup schedule should be disabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * SAS URL to the container.
     */
    @JsonProperty(value = "properties.storageAccountUrl")
    private String storageAccountUrl;

    /*
     * Schedule for the backup if it is executed periodically.
     */
    @JsonProperty(value = "properties.backupSchedule")
    private BackupSchedule backupSchedule;

    /*
     * Databases included in the backup.
     */
    @JsonProperty(value = "properties.databases")
    private List<DatabaseBackupSetting> databases;

    /**
     * Get the backupName property: Name of the backup.
     *
     * @return the backupName value.
     */
    public String backupName() {
        return this.backupName;
    }

    /**
     * Set the backupName property: Name of the backup.
     *
     * @param backupName the backupName value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * Get the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     *
     * @param enabled the enabled value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the storageAccountUrl property: SAS URL to the container.
     *
     * @return the storageAccountUrl value.
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Set the storageAccountUrl property: SAS URL to the container.
     *
     * @param storageAccountUrl the storageAccountUrl value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withStorageAccountUrl(String storageAccountUrl) {
        this.storageAccountUrl = storageAccountUrl;
        return this;
    }

    /**
     * Get the backupSchedule property: Schedule for the backup if it is executed periodically.
     *
     * @return the backupSchedule value.
     */
    public BackupSchedule backupSchedule() {
        return this.backupSchedule;
    }

    /**
     * Set the backupSchedule property: Schedule for the backup if it is executed periodically.
     *
     * @param backupSchedule the backupSchedule value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupSchedule(BackupSchedule backupSchedule) {
        this.backupSchedule = backupSchedule;
        return this;
    }

    /**
     * Get the databases property: Databases included in the backup.
     *
     * @return the databases value.
     */
    public List<DatabaseBackupSetting> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: Databases included in the backup.
     *
     * @param databases the databases value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withDatabases(List<DatabaseBackupSetting> databases) {
        this.databases = databases;
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
        if (backupSchedule() != null) {
            backupSchedule().validate();
        }
        if (databases() != null) {
            databases().forEach(e -> e.validate());
        }
    }
}
