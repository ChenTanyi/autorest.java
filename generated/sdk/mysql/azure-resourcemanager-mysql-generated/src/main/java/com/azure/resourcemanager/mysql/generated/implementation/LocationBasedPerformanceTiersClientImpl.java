// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.LocationBasedPerformanceTiersClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.PerformanceTierPropertiesInner;
import com.azure.resourcemanager.mysql.generated.models.PerformanceTierListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocationBasedPerformanceTiersClient. */
public final class LocationBasedPerformanceTiersClientImpl implements LocationBasedPerformanceTiersClient {
    private final ClientLogger logger = new ClientLogger(LocationBasedPerformanceTiersClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LocationBasedPerformanceTiersService service;

    /** The service client containing this operation class. */
    private final MySqlManagementClientImpl client;

    /**
     * Initializes an instance of LocationBasedPerformanceTiersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LocationBasedPerformanceTiersClientImpl(MySqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    LocationBasedPerformanceTiersService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MySqlManagementClientLocationBasedPerformanceTiers to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MySqlManagementClien")
    private interface LocationBasedPerformanceTiersService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DBForMySQL/locations/{locationName}/performanceTiers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PerformanceTierListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationName") String locationName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PerformanceTierPropertiesInner>> listSinglePageAsync(String locationName) {
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
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            locationName,
                            accept,
                            context))
            .<PagedResponse<PerformanceTierPropertiesInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PerformanceTierPropertiesInner>> listSinglePageAsync(
        String locationName, Context context) {
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
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), locationName, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PerformanceTierPropertiesInner> listAsync(String locationName) {
        return new PagedFlux<>(() -> listSinglePageAsync(locationName));
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PerformanceTierPropertiesInner> listAsync(String locationName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(locationName, context));
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PerformanceTierPropertiesInner> list(String locationName) {
        return new PagedIterable<>(listAsync(locationName));
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PerformanceTierPropertiesInner> list(String locationName, Context context) {
        return new PagedIterable<>(listAsync(locationName, context));
    }
}
