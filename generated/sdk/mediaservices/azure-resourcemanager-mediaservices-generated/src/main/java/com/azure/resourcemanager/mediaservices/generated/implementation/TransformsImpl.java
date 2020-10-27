// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.TransformsClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.TransformInner;
import com.azure.resourcemanager.mediaservices.generated.models.Transform;
import com.azure.resourcemanager.mediaservices.generated.models.Transforms;

public final class TransformsImpl implements Transforms {
    private final TransformsClient innerClient;

    private final MediaservicesManager serviceManager;

    public TransformsImpl(TransformsClient innerClient, MediaservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Transform> list(String resourceGroupName, String accountName) {
        PagedIterable<TransformInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new TransformImpl(inner1, this.manager()));
    }

    public PagedIterable<Transform> list(
        String resourceGroupName, String accountName, String filter, String orderby, Context context) {
        PagedIterable<TransformInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, filter, orderby, context);
        return inner.mapPage(inner1 -> new TransformImpl(inner1, this.manager()));
    }

    public Transform get(String resourceGroupName, String accountName, String transformName) {
        TransformInner inner = this.serviceClient().get(resourceGroupName, accountName, transformName);
        if (inner != null) {
            return new TransformImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Transform> getWithResponse(
        String resourceGroupName, String accountName, String transformName, Context context) {
        Response<TransformInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, transformName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TransformImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String transformName) {
        this.serviceClient().delete(resourceGroupName, accountName, transformName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String transformName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, transformName, context);
    }

    private TransformsClient serviceClient() {
        return this.innerClient;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    public TransformImpl define(String name) {
        return new TransformImpl(name, this.manager());
    }
}