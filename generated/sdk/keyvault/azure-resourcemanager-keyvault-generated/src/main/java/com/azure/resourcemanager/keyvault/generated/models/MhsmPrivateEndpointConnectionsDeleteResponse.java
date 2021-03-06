// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.keyvault.generated.fluent.models.MhsmPrivateEndpointConnectionInner;

/** Contains all response data for the delete operation. */
public final class MhsmPrivateEndpointConnectionsDeleteResponse
    extends ResponseBase<MhsmPrivateEndpointConnectionsDeleteHeaders, MhsmPrivateEndpointConnectionInner> {
    /**
     * Creates an instance of MhsmPrivateEndpointConnectionsDeleteResponse.
     *
     * @param request the request which resulted in this MhsmPrivateEndpointConnectionsDeleteResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public MhsmPrivateEndpointConnectionsDeleteResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        MhsmPrivateEndpointConnectionInner value,
        MhsmPrivateEndpointConnectionsDeleteHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public MhsmPrivateEndpointConnectionInner getValue() {
        return super.getValue();
    }
}
