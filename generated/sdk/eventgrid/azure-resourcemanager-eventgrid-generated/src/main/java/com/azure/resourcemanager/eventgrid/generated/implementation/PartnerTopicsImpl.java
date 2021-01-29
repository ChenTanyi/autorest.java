// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.EventGridManager;
import com.azure.resourcemanager.eventgrid.generated.fluent.PartnerTopicsClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerTopicInner;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopic;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicUpdateParameters;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopics;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PartnerTopicsImpl implements PartnerTopics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PartnerTopicsImpl.class);

    private final PartnerTopicsClient innerClient;

    private final EventGridManager serviceManager;

    public PartnerTopicsImpl(PartnerTopicsClient innerClient, EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PartnerTopic getByResourceGroup(String resourceGroupName, String partnerTopicName) {
        PartnerTopicInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, partnerTopicName);
        if (inner != null) {
            return new PartnerTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PartnerTopic> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerTopicName, Context context) {
        Response<PartnerTopicInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, partnerTopicName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PartnerTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String partnerTopicName) {
        this.serviceClient().delete(resourceGroupName, partnerTopicName);
    }

    public void delete(String resourceGroupName, String partnerTopicName, Context context) {
        this.serviceClient().delete(resourceGroupName, partnerTopicName, context);
    }

    public PartnerTopic update(
        String resourceGroupName, String partnerTopicName, PartnerTopicUpdateParameters partnerTopicUpdateParameters) {
        PartnerTopicInner inner =
            this.serviceClient().update(resourceGroupName, partnerTopicName, partnerTopicUpdateParameters);
        if (inner != null) {
            return new PartnerTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PartnerTopic> updateWithResponse(
        String resourceGroupName,
        String partnerTopicName,
        PartnerTopicUpdateParameters partnerTopicUpdateParameters,
        Context context) {
        Response<PartnerTopicInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, partnerTopicName, partnerTopicUpdateParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PartnerTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PartnerTopic> list() {
        PagedIterable<PartnerTopicInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new PartnerTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerTopic> list(String filter, Integer top, Context context) {
        PagedIterable<PartnerTopicInner> inner = this.serviceClient().list(filter, top, context);
        return inner.mapPage(inner1 -> new PartnerTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerTopic> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PartnerTopicInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new PartnerTopicImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerTopic> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<PartnerTopicInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return inner.mapPage(inner1 -> new PartnerTopicImpl(inner1, this.manager()));
    }

    public PartnerTopic activate(String resourceGroupName, String partnerTopicName) {
        PartnerTopicInner inner = this.serviceClient().activate(resourceGroupName, partnerTopicName);
        if (inner != null) {
            return new PartnerTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PartnerTopic> activateWithResponse(
        String resourceGroupName, String partnerTopicName, Context context) {
        Response<PartnerTopicInner> inner =
            this.serviceClient().activateWithResponse(resourceGroupName, partnerTopicName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PartnerTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PartnerTopic deactivate(String resourceGroupName, String partnerTopicName) {
        PartnerTopicInner inner = this.serviceClient().deactivate(resourceGroupName, partnerTopicName);
        if (inner != null) {
            return new PartnerTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PartnerTopic> deactivateWithResponse(
        String resourceGroupName, String partnerTopicName, Context context) {
        Response<PartnerTopicInner> inner =
            this.serviceClient().deactivateWithResponse(resourceGroupName, partnerTopicName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PartnerTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PartnerTopicsClient serviceClient() {
        return this.innerClient;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }
}
