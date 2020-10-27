// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ResourceTypeSkuInner;

/** An instance of this class provides access to all the operations defined in SkusClient. */
public interface SkusClient {
    /**
     * List all the available Skus in the region and information related to them.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceTypeSkuInner> list();

    /**
     * List all the available Skus in the region and information related to them.
     *
     * @param filter Specify $filter='location eq &lt;location&gt;' to filter on location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceTypeSkuInner> list(String filter, Context context);
}
