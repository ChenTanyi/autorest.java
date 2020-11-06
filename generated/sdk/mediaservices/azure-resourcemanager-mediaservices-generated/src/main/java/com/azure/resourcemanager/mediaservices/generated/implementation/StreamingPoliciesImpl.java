// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.StreamingPoliciesClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.StreamingPolicyInner;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingPolicies;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingPolicy;

public final class StreamingPoliciesImpl implements StreamingPolicies {
    private final StreamingPoliciesClient innerClient;

    private final MediaservicesManager serviceManager;

    public StreamingPoliciesImpl(StreamingPoliciesClient innerClient, MediaservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StreamingPolicy> list(String resourceGroupName, String accountName) {
        PagedIterable<StreamingPolicyInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new StreamingPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<StreamingPolicy> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context) {
        PagedIterable<StreamingPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, filter, top, orderby, context);
        return inner.mapPage(inner1 -> new StreamingPolicyImpl(inner1, this.manager()));
    }

    public StreamingPolicy get(String resourceGroupName, String accountName, String streamingPolicyName) {
        StreamingPolicyInner inner = this.serviceClient().get(resourceGroupName, accountName, streamingPolicyName);
        if (inner != null) {
            return new StreamingPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StreamingPolicy> getWithResponse(
        String resourceGroupName, String accountName, String streamingPolicyName, Context context) {
        Response<StreamingPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, streamingPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StreamingPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String streamingPolicyName) {
        this.serviceClient().delete(resourceGroupName, accountName, streamingPolicyName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String streamingPolicyName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, streamingPolicyName, context);
    }

    public StreamingPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        String streamingPolicyName = Utils.getValueFromIdByName(id, "streamingPolicies");
        return this.getWithResponse(resourceGroupName, accountName, streamingPolicyName, Context.NONE).getValue();
    }

    public Response<StreamingPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        String streamingPolicyName = Utils.getValueFromIdByName(id, "streamingPolicies");
        return this.getWithResponse(resourceGroupName, accountName, streamingPolicyName, context);
    }

    private StreamingPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    public StreamingPolicyImpl define(String name) {
        return new StreamingPolicyImpl(name, this.manager());
    }
}
