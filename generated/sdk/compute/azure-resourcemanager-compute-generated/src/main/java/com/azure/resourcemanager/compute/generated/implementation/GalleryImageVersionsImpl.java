// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.GalleryImageVersionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageVersionInner;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersion;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersions;
import com.azure.resourcemanager.compute.generated.models.ReplicationStatusTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GalleryImageVersionsImpl implements GalleryImageVersions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageVersionsImpl.class);

    private final GalleryImageVersionsClient innerClient;

    private final ComputeManager serviceManager;

    public GalleryImageVersionsImpl(GalleryImageVersionsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public GalleryImageVersion get(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        GalleryImageVersionInner inner =
            this.serviceClient().get(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName);
        if (inner != null) {
            return new GalleryImageVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GalleryImageVersion> getWithResponse(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        ReplicationStatusTypes expand,
        Context context) {
        Response<GalleryImageVersionInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GalleryImageVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName) {
        this.serviceClient().delete(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName);
    }

    public void delete(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, context);
    }

    public PagedIterable<GalleryImageVersion> listByGalleryImage(
        String resourceGroupName, String galleryName, String galleryImageName) {
        PagedIterable<GalleryImageVersionInner> inner =
            this.serviceClient().listByGalleryImage(resourceGroupName, galleryName, galleryImageName);
        return inner.mapPage(inner1 -> new GalleryImageVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<GalleryImageVersion> listByGalleryImage(
        String resourceGroupName, String galleryName, String galleryImageName, Context context) {
        PagedIterable<GalleryImageVersionInner> inner =
            this.serviceClient().listByGalleryImage(resourceGroupName, galleryName, galleryImageName, context);
        return inner.mapPage(inner1 -> new GalleryImageVersionImpl(inner1, this.manager()));
    }

    public GalleryImageVersion getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        String galleryImageName = Utils.getValueFromIdByName(id, "images");
        if (galleryImageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        String galleryImageVersionName = Utils.getValueFromIdByName(id, "versions");
        if (galleryImageVersionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        ReplicationStatusTypes localExpand = null;
        return this
            .getWithResponse(
                resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<GalleryImageVersion> getByIdWithResponse(
        String id, ReplicationStatusTypes expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        String galleryImageName = Utils.getValueFromIdByName(id, "images");
        if (galleryImageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        String galleryImageVersionName = Utils.getValueFromIdByName(id, "versions");
        if (galleryImageVersionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        return this
            .getWithResponse(
                resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, expand, context);
    }

    private GalleryImageVersionsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public GalleryImageVersionImpl define(String name) {
        return new GalleryImageVersionImpl(name, this.manager());
    }
}
