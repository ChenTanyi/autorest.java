// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.generated.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerSecurityAlertPoliciesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.postgresql.generated.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.postgresql.generated.models.ServerSecurityAlertPolicies;
import com.azure.resourcemanager.postgresql.generated.models.ServerSecurityAlertPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerSecurityAlertPoliciesImpl implements ServerSecurityAlertPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerSecurityAlertPoliciesImpl.class);

    private final ServerSecurityAlertPoliciesClient innerClient;

    private final PostgreSqlManager serviceManager;

    public ServerSecurityAlertPoliciesImpl(
        ServerSecurityAlertPoliciesClient innerClient, PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerSecurityAlertPolicy get(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName) {
        ServerSecurityAlertPolicyInner inner =
            this.serviceClient().get(resourceGroupName, serverName, securityAlertPolicyName);
        if (inner != null) {
            return new ServerSecurityAlertPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerSecurityAlertPolicy> getWithResponse(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName, Context context) {
        Response<ServerSecurityAlertPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, securityAlertPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerSecurityAlertPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ServerSecurityAlertPolicy> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerSecurityAlertPolicyInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new ServerSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerSecurityAlertPolicy> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerSecurityAlertPolicyInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new ServerSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public ServerSecurityAlertPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        SecurityAlertPolicyName securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(Utils.getValueFromIdByName(id, "securityAlertPolicies"));
        if (securityAlertPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, securityAlertPolicyName, Context.NONE).getValue();
    }

    public Response<ServerSecurityAlertPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        SecurityAlertPolicyName securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(Utils.getValueFromIdByName(id, "securityAlertPolicies"));
        if (securityAlertPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, securityAlertPolicyName, context);
    }

    private ServerSecurityAlertPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private PostgreSqlManager manager() {
        return this.serviceManager;
    }

    public ServerSecurityAlertPolicyImpl define(SecurityAlertPolicyName name) {
        return new ServerSecurityAlertPolicyImpl(name, this.manager());
    }
}
