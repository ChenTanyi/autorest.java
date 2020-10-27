// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.MediaServiceInner;
import com.azure.resourcemanager.mediaservices.generated.models.AccountEncryption;
import com.azure.resourcemanager.mediaservices.generated.models.MediaService;
import com.azure.resourcemanager.mediaservices.generated.models.MediaServiceIdentity;
import com.azure.resourcemanager.mediaservices.generated.models.StorageAccount;
import com.azure.resourcemanager.mediaservices.generated.models.StorageAuthentication;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class MediaServiceImpl implements MediaService, MediaService.Definition, MediaService.Update {
    private MediaServiceInner innerObject;

    private final MediaservicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public MediaServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public UUID mediaServiceId() {
        return this.innerModel().mediaServiceId();
    }

    public List<StorageAccount> storageAccounts() {
        List<StorageAccount> inner = this.innerModel().storageAccounts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public StorageAuthentication storageAuthentication() {
        return this.innerModel().storageAuthentication();
    }

    public AccountEncryption encryption() {
        return this.innerModel().encryption();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public MediaServiceInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    public MediaServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public MediaService create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .createOrUpdateWithResponse(resourceGroupName, accountName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public MediaService create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .createOrUpdateWithResponse(resourceGroupName, accountName, innerObject, context)
                .getValue();
        return this;
    }

    public MediaServiceImpl(String name, MediaservicesManager serviceManager) {
        this.innerObject = new MediaServiceInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
    }

    public MediaServiceImpl update() {
        return this;
    }

    public MediaService apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .updateWithResponse(resourceGroupName, accountName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public MediaService apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .updateWithResponse(resourceGroupName, accountName, innerObject, context)
                .getValue();
        return this;
    }

    public MediaServiceImpl(MediaServiceInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaservices");
    }

    public MediaService refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public MediaService refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMediaservices()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public MediaServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public MediaServiceImpl withEncryption(AccountEncryption encryption) {
        this.innerModel().withEncryption(encryption);
        return this;
    }

    public MediaServiceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public MediaServiceImpl withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.innerModel().withStorageAccounts(storageAccounts);
        return this;
    }

    public MediaServiceImpl withStorageAuthentication(StorageAuthentication storageAuthentication) {
        this.innerModel().withStorageAuthentication(storageAuthentication);
        return this;
    }

    public MediaServiceImpl withIdentity(MediaServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public MediaServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }
}
