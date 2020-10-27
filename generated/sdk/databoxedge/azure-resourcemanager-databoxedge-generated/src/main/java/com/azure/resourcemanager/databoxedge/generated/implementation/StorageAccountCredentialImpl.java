// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountCredentialInner;
import com.azure.resourcemanager.databoxedge.generated.models.AccountType;
import com.azure.resourcemanager.databoxedge.generated.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.generated.models.SslStatus;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccountCredential;

public final class StorageAccountCredentialImpl
    implements StorageAccountCredential, StorageAccountCredential.Definition, StorageAccountCredential.Update {
    private StorageAccountCredentialInner innerObject;

    private final DataBoxEdgeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String alias() {
        return this.innerModel().alias();
    }

    public String username() {
        return this.innerModel().username();
    }

    public AsymmetricEncryptedSecret accountKey() {
        return this.innerModel().accountKey();
    }

    public String connectionString() {
        return this.innerModel().connectionString();
    }

    public SslStatus sslStatus() {
        return this.innerModel().sslStatus();
    }

    public String blobDomainName() {
        return this.innerModel().blobDomainName();
    }

    public AccountType accountType() {
        return this.innerModel().accountType();
    }

    public String storageAccountId() {
        return this.innerModel().storageAccountId();
    }

    public StorageAccountCredentialInner innerModel() {
        return this.innerObject;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String deviceName;

    public StorageAccountCredentialImpl withExistingDataBoxEdgeDevice(String deviceName, String name) {
        this.deviceName = deviceName;
        this.name = name;
        return this;
    }

    public StorageAccountCredential create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, innerObject, Context.NONE);
        return this;
    }

    public StorageAccountCredential create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, innerObject, context);
        return this;
    }

    public StorageAccountCredentialImpl(String name, DataBoxEdgeManager serviceManager) {
        this.innerObject = new StorageAccountCredentialInner();
        this.serviceManager = serviceManager;
        this.resourceGroupName = name;
    }

    public StorageAccountCredentialImpl update() {
        return this;
    }

    public StorageAccountCredential apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, innerObject, Context.NONE);
        return this;
    }

    public StorageAccountCredential apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, innerObject, context);
        return this;
    }

    public StorageAccountCredentialImpl(StorageAccountCredentialInner innerObject, DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "storageAccountCredentials");
    }

    public StorageAccountCredential refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .getWithResponse(deviceName, name, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public StorageAccountCredential refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .getWithResponse(deviceName, name, resourceGroupName, context)
                .getValue();
        return this;
    }

    public StorageAccountCredentialImpl withAccountKey(AsymmetricEncryptedSecret accountKey) {
        this.innerModel().withAccountKey(accountKey);
        return this;
    }

    public StorageAccountCredentialImpl withAlias(String alias) {
        this.innerModel().withAlias(alias);
        return this;
    }

    public StorageAccountCredentialImpl withStorageAccountId(String storageAccountId) {
        this.innerModel().withStorageAccountId(storageAccountId);
        return this;
    }

    public StorageAccountCredentialImpl withSslStatus(SslStatus sslStatus) {
        this.innerModel().withSslStatus(sslStatus);
        return this;
    }

    public StorageAccountCredentialImpl withUsername(String username) {
        this.innerModel().withUsername(username);
        return this;
    }

    public StorageAccountCredentialImpl withAccountType(AccountType accountType) {
        this.innerModel().withAccountType(accountType);
        return this;
    }

    public StorageAccountCredentialImpl withBlobDomainName(String blobDomainName) {
        this.innerModel().withBlobDomainName(blobDomainName);
        return this;
    }

    public StorageAccountCredentialImpl withConnectionString(String connectionString) {
        this.innerModel().withConnectionString(connectionString);
        return this;
    }
}
