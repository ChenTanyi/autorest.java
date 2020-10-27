// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualApplianceSkus. */
public interface VirtualApplianceSkus {
    /**
     * List all SKUs available for a virtual appliance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call.
     */
    PagedIterable<NetworkVirtualApplianceSku> list();

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call.
     */
    PagedIterable<NetworkVirtualApplianceSku> list(Context context);

    /**
     * Retrieves a single available sku for network virtual appliance.
     *
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the NetworkVirtualApplianceSkus resource.
     */
    NetworkVirtualApplianceSku get(String skuName);

    /**
     * Retrieves a single available sku for network virtual appliance.
     *
     * @param skuName Name of the Sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the NetworkVirtualApplianceSkus resource.
     */
    Response<NetworkVirtualApplianceSku> getWithResponse(String skuName, Context context);
}