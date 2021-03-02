// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.RestoreRequestInner;
import com.azure.resourcemanager.appservice.generated.models.BackupRestoreOperationType;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.RestoreRequest;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.util.Collections;
import java.util.List;

public final class RestoreRequestImpl implements RestoreRequest {
    private RestoreRequestInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    RestoreRequestImpl(
        RestoreRequestInner innerObject,
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

    public String storageAccountUrl() {
        return this.innerModel().storageAccountUrl();
    }

    public String blobName() {
        return this.innerModel().blobName();
    }

    public Boolean overwrite() {
        return this.innerModel().overwrite();
    }

    public String siteName() {
        return this.innerModel().siteName();
    }

    public List<DatabaseBackupSetting> databases() {
        List<DatabaseBackupSetting> inner = this.innerModel().databases();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean ignoreConflictingHostNames() {
        return this.innerModel().ignoreConflictingHostNames();
    }

    public Boolean ignoreDatabases() {
        return this.innerModel().ignoreDatabases();
    }

    public String appServicePlan() {
        return this.innerModel().appServicePlan();
    }

    public BackupRestoreOperationType operationType() {
        return this.innerModel().operationType();
    }

    public Boolean adjustConnectionStrings() {
        return this.innerModel().adjustConnectionStrings();
    }

    public String hostingEnvironment() {
        return this.innerModel().hostingEnvironment();
    }

    public RestoreRequestInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
