// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.fluent.ReportsClient;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.LatencyScorecardInner;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.TimeseriesInner;
import com.azure.resourcemanager.frontdoor.generated.models.LatencyScorecardAggregationInterval;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesAggregationInterval;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesType;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReportsClient. */
public final class ReportsClientImpl implements ReportsClient {
    private final ClientLogger logger = new ClientLogger(ReportsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ReportsService service;

    /** The service client containing this operation class. */
    private final FrontDoorManagementClientImpl client;

    /**
     * Initializes an instance of ReportsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReportsClientImpl(FrontDoorManagementClientImpl client) {
        this.service = RestProxy.create(ReportsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for FrontDoorManagementClientReports to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "FrontDoorManagementC")
    private interface ReportsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/NetworkExperimentProfiles/{profileName}/Experiments/{experimentName}/LatencyScorecard")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LatencyScorecardInner>> getLatencyScorecards(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("profileName") String profileName,
            @PathParam("experimentName") String experimentName,
            @QueryParam("endDateTimeUTC") String endDateTimeUtc,
            @QueryParam("country") String country,
            @QueryParam("aggregationInterval") LatencyScorecardAggregationInterval aggregationInterval,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/NetworkExperimentProfiles/{profileName}/Experiments/{experimentName}/Timeseries")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TimeseriesInner>> getTimeseries(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("profileName") String profileName,
            @PathParam("experimentName") String experimentName,
            @QueryParam("startDateTimeUTC") OffsetDateTime startDateTimeUtc,
            @QueryParam("endDateTimeUTC") OffsetDateTime endDateTimeUtc,
            @QueryParam("aggregationInterval") TimeseriesAggregationInterval aggregationInterval,
            @QueryParam("timeseriesType") TimeseriesType timeseriesType,
            @QueryParam("endpoint") String endpointParam,
            @QueryParam("country") String country,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @param endDateTimeUtc The end DateTime of the Latency Scorecard in UTC.
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LatencyScorecardInner>> getLatencyScorecardsWithResponseAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval,
        String endDateTimeUtc,
        String country) {
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
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (experimentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter experimentName is required and cannot be null."));
        }
        if (aggregationInterval == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getLatencyScorecards(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            resourceGroupName,
                            profileName,
                            experimentName,
                            endDateTimeUtc,
                            country,
                            aggregationInterval,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @param endDateTimeUtc The end DateTime of the Latency Scorecard in UTC.
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LatencyScorecardInner>> getLatencyScorecardsWithResponseAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval,
        String endDateTimeUtc,
        String country,
        Context context) {
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
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (experimentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter experimentName is required and cannot be null."));
        }
        if (aggregationInterval == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getLatencyScorecards(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                apiVersion,
                resourceGroupName,
                profileName,
                experimentName,
                endDateTimeUtc,
                country,
                aggregationInterval,
                accept,
                context);
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @param endDateTimeUtc The end DateTime of the Latency Scorecard in UTC.
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LatencyScorecardInner> getLatencyScorecardsAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval,
        String endDateTimeUtc,
        String country) {
        return getLatencyScorecardsWithResponseAsync(
                resourceGroupName, profileName, experimentName, aggregationInterval, endDateTimeUtc, country)
            .flatMap(
                (Response<LatencyScorecardInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LatencyScorecardInner> getLatencyScorecardsAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval) {
        final String endDateTimeUtc = null;
        final String country = null;
        return getLatencyScorecardsWithResponseAsync(
                resourceGroupName, profileName, experimentName, aggregationInterval, endDateTimeUtc, country)
            .flatMap(
                (Response<LatencyScorecardInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LatencyScorecardInner getLatencyScorecards(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval) {
        final String endDateTimeUtc = null;
        final String country = null;
        return getLatencyScorecardsAsync(
                resourceGroupName, profileName, experimentName, aggregationInterval, endDateTimeUtc, country)
            .block();
    }

    /**
     * Gets a Latency Scorecard for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param aggregationInterval The aggregation interval of the Latency Scorecard.
     * @param endDateTimeUtc The end DateTime of the Latency Scorecard in UTC.
     * @param country The country associated with the Latency Scorecard. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Latency Scorecard for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LatencyScorecardInner> getLatencyScorecardsWithResponse(
        String resourceGroupName,
        String profileName,
        String experimentName,
        LatencyScorecardAggregationInterval aggregationInterval,
        String endDateTimeUtc,
        String country,
        Context context) {
        return getLatencyScorecardsWithResponseAsync(
                resourceGroupName, profileName, experimentName, aggregationInterval, endDateTimeUtc, country, context)
            .block();
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @param endpoint The specific endpoint.
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TimeseriesInner>> getTimeseriesWithResponseAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType,
        String endpoint,
        String country) {
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
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (experimentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter experimentName is required and cannot be null."));
        }
        if (startDateTimeUtc == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter startDateTimeUtc is required and cannot be null."));
        }
        if (endDateTimeUtc == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDateTimeUtc is required and cannot be null."));
        }
        if (aggregationInterval == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null."));
        }
        if (timeseriesType == null) {
            return Mono.error(new IllegalArgumentException("Parameter timeseriesType is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getTimeseries(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            resourceGroupName,
                            profileName,
                            experimentName,
                            startDateTimeUtc,
                            endDateTimeUtc,
                            aggregationInterval,
                            timeseriesType,
                            endpoint,
                            country,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @param endpoint The specific endpoint.
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TimeseriesInner>> getTimeseriesWithResponseAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType,
        String endpoint,
        String country,
        Context context) {
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
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (experimentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter experimentName is required and cannot be null."));
        }
        if (startDateTimeUtc == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter startDateTimeUtc is required and cannot be null."));
        }
        if (endDateTimeUtc == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDateTimeUtc is required and cannot be null."));
        }
        if (aggregationInterval == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter aggregationInterval is required and cannot be null."));
        }
        if (timeseriesType == null) {
            return Mono.error(new IllegalArgumentException("Parameter timeseriesType is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getTimeseries(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                apiVersion,
                resourceGroupName,
                profileName,
                experimentName,
                startDateTimeUtc,
                endDateTimeUtc,
                aggregationInterval,
                timeseriesType,
                endpoint,
                country,
                accept,
                context);
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @param endpoint The specific endpoint.
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TimeseriesInner> getTimeseriesAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType,
        String endpoint,
        String country) {
        return getTimeseriesWithResponseAsync(
                resourceGroupName,
                profileName,
                experimentName,
                startDateTimeUtc,
                endDateTimeUtc,
                aggregationInterval,
                timeseriesType,
                endpoint,
                country)
            .flatMap(
                (Response<TimeseriesInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<TimeseriesInner> getTimeseriesAsync(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType) {
        final String endpoint = null;
        final String country = null;
        return getTimeseriesWithResponseAsync(
                resourceGroupName,
                profileName,
                experimentName,
                startDateTimeUtc,
                endDateTimeUtc,
                aggregationInterval,
                timeseriesType,
                endpoint,
                country)
            .flatMap(
                (Response<TimeseriesInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TimeseriesInner getTimeseries(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType) {
        final String endpoint = null;
        final String country = null;
        return getTimeseriesAsync(
                resourceGroupName,
                profileName,
                experimentName,
                startDateTimeUtc,
                endDateTimeUtc,
                aggregationInterval,
                timeseriesType,
                endpoint,
                country)
            .block();
    }

    /**
     * Gets a Timeseries for a given Experiment.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param experimentName The Experiment identifier associated with the Experiment.
     * @param startDateTimeUtc The start DateTime of the Timeseries in UTC.
     * @param endDateTimeUtc The end DateTime of the Timeseries in UTC.
     * @param aggregationInterval The aggregation interval of the Timeseries.
     * @param timeseriesType The type of Timeseries.
     * @param endpoint The specific endpoint.
     * @param country The country associated with the Timeseries. Values are country ISO codes as specified here-
     *     https://www.iso.org/iso-3166-country-codes.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Timeseries for a given Experiment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TimeseriesInner> getTimeseriesWithResponse(
        String resourceGroupName,
        String profileName,
        String experimentName,
        OffsetDateTime startDateTimeUtc,
        OffsetDateTime endDateTimeUtc,
        TimeseriesAggregationInterval aggregationInterval,
        TimeseriesType timeseriesType,
        String endpoint,
        String country,
        Context context) {
        return getTimeseriesWithResponseAsync(
                resourceGroupName,
                profileName,
                experimentName,
                startDateTimeUtc,
                endDateTimeUtc,
                aggregationInterval,
                timeseriesType,
                endpoint,
                country,
                context)
            .block();
    }
}
