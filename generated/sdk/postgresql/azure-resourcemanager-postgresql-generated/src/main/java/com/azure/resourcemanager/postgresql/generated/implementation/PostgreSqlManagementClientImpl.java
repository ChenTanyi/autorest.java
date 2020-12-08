// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.postgresql.generated.fluent.CheckNameAvailabilitiesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ConfigurationsClient;
import com.azure.resourcemanager.postgresql.generated.fluent.DatabasesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.FirewallRulesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.LocationBasedPerformanceTiersClient;
import com.azure.resourcemanager.postgresql.generated.fluent.LogFilesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.OperationsClient;
import com.azure.resourcemanager.postgresql.generated.fluent.PostgreSqlManagementClient;
import com.azure.resourcemanager.postgresql.generated.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.postgresql.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.RecoverableServersClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ReplicasClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerAdministratorsClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerBasedPerformanceTiersClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerKeysClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerParametersClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ServerSecurityAlertPoliciesClient;
import com.azure.resourcemanager.postgresql.generated.fluent.ServersClient;
import com.azure.resourcemanager.postgresql.generated.fluent.VirtualNetworkRulesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the PostgreSqlManagementClientImpl type. */
@ServiceClient(builder = PostgreSqlManagementClientBuilder.class)
public final class PostgreSqlManagementClientImpl implements PostgreSqlManagementClient {
    private final ClientLogger logger = new ClientLogger(PostgreSqlManagementClientImpl.class);

    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The ServersClient object to access its operations. */
    private final ServersClient servers;

    /**
     * Gets the ServersClient object to access its operations.
     *
     * @return the ServersClient object.
     */
    public ServersClient getServers() {
        return this.servers;
    }

    /** The ReplicasClient object to access its operations. */
    private final ReplicasClient replicas;

    /**
     * Gets the ReplicasClient object to access its operations.
     *
     * @return the ReplicasClient object.
     */
    public ReplicasClient getReplicas() {
        return this.replicas;
    }

    /** The FirewallRulesClient object to access its operations. */
    private final FirewallRulesClient firewallRules;

    /**
     * Gets the FirewallRulesClient object to access its operations.
     *
     * @return the FirewallRulesClient object.
     */
    public FirewallRulesClient getFirewallRules() {
        return this.firewallRules;
    }

    /** The VirtualNetworkRulesClient object to access its operations. */
    private final VirtualNetworkRulesClient virtualNetworkRules;

    /**
     * Gets the VirtualNetworkRulesClient object to access its operations.
     *
     * @return the VirtualNetworkRulesClient object.
     */
    public VirtualNetworkRulesClient getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /** The DatabasesClient object to access its operations. */
    private final DatabasesClient databases;

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    public DatabasesClient getDatabases() {
        return this.databases;
    }

    /** The ConfigurationsClient object to access its operations. */
    private final ConfigurationsClient configurations;

    /**
     * Gets the ConfigurationsClient object to access its operations.
     *
     * @return the ConfigurationsClient object.
     */
    public ConfigurationsClient getConfigurations() {
        return this.configurations;
    }

    /** The ServerParametersClient object to access its operations. */
    private final ServerParametersClient serverParameters;

    /**
     * Gets the ServerParametersClient object to access its operations.
     *
     * @return the ServerParametersClient object.
     */
    public ServerParametersClient getServerParameters() {
        return this.serverParameters;
    }

    /** The LogFilesClient object to access its operations. */
    private final LogFilesClient logFiles;

    /**
     * Gets the LogFilesClient object to access its operations.
     *
     * @return the LogFilesClient object.
     */
    public LogFilesClient getLogFiles() {
        return this.logFiles;
    }

    /** The ServerAdministratorsClient object to access its operations. */
    private final ServerAdministratorsClient serverAdministrators;

    /**
     * Gets the ServerAdministratorsClient object to access its operations.
     *
     * @return the ServerAdministratorsClient object.
     */
    public ServerAdministratorsClient getServerAdministrators() {
        return this.serverAdministrators;
    }

    /** The RecoverableServersClient object to access its operations. */
    private final RecoverableServersClient recoverableServers;

    /**
     * Gets the RecoverableServersClient object to access its operations.
     *
     * @return the RecoverableServersClient object.
     */
    public RecoverableServersClient getRecoverableServers() {
        return this.recoverableServers;
    }

    /** The ServerBasedPerformanceTiersClient object to access its operations. */
    private final ServerBasedPerformanceTiersClient serverBasedPerformanceTiers;

    /**
     * Gets the ServerBasedPerformanceTiersClient object to access its operations.
     *
     * @return the ServerBasedPerformanceTiersClient object.
     */
    public ServerBasedPerformanceTiersClient getServerBasedPerformanceTiers() {
        return this.serverBasedPerformanceTiers;
    }

    /** The LocationBasedPerformanceTiersClient object to access its operations. */
    private final LocationBasedPerformanceTiersClient locationBasedPerformanceTiers;

    /**
     * Gets the LocationBasedPerformanceTiersClient object to access its operations.
     *
     * @return the LocationBasedPerformanceTiersClient object.
     */
    public LocationBasedPerformanceTiersClient getLocationBasedPerformanceTiers() {
        return this.locationBasedPerformanceTiers;
    }

    /** The CheckNameAvailabilitiesClient object to access its operations. */
    private final CheckNameAvailabilitiesClient checkNameAvailabilities;

    /**
     * Gets the CheckNameAvailabilitiesClient object to access its operations.
     *
     * @return the CheckNameAvailabilitiesClient object.
     */
    public CheckNameAvailabilitiesClient getCheckNameAvailabilities() {
        return this.checkNameAvailabilities;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The ServerSecurityAlertPoliciesClient object to access its operations. */
    private final ServerSecurityAlertPoliciesClient serverSecurityAlertPolicies;

    /**
     * Gets the ServerSecurityAlertPoliciesClient object to access its operations.
     *
     * @return the ServerSecurityAlertPoliciesClient object.
     */
    public ServerSecurityAlertPoliciesClient getServerSecurityAlertPolicies() {
        return this.serverSecurityAlertPolicies;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The ServerKeysClient object to access its operations. */
    private final ServerKeysClient serverKeys;

    /**
     * Gets the ServerKeysClient object to access its operations.
     *
     * @return the ServerKeysClient object.
     */
    public ServerKeysClient getServerKeys() {
        return this.serverKeys;
    }

    /**
     * Initializes an instance of PostgreSqlManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    PostgreSqlManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.servers = new ServersClientImpl(this);
        this.replicas = new ReplicasClientImpl(this);
        this.firewallRules = new FirewallRulesClientImpl(this);
        this.virtualNetworkRules = new VirtualNetworkRulesClientImpl(this);
        this.databases = new DatabasesClientImpl(this);
        this.configurations = new ConfigurationsClientImpl(this);
        this.serverParameters = new ServerParametersClientImpl(this);
        this.logFiles = new LogFilesClientImpl(this);
        this.serverAdministrators = new ServerAdministratorsClientImpl(this);
        this.recoverableServers = new RecoverableServersClientImpl(this);
        this.serverBasedPerformanceTiers = new ServerBasedPerformanceTiersClientImpl(this);
        this.locationBasedPerformanceTiers = new LocationBasedPerformanceTiersClientImpl(this);
        this.checkNameAvailabilities = new CheckNameAvailabilitiesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.serverSecurityAlertPolicies = new ServerSecurityAlertPoliciesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.serverKeys = new ServerKeysClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException ioe) {
                        logger.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }
}
