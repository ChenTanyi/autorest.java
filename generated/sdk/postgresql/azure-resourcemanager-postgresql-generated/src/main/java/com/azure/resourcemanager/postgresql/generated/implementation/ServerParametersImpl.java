// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.generated.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerParametersClient;
import com.azure.resourcemanager.postgresql.generated.fluent.models.ConfigurationListResultInner;
import com.azure.resourcemanager.postgresql.generated.models.ConfigurationListResult;
import com.azure.resourcemanager.postgresql.generated.models.ServerParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerParametersImpl implements ServerParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerParametersImpl.class);

    private final ServerParametersClient innerClient;

    private final PostgreSqlManager serviceManager;

    public ServerParametersImpl(ServerParametersClient innerClient, PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ConfigurationListResult listUpdateConfigurations(
        String resourceGroupName, String serverName, ConfigurationListResultInner value) {
        ConfigurationListResultInner inner =
            this.serviceClient().listUpdateConfigurations(resourceGroupName, serverName, value);
        if (inner != null) {
            return new ConfigurationListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ConfigurationListResult listUpdateConfigurations(
        String resourceGroupName, String serverName, ConfigurationListResultInner value, Context context) {
        ConfigurationListResultInner inner =
            this.serviceClient().listUpdateConfigurations(resourceGroupName, serverName, value, context);
        if (inner != null) {
            return new ConfigurationListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ServerParametersClient serviceClient() {
        return this.innerClient;
    }

    private PostgreSqlManager manager() {
        return this.serviceManager;
    }
}