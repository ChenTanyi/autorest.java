// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DiskAccesses. */
public interface DiskAccesses {
    /**
     * Gets information about a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum
     *     name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource.
     */
    DiskAccess getByResourceGroup(String resourceGroupName, String diskAccessName);

    /**
     * Gets information about a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum
     *     name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource.
     */
    Response<DiskAccess> getByResourceGroupWithResponse(
        String resourceGroupName, String diskAccessName, Context context);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum
     *     name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String diskAccessName);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum
     *     name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String diskAccessName, Context context);

    /**
     * Lists all the disk access resources under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the disk access resources under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the disk access resources under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    PagedIterable<DiskAccess> list();

    /**
     * Lists all the disk access resources under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    PagedIterable<DiskAccess> list(Context context);

    /**
     * Gets the private link resources possible under disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum
     *     name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources possible under disk access resource.
     */
    PrivateLinkResourceListResult getPrivateLinkResources(String resourceGroupName, String diskAccessName);

    /**
     * Gets the private link resources possible under disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum
     *     name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources possible under disk access resource.
     */
    Response<PrivateLinkResourceListResult> getPrivateLinkResourcesWithResponse(
        String resourceGroupName, String diskAccessName, Context context);

    /**
     * Begins definition for a new DiskAccess resource.
     *
     * @param name resource name.
     * @return the first stage of the new DiskAccess definition.
     */
    DiskAccess.DefinitionStages.Blank define(String name);
}