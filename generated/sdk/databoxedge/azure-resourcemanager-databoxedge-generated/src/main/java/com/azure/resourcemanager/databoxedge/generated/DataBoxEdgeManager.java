// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

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
import com.azure.resourcemanager.databoxedge.generated.fluent.DataBoxEdgeManagementClient;
import com.azure.resourcemanager.databoxedge.generated.implementation.AlertsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.BandwidthSchedulesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.ContainersImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.DataBoxEdgeManagementClientBuilder;
import com.azure.resourcemanager.databoxedge.generated.implementation.DevicesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.JobsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.NodesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.OperationsStatusImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.OrdersImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.RolesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.SharesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.SkusImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.StorageAccountCredentialsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.StorageAccountsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.TriggersImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.UsersImpl;
import com.azure.resourcemanager.databoxedge.generated.models.Alerts;
import com.azure.resourcemanager.databoxedge.generated.models.BandwidthSchedules;
import com.azure.resourcemanager.databoxedge.generated.models.Containers;
import com.azure.resourcemanager.databoxedge.generated.models.Devices;
import com.azure.resourcemanager.databoxedge.generated.models.Jobs;
import com.azure.resourcemanager.databoxedge.generated.models.Nodes;
import com.azure.resourcemanager.databoxedge.generated.models.Operations;
import com.azure.resourcemanager.databoxedge.generated.models.OperationsStatus;
import com.azure.resourcemanager.databoxedge.generated.models.Orders;
import com.azure.resourcemanager.databoxedge.generated.models.Roles;
import com.azure.resourcemanager.databoxedge.generated.models.Shares;
import com.azure.resourcemanager.databoxedge.generated.models.Skus;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccountCredentials;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccounts;
import com.azure.resourcemanager.databoxedge.generated.models.Triggers;
import com.azure.resourcemanager.databoxedge.generated.models.Users;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to DataBoxEdgeManager. */
public final class DataBoxEdgeManager {
    private Operations operations;

    private Devices devices;

    private Alerts alerts;

    private BandwidthSchedules bandwidthSchedules;

    private Jobs jobs;

    private Nodes nodes;

    private OperationsStatus operationsStatus;

    private Orders orders;

    private Roles roles;

    private Shares shares;

    private StorageAccountCredentials storageAccountCredentials;

    private StorageAccounts storageAccounts;

    private Containers containers;

    private Triggers triggers;

    private Users users;

    private Skus skus;

    private final DataBoxEdgeManagementClient clientObject;

    private DataBoxEdgeManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DataBoxEdgeManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DataBoxEdge service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DataBoxEdge service API instance.
     */
    public static DataBoxEdgeManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create DataBoxEdgeManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DataBoxEdgeManager.Configurable();
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
         * Creates an instance of DataBoxEdge service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DataBoxEdge service API instance.
         */
        public DataBoxEdgeManager authenticate(TokenCredential credential, AzureProfile profile) {
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
                        "com.azure.resourcemanager.databoxedge.generated",
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
            return new DataBoxEdgeManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Devices. */
    public Devices devices() {
        if (this.devices == null) {
            this.devices = new DevicesImpl(clientObject.getDevices(), this);
        }
        return devices;
    }

    /** @return Resource collection API of Alerts. */
    public Alerts alerts() {
        if (this.alerts == null) {
            this.alerts = new AlertsImpl(clientObject.getAlerts(), this);
        }
        return alerts;
    }

    /** @return Resource collection API of BandwidthSchedules. */
    public BandwidthSchedules bandwidthSchedules() {
        if (this.bandwidthSchedules == null) {
            this.bandwidthSchedules = new BandwidthSchedulesImpl(clientObject.getBandwidthSchedules(), this);
        }
        return bandwidthSchedules;
    }

    /** @return Resource collection API of Jobs. */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /** @return Resource collection API of Nodes. */
    public Nodes nodes() {
        if (this.nodes == null) {
            this.nodes = new NodesImpl(clientObject.getNodes(), this);
        }
        return nodes;
    }

    /** @return Resource collection API of OperationsStatus. */
    public OperationsStatus operationsStatus() {
        if (this.operationsStatus == null) {
            this.operationsStatus = new OperationsStatusImpl(clientObject.getOperationsStatus(), this);
        }
        return operationsStatus;
    }

    /** @return Resource collection API of Orders. */
    public Orders orders() {
        if (this.orders == null) {
            this.orders = new OrdersImpl(clientObject.getOrders(), this);
        }
        return orders;
    }

    /** @return Resource collection API of Roles. */
    public Roles roles() {
        if (this.roles == null) {
            this.roles = new RolesImpl(clientObject.getRoles(), this);
        }
        return roles;
    }

    /** @return Resource collection API of Shares. */
    public Shares shares() {
        if (this.shares == null) {
            this.shares = new SharesImpl(clientObject.getShares(), this);
        }
        return shares;
    }

    /** @return Resource collection API of StorageAccountCredentials. */
    public StorageAccountCredentials storageAccountCredentials() {
        if (this.storageAccountCredentials == null) {
            this.storageAccountCredentials =
                new StorageAccountCredentialsImpl(clientObject.getStorageAccountCredentials(), this);
        }
        return storageAccountCredentials;
    }

    /** @return Resource collection API of StorageAccounts. */
    public StorageAccounts storageAccounts() {
        if (this.storageAccounts == null) {
            this.storageAccounts = new StorageAccountsImpl(clientObject.getStorageAccounts(), this);
        }
        return storageAccounts;
    }

    /** @return Resource collection API of Containers. */
    public Containers containers() {
        if (this.containers == null) {
            this.containers = new ContainersImpl(clientObject.getContainers(), this);
        }
        return containers;
    }

    /** @return Resource collection API of Triggers. */
    public Triggers triggers() {
        if (this.triggers == null) {
            this.triggers = new TriggersImpl(clientObject.getTriggers(), this);
        }
        return triggers;
    }

    /** @return Resource collection API of Users. */
    public Users users() {
        if (this.users == null) {
            this.users = new UsersImpl(clientObject.getUsers(), this);
        }
        return users;
    }

    /** @return Resource collection API of Skus. */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /**
     * @return Wrapped service client DataBoxEdgeManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public DataBoxEdgeManagementClient serviceClient() {
        return this.clientObject;
    }
}
