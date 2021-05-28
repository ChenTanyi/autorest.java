// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

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
import com.azure.resourcemanager.storage.generated.fluent.StorageManagementClient;
import com.azure.resourcemanager.storage.generated.implementation.BlobContainersImpl;
import com.azure.resourcemanager.storage.generated.implementation.BlobInventoryPoliciesImpl;
import com.azure.resourcemanager.storage.generated.implementation.BlobServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.DeletedAccountsImpl;
import com.azure.resourcemanager.storage.generated.implementation.EncryptionScopesImpl;
import com.azure.resourcemanager.storage.generated.implementation.FileServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.FileSharesImpl;
import com.azure.resourcemanager.storage.generated.implementation.ManagementPoliciesImpl;
import com.azure.resourcemanager.storage.generated.implementation.ObjectReplicationPoliciesOperationsImpl;
import com.azure.resourcemanager.storage.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.storage.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.storage.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.storage.generated.implementation.QueueServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.QueuesImpl;
import com.azure.resourcemanager.storage.generated.implementation.SkusImpl;
import com.azure.resourcemanager.storage.generated.implementation.StorageAccountsImpl;
import com.azure.resourcemanager.storage.generated.implementation.StorageManagementClientBuilder;
import com.azure.resourcemanager.storage.generated.implementation.TableServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.TablesImpl;
import com.azure.resourcemanager.storage.generated.implementation.UsagesImpl;
import com.azure.resourcemanager.storage.generated.models.BlobContainers;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicies;
import com.azure.resourcemanager.storage.generated.models.BlobServices;
import com.azure.resourcemanager.storage.generated.models.DeletedAccounts;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopes;
import com.azure.resourcemanager.storage.generated.models.FileServices;
import com.azure.resourcemanager.storage.generated.models.FileShares;
import com.azure.resourcemanager.storage.generated.models.ManagementPolicies;
import com.azure.resourcemanager.storage.generated.models.ObjectReplicationPoliciesOperations;
import com.azure.resourcemanager.storage.generated.models.Operations;
import com.azure.resourcemanager.storage.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.storage.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.storage.generated.models.QueueServices;
import com.azure.resourcemanager.storage.generated.models.Queues;
import com.azure.resourcemanager.storage.generated.models.Skus;
import com.azure.resourcemanager.storage.generated.models.StorageAccounts;
import com.azure.resourcemanager.storage.generated.models.TableServices;
import com.azure.resourcemanager.storage.generated.models.Tables;
import com.azure.resourcemanager.storage.generated.models.Usages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to StorageManager. The Azure Storage Management API. */
public final class StorageManager {
    private Operations operations;

    private Skus skus;

    private StorageAccounts storageAccounts;

    private DeletedAccounts deletedAccounts;

    private Usages usages;

    private ManagementPolicies managementPolicies;

    private BlobInventoryPolicies blobInventoryPolicies;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private ObjectReplicationPoliciesOperations objectReplicationPoliciesOperations;

    private EncryptionScopes encryptionScopes;

    private BlobServices blobServices;

    private BlobContainers blobContainers;

    private FileServices fileServices;

    private FileShares fileShares;

    private QueueServices queueServices;

    private Queues queues;

    private TableServices tableServices;

    private Tables tables;

    private final StorageManagementClient clientObject;

    private StorageManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new StorageManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Storage service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Storage service API instance.
     */
    public static StorageManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create StorageManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new StorageManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
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
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
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
         * Creates an instance of Storage service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Storage service API instance.
         */
        public StorageManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.storage.generated")
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

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
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
            policies.add(new BearerTokenAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new StorageManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Skus. */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /** @return Resource collection API of StorageAccounts. */
    public StorageAccounts storageAccounts() {
        if (this.storageAccounts == null) {
            this.storageAccounts = new StorageAccountsImpl(clientObject.getStorageAccounts(), this);
        }
        return storageAccounts;
    }

    /** @return Resource collection API of DeletedAccounts. */
    public DeletedAccounts deletedAccounts() {
        if (this.deletedAccounts == null) {
            this.deletedAccounts = new DeletedAccountsImpl(clientObject.getDeletedAccounts(), this);
        }
        return deletedAccounts;
    }

    /** @return Resource collection API of Usages. */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /** @return Resource collection API of ManagementPolicies. */
    public ManagementPolicies managementPolicies() {
        if (this.managementPolicies == null) {
            this.managementPolicies = new ManagementPoliciesImpl(clientObject.getManagementPolicies(), this);
        }
        return managementPolicies;
    }

    /** @return Resource collection API of BlobInventoryPolicies. */
    public BlobInventoryPolicies blobInventoryPolicies() {
        if (this.blobInventoryPolicies == null) {
            this.blobInventoryPolicies = new BlobInventoryPoliciesImpl(clientObject.getBlobInventoryPolicies(), this);
        }
        return blobInventoryPolicies;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /** @return Resource collection API of ObjectReplicationPoliciesOperations. */
    public ObjectReplicationPoliciesOperations objectReplicationPoliciesOperations() {
        if (this.objectReplicationPoliciesOperations == null) {
            this.objectReplicationPoliciesOperations =
                new ObjectReplicationPoliciesOperationsImpl(
                    clientObject.getObjectReplicationPoliciesOperations(), this);
        }
        return objectReplicationPoliciesOperations;
    }

    /** @return Resource collection API of EncryptionScopes. */
    public EncryptionScopes encryptionScopes() {
        if (this.encryptionScopes == null) {
            this.encryptionScopes = new EncryptionScopesImpl(clientObject.getEncryptionScopes(), this);
        }
        return encryptionScopes;
    }

    /** @return Resource collection API of BlobServices. */
    public BlobServices blobServices() {
        if (this.blobServices == null) {
            this.blobServices = new BlobServicesImpl(clientObject.getBlobServices(), this);
        }
        return blobServices;
    }

    /** @return Resource collection API of BlobContainers. */
    public BlobContainers blobContainers() {
        if (this.blobContainers == null) {
            this.blobContainers = new BlobContainersImpl(clientObject.getBlobContainers(), this);
        }
        return blobContainers;
    }

    /** @return Resource collection API of FileServices. */
    public FileServices fileServices() {
        if (this.fileServices == null) {
            this.fileServices = new FileServicesImpl(clientObject.getFileServices(), this);
        }
        return fileServices;
    }

    /** @return Resource collection API of FileShares. */
    public FileShares fileShares() {
        if (this.fileShares == null) {
            this.fileShares = new FileSharesImpl(clientObject.getFileShares(), this);
        }
        return fileShares;
    }

    /** @return Resource collection API of QueueServices. */
    public QueueServices queueServices() {
        if (this.queueServices == null) {
            this.queueServices = new QueueServicesImpl(clientObject.getQueueServices(), this);
        }
        return queueServices;
    }

    /** @return Resource collection API of Queues. */
    public Queues queues() {
        if (this.queues == null) {
            this.queues = new QueuesImpl(clientObject.getQueues(), this);
        }
        return queues;
    }

    /** @return Resource collection API of TableServices. */
    public TableServices tableServices() {
        if (this.tableServices == null) {
            this.tableServices = new TableServicesImpl(clientObject.getTableServices(), this);
        }
        return tableServices;
    }

    /** @return Resource collection API of Tables. */
    public Tables tables() {
        if (this.tables == null) {
            this.tables = new TablesImpl(clientObject.getTables(), this);
        }
        return tables;
    }

    /**
     * @return Wrapped service client StorageManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public StorageManagementClient serviceClient() {
        return this.clientObject;
    }
}
