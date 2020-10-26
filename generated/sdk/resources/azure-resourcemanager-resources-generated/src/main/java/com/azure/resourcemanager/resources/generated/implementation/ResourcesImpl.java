// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.ResourcesClient;
import com.azure.resourcemanager.resources.generated.fluent.models.GenericResourceExpandedInner;
import com.azure.resourcemanager.resources.generated.fluent.models.GenericResourceInner;
import com.azure.resourcemanager.resources.generated.models.GenericResource;
import com.azure.resourcemanager.resources.generated.models.GenericResourceExpanded;
import com.azure.resourcemanager.resources.generated.models.Resources;
import com.azure.resourcemanager.resources.generated.models.ResourcesMoveInfo;

public final class ResourcesImpl implements Resources {
    private final ResourcesClient innerClient;

    private final ResourceManager serviceManager;

    public ResourcesImpl(ResourcesClient innerClient, ResourceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GenericResourceExpanded> listByResourceGroup(String resourceGroupName) {
        PagedIterable<GenericResourceExpandedInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new GenericResourceExpandedImpl(inner1, this.manager()));
    }

    public PagedIterable<GenericResourceExpanded> listByResourceGroup(
        String resourceGroupName, String filter, String expand, Integer top, Context context) {
        PagedIterable<GenericResourceExpandedInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, expand, top, context);
        return inner.mapPage(inner1 -> new GenericResourceExpandedImpl(inner1, this.manager()));
    }

    public void moveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters) {
        this.serviceClient().moveResources(sourceResourceGroupName, parameters);
    }

    public void moveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters, Context context) {
        this.serviceClient().moveResources(sourceResourceGroupName, parameters, context);
    }

    public void validateMoveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters) {
        this.serviceClient().validateMoveResources(sourceResourceGroupName, parameters);
    }

    public void validateMoveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters, Context context) {
        this.serviceClient().validateMoveResources(sourceResourceGroupName, parameters, context);
    }

    public PagedIterable<GenericResourceExpanded> list() {
        PagedIterable<GenericResourceExpandedInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new GenericResourceExpandedImpl(inner1, this.manager()));
    }

    public PagedIterable<GenericResourceExpanded> list(String filter, String expand, Integer top, Context context) {
        PagedIterable<GenericResourceExpandedInner> inner = this.serviceClient().list(filter, expand, top, context);
        return inner.mapPage(inner1 -> new GenericResourceExpandedImpl(inner1, this.manager()));
    }

    public boolean checkExistence(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion) {
        return this
            .serviceClient()
            .checkExistence(
                resourceGroupName,
                resourceProviderNamespace,
                parentResourcePath,
                resourceType,
                resourceName,
                apiVersion);
    }

    public Response<Boolean> checkExistenceWithResponse(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        Context context) {
        return this
            .serviceClient()
            .checkExistenceWithResponse(
                resourceGroupName,
                resourceProviderNamespace,
                parentResourcePath,
                resourceType,
                resourceName,
                apiVersion,
                context);
    }

    public void delete(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion) {
        this
            .serviceClient()
            .delete(
                resourceGroupName,
                resourceProviderNamespace,
                parentResourcePath,
                resourceType,
                resourceName,
                apiVersion);
    }

    public void delete(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        Context context) {
        this
            .serviceClient()
            .delete(
                resourceGroupName,
                resourceProviderNamespace,
                parentResourcePath,
                resourceType,
                resourceName,
                apiVersion,
                context);
    }

    public GenericResource createOrUpdate(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters) {
        GenericResourceInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    apiVersion,
                    parameters);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource createOrUpdate(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters,
        Context context) {
        GenericResourceInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    apiVersion,
                    parameters,
                    context);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource update(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters) {
        GenericResourceInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    apiVersion,
                    parameters);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource update(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters,
        Context context) {
        GenericResourceInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    apiVersion,
                    parameters,
                    context);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource get(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion) {
        GenericResourceInner inner =
            this
                .serviceClient()
                .get(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    apiVersion);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GenericResource> getWithResponse(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        Context context) {
        Response<GenericResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    apiVersion,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GenericResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public boolean checkExistenceById(String resourceId, String apiVersion) {
        return this.serviceClient().checkExistenceById(resourceId, apiVersion);
    }

    public Response<Boolean> checkExistenceByIdWithResponse(String resourceId, String apiVersion, Context context) {
        return this.serviceClient().checkExistenceByIdWithResponse(resourceId, apiVersion, context);
    }

    public void deleteById(String resourceId, String apiVersion) {
        this.serviceClient().deleteById(resourceId, apiVersion);
    }

    public void deleteById(String resourceId, String apiVersion, Context context) {
        this.serviceClient().deleteById(resourceId, apiVersion, context);
    }

    public GenericResource createOrUpdateById(String resourceId, String apiVersion, GenericResourceInner parameters) {
        GenericResourceInner inner = this.serviceClient().createOrUpdateById(resourceId, apiVersion, parameters);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource createOrUpdateById(
        String resourceId, String apiVersion, GenericResourceInner parameters, Context context) {
        GenericResourceInner inner =
            this.serviceClient().createOrUpdateById(resourceId, apiVersion, parameters, context);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource updateById(String resourceId, String apiVersion, GenericResourceInner parameters) {
        GenericResourceInner inner = this.serviceClient().updateById(resourceId, apiVersion, parameters);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource updateById(
        String resourceId, String apiVersion, GenericResourceInner parameters, Context context) {
        GenericResourceInner inner = this.serviceClient().updateById(resourceId, apiVersion, parameters, context);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenericResource getById(String resourceId, String apiVersion) {
        GenericResourceInner inner = this.serviceClient().getById(resourceId, apiVersion);
        if (inner != null) {
            return new GenericResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GenericResource> getByIdWithResponse(String resourceId, String apiVersion, Context context) {
        Response<GenericResourceInner> inner =
            this.serviceClient().getByIdWithResponse(resourceId, apiVersion, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GenericResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResourcesClient serviceClient() {
        return this.innerClient;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }
}
