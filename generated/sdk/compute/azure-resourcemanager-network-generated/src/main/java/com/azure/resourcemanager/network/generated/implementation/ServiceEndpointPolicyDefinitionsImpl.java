// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ServiceEndpointPolicyDefinitionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicyDefinition;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicyDefinitions;

public final class ServiceEndpointPolicyDefinitionsImpl implements ServiceEndpointPolicyDefinitions {
    private final ServiceEndpointPolicyDefinitionsClient innerClient;

    private final NetworkManager serviceManager;

    public ServiceEndpointPolicyDefinitionsImpl(
        ServiceEndpointPolicyDefinitionsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        this.serviceClient().delete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
    }

    public void delete(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        this
            .serviceClient()
            .delete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
    }

    public ServiceEndpointPolicyDefinition get(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        ServiceEndpointPolicyDefinitionInner inner =
            this.serviceClient().get(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
        if (inner != null) {
            return new ServiceEndpointPolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceEndpointPolicyDefinition> getWithResponse(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        Response<ServiceEndpointPolicyDefinitionInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceEndpointPolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceEndpointPolicyDefinition createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions) {
        ServiceEndpointPolicyDefinitionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    serviceEndpointPolicyDefinitions);
        if (inner != null) {
            return new ServiceEndpointPolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServiceEndpointPolicyDefinition createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions,
        Context context) {
        ServiceEndpointPolicyDefinitionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    serviceEndpointPolicyDefinitions,
                    context);
        if (inner != null) {
            return new ServiceEndpointPolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ServiceEndpointPolicyDefinition> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName) {
        PagedIterable<ServiceEndpointPolicyDefinitionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, serviceEndpointPolicyName);
        return inner.mapPage(inner1 -> new ServiceEndpointPolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceEndpointPolicyDefinition> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName, Context context) {
        PagedIterable<ServiceEndpointPolicyDefinitionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, serviceEndpointPolicyName, context);
        return inner.mapPage(inner1 -> new ServiceEndpointPolicyDefinitionImpl(inner1, this.manager()));
    }

    private ServiceEndpointPolicyDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
