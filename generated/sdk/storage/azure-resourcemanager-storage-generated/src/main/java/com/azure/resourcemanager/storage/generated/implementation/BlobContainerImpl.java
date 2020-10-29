// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobContainerInner;
import com.azure.resourcemanager.storage.generated.models.BlobContainer;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicyProperties;
import com.azure.resourcemanager.storage.generated.models.LeaseDuration;
import com.azure.resourcemanager.storage.generated.models.LeaseState;
import com.azure.resourcemanager.storage.generated.models.LeaseStatus;
import com.azure.resourcemanager.storage.generated.models.LegalHoldProperties;
import com.azure.resourcemanager.storage.generated.models.PublicAccess;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class BlobContainerImpl implements BlobContainer, BlobContainer.Definition, BlobContainer.Update {
    private BlobContainerInner innerObject;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Boolean deleted() {
        return this.innerModel().deleted();
    }

    public OffsetDateTime deletedTime() {
        return this.innerModel().deletedTime();
    }

    public Integer remainingRetentionDays() {
        return this.innerModel().remainingRetentionDays();
    }

    public String defaultEncryptionScope() {
        return this.innerModel().defaultEncryptionScope();
    }

    public Boolean denyEncryptionScopeOverride() {
        return this.innerModel().denyEncryptionScopeOverride();
    }

    public PublicAccess publicAccess() {
        return this.innerModel().publicAccess();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public LeaseStatus leaseStatus() {
        return this.innerModel().leaseStatus();
    }

    public LeaseState leaseState() {
        return this.innerModel().leaseState();
    }

    public LeaseDuration leaseDuration() {
        return this.innerModel().leaseDuration();
    }

    public Map<String, String> metadata() {
        Map<String, String> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public ImmutabilityPolicyProperties immutabilityPolicy() {
        return this.innerModel().immutabilityPolicy();
    }

    public LegalHoldProperties legalHold() {
        return this.innerModel().legalHold();
    }

    public Boolean hasLegalHold() {
        return this.innerModel().hasLegalHold();
    }

    public Boolean hasImmutabilityPolicy() {
        return this.innerModel().hasImmutabilityPolicy();
    }

    public BlobContainerInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String containerName;

    public BlobContainerImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public BlobContainer create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .createWithResponse(resourceGroupName, accountName, containerName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public BlobContainer create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .createWithResponse(resourceGroupName, accountName, containerName, innerObject, context)
                .getValue();
        return this;
    }

    public BlobContainerImpl(String name, StorageManager serviceManager) {
        this.innerObject = new BlobContainerInner();
        this.serviceManager = serviceManager;
        this.containerName = name;
    }

    public BlobContainerImpl update() {
        return this;
    }

    public BlobContainer apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .updateWithResponse(resourceGroupName, accountName, containerName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public BlobContainer apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .updateWithResponse(resourceGroupName, accountName, containerName, innerObject, context)
                .getValue();
        return this;
    }

    public BlobContainerImpl(BlobContainerInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.containerName = Utils.getValueFromIdByName(innerObject.id(), "containers");
    }

    public BlobContainer refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .getWithResponse(resourceGroupName, accountName, containerName, Context.NONE)
                .getValue();
        return this;
    }

    public BlobContainer refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .getWithResponse(resourceGroupName, accountName, containerName, context)
                .getValue();
        return this;
    }

    public BlobContainerImpl withDefaultEncryptionScope(String defaultEncryptionScope) {
        this.innerModel().withDefaultEncryptionScope(defaultEncryptionScope);
        return this;
    }

    public BlobContainerImpl withDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride) {
        this.innerModel().withDenyEncryptionScopeOverride(denyEncryptionScopeOverride);
        return this;
    }

    public BlobContainerImpl withPublicAccess(PublicAccess publicAccess) {
        this.innerModel().withPublicAccess(publicAccess);
        return this;
    }

    public BlobContainerImpl withMetadata(Map<String, String> metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }
}
