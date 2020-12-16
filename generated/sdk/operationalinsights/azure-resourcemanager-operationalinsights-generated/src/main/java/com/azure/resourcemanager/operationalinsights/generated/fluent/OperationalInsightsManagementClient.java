// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for OperationalInsightsManagementClient class. */
public interface OperationalInsightsManagementClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the DataExportsClient object to access its operations.
     *
     * @return the DataExportsClient object.
     */
    DataExportsClient getDataExports();

    /**
     * Gets the DataSourcesClient object to access its operations.
     *
     * @return the DataSourcesClient object.
     */
    DataSourcesClient getDataSources();

    /**
     * Gets the IntelligencePacksClient object to access its operations.
     *
     * @return the IntelligencePacksClient object.
     */
    IntelligencePacksClient getIntelligencePacks();

    /**
     * Gets the LinkedServicesClient object to access its operations.
     *
     * @return the LinkedServicesClient object.
     */
    LinkedServicesClient getLinkedServices();

    /**
     * Gets the LinkedStorageAccountsClient object to access its operations.
     *
     * @return the LinkedStorageAccountsClient object.
     */
    LinkedStorageAccountsClient getLinkedStorageAccounts();

    /**
     * Gets the ManagementGroupsClient object to access its operations.
     *
     * @return the ManagementGroupsClient object.
     */
    ManagementGroupsClient getManagementGroups();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the OperationStatusesClient object to access its operations.
     *
     * @return the OperationStatusesClient object.
     */
    OperationStatusesClient getOperationStatuses();

    /**
     * Gets the SharedKeysOperationsClient object to access its operations.
     *
     * @return the SharedKeysOperationsClient object.
     */
    SharedKeysOperationsClient getSharedKeysOperations();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    WorkspacesClient getWorkspaces();

    /**
     * Gets the DeletedWorkspacesClient object to access its operations.
     *
     * @return the DeletedWorkspacesClient object.
     */
    DeletedWorkspacesClient getDeletedWorkspaces();

    /**
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    ClustersClient getClusters();

    /**
     * Gets the StorageInsightConfigsClient object to access its operations.
     *
     * @return the StorageInsightConfigsClient object.
     */
    StorageInsightConfigsClient getStorageInsightConfigs();

    /**
     * Gets the SavedSearchesClient object to access its operations.
     *
     * @return the SavedSearchesClient object.
     */
    SavedSearchesClient getSavedSearches();

    /**
     * Gets the AvailableServiceTiersClient object to access its operations.
     *
     * @return the AvailableServiceTiersClient object.
     */
    AvailableServiceTiersClient getAvailableServiceTiers();

    /**
     * Gets the GatewaysClient object to access its operations.
     *
     * @return the GatewaysClient object.
     */
    GatewaysClient getGateways();

    /**
     * Gets the SchemasClient object to access its operations.
     *
     * @return the SchemasClient object.
     */
    SchemasClient getSchemas();

    /**
     * Gets the WorkspacePurgesClient object to access its operations.
     *
     * @return the WorkspacePurgesClient object.
     */
    WorkspacePurgesClient getWorkspacePurges();

    /**
     * Gets the TablesClient object to access its operations.
     *
     * @return the TablesClient object.
     */
    TablesClient getTables();
}