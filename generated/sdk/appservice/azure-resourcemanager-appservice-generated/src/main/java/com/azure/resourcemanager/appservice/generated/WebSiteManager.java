// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.WebSiteManagementClient;
import com.azure.resourcemanager.appservice.generated.implementation.AppServiceCertificateOrdersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.AppServiceEnvironmentsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.AppServicePlansImpl;
import com.azure.resourcemanager.appservice.generated.implementation.CertificateRegistrationProvidersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.CertificatesImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DeletedWebAppsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DiagnosticsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DomainRegistrationProvidersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DomainsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.ProvidersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.RecommendationsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.ResourceHealthMetadatasImpl;
import com.azure.resourcemanager.appservice.generated.implementation.StaticSitesImpl;
import com.azure.resourcemanager.appservice.generated.implementation.TopLevelDomainsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WebAppsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WebSiteManagementClientBuilder;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrders;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironments;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlans;
import com.azure.resourcemanager.appservice.generated.models.CertificateRegistrationProviders;
import com.azure.resourcemanager.appservice.generated.models.Certificates;
import com.azure.resourcemanager.appservice.generated.models.DeletedWebApps;
import com.azure.resourcemanager.appservice.generated.models.Diagnostics;
import com.azure.resourcemanager.appservice.generated.models.DomainRegistrationProviders;
import com.azure.resourcemanager.appservice.generated.models.Domains;
import com.azure.resourcemanager.appservice.generated.models.Providers;
import com.azure.resourcemanager.appservice.generated.models.Recommendations;
import com.azure.resourcemanager.appservice.generated.models.ResourceHealthMetadatas;
import com.azure.resourcemanager.appservice.generated.models.StaticSites;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomains;
import com.azure.resourcemanager.appservice.generated.models.WebApps;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to WebSiteManager. WebSite Management Client. */
public final class WebSiteManager {
    private AppServiceCertificateOrders appServiceCertificateOrders;

    private CertificateRegistrationProviders certificateRegistrationProviders;

    private Domains domains;

    private TopLevelDomains topLevelDomains;

    private DomainRegistrationProviders domainRegistrationProviders;

    private Certificates certificates;

    private DeletedWebApps deletedWebApps;

    private Diagnostics diagnostics;

    private Providers providers;

    private Recommendations recommendations;

    private WebApps webApps;

    private StaticSites staticSites;

    private AppServiceEnvironments appServiceEnvironments;

    private AppServicePlans appServicePlans;

    private ResourceHealthMetadatas resourceHealthMetadatas;

    private final WebSiteManagementClient clientObject;

    private WebSiteManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new WebSiteManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of WebSite service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the WebSite service API instance.
     */
    public static WebSiteManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create WebSiteManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new WebSiteManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide .
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of WebSite service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the WebSite service API instance.
         */
        public WebSiteManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies
                .add(
                    new UserAgentPolicy(
                        null,
                        "com.azure.resourcemanager.appservice.generated",
                        "1.0.0-beta.1",
                        Configuration.getGlobalConfiguration()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new WebSiteManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of AppServiceCertificateOrders. */
    public AppServiceCertificateOrders appServiceCertificateOrders() {
        if (this.appServiceCertificateOrders == null) {
            this.appServiceCertificateOrders =
                new AppServiceCertificateOrdersImpl(clientObject.getAppServiceCertificateOrders(), this);
        }
        return appServiceCertificateOrders;
    }

    /** @return Resource collection API of CertificateRegistrationProviders. */
    public CertificateRegistrationProviders certificateRegistrationProviders() {
        if (this.certificateRegistrationProviders == null) {
            this.certificateRegistrationProviders =
                new CertificateRegistrationProvidersImpl(clientObject.getCertificateRegistrationProviders(), this);
        }
        return certificateRegistrationProviders;
    }

    /** @return Resource collection API of Domains. */
    public Domains domains() {
        if (this.domains == null) {
            this.domains = new DomainsImpl(clientObject.getDomains(), this);
        }
        return domains;
    }

    /** @return Resource collection API of TopLevelDomains. */
    public TopLevelDomains topLevelDomains() {
        if (this.topLevelDomains == null) {
            this.topLevelDomains = new TopLevelDomainsImpl(clientObject.getTopLevelDomains(), this);
        }
        return topLevelDomains;
    }

    /** @return Resource collection API of DomainRegistrationProviders. */
    public DomainRegistrationProviders domainRegistrationProviders() {
        if (this.domainRegistrationProviders == null) {
            this.domainRegistrationProviders =
                new DomainRegistrationProvidersImpl(clientObject.getDomainRegistrationProviders(), this);
        }
        return domainRegistrationProviders;
    }

    /** @return Resource collection API of Certificates. */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(clientObject.getCertificates(), this);
        }
        return certificates;
    }

    /** @return Resource collection API of DeletedWebApps. */
    public DeletedWebApps deletedWebApps() {
        if (this.deletedWebApps == null) {
            this.deletedWebApps = new DeletedWebAppsImpl(clientObject.getDeletedWebApps(), this);
        }
        return deletedWebApps;
    }

    /** @return Resource collection API of Diagnostics. */
    public Diagnostics diagnostics() {
        if (this.diagnostics == null) {
            this.diagnostics = new DiagnosticsImpl(clientObject.getDiagnostics(), this);
        }
        return diagnostics;
    }

    /** @return Resource collection API of Providers. */
    public Providers providers() {
        if (this.providers == null) {
            this.providers = new ProvidersImpl(clientObject.getProviders(), this);
        }
        return providers;
    }

    /** @return Resource collection API of Recommendations. */
    public Recommendations recommendations() {
        if (this.recommendations == null) {
            this.recommendations = new RecommendationsImpl(clientObject.getRecommendations(), this);
        }
        return recommendations;
    }

    /** @return Resource collection API of WebApps. */
    public WebApps webApps() {
        if (this.webApps == null) {
            this.webApps = new WebAppsImpl(clientObject.getWebApps(), this);
        }
        return webApps;
    }

    /** @return Resource collection API of StaticSites. */
    public StaticSites staticSites() {
        if (this.staticSites == null) {
            this.staticSites = new StaticSitesImpl(clientObject.getStaticSites(), this);
        }
        return staticSites;
    }

    /** @return Resource collection API of AppServiceEnvironments. */
    public AppServiceEnvironments appServiceEnvironments() {
        if (this.appServiceEnvironments == null) {
            this.appServiceEnvironments =
                new AppServiceEnvironmentsImpl(clientObject.getAppServiceEnvironments(), this);
        }
        return appServiceEnvironments;
    }

    /** @return Resource collection API of AppServicePlans. */
    public AppServicePlans appServicePlans() {
        if (this.appServicePlans == null) {
            this.appServicePlans = new AppServicePlansImpl(clientObject.getAppServicePlans(), this);
        }
        return appServicePlans;
    }

    /** @return Resource collection API of ResourceHealthMetadatas. */
    public ResourceHealthMetadatas resourceHealthMetadatas() {
        if (this.resourceHealthMetadatas == null) {
            this.resourceHealthMetadatas =
                new ResourceHealthMetadatasImpl(clientObject.getResourceHealthMetadatas(), this);
        }
        return resourceHealthMetadatas;
    }

    /**
     * @return Wrapped service client WebSiteManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public WebSiteManagementClient serviceClient() {
        return this.clientObject;
    }
}
