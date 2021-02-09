// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.HDInsightManager;
import com.azure.resourcemanager.hdinsight.generated.fluent.ScriptExecutionHistoriesClient;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.RuntimeScriptActionDetailInner;
import com.azure.resourcemanager.hdinsight.generated.models.RuntimeScriptActionDetail;
import com.azure.resourcemanager.hdinsight.generated.models.ScriptExecutionHistories;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ScriptExecutionHistoriesImpl implements ScriptExecutionHistories {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScriptExecutionHistoriesImpl.class);

    private final ScriptExecutionHistoriesClient innerClient;

    private final HDInsightManager serviceManager;

    public ScriptExecutionHistoriesImpl(ScriptExecutionHistoriesClient innerClient, HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RuntimeScriptActionDetail> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<RuntimeScriptActionDetailInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new RuntimeScriptActionDetailImpl(inner1, this.manager()));
    }

    public PagedIterable<RuntimeScriptActionDetail> listByCluster(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<RuntimeScriptActionDetailInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new RuntimeScriptActionDetailImpl(inner1, this.manager()));
    }

    public void promote(String resourceGroupName, String clusterName, String scriptExecutionId) {
        this.serviceClient().promote(resourceGroupName, clusterName, scriptExecutionId);
    }

    public Response<Void> promoteWithResponse(
        String resourceGroupName, String clusterName, String scriptExecutionId, Context context) {
        return this.serviceClient().promoteWithResponse(resourceGroupName, clusterName, scriptExecutionId, context);
    }

    private ScriptExecutionHistoriesClient serviceClient() {
        return this.innerClient;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
