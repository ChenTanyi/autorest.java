// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ClusterInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.FollowerDatabaseDefinitionInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Cluster. */
public interface Cluster {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The SKU of the cluster.
     *
     * @return the sku value.
     */
    AzureSku sku();

    /**
     * Gets the zones property: The availability zones of the cluster.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the identity property: The identity of the cluster, if configured.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the state property: The state of the resource.
     *
     * @return the state value.
     */
    State state();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the uri property: The cluster URI.
     *
     * @return the uri value.
     */
    String uri();

    /**
     * Gets the dataIngestionUri property: The cluster data ingestion URI.
     *
     * @return the dataIngestionUri value.
     */
    String dataIngestionUri();

    /**
     * Gets the stateReason property: The reason for the cluster's current state.
     *
     * @return the stateReason value.
     */
    String stateReason();

    /**
     * Gets the trustedExternalTenants property: The cluster's external tenants.
     *
     * @return the trustedExternalTenants value.
     */
    List<TrustedExternalTenant> trustedExternalTenants();

    /**
     * Gets the optimizedAutoscale property: Optimized auto scale definition.
     *
     * @return the optimizedAutoscale value.
     */
    OptimizedAutoscale optimizedAutoscale();

    /**
     * Gets the enableDiskEncryption property: A boolean value that indicates if the cluster's disks are encrypted.
     *
     * @return the enableDiskEncryption value.
     */
    Boolean enableDiskEncryption();

    /**
     * Gets the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     *
     * @return the enableStreamingIngest value.
     */
    Boolean enableStreamingIngest();

    /**
     * Gets the virtualNetworkConfiguration property: Virtual network definition.
     *
     * @return the virtualNetworkConfiguration value.
     */
    VirtualNetworkConfiguration virtualNetworkConfiguration();

    /**
     * Gets the keyVaultProperties property: KeyVault properties for the cluster encryption.
     *
     * @return the keyVaultProperties value.
     */
    KeyVaultProperties keyVaultProperties();

    /**
     * Gets the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     *
     * @return the enablePurge value.
     */
    Boolean enablePurge();

    /**
     * Gets the languageExtensions property: List of the cluster's language extensions.
     *
     * @return the languageExtensions value.
     */
    LanguageExtensionsList languageExtensions();

    /**
     * Gets the enableDoubleEncryption property: A boolean value that indicates if double encryption is enabled.
     *
     * @return the enableDoubleEncryption value.
     */
    Boolean enableDoubleEncryption();

    /**
     * Gets the engineType property: The engine type.
     *
     * @return the engineType value.
     */
    EngineType engineType();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.azurekusto.generated.fluent.models.ClusterInner object.
     *
     * @return the inner object.
     */
    ClusterInner innerModel();

    /** The entirety of the Cluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The Cluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the Cluster definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Cluster definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Cluster definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group containing the Kusto cluster.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Cluster definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the cluster..
             *
             * @param sku The SKU of the cluster.
             * @return the next definition stage.
             */
            WithCreate withSku(AzureSku sku);
        }
        /**
         * The stage of the Cluster definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithZones,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithTrustedExternalTenants,
                DefinitionStages.WithOptimizedAutoscale,
                DefinitionStages.WithEnableDiskEncryption,
                DefinitionStages.WithEnableStreamingIngest,
                DefinitionStages.WithVirtualNetworkConfiguration,
                DefinitionStages.WithKeyVaultProperties,
                DefinitionStages.WithEnablePurge,
                DefinitionStages.WithEnableDoubleEncryption,
                DefinitionStages.WithEngineType,
                DefinitionStages.WithIfMatch,
                DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Cluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cluster create(Context context);
        }
        /** The stage of the Cluster definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Cluster definition allowing to specify zones. */
        interface WithZones {
            /**
             * Specifies the zones property: The availability zones of the cluster..
             *
             * @param zones The availability zones of the cluster.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }
        /** The stage of the Cluster definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the cluster, if configured..
             *
             * @param identity The identity of the cluster, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the Cluster definition allowing to specify trustedExternalTenants. */
        interface WithTrustedExternalTenants {
            /**
             * Specifies the trustedExternalTenants property: The cluster's external tenants..
             *
             * @param trustedExternalTenants The cluster's external tenants.
             * @return the next definition stage.
             */
            WithCreate withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants);
        }
        /** The stage of the Cluster definition allowing to specify optimizedAutoscale. */
        interface WithOptimizedAutoscale {
            /**
             * Specifies the optimizedAutoscale property: Optimized auto scale definition..
             *
             * @param optimizedAutoscale Optimized auto scale definition.
             * @return the next definition stage.
             */
            WithCreate withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale);
        }
        /** The stage of the Cluster definition allowing to specify enableDiskEncryption. */
        interface WithEnableDiskEncryption {
            /**
             * Specifies the enableDiskEncryption property: A boolean value that indicates if the cluster's disks are
             * encrypted..
             *
             * @param enableDiskEncryption A boolean value that indicates if the cluster's disks are encrypted.
             * @return the next definition stage.
             */
            WithCreate withEnableDiskEncryption(Boolean enableDiskEncryption);
        }
        /** The stage of the Cluster definition allowing to specify enableStreamingIngest. */
        interface WithEnableStreamingIngest {
            /**
             * Specifies the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is
             * enabled..
             *
             * @param enableStreamingIngest A boolean value that indicates if the streaming ingest is enabled.
             * @return the next definition stage.
             */
            WithCreate withEnableStreamingIngest(Boolean enableStreamingIngest);
        }
        /** The stage of the Cluster definition allowing to specify virtualNetworkConfiguration. */
        interface WithVirtualNetworkConfiguration {
            /**
             * Specifies the virtualNetworkConfiguration property: Virtual network definition..
             *
             * @param virtualNetworkConfiguration Virtual network definition.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration);
        }
        /** The stage of the Cluster definition allowing to specify keyVaultProperties. */
        interface WithKeyVaultProperties {
            /**
             * Specifies the keyVaultProperties property: KeyVault properties for the cluster encryption..
             *
             * @param keyVaultProperties KeyVault properties for the cluster encryption.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultProperties(KeyVaultProperties keyVaultProperties);
        }
        /** The stage of the Cluster definition allowing to specify enablePurge. */
        interface WithEnablePurge {
            /**
             * Specifies the enablePurge property: A boolean value that indicates if the purge operations are enabled..
             *
             * @param enablePurge A boolean value that indicates if the purge operations are enabled.
             * @return the next definition stage.
             */
            WithCreate withEnablePurge(Boolean enablePurge);
        }
        /** The stage of the Cluster definition allowing to specify enableDoubleEncryption. */
        interface WithEnableDoubleEncryption {
            /**
             * Specifies the enableDoubleEncryption property: A boolean value that indicates if double encryption is
             * enabled..
             *
             * @param enableDoubleEncryption A boolean value that indicates if double encryption is enabled.
             * @return the next definition stage.
             */
            WithCreate withEnableDoubleEncryption(Boolean enableDoubleEncryption);
        }
        /** The stage of the Cluster definition allowing to specify engineType. */
        interface WithEngineType {
            /**
             * Specifies the engineType property: The engine type.
             *
             * @param engineType The engine type.
             * @return the next definition stage.
             */
            WithCreate withEngineType(EngineType engineType);
        }
        /** The stage of the Cluster definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the cluster. Omit this value to always overwrite the current
             * cluster. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             *
             * @param ifMatch The ETag of the cluster. Omit this value to always overwrite the current cluster. Specify
             *     the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the Cluster definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new cluster to be created, but to prevent
             * updating an existing cluster. Other values will result in a 412 Pre-condition Failed response..
             *
             * @param ifNoneMatch Set to '*' to allow a new cluster to be created, but to prevent updating an existing
             *     cluster. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the Cluster resource.
     *
     * @return the stage of resource update.
     */
    Cluster.Update update();

    /** The template for Cluster update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity,
            UpdateStages.WithTrustedExternalTenants,
            UpdateStages.WithOptimizedAutoscale,
            UpdateStages.WithEnableDiskEncryption,
            UpdateStages.WithEnableStreamingIngest,
            UpdateStages.WithVirtualNetworkConfiguration,
            UpdateStages.WithKeyVaultProperties,
            UpdateStages.WithEnablePurge,
            UpdateStages.WithEnableDoubleEncryption,
            UpdateStages.WithEngineType,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Cluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cluster apply(Context context);
    }
    /** The Cluster update stages. */
    interface UpdateStages {
        /** The stage of the Cluster update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Cluster update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the cluster..
             *
             * @param sku The SKU of the cluster.
             * @return the next definition stage.
             */
            Update withSku(AzureSku sku);
        }
        /** The stage of the Cluster update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the cluster, if configured..
             *
             * @param identity The identity of the cluster, if configured.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the Cluster update allowing to specify trustedExternalTenants. */
        interface WithTrustedExternalTenants {
            /**
             * Specifies the trustedExternalTenants property: The cluster's external tenants..
             *
             * @param trustedExternalTenants The cluster's external tenants.
             * @return the next definition stage.
             */
            Update withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants);
        }
        /** The stage of the Cluster update allowing to specify optimizedAutoscale. */
        interface WithOptimizedAutoscale {
            /**
             * Specifies the optimizedAutoscale property: Optimized auto scale definition..
             *
             * @param optimizedAutoscale Optimized auto scale definition.
             * @return the next definition stage.
             */
            Update withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale);
        }
        /** The stage of the Cluster update allowing to specify enableDiskEncryption. */
        interface WithEnableDiskEncryption {
            /**
             * Specifies the enableDiskEncryption property: A boolean value that indicates if the cluster's disks are
             * encrypted..
             *
             * @param enableDiskEncryption A boolean value that indicates if the cluster's disks are encrypted.
             * @return the next definition stage.
             */
            Update withEnableDiskEncryption(Boolean enableDiskEncryption);
        }
        /** The stage of the Cluster update allowing to specify enableStreamingIngest. */
        interface WithEnableStreamingIngest {
            /**
             * Specifies the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is
             * enabled..
             *
             * @param enableStreamingIngest A boolean value that indicates if the streaming ingest is enabled.
             * @return the next definition stage.
             */
            Update withEnableStreamingIngest(Boolean enableStreamingIngest);
        }
        /** The stage of the Cluster update allowing to specify virtualNetworkConfiguration. */
        interface WithVirtualNetworkConfiguration {
            /**
             * Specifies the virtualNetworkConfiguration property: Virtual network definition..
             *
             * @param virtualNetworkConfiguration Virtual network definition.
             * @return the next definition stage.
             */
            Update withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration);
        }
        /** The stage of the Cluster update allowing to specify keyVaultProperties. */
        interface WithKeyVaultProperties {
            /**
             * Specifies the keyVaultProperties property: KeyVault properties for the cluster encryption..
             *
             * @param keyVaultProperties KeyVault properties for the cluster encryption.
             * @return the next definition stage.
             */
            Update withKeyVaultProperties(KeyVaultProperties keyVaultProperties);
        }
        /** The stage of the Cluster update allowing to specify enablePurge. */
        interface WithEnablePurge {
            /**
             * Specifies the enablePurge property: A boolean value that indicates if the purge operations are enabled..
             *
             * @param enablePurge A boolean value that indicates if the purge operations are enabled.
             * @return the next definition stage.
             */
            Update withEnablePurge(Boolean enablePurge);
        }
        /** The stage of the Cluster update allowing to specify enableDoubleEncryption. */
        interface WithEnableDoubleEncryption {
            /**
             * Specifies the enableDoubleEncryption property: A boolean value that indicates if double encryption is
             * enabled..
             *
             * @param enableDoubleEncryption A boolean value that indicates if double encryption is enabled.
             * @return the next definition stage.
             */
            Update withEnableDoubleEncryption(Boolean enableDoubleEncryption);
        }
        /** The stage of the Cluster update allowing to specify engineType. */
        interface WithEngineType {
            /**
             * Specifies the engineType property: The engine type.
             *
             * @param engineType The engine type.
             * @return the next definition stage.
             */
            Update withEngineType(EngineType engineType);
        }
        /** The stage of the Cluster update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the cluster. Omit this value to always overwrite the current
             * cluster. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             *
             * @param ifMatch The ETag of the cluster. Omit this value to always overwrite the current cluster. Specify
             *     the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Cluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cluster refresh(Context context);

    /**
     * Stops a Kusto cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stops a Kusto cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);

    /**
     * Starts a Kusto cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Starts a Kusto cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Returns a list of databases that are owned by this cluster and were followed by another cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principals operation response.
     */
    PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases();

    /**
     * Returns a list of databases that are owned by this cluster and were followed by another cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principals operation response.
     */
    PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(Context context);

    /**
     * Detaches all followers of a database owned by this cluster.
     *
     * @param followerDatabaseToRemove The follower databases properties to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove);

    /**
     * Detaches all followers of a database owned by this cluster.
     *
     * @param followerDatabaseToRemove The follower databases properties to remove.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove, Context context);

    /**
     * Diagnoses network connectivity status for external resources on which the service is dependent on.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    DiagnoseVirtualNetworkResult diagnoseVirtualNetwork();

    /**
     * Diagnoses network connectivity status for external resources on which the service is dependent on.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    DiagnoseVirtualNetworkResult diagnoseVirtualNetwork(Context context);

    /**
     * Returns a list of language extensions that can run within KQL queries.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of language extension objects.
     */
    PagedIterable<LanguageExtension> listLanguageExtensions();

    /**
     * Returns a list of language extensions that can run within KQL queries.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of language extension objects.
     */
    PagedIterable<LanguageExtension> listLanguageExtensions(Context context);

    /**
     * Add a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToAdd The language extensions to add.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd);

    /**
     * Add a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToAdd The language extensions to add.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd, Context context);

    /**
     * Remove a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToRemove The language extensions to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove);

    /**
     * Remove a list of language extensions that can run within KQL queries.
     *
     * @param languageExtensionsToRemove The language extensions to remove.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove, Context context);
}
