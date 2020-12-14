// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LinkedStorageAccounts. */
public interface LinkedStorageAccounts {
    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, DataSourceType dataSourceType);

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, DataSourceType dataSourceType, Context context);

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all linked storage account of a specific data source type associated with the specified workspace.
     */
    LinkedStorageAccountsResource get(String resourceGroupName, String workspaceName, DataSourceType dataSourceType);

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all linked storage account of a specific data source type associated with the specified workspace.
     */
    Response<LinkedStorageAccountsResource> getWithResponse(
        String resourceGroupName, String workspaceName, DataSourceType dataSourceType, Context context);

    /**
     * Gets all linked storage accounts associated with the specified workspace, storage accounts will be sorted by
     * their data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all linked storage accounts associated with the specified workspace, storage accounts will be sorted by
     *     their data source type.
     */
    PagedIterable<LinkedStorageAccountsResource> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Gets all linked storage accounts associated with the specified workspace, storage accounts will be sorted by
     * their data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all linked storage accounts associated with the specified workspace, storage accounts will be sorted by
     *     their data source type.
     */
    PagedIterable<LinkedStorageAccountsResource> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all linked storage account of a specific data source type associated with the specified workspace.
     */
    LinkedStorageAccountsResource getById(String id);

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all linked storage account of a specific data source type associated with the specified workspace.
     */
    Response<LinkedStorageAccountsResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LinkedStorageAccountsResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new LinkedStorageAccountsResource definition.
     */
    LinkedStorageAccountsResource.DefinitionStages.Blank define(DataSourceType name);
}
