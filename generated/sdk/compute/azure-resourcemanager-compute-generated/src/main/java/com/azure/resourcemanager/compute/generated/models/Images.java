// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Images. */
public interface Images {
    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String imageName);

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String imageName, Context context);

    /**
     * Gets an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    Image getByResourceGroup(String resourceGroupName, String imageName);

    /**
     * Gets an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    Response<Image> getByResourceGroupWithResponse(
        String resourceGroupName, String imageName, String expand, Context context);

    /**
     * Gets the list of images under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of images under a resource group.
     */
    PagedIterable<Image> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the list of images under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of images under a resource group.
     */
    PagedIterable<Image> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Images in the subscription.
     */
    PagedIterable<Image> list();

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Images in the subscription.
     */
    PagedIterable<Image> list(Context context);

    /**
     * Gets an image.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    Image getById(String id);

    /**
     * Gets an image.
     *
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    Response<Image> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Begins definition for a new Image resource.
     *
     * @param name resource name.
     * @return the first stage of the new Image definition.
     */
    Image.DefinitionStages.Blank define(String name);
}
