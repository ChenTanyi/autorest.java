// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.HDInsightManager;
import com.azure.resourcemanager.hdinsight.generated.fluent.VirtualMachinesClient;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.HostInfoInner;
import com.azure.resourcemanager.hdinsight.generated.models.HostInfo;
import com.azure.resourcemanager.hdinsight.generated.models.VirtualMachines;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VirtualMachinesImpl implements VirtualMachines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachinesImpl.class);

    private final VirtualMachinesClient innerClient;

    private final HDInsightManager serviceManager;

    public VirtualMachinesImpl(VirtualMachinesClient innerClient, HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public List<HostInfo> listHosts(String resourceGroupName, String clusterName) {
        List<HostInfoInner> inner = this.serviceClient().listHosts(resourceGroupName, clusterName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new HostInfoImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<HostInfo>> listHostsWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<List<HostInfoInner>> inner =
            this.serviceClient().listHostsWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new HostInfoImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public void restartHosts(String resourceGroupName, String clusterName, List<String> hosts) {
        this.serviceClient().restartHosts(resourceGroupName, clusterName, hosts);
    }

    public void restartHosts(String resourceGroupName, String clusterName, List<String> hosts, Context context) {
        this.serviceClient().restartHosts(resourceGroupName, clusterName, hosts, context);
    }

    private VirtualMachinesClient serviceClient() {
        return this.innerClient;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
