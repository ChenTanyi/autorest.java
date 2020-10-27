// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.LiveOutputInner;
import com.azure.resourcemanager.mediaservices.generated.models.Hls;
import com.azure.resourcemanager.mediaservices.generated.models.LiveOutput;
import com.azure.resourcemanager.mediaservices.generated.models.LiveOutputResourceState;
import java.time.Duration;
import java.time.OffsetDateTime;

public final class LiveOutputImpl implements LiveOutput, LiveOutput.Definition {
    private LiveOutputInner innerObject;

    private final MediaservicesManager serviceManager;

    public LiveOutputImpl(LiveOutputInner innerObject, MediaservicesManager serviceManager) {
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

    public String description() {
        return this.innerModel().description();
    }

    public String assetName() {
        return this.innerModel().assetName();
    }

    public Duration archiveWindowLength() {
        return this.innerModel().archiveWindowLength();
    }

    public String manifestName() {
        return this.innerModel().manifestName();
    }

    public Hls hls() {
        return this.innerModel().hls();
    }

    public Long outputSnapTime() {
        return this.innerModel().outputSnapTime();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public LiveOutputResourceState resourceState() {
        return this.innerModel().resourceState();
    }

    public LiveOutputInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String liveOutputName;

    private String accountName;

    private String liveEventName;

    public LiveOutputImpl withExistingLiveEvent(String resourceGroupName, String accountName, String liveEventName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.liveEventName = liveEventName;
        return this;
    }

    public LiveOutput create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveOutputs()
                .create(resourceGroupName, accountName, liveEventName, liveOutputName, innerObject, Context.NONE);
        return this;
    }

    public LiveOutput create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveOutputs()
                .create(resourceGroupName, accountName, liveEventName, liveOutputName, innerObject, context);
        return this;
    }

    public LiveOutputImpl(String name, MediaservicesManager serviceManager) {
        this.innerObject = new LiveOutputInner();
        this.serviceManager = serviceManager;
        this.liveOutputName = name;
    }

    public LiveOutput refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveOutputs()
                .getWithResponse(resourceGroupName, accountName, liveEventName, liveOutputName, Context.NONE)
                .getValue();
        return this;
    }

    public LiveOutput refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveOutputs()
                .getWithResponse(resourceGroupName, accountName, liveEventName, liveOutputName, context)
                .getValue();
        return this;
    }

    public LiveOutputImpl withManifestName(String manifestName) {
        this.innerModel().withManifestName(manifestName);
        return this;
    }

    public LiveOutputImpl withHls(Hls hls) {
        this.innerModel().withHls(hls);
        return this;
    }

    public LiveOutputImpl withArchiveWindowLength(Duration archiveWindowLength) {
        this.innerModel().withArchiveWindowLength(archiveWindowLength);
        return this;
    }

    public LiveOutputImpl withAssetName(String assetName) {
        this.innerModel().withAssetName(assetName);
        return this;
    }

    public LiveOutputImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public LiveOutputImpl withOutputSnapTime(Long outputSnapTime) {
        this.innerModel().withOutputSnapTime(outputSnapTime);
        return this;
    }
}
