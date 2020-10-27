// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.iothub.generated.fluent.IotHubsClient;
import com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException;
import com.azure.resourcemanager.iothub.generated.models.FailoverInput;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IotHubsClient. */
public final class IotHubsClientImpl implements IotHubsClient {
    private final ClientLogger logger = new ClientLogger(IotHubsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final IotHubsService service;

    /** The service client containing this operation class. */
    private final IotHubClientImpl client;

    /**
     * Initializes an instance of IotHubsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IotHubsClientImpl(IotHubClientImpl client) {
        this.service = RestProxy.create(IotHubsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for IotHubClientIotHubs to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "IotHubClientIotHubs")
    private interface IotHubsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Devices/IotHubs"
                + "/{iotHubName}/failover")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ErrorDetailsException.class)
        Mono<Response<Flux<ByteBuffer>>> manualFailover(
            @HostParam("$host") String endpoint,
            @PathParam("iotHubName") String iotHubName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") FailoverInput failoverInput,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> manualFailoverWithResponseAsync(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (iotHubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter iotHubName is required and cannot be null."));
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
        if (failoverInput == null) {
            return Mono.error(new IllegalArgumentException("Parameter failoverInput is required and cannot be null."));
        } else {
            failoverInput.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .manualFailover(
                            this.client.getEndpoint(),
                            iotHubName,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            failoverInput,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> manualFailoverWithResponseAsync(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (iotHubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter iotHubName is required and cannot be null."));
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
        if (failoverInput == null) {
            return Mono.error(new IllegalArgumentException("Parameter failoverInput is required and cannot be null."));
        } else {
            failoverInput.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .manualFailover(
                this.client.getEndpoint(),
                iotHubName,
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                failoverInput,
                accept,
                context);
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<Void>, Void> beginManualFailoverAsync(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            manualFailoverWithResponseAsync(iotHubName, resourceGroupName, failoverInput);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, Context.NONE);
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<Void>, Void> beginManualFailoverAsync(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            manualFailoverWithResponseAsync(iotHubName, resourceGroupName, failoverInput, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginManualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput) {
        return beginManualFailoverAsync(iotHubName, resourceGroupName, failoverInput).getSyncPoller();
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginManualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context) {
        return beginManualFailoverAsync(iotHubName, resourceGroupName, failoverInput, context).getSyncPoller();
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> manualFailoverAsync(String iotHubName, String resourceGroupName, FailoverInput failoverInput) {
        return beginManualFailoverAsync(iotHubName, resourceGroupName, failoverInput)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> manualFailoverAsync(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context) {
        return beginManualFailoverAsync(iotHubName, resourceGroupName, failoverInput, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void manualFailover(String iotHubName, String resourceGroupName, FailoverInput failoverInput) {
        manualFailoverAsync(iotHubName, resourceGroupName, failoverInput).block();
    }

    /**
     * Manually initiate a failover for the IoT Hub to its secondary region. To learn more, see
     * https://aka.ms/manualfailover.
     *
     * @param iotHubName Name of the IoT hub to failover.
     * @param resourceGroupName Name of the resource group containing the IoT hub resource.
     * @param failoverInput Use to provide failover region when requesting manual Failover for a hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void manualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context) {
        manualFailoverAsync(iotHubName, resourceGroupName, failoverInput, context).block();
    }
}