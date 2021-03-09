// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.BackupRequestInner;
import com.azure.resourcemanager.appservice.generated.models.BackupRequest;
import com.azure.resourcemanager.appservice.generated.models.BackupSchedule;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import java.util.Collections;
import java.util.List;

public final class BackupRequestImpl implements BackupRequest {
    private BackupRequestInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    BackupRequestImpl(
        BackupRequestInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String backupName() {
        return this.innerModel().backupName();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public String storageAccountUrl() {
        return this.innerModel().storageAccountUrl();
    }

    public BackupSchedule backupSchedule() {
        return this.innerModel().backupSchedule();
    }

    public List<DatabaseBackupSetting> databases() {
        List<DatabaseBackupSetting> inner = this.innerModel().databases();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public BackupRequestInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
