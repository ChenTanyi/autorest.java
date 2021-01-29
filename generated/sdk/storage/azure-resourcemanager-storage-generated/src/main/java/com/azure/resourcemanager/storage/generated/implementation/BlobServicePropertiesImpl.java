// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.BlobServiceProperties;
import com.azure.resourcemanager.storage.generated.models.ChangeFeed;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.azure.resourcemanager.storage.generated.models.DeleteRetentionPolicy;
import com.azure.resourcemanager.storage.generated.models.LastAccessTimeTrackingPolicy;
import com.azure.resourcemanager.storage.generated.models.RestorePolicyProperties;
import com.azure.resourcemanager.storage.generated.models.Sku;

public final class BlobServicePropertiesImpl
    implements BlobServiceProperties, BlobServiceProperties.Definition, BlobServiceProperties.Update {
    private BlobServicePropertiesInner innerObject;

    private final StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public CorsRules cors() {
        return this.innerModel().cors();
    }

    public String defaultServiceVersion() {
        return this.innerModel().defaultServiceVersion();
    }

    public DeleteRetentionPolicy deleteRetentionPolicy() {
        return this.innerModel().deleteRetentionPolicy();
    }

    public Boolean isVersioningEnabled() {
        return this.innerModel().isVersioningEnabled();
    }

    public Boolean automaticSnapshotPolicyEnabled() {
        return this.innerModel().automaticSnapshotPolicyEnabled();
    }

    public ChangeFeed changeFeed() {
        return this.innerModel().changeFeed();
    }

    public RestorePolicyProperties restorePolicy() {
        return this.innerModel().restorePolicy();
    }

    public DeleteRetentionPolicy containerDeleteRetentionPolicy() {
        return this.innerModel().containerDeleteRetentionPolicy();
    }

    public LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy() {
        return this.innerModel().lastAccessTimeTrackingPolicy();
    }

    public BlobServicePropertiesInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    public BlobServicePropertiesImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public BlobServiceProperties create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public BlobServiceProperties create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), context)
                .getValue();
        return this;
    }

    BlobServicePropertiesImpl(StorageManager serviceManager) {
        this.innerObject = new BlobServicePropertiesInner();
        this.serviceManager = serviceManager;
    }

    public BlobServicePropertiesImpl update() {
        return this;
    }

    public BlobServiceProperties apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public BlobServiceProperties apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobServices()
                .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), context)
                .getValue();
        return this;
    }

    BlobServicePropertiesImpl(BlobServicePropertiesInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
    }

    public BlobServiceProperties refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobServices()
                .getServicePropertiesWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public BlobServiceProperties refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobServices()
                .getServicePropertiesWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public BlobServicePropertiesImpl withCors(CorsRules cors) {
        this.innerModel().withCors(cors);
        return this;
    }

    public BlobServicePropertiesImpl withDefaultServiceVersion(String defaultServiceVersion) {
        this.innerModel().withDefaultServiceVersion(defaultServiceVersion);
        return this;
    }

    public BlobServicePropertiesImpl withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy) {
        this.innerModel().withDeleteRetentionPolicy(deleteRetentionPolicy);
        return this;
    }

    public BlobServicePropertiesImpl withIsVersioningEnabled(Boolean isVersioningEnabled) {
        this.innerModel().withIsVersioningEnabled(isVersioningEnabled);
        return this;
    }

    public BlobServicePropertiesImpl withAutomaticSnapshotPolicyEnabled(Boolean automaticSnapshotPolicyEnabled) {
        this.innerModel().withAutomaticSnapshotPolicyEnabled(automaticSnapshotPolicyEnabled);
        return this;
    }

    public BlobServicePropertiesImpl withChangeFeed(ChangeFeed changeFeed) {
        this.innerModel().withChangeFeed(changeFeed);
        return this;
    }

    public BlobServicePropertiesImpl withRestorePolicy(RestorePolicyProperties restorePolicy) {
        this.innerModel().withRestorePolicy(restorePolicy);
        return this;
    }

    public BlobServicePropertiesImpl withContainerDeleteRetentionPolicy(
        DeleteRetentionPolicy containerDeleteRetentionPolicy) {
        this.innerModel().withContainerDeleteRetentionPolicy(containerDeleteRetentionPolicy);
        return this;
    }

    public BlobServicePropertiesImpl withLastAccessTimeTrackingPolicy(
        LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy) {
        this.innerModel().withLastAccessTimeTrackingPolicy(lastAccessTimeTrackingPolicy);
        return this;
    }
}
