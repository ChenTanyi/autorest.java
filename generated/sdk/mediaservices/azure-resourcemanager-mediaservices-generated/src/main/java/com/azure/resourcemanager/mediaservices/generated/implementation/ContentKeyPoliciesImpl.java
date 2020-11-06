// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.ContentKeyPoliciesClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.ContentKeyPolicyInner;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.ContentKeyPolicyPropertiesInner;
import com.azure.resourcemanager.mediaservices.generated.models.ContentKeyPolicies;
import com.azure.resourcemanager.mediaservices.generated.models.ContentKeyPolicy;
import com.azure.resourcemanager.mediaservices.generated.models.ContentKeyPolicyProperties;

public final class ContentKeyPoliciesImpl implements ContentKeyPolicies {
    private final ContentKeyPoliciesClient innerClient;

    private final MediaservicesManager serviceManager;

    public ContentKeyPoliciesImpl(ContentKeyPoliciesClient innerClient, MediaservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ContentKeyPolicy> list(String resourceGroupName, String accountName) {
        PagedIterable<ContentKeyPolicyInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new ContentKeyPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ContentKeyPolicy> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context) {
        PagedIterable<ContentKeyPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, filter, top, orderby, context);
        return inner.mapPage(inner1 -> new ContentKeyPolicyImpl(inner1, this.manager()));
    }

    public ContentKeyPolicy get(String resourceGroupName, String accountName, String contentKeyPolicyName) {
        ContentKeyPolicyInner inner = this.serviceClient().get(resourceGroupName, accountName, contentKeyPolicyName);
        if (inner != null) {
            return new ContentKeyPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ContentKeyPolicy> getWithResponse(
        String resourceGroupName, String accountName, String contentKeyPolicyName, Context context) {
        Response<ContentKeyPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, contentKeyPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContentKeyPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String contentKeyPolicyName) {
        this.serviceClient().delete(resourceGroupName, accountName, contentKeyPolicyName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String contentKeyPolicyName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, contentKeyPolicyName, context);
    }

    public ContentKeyPolicyProperties getPolicyPropertiesWithSecrets(
        String resourceGroupName, String accountName, String contentKeyPolicyName) {
        ContentKeyPolicyPropertiesInner inner =
            this.serviceClient().getPolicyPropertiesWithSecrets(resourceGroupName, accountName, contentKeyPolicyName);
        if (inner != null) {
            return new ContentKeyPolicyPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ContentKeyPolicyProperties> getPolicyPropertiesWithSecretsWithResponse(
        String resourceGroupName, String accountName, String contentKeyPolicyName, Context context) {
        Response<ContentKeyPolicyPropertiesInner> inner =
            this
                .serviceClient()
                .getPolicyPropertiesWithSecretsWithResponse(
                    resourceGroupName, accountName, contentKeyPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContentKeyPolicyPropertiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ContentKeyPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        String contentKeyPolicyName = Utils.getValueFromIdByName(id, "contentKeyPolicies");
        return this.getWithResponse(resourceGroupName, accountName, contentKeyPolicyName, Context.NONE).getValue();
    }

    public Response<ContentKeyPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        String contentKeyPolicyName = Utils.getValueFromIdByName(id, "contentKeyPolicies");
        return this.getWithResponse(resourceGroupName, accountName, contentKeyPolicyName, context);
    }

    private ContentKeyPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    public ContentKeyPolicyImpl define(String name) {
        return new ContentKeyPolicyImpl(name, this.manager());
    }
}
