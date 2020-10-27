// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerSecurityAlertPoliciesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.postgresql.generated.models.SecurityAlertPolicyName;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServerSecurityAlertPoliciesClient. */
public final class ServerSecurityAlertPoliciesClientImpl implements ServerSecurityAlertPoliciesClient {
    private final ClientLogger logger = new ClientLogger(ServerSecurityAlertPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ServerSecurityAlertPoliciesService service;

    /** The service client containing this operation class. */
    private final PostgreSqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerSecurityAlertPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServerSecurityAlertPoliciesClientImpl(PostgreSqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ServerSecurityAlertPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PostgreSqlManagementClientServerSecurityAlertPolicies to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PostgreSqlManagement")
    private interface ServerSecurityAlertPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL"
                + "/servers/{serverName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerSecurityAlertPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("securityAlertPolicyName") SecurityAlertPolicyName securityAlertPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL"
                + "/servers/{serverName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("securityAlertPolicyName") SecurityAlertPolicyName securityAlertPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ServerSecurityAlertPolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerSecurityAlertPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            securityAlertPolicyName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerSecurityAlertPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                securityAlertPolicyName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context);
    }

    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerSecurityAlertPolicyInner> getAsync(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName) {
        return getWithResponseAsync(resourceGroupName, serverName, securityAlertPolicyName)
            .flatMap(
                (Response<ServerSecurityAlertPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerSecurityAlertPolicyInner get(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName) {
        return getAsync(resourceGroupName, serverName, securityAlertPolicyName).block();
    }

    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServerSecurityAlertPolicyInner> getWithResponse(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, securityAlertPolicyName, context).block();
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            securityAlertPolicyName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (securityAlertPolicyName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter securityAlertPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-12-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                securityAlertPolicyName,
                this.client.getSubscriptionId(),
                apiVersion,
                parameters,
                accept,
                context);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String serverName,
            SecurityAlertPolicyName securityAlertPolicyName,
            ServerSecurityAlertPolicyInner parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(resourceGroupName, serverName, securityAlertPolicyName, parameters);
        return this
            .client
            .<ServerSecurityAlertPolicyInner, ServerSecurityAlertPolicyInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ServerSecurityAlertPolicyInner.class,
                ServerSecurityAlertPolicyInner.class,
                Context.NONE);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String serverName,
            SecurityAlertPolicyName securityAlertPolicyName,
            ServerSecurityAlertPolicyInner parameters,
            Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(
                resourceGroupName, serverName, securityAlertPolicyName, parameters, context);
        return this
            .client
            .<ServerSecurityAlertPolicyInner, ServerSecurityAlertPolicyInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ServerSecurityAlertPolicyInner.class,
                ServerSecurityAlertPolicyInner.class,
                context);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, securityAlertPolicyName, parameters)
            .getSyncPoller();
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters,
        Context context) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, securityAlertPolicyName, parameters, context)
            .getSyncPoller();
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerSecurityAlertPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, securityAlertPolicyName, parameters)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerSecurityAlertPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters,
        Context context) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, securityAlertPolicyName, parameters, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, securityAlertPolicyName, parameters).block();
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters A server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters,
        Context context) {
        return createOrUpdateAsync(resourceGroupName, serverName, securityAlertPolicyName, parameters, context).block();
    }
}
