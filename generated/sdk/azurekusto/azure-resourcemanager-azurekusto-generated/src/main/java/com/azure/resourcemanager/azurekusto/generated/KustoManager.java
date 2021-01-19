// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated;

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
import com.azure.resourcemanager.azurekusto.generated.fluent.KustoManagementClient;
import com.azure.resourcemanager.azurekusto.generated.implementation.AttachedDatabaseConfigurationsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.ClusterPrincipalAssignmentsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.ClustersImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.DataConnectionsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.DatabasePrincipalAssignmentsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.DatabasesImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.KustoManagementClientBuilder;
import com.azure.resourcemanager.azurekusto.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.azurekusto.generated.models.AttachedDatabaseConfigurations;
import com.azure.resourcemanager.azurekusto.generated.models.ClusterPrincipalAssignments;
import com.azure.resourcemanager.azurekusto.generated.models.Clusters;
import com.azure.resourcemanager.azurekusto.generated.models.DataConnections;
import com.azure.resourcemanager.azurekusto.generated.models.DatabasePrincipalAssignments;
import com.azure.resourcemanager.azurekusto.generated.models.Databases;
import com.azure.resourcemanager.azurekusto.generated.models.Operations;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to KustoManager. The Azure Kusto management API provides a RESTful set of web services that interact with
 * Azure Kusto services to manage your clusters and databases. The API enables you to create, update, and delete
 * clusters and databases.
 */
public final class KustoManager {
    private Clusters clusters;

    private ClusterPrincipalAssignments clusterPrincipalAssignments;

    private Databases databases;

    private DatabasePrincipalAssignments databasePrincipalAssignments;

    private AttachedDatabaseConfigurations attachedDatabaseConfigurations;

    private DataConnections dataConnections;

    private Operations operations;

    private final KustoManagementClient clientObject;

    private KustoManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new KustoManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Kusto service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Kusto service API instance.
     */
    public static KustoManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create KustoManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new KustoManager.Configurable();
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
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
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
         * Creates an instance of Kusto service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Kusto service API instance.
         */
        public KustoManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.azurekusto.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
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
            return new KustoManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Clusters. */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(clientObject.getClusters(), this);
        }
        return clusters;
    }

    /** @return Resource collection API of ClusterPrincipalAssignments. */
    public ClusterPrincipalAssignments clusterPrincipalAssignments() {
        if (this.clusterPrincipalAssignments == null) {
            this.clusterPrincipalAssignments =
                new ClusterPrincipalAssignmentsImpl(clientObject.getClusterPrincipalAssignments(), this);
        }
        return clusterPrincipalAssignments;
    }

    /** @return Resource collection API of Databases. */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /** @return Resource collection API of DatabasePrincipalAssignments. */
    public DatabasePrincipalAssignments databasePrincipalAssignments() {
        if (this.databasePrincipalAssignments == null) {
            this.databasePrincipalAssignments =
                new DatabasePrincipalAssignmentsImpl(clientObject.getDatabasePrincipalAssignments(), this);
        }
        return databasePrincipalAssignments;
    }

    /** @return Resource collection API of AttachedDatabaseConfigurations. */
    public AttachedDatabaseConfigurations attachedDatabaseConfigurations() {
        if (this.attachedDatabaseConfigurations == null) {
            this.attachedDatabaseConfigurations =
                new AttachedDatabaseConfigurationsImpl(clientObject.getAttachedDatabaseConfigurations(), this);
        }
        return attachedDatabaseConfigurations;
    }

    /** @return Resource collection API of DataConnections. */
    public DataConnections dataConnections() {
        if (this.dataConnections == null) {
            this.dataConnections = new DataConnectionsImpl(clientObject.getDataConnections(), this);
        }
        return dataConnections;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * @return Wrapped service client KustoManagementClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public KustoManagementClient serviceClient() {
        return this.clientObject;
    }
}
