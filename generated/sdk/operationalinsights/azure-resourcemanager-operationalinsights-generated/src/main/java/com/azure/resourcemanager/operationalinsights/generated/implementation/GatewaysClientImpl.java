// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.fluent.GatewaysClient;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GatewaysClient. */
public final class GatewaysClientImpl implements GatewaysClient {
    private final ClientLogger logger = new ClientLogger(GatewaysClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GatewaysService service;

    /** The service client containing this operation class. */
    private final OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of GatewaysClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GatewaysClientImpl(OperationalInsightsManagementClientImpl client) {
        this.service = RestProxy.create(GatewaysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationalInsightsManagementClientGateways to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "OperationalInsightsM")
    private interface GatewaysService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/gateways/{gatewayId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("gatewayId") String gatewayId,
            @QueryParam("api-version") String apiVersion,
            Context context);
    }

    /**
     * Delete a Log Analytics gateway.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param gatewayId The Log Analytics gateway Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String workspaceName, String gatewayId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (gatewayId == null) {
            return Mono.error(new IllegalArgumentException("Parameter gatewayId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            gatewayId,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Delete a Log Analytics gateway.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param gatewayId The Log Analytics gateway Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String workspaceName, String gatewayId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (gatewayId == null) {
            return Mono.error(new IllegalArgumentException("Parameter gatewayId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                gatewayId,
                apiVersion,
                context);
    }

    /**
     * Delete a Log Analytics gateway.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param gatewayId The Log Analytics gateway Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String workspaceName, String gatewayId) {
        return deleteWithResponseAsync(resourceGroupName, workspaceName, gatewayId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete a Log Analytics gateway.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param gatewayId The Log Analytics gateway Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String workspaceName, String gatewayId) {
        deleteAsync(resourceGroupName, workspaceName, gatewayId).block();
    }

    /**
     * Delete a Log Analytics gateway.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param gatewayId The Log Analytics gateway Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String gatewayId, Context context) {
        return deleteWithResponseAsync(resourceGroupName, workspaceName, gatewayId, context).block();
    }
}
