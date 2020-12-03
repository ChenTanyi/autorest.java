// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.Context;

/** Resource collection API of Endpoints. */
public interface Endpoints {
    /**
     * Removes a content from Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     *     which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     *     files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void purgeContent(String resourceGroupName, String frontDoorName, PurgeParameters contentFilePaths);

    /**
     * Removes a content from Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     *     which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     *     files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void purgeContent(
        String resourceGroupName, String frontDoorName, PurgeParameters contentFilePaths, Context context);
}
