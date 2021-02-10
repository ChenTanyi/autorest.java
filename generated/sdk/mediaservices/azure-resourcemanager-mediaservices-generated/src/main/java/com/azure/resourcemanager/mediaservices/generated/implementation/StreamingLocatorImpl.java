// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.StreamingLocatorInner;
import com.azure.resourcemanager.mediaservices.generated.models.ListContentKeysResponse;
import com.azure.resourcemanager.mediaservices.generated.models.ListPathsResponse;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingLocator;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingLocatorContentKey;
import com.azure.resourcemanager.mediaservices.generated.models.SystemData;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class StreamingLocatorImpl implements StreamingLocator, StreamingLocator.Definition {
    private StreamingLocatorInner innerObject;

    private final MediaservicesManager serviceManager;

    StreamingLocatorImpl(StreamingLocatorInner innerObject, MediaservicesManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String assetName() {
        return this.innerModel().assetName();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public UUID streamingLocatorId() {
        return this.innerModel().streamingLocatorId();
    }

    public String streamingPolicyName() {
        return this.innerModel().streamingPolicyName();
    }

    public String defaultContentKeyPolicyName() {
        return this.innerModel().defaultContentKeyPolicyName();
    }

    public List<StreamingLocatorContentKey> contentKeys() {
        List<StreamingLocatorContentKey> inner = this.innerModel().contentKeys();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String alternativeMediaId() {
        return this.innerModel().alternativeMediaId();
    }

    public List<String> filters() {
        List<String> inner = this.innerModel().filters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StreamingLocatorInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String streamingLocatorName;

    public StreamingLocatorImpl withExistingMediaService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public StreamingLocator create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingLocators()
                .createWithResponse(
                    resourceGroupName, accountName, streamingLocatorName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public StreamingLocator create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingLocators()
                .createWithResponse(resourceGroupName, accountName, streamingLocatorName, this.innerModel(), context)
                .getValue();
        return this;
    }

    StreamingLocatorImpl(String name, MediaservicesManager serviceManager) {
        this.innerObject = new StreamingLocatorInner();
        this.serviceManager = serviceManager;
        this.streamingLocatorName = name;
    }

    public StreamingLocator refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingLocators()
                .getWithResponse(resourceGroupName, accountName, streamingLocatorName, Context.NONE)
                .getValue();
        return this;
    }

    public StreamingLocator refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingLocators()
                .getWithResponse(resourceGroupName, accountName, streamingLocatorName, context)
                .getValue();
        return this;
    }

    public ListContentKeysResponse listContentKeys() {
        return serviceManager.streamingLocators().listContentKeys(resourceGroupName, accountName, streamingLocatorName);
    }

    public Response<ListContentKeysResponse> listContentKeysWithResponse(Context context) {
        return serviceManager
            .streamingLocators()
            .listContentKeysWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
    }

    public ListPathsResponse listPaths() {
        return serviceManager.streamingLocators().listPaths(resourceGroupName, accountName, streamingLocatorName);
    }

    public Response<ListPathsResponse> listPathsWithResponse(Context context) {
        return serviceManager
            .streamingLocators()
            .listPathsWithResponse(resourceGroupName, accountName, streamingLocatorName, context);
    }

    public StreamingLocatorImpl withAssetName(String assetName) {
        this.innerModel().withAssetName(assetName);
        return this;
    }

    public StreamingLocatorImpl withStartTime(OffsetDateTime startTime) {
        this.innerModel().withStartTime(startTime);
        return this;
    }

    public StreamingLocatorImpl withEndTime(OffsetDateTime endTime) {
        this.innerModel().withEndTime(endTime);
        return this;
    }

    public StreamingLocatorImpl withStreamingLocatorId(UUID streamingLocatorId) {
        this.innerModel().withStreamingLocatorId(streamingLocatorId);
        return this;
    }

    public StreamingLocatorImpl withStreamingPolicyName(String streamingPolicyName) {
        this.innerModel().withStreamingPolicyName(streamingPolicyName);
        return this;
    }

    public StreamingLocatorImpl withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        this.innerModel().withDefaultContentKeyPolicyName(defaultContentKeyPolicyName);
        return this;
    }

    public StreamingLocatorImpl withContentKeys(List<StreamingLocatorContentKey> contentKeys) {
        this.innerModel().withContentKeys(contentKeys);
        return this;
    }

    public StreamingLocatorImpl withAlternativeMediaId(String alternativeMediaId) {
        this.innerModel().withAlternativeMediaId(alternativeMediaId);
        return this;
    }

    public StreamingLocatorImpl withFilters(List<String> filters) {
        this.innerModel().withFilters(filters);
        return this;
    }
}
