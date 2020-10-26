// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.TagOperationsClient;
import com.azure.resourcemanager.resources.generated.fluent.models.TagDetailsInner;
import com.azure.resourcemanager.resources.generated.fluent.models.TagValueInner;
import com.azure.resourcemanager.resources.generated.fluent.models.TagsResourceInner;
import com.azure.resourcemanager.resources.generated.models.TagDetails;
import com.azure.resourcemanager.resources.generated.models.TagOperations;
import com.azure.resourcemanager.resources.generated.models.TagValue;
import com.azure.resourcemanager.resources.generated.models.TagsPatchResource;
import com.azure.resourcemanager.resources.generated.models.TagsResource;

public final class TagOperationsImpl implements TagOperations {
    private final TagOperationsClient innerClient;

    private final ResourceManager serviceManager;

    public TagOperationsImpl(TagOperationsClient innerClient, ResourceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteValue(String tagName, String tagValue) {
        this.serviceClient().deleteValue(tagName, tagValue);
    }

    public Response<Void> deleteValueWithResponse(String tagName, String tagValue, Context context) {
        return this.serviceClient().deleteValueWithResponse(tagName, tagValue, context);
    }

    public TagValue createOrUpdateValue(String tagName, String tagValue) {
        TagValueInner inner = this.serviceClient().createOrUpdateValue(tagName, tagValue);
        if (inner != null) {
            return new TagValueImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagValue> createOrUpdateValueWithResponse(String tagName, String tagValue, Context context) {
        Response<TagValueInner> inner =
            this.serviceClient().createOrUpdateValueWithResponse(tagName, tagValue, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagValueImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TagDetails createOrUpdate(String tagName) {
        TagDetailsInner inner = this.serviceClient().createOrUpdate(tagName);
        if (inner != null) {
            return new TagDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagDetails> createOrUpdateWithResponse(String tagName, Context context) {
        Response<TagDetailsInner> inner = this.serviceClient().createOrUpdateWithResponse(tagName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String tagName) {
        this.serviceClient().delete(tagName);
    }

    public Response<Void> deleteWithResponse(String tagName, Context context) {
        return this.serviceClient().deleteWithResponse(tagName, context);
    }

    public PagedIterable<TagDetails> list() {
        PagedIterable<TagDetailsInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new TagDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<TagDetails> list(Context context) {
        PagedIterable<TagDetailsInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new TagDetailsImpl(inner1, this.manager()));
    }

    public TagsResource createOrUpdateAtScope(String scope, TagsResourceInner parameters) {
        TagsResourceInner inner = this.serviceClient().createOrUpdateAtScope(scope, parameters);
        if (inner != null) {
            return new TagsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagsResource> createOrUpdateAtScopeWithResponse(
        String scope, TagsResourceInner parameters, Context context) {
        Response<TagsResourceInner> inner =
            this.serviceClient().createOrUpdateAtScopeWithResponse(scope, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TagsResource updateAtScope(String scope, TagsPatchResource parameters) {
        TagsResourceInner inner = this.serviceClient().updateAtScope(scope, parameters);
        if (inner != null) {
            return new TagsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagsResource> updateAtScopeWithResponse(
        String scope, TagsPatchResource parameters, Context context) {
        Response<TagsResourceInner> inner = this.serviceClient().updateAtScopeWithResponse(scope, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TagsResource getAtScope(String scope) {
        TagsResourceInner inner = this.serviceClient().getAtScope(scope);
        if (inner != null) {
            return new TagsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagsResource> getAtScopeWithResponse(String scope, Context context) {
        Response<TagsResourceInner> inner = this.serviceClient().getAtScopeWithResponse(scope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteAtScope(String scope) {
        this.serviceClient().deleteAtScope(scope);
    }

    public Response<Void> deleteAtScopeWithResponse(String scope, Context context) {
        return this.serviceClient().deleteAtScopeWithResponse(scope, context);
    }

    private TagOperationsClient serviceClient() {
        return this.innerClient;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }
}
