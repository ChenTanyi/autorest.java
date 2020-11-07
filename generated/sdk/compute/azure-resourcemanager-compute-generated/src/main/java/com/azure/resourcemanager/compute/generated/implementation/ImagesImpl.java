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
import com.azure.resourcemanager.compute.generated.fluent.ImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.ImageInner;
import com.azure.resourcemanager.compute.generated.models.Image;
import com.azure.resourcemanager.compute.generated.models.Images;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ImagesImpl implements Images {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImagesImpl.class);

    private final ImagesClient innerClient;

    private final ComputeManager serviceManager;

    public ImagesImpl(ImagesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String imageName) {
        this.serviceClient().delete(resourceGroupName, imageName);
    }

    public void delete(String resourceGroupName, String imageName, Context context) {
        this.serviceClient().delete(resourceGroupName, imageName, context);
    }

    public Image getByResourceGroup(String resourceGroupName, String imageName) {
        ImageInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, imageName);
        if (inner != null) {
            return new ImageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Image> getByResourceGroupWithResponse(
        String resourceGroupName, String imageName, String expand, Context context) {
        Response<ImageInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, imageName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ImageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Image> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ImageInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ImageImpl(inner1, this.manager()));
    }

    public PagedIterable<Image> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ImageInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ImageImpl(inner1, this.manager()));
    }

    public PagedIterable<Image> list() {
        PagedIterable<ImageInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ImageImpl(inner1, this.manager()));
    }

    public PagedIterable<Image> list(Context context) {
        PagedIterable<ImageInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ImageImpl(inner1, this.manager()));
    }

    public Image getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String imageName = Utils.getValueFromIdByName(id, "images");
        if (imageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        String localExpand = null;
        return this.getByResourceGroupWithResponse(resourceGroupName, imageName, localExpand, Context.NONE).getValue();
    }

    public Response<Image> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String imageName = Utils.getValueFromIdByName(id, "images");
        if (imageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, imageName, expand, context);
    }

    private ImagesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public ImageImpl define(String name) {
        return new ImageImpl(name, this.manager());
    }
}
