// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterInner;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.GatewaySettingsInner;
import com.azure.resourcemanager.hdinsight.generated.models.AutoscaleConfigurationUpdateParameter;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterCreateParametersExtended;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterDiskEncryptionParameters;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterPatchParameters;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterResizeParameters;
import com.azure.resourcemanager.hdinsight.generated.models.ExecuteScriptActionParameters;
import com.azure.resourcemanager.hdinsight.generated.models.RoleName;
import com.azure.resourcemanager.hdinsight.generated.models.UpdateGatewaySettingsParameters;

/** An instance of this class provides access to all the operations defined in ClustersClient. */
public interface ClustersClient {
    /**
     * Creates a new HDInsight cluster with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster create request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreate(
        String resourceGroupName, String clusterName, ClusterCreateParametersExtended parameters);

    /**
     * Creates a new HDInsight cluster with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster create request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreate(
        String resourceGroupName, String clusterName, ClusterCreateParametersExtended parameters, Context context);

    /**
     * Creates a new HDInsight cluster with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster create request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner create(String resourceGroupName, String clusterName, ClusterCreateParametersExtended parameters);

    /**
     * Creates a new HDInsight cluster with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster create request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner create(
        String resourceGroupName, String clusterName, ClusterCreateParametersExtended parameters, Context context);

    /**
     * Patch HDInsight cluster with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster patch request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterPatchParameters parameters);

    /**
     * Patch HDInsight cluster with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster patch request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> updateWithResponse(
        String resourceGroupName, String clusterName, ClusterPatchParameters parameters, Context context);

    /**
     * Deletes the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName);

    /**
     * Deletes the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, Context context);

    /**
     * Deletes the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Deletes the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Gets the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Lists the HDInsight clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the HDInsight clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Resizes the specified HDInsight cluster to the specified size.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the resize operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginResize(
        String resourceGroupName, String clusterName, RoleName roleName, ClusterResizeParameters parameters);

    /**
     * Resizes the specified HDInsight cluster to the specified size.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the resize operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginResize(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        ClusterResizeParameters parameters,
        Context context);

    /**
     * Resizes the specified HDInsight cluster to the specified size.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the resize operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resize(String resourceGroupName, String clusterName, RoleName roleName, ClusterResizeParameters parameters);

    /**
     * Resizes the specified HDInsight cluster to the specified size.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the resize operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resize(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        ClusterResizeParameters parameters,
        Context context);

    /**
     * Updates the Autoscale Configuration for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the update autoscale configuration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginUpdateAutoScaleConfiguration(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        AutoscaleConfigurationUpdateParameter parameters);

    /**
     * Updates the Autoscale Configuration for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the update autoscale configuration operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginUpdateAutoScaleConfiguration(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        AutoscaleConfigurationUpdateParameter parameters,
        Context context);

    /**
     * Updates the Autoscale Configuration for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the update autoscale configuration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateAutoScaleConfiguration(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        AutoscaleConfigurationUpdateParameter parameters);

    /**
     * Updates the Autoscale Configuration for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param roleName The constant value for the roleName.
     * @param parameters The parameters for the update autoscale configuration operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateAutoScaleConfiguration(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        AutoscaleConfigurationUpdateParameter parameters,
        Context context);

    /**
     * Lists all the HDInsight clusters under the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list();

    /**
     * Lists all the HDInsight clusters under the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list(Context context);

    /**
     * Rotate disk encryption key of the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for the disk encryption operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRotateDiskEncryptionKey(
        String resourceGroupName, String clusterName, ClusterDiskEncryptionParameters parameters);

    /**
     * Rotate disk encryption key of the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for the disk encryption operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRotateDiskEncryptionKey(
        String resourceGroupName, String clusterName, ClusterDiskEncryptionParameters parameters, Context context);

    /**
     * Rotate disk encryption key of the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for the disk encryption operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void rotateDiskEncryptionKey(
        String resourceGroupName, String clusterName, ClusterDiskEncryptionParameters parameters);

    /**
     * Rotate disk encryption key of the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for the disk encryption operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void rotateDiskEncryptionKey(
        String resourceGroupName, String clusterName, ClusterDiskEncryptionParameters parameters, Context context);

    /**
     * Gets the gateway settings for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the gateway settings for the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GatewaySettingsInner getGatewaySettings(String resourceGroupName, String clusterName);

    /**
     * Gets the gateway settings for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the gateway settings for the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GatewaySettingsInner> getGatewaySettingsWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Configures the gateway settings on the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginUpdateGatewaySettings(
        String resourceGroupName, String clusterName, UpdateGatewaySettingsParameters parameters);

    /**
     * Configures the gateway settings on the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster configurations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginUpdateGatewaySettings(
        String resourceGroupName, String clusterName, UpdateGatewaySettingsParameters parameters, Context context);

    /**
     * Configures the gateway settings on the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateGatewaySettings(
        String resourceGroupName, String clusterName, UpdateGatewaySettingsParameters parameters);

    /**
     * Configures the gateway settings on the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The cluster configurations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateGatewaySettings(
        String resourceGroupName, String clusterName, UpdateGatewaySettingsParameters parameters, Context context);

    /**
     * Executes script actions on the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for executing script actions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginExecuteScriptActions(
        String resourceGroupName, String clusterName, ExecuteScriptActionParameters parameters);

    /**
     * Executes script actions on the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for executing script actions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginExecuteScriptActions(
        String resourceGroupName, String clusterName, ExecuteScriptActionParameters parameters, Context context);

    /**
     * Executes script actions on the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for executing script actions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void executeScriptActions(String resourceGroupName, String clusterName, ExecuteScriptActionParameters parameters);

    /**
     * Executes script actions on the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for executing script actions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void executeScriptActions(
        String resourceGroupName, String clusterName, ExecuteScriptActionParameters parameters, Context context);
}
