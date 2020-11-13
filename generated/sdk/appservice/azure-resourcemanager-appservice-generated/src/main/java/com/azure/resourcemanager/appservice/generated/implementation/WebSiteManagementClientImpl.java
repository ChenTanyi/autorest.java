// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

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
import com.azure.resourcemanager.appservice.generated.fluent.AppServiceCertificateOrdersClient;
import com.azure.resourcemanager.appservice.generated.fluent.AppServiceEnvironmentsClient;
import com.azure.resourcemanager.appservice.generated.fluent.AppServicePlansClient;
import com.azure.resourcemanager.appservice.generated.fluent.CertificateRegistrationProvidersClient;
import com.azure.resourcemanager.appservice.generated.fluent.CertificatesClient;
import com.azure.resourcemanager.appservice.generated.fluent.DeletedWebAppsClient;
import com.azure.resourcemanager.appservice.generated.fluent.DiagnosticsClient;
import com.azure.resourcemanager.appservice.generated.fluent.DomainRegistrationProvidersClient;
import com.azure.resourcemanager.appservice.generated.fluent.DomainsClient;
import com.azure.resourcemanager.appservice.generated.fluent.ProvidersClient;
import com.azure.resourcemanager.appservice.generated.fluent.RecommendationsClient;
import com.azure.resourcemanager.appservice.generated.fluent.ResourceHealthMetadatasClient;
import com.azure.resourcemanager.appservice.generated.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.appservice.generated.fluent.StaticSitesClient;
import com.azure.resourcemanager.appservice.generated.fluent.TopLevelDomainsClient;
import com.azure.resourcemanager.appservice.generated.fluent.WebAppsClient;
import com.azure.resourcemanager.appservice.generated.fluent.WebSiteManagementClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the WebSiteManagementClientImpl type. */
@ServiceClient(builder = WebSiteManagementClientBuilder.class)
public final class WebSiteManagementClientImpl implements WebSiteManagementClient {
    private final ClientLogger logger = new ClientLogger(WebSiteManagementClientImpl.class);

    /** Your Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000). */
    private final String subscriptionId;

    /**
     * Gets Your Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
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

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
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

    /** The AppServiceCertificateOrdersClient object to access its operations. */
    private final AppServiceCertificateOrdersClient appServiceCertificateOrders;

    /**
     * Gets the AppServiceCertificateOrdersClient object to access its operations.
     *
     * @return the AppServiceCertificateOrdersClient object.
     */
    public AppServiceCertificateOrdersClient getAppServiceCertificateOrders() {
        return this.appServiceCertificateOrders;
    }

    /** The CertificateRegistrationProvidersClient object to access its operations. */
    private final CertificateRegistrationProvidersClient certificateRegistrationProviders;

    /**
     * Gets the CertificateRegistrationProvidersClient object to access its operations.
     *
     * @return the CertificateRegistrationProvidersClient object.
     */
    public CertificateRegistrationProvidersClient getCertificateRegistrationProviders() {
        return this.certificateRegistrationProviders;
    }

    /** The DomainsClient object to access its operations. */
    private final DomainsClient domains;

    /**
     * Gets the DomainsClient object to access its operations.
     *
     * @return the DomainsClient object.
     */
    public DomainsClient getDomains() {
        return this.domains;
    }

    /** The TopLevelDomainsClient object to access its operations. */
    private final TopLevelDomainsClient topLevelDomains;

    /**
     * Gets the TopLevelDomainsClient object to access its operations.
     *
     * @return the TopLevelDomainsClient object.
     */
    public TopLevelDomainsClient getTopLevelDomains() {
        return this.topLevelDomains;
    }

    /** The DomainRegistrationProvidersClient object to access its operations. */
    private final DomainRegistrationProvidersClient domainRegistrationProviders;

    /**
     * Gets the DomainRegistrationProvidersClient object to access its operations.
     *
     * @return the DomainRegistrationProvidersClient object.
     */
    public DomainRegistrationProvidersClient getDomainRegistrationProviders() {
        return this.domainRegistrationProviders;
    }

    /** The CertificatesClient object to access its operations. */
    private final CertificatesClient certificates;

    /**
     * Gets the CertificatesClient object to access its operations.
     *
     * @return the CertificatesClient object.
     */
    public CertificatesClient getCertificates() {
        return this.certificates;
    }

    /** The DeletedWebAppsClient object to access its operations. */
    private final DeletedWebAppsClient deletedWebApps;

    /**
     * Gets the DeletedWebAppsClient object to access its operations.
     *
     * @return the DeletedWebAppsClient object.
     */
    public DeletedWebAppsClient getDeletedWebApps() {
        return this.deletedWebApps;
    }

    /** The DiagnosticsClient object to access its operations. */
    private final DiagnosticsClient diagnostics;

    /**
     * Gets the DiagnosticsClient object to access its operations.
     *
     * @return the DiagnosticsClient object.
     */
    public DiagnosticsClient getDiagnostics() {
        return this.diagnostics;
    }

    /** The ProvidersClient object to access its operations. */
    private final ProvidersClient providers;

    /**
     * Gets the ProvidersClient object to access its operations.
     *
     * @return the ProvidersClient object.
     */
    public ProvidersClient getProviders() {
        return this.providers;
    }

    /** The RecommendationsClient object to access its operations. */
    private final RecommendationsClient recommendations;

    /**
     * Gets the RecommendationsClient object to access its operations.
     *
     * @return the RecommendationsClient object.
     */
    public RecommendationsClient getRecommendations() {
        return this.recommendations;
    }

    /** The ResourceProvidersClient object to access its operations. */
    private final ResourceProvidersClient resourceProviders;

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    public ResourceProvidersClient getResourceProviders() {
        return this.resourceProviders;
    }

    /** The WebAppsClient object to access its operations. */
    private final WebAppsClient webApps;

    /**
     * Gets the WebAppsClient object to access its operations.
     *
     * @return the WebAppsClient object.
     */
    public WebAppsClient getWebApps() {
        return this.webApps;
    }

    /** The StaticSitesClient object to access its operations. */
    private final StaticSitesClient staticSites;

    /**
     * Gets the StaticSitesClient object to access its operations.
     *
     * @return the StaticSitesClient object.
     */
    public StaticSitesClient getStaticSites() {
        return this.staticSites;
    }

    /** The AppServiceEnvironmentsClient object to access its operations. */
    private final AppServiceEnvironmentsClient appServiceEnvironments;

    /**
     * Gets the AppServiceEnvironmentsClient object to access its operations.
     *
     * @return the AppServiceEnvironmentsClient object.
     */
    public AppServiceEnvironmentsClient getAppServiceEnvironments() {
        return this.appServiceEnvironments;
    }

    /** The AppServicePlansClient object to access its operations. */
    private final AppServicePlansClient appServicePlans;

    /**
     * Gets the AppServicePlansClient object to access its operations.
     *
     * @return the AppServicePlansClient object.
     */
    public AppServicePlansClient getAppServicePlans() {
        return this.appServicePlans;
    }

    /** The ResourceHealthMetadatasClient object to access its operations. */
    private final ResourceHealthMetadatasClient resourceHealthMetadatas;

    /**
     * Gets the ResourceHealthMetadatasClient object to access its operations.
     *
     * @return the ResourceHealthMetadatasClient object.
     */
    public ResourceHealthMetadatasClient getResourceHealthMetadatas() {
        return this.resourceHealthMetadatas;
    }

    /**
     * Initializes an instance of WebSiteManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Your Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param endpoint server parameter.
     */
    WebSiteManagementClientImpl(
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
        this.apiVersion = "2019-08-01";
        this.appServiceCertificateOrders = new AppServiceCertificateOrdersClientImpl(this);
        this.certificateRegistrationProviders = new CertificateRegistrationProvidersClientImpl(this);
        this.domains = new DomainsClientImpl(this);
        this.topLevelDomains = new TopLevelDomainsClientImpl(this);
        this.domainRegistrationProviders = new DomainRegistrationProvidersClientImpl(this);
        this.certificates = new CertificatesClientImpl(this);
        this.deletedWebApps = new DeletedWebAppsClientImpl(this);
        this.diagnostics = new DiagnosticsClientImpl(this);
        this.providers = new ProvidersClientImpl(this);
        this.recommendations = new RecommendationsClientImpl(this);
        this.resourceProviders = new ResourceProvidersClientImpl(this);
        this.webApps = new WebAppsClientImpl(this);
        this.staticSites = new StaticSitesClientImpl(this);
        this.appServiceEnvironments = new AppServiceEnvironmentsClientImpl(this);
        this.appServicePlans = new AppServicePlansClientImpl(this);
        this.resourceHealthMetadatas = new ResourceHealthMetadatasClientImpl(this);
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
