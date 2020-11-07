// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.NetworkInterfaceTapConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceTapConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceTapConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkInterfaceTapConfigurationsImpl implements NetworkInterfaceTapConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceTapConfigurationsImpl.class);

    private final NetworkInterfaceTapConfigurationsClient innerClient;

    private final NetworkManager serviceManager;

    public NetworkInterfaceTapConfigurationsImpl(
        NetworkInterfaceTapConfigurationsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String networkInterfaceName, String tapConfigurationName) {
        this.serviceClient().delete(resourceGroupName, networkInterfaceName, tapConfigurationName);
    }

    public void delete(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkInterfaceName, tapConfigurationName, context);
    }

    public NetworkInterfaceTapConfiguration get(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName) {
        NetworkInterfaceTapConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, networkInterfaceName, tapConfigurationName);
        if (inner != null) {
            return new NetworkInterfaceTapConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkInterfaceTapConfiguration> getWithResponse(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName, Context context) {
        Response<NetworkInterfaceTapConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, networkInterfaceName, tapConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkInterfaceTapConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkInterfaceTapConfiguration> list(String resourceGroupName, String networkInterfaceName) {
        PagedIterable<NetworkInterfaceTapConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, networkInterfaceName);
        return inner.mapPage(inner1 -> new NetworkInterfaceTapConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterfaceTapConfiguration> list(
        String resourceGroupName, String networkInterfaceName, Context context) {
        PagedIterable<NetworkInterfaceTapConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, networkInterfaceName, context);
        return inner.mapPage(inner1 -> new NetworkInterfaceTapConfigurationImpl(inner1, this.manager()));
    }

    public NetworkInterfaceTapConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        String tapConfigurationName = Utils.getValueFromIdByName(id, "tapConfigurations");
        if (tapConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'tapConfigurations'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, networkInterfaceName, tapConfigurationName, Context.NONE)
            .getValue();
    }

    public Response<NetworkInterfaceTapConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        String tapConfigurationName = Utils.getValueFromIdByName(id, "tapConfigurations");
        if (tapConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'tapConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkInterfaceName, tapConfigurationName, context);
    }

    private NetworkInterfaceTapConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkInterfaceTapConfigurationImpl define(String name) {
        return new NetworkInterfaceTapConfigurationImpl(name, this.manager());
    }
}
