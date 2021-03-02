// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.AdminRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.AdminRuleInner;
import com.azure.resourcemanager.network.generated.models.AdminRule;
import com.azure.resourcemanager.network.generated.models.AdminRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AdminRulesImpl implements AdminRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdminRulesImpl.class);

    private final AdminRulesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public AdminRulesImpl(
        AdminRulesClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AdminRule> list(
        String resourceGroupName, String networkManagerName, String configurationName) {
        PagedIterable<AdminRuleInner> inner =
            this.serviceClient().list(resourceGroupName, networkManagerName, configurationName);
        return Utils.mapPage(inner, inner1 -> new AdminRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AdminRule> list(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        Integer top,
        String skipToken,
        Context context) {
        PagedIterable<AdminRuleInner> inner =
            this
                .serviceClient()
                .list(resourceGroupName, networkManagerName, configurationName, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new AdminRuleImpl(inner1, this.manager()));
    }

    public AdminRule get(
        String resourceGroupName, String networkManagerName, String configurationName, String ruleName) {
        AdminRuleInner inner =
            this.serviceClient().get(resourceGroupName, networkManagerName, configurationName, ruleName);
        if (inner != null) {
            return new AdminRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AdminRule> getWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleName,
        Context context) {
        Response<AdminRuleInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AdminRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkManagerName, String configurationName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName, ruleName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, context);
    }

    public AdminRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityConfigurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityConfigurations'.",
                                id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "adminRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'adminRules'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, Context.NONE)
            .getValue();
    }

    public Response<AdminRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityConfigurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityConfigurations'.",
                                id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "adminRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'adminRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityConfigurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityConfigurations'.",
                                id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "adminRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'adminRules'.", id)));
        }
        this
            .deleteWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityConfigurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityConfigurations'.",
                                id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "adminRules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'adminRules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, networkManagerName, configurationName, ruleName, context);
    }

    private AdminRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public AdminRuleImpl define(String name) {
        return new AdminRuleImpl(name, this.manager());
    }
}
