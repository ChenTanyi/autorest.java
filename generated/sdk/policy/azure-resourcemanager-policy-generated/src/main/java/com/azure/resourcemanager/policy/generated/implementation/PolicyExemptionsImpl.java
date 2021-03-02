// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.fluent.PolicyExemptionsClient;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyExemptionInner;
import com.azure.resourcemanager.policy.generated.models.PolicyExemption;
import com.azure.resourcemanager.policy.generated.models.PolicyExemptions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PolicyExemptionsImpl implements PolicyExemptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyExemptionsImpl.class);

    private final PolicyExemptionsClient innerClient;

    private final com.azure.resourcemanager.policy.generated.PolicyManager serviceManager;

    public PolicyExemptionsImpl(
        PolicyExemptionsClient innerClient, com.azure.resourcemanager.policy.generated.PolicyManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String scope, String policyExemptionName) {
        this.serviceClient().delete(scope, policyExemptionName);
    }

    public Response<Void> deleteWithResponse(String scope, String policyExemptionName, Context context) {
        return this.serviceClient().deleteWithResponse(scope, policyExemptionName, context);
    }

    public PolicyExemption get(String scope, String policyExemptionName) {
        PolicyExemptionInner inner = this.serviceClient().get(scope, policyExemptionName);
        if (inner != null) {
            return new PolicyExemptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyExemption> getWithResponse(String scope, String policyExemptionName, Context context) {
        Response<PolicyExemptionInner> inner =
            this.serviceClient().getWithResponse(scope, policyExemptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyExemptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PolicyExemption> list() {
        PagedIterable<PolicyExemptionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyExemption> list(String filter, Context context) {
        PagedIterable<PolicyExemptionInner> inner = this.serviceClient().list(filter, context);
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyExemption> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PolicyExemptionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyExemption> listByResourceGroup(
        String resourceGroupName, String filter, Context context) {
        PagedIterable<PolicyExemptionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyExemption> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName) {
        PagedIterable<PolicyExemptionInner> inner =
            this
                .serviceClient()
                .listForResource(
                    resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName);
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyExemption> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter,
        Context context) {
        PagedIterable<PolicyExemptionInner> inner =
            this
                .serviceClient()
                .listForResource(
                    resourceGroupName,
                    resourceProviderNamespace,
                    parentResourcePath,
                    resourceType,
                    resourceName,
                    filter,
                    context);
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyExemption> listForManagementGroup(String managementGroupId) {
        PagedIterable<PolicyExemptionInner> inner = this.serviceClient().listForManagementGroup(managementGroupId);
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyExemption> listForManagementGroup(
        String managementGroupId, String filter, Context context) {
        PagedIterable<PolicyExemptionInner> inner =
            this.serviceClient().listForManagementGroup(managementGroupId, filter, context);
        return Utils.mapPage(inner, inner1 -> new PolicyExemptionImpl(inner1, this.manager()));
    }

    public PolicyExemption getById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String policyExemptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}",
                    "policyExemptionName");
        if (policyExemptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policyExemptions'.", id)));
        }
        return this.getWithResponse(scope, policyExemptionName, Context.NONE).getValue();
    }

    public Response<PolicyExemption> getByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String policyExemptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}",
                    "policyExemptionName");
        if (policyExemptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policyExemptions'.", id)));
        }
        return this.getWithResponse(scope, policyExemptionName, context);
    }

    public void deleteById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String policyExemptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}",
                    "policyExemptionName");
        if (policyExemptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policyExemptions'.", id)));
        }
        this.deleteWithResponse(scope, policyExemptionName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String policyExemptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}",
                    "policyExemptionName");
        if (policyExemptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'policyExemptions'.", id)));
        }
        return this.deleteWithResponse(scope, policyExemptionName, context);
    }

    private PolicyExemptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.policy.generated.PolicyManager manager() {
        return this.serviceManager;
    }

    public PolicyExemptionImpl define(String name) {
        return new PolicyExemptionImpl(name, this.manager());
    }
}
