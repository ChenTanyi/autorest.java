// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.PolicyManager;
import com.azure.resourcemanager.policy.generated.fluent.PolicyAssignmentsClient;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyAssignmentInner;
import com.azure.resourcemanager.policy.generated.models.PolicyAssignment;
import com.azure.resourcemanager.policy.generated.models.PolicyAssignments;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PolicyAssignmentsImpl implements PolicyAssignments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyAssignmentsImpl.class);

    private final PolicyAssignmentsClient innerClient;

    private final PolicyManager serviceManager;

    public PolicyAssignmentsImpl(PolicyAssignmentsClient innerClient, PolicyManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PolicyAssignment deleteByResourceGroup(String scope, String policyAssignmentName) {
        PolicyAssignmentInner inner = this.serviceClient().delete(scope, policyAssignmentName);
        if (inner != null) {
            return new PolicyAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyAssignment> deleteWithResponse(String scope, String policyAssignmentName, Context context) {
        Response<PolicyAssignmentInner> inner =
            this.serviceClient().deleteWithResponse(scope, policyAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyAssignment get(String scope, String policyAssignmentName) {
        PolicyAssignmentInner inner = this.serviceClient().get(scope, policyAssignmentName);
        if (inner != null) {
            return new PolicyAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyAssignment> getWithResponse(String scope, String policyAssignmentName, Context context) {
        Response<PolicyAssignmentInner> inner =
            this.serviceClient().getWithResponse(scope, policyAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PolicyAssignment> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PolicyAssignmentInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyAssignment> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<PolicyAssignmentInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName) {
        PagedIterable<PolicyAssignmentInner> inner =
            this
                .serviceClient()
                .listForResource(
                    resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName);
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter,
        Integer top,
        Context context) {
        PagedIterable<PolicyAssignmentInner> inner =
            this
                .serviceClient()
                .listForResource(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    filter,
                    top,
                    context);
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyAssignment> listForManagementGroup(String managementGroupId) {
        PagedIterable<PolicyAssignmentInner> inner = this.serviceClient().listForManagementGroup(managementGroupId);
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyAssignment> listForManagementGroup(
        String managementGroupId, String filter, Integer top, Context context) {
        PagedIterable<PolicyAssignmentInner> inner =
            this.serviceClient().listForManagementGroup(managementGroupId, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyAssignment> list() {
        PagedIterable<PolicyAssignmentInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyAssignment> list(String filter, Integer top, Context context) {
        PagedIterable<PolicyAssignmentInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PolicyAssignmentImpl(inner1, this.manager()));
    }

    public PolicyAssignment deleteById(String policyAssignmentId) {
        PolicyAssignmentInner inner = this.serviceClient().deleteById(policyAssignmentId);
        if (inner != null) {
            return new PolicyAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyAssignment> deleteByIdWithResponse(String policyAssignmentId, Context context) {
        Response<PolicyAssignmentInner> inner =
            this.serviceClient().deleteByIdWithResponse(policyAssignmentId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyAssignment createById(String policyAssignmentId, PolicyAssignmentInner parameters) {
        PolicyAssignmentInner inner = this.serviceClient().createById(policyAssignmentId, parameters);
        if (inner != null) {
            return new PolicyAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyAssignment> createByIdWithResponse(
        String policyAssignmentId, PolicyAssignmentInner parameters, Context context) {
        Response<PolicyAssignmentInner> inner =
            this.serviceClient().createByIdWithResponse(policyAssignmentId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyAssignment getById(String policyAssignmentId) {
        PolicyAssignmentInner inner = this.serviceClient().getById(policyAssignmentId);
        if (inner != null) {
            return new PolicyAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyAssignment> getByIdWithResponse(String policyAssignmentId, Context context) {
        Response<PolicyAssignmentInner> inner = this.serviceClient().getByIdWithResponse(policyAssignmentId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PolicyAssignmentsClient serviceClient() {
        return this.innerClient;
    }

    private PolicyManager manager() {
        return this.serviceManager;
    }

    public PolicyAssignmentImpl define(String name) {
        return new PolicyAssignmentImpl(name, this.manager());
    }
}
