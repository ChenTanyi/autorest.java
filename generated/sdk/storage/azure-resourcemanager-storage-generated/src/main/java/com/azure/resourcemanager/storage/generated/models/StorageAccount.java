// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of StorageAccount. */
@Immutable
public interface StorageAccount {
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
     * Gets the sku property: Gets the SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the kind property: Gets the Kind.
     *
     * @return the kind value.
     */
    Kind kind();

    /**
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the provisioningState property: Gets the status of the storage account at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the primaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue,
     * or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     *
     * @return the primaryEndpoints value.
     */
    Endpoints primaryEndpoints();

    /**
     * Gets the primaryLocation property: Gets the location of the primary data center for the storage account.
     *
     * @return the primaryLocation value.
     */
    String primaryLocation();

    /**
     * Gets the statusOfPrimary property: Gets the status indicating whether the primary location of the storage account
     * is available or unavailable.
     *
     * @return the statusOfPrimary value.
     */
    AccountStatus statusOfPrimary();

    /**
     * Gets the lastGeoFailoverTime property: Gets the timestamp of the most recent instance of a failover to the
     * secondary location. Only the most recent timestamp is retained. This element is not returned if there has never
     * been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the lastGeoFailoverTime value.
     */
    OffsetDateTime lastGeoFailoverTime();

    /**
     * Gets the secondaryLocation property: Gets the location of the geo-replicated secondary for the storage account.
     * Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the secondaryLocation value.
     */
    String secondaryLocation();

    /**
     * Gets the statusOfSecondary property: Gets the status indicating whether the secondary location of the storage
     * account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     *
     * @return the statusOfSecondary value.
     */
    AccountStatus statusOfSecondary();

    /**
     * Gets the creationTime property: Gets the creation date and time of the storage account in UTC.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the customDomain property: Gets the custom domain the user assigned to this storage account.
     *
     * @return the customDomain value.
     */
    CustomDomain customDomain();

    /**
     * Gets the secondaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue,
     * or table object from the secondary location of the storage account. Only available if the SKU name is
     * Standard_RAGRS.
     *
     * @return the secondaryEndpoints value.
     */
    Endpoints secondaryEndpoints();

    /**
     * Gets the encryption property: Gets the encryption settings on the account. If unspecified, the account is
     * unencrypted.
     *
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * Gets the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @return the accessTier value.
     */
    AccessTier accessTier();

    /**
     * Gets the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication();

    /**
     * Gets the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    Boolean enableHttpsTrafficOnly();

    /**
     * Gets the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    NetworkRuleSet networkRuleSet();

    /**
     * Gets the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @return the isHnsEnabled value.
     */
    Boolean isHnsEnabled();

    /**
     * Gets the geoReplicationStats property: Geo Replication Stats.
     *
     * @return the geoReplicationStats value.
     */
    GeoReplicationStats geoReplicationStats();

    /**
     * Gets the failoverInProgress property: If the failover is in progress, the value will be true, otherwise, it will
     * be null.
     *
     * @return the failoverInProgress value.
     */
    Boolean failoverInProgress();

    /**
     * Gets the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    LargeFileSharesState largeFileSharesState();

    /**
     * Gets the privateEndpointConnections property: List of private endpoint connection associated with the specified
     * storage account.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    RoutingPreference routingPreference();

    /**
     * Gets the blobRestoreStatus property: Blob restore status.
     *
     * @return the blobRestoreStatus value.
     */
    BlobRestoreStatus blobRestoreStatus();

    /**
     * Gets the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the
     * storage account. The default interpretation is true for this property.
     *
     * @return the allowBlobPublicAccess value.
     */
    Boolean allowBlobPublicAccess();

    /**
     * Gets the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @return the minimumTlsVersion value.
     */
    MinimumTlsVersion minimumTlsVersion();

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
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountInner object.
     *
     * @return the inner object.
     */
    StorageAccountInner innerModel();

    /** The entirety of the StorageAccount definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithKind,
            DefinitionStages.WithCreate {
    }
    /** The StorageAccount definition stages. */
    interface DefinitionStages {
        /** The first stage of the StorageAccount definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the StorageAccount definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Required. Gets or sets the location of the resource. This will be one of the supported
             *     and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a
             *     resource cannot be changed once it is created, but if an identical geo region is specified on update,
             *     the request will succeed.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Required. Gets or sets the location of the resource. This will be one of the supported
             *     and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a
             *     resource cannot be changed once it is created, but if an identical geo region is specified on update,
             *     the request will succeed.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the StorageAccount definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             *     insensitive.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the StorageAccount definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Required. Gets or sets the SKU name..
             *
             * @param sku Required. Gets or sets the SKU name.
             * @return the next definition stage.
             */
            WithKind withSku(Sku sku);
        }
        /** The stage of the StorageAccount definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Required. Indicates the type of storage account..
             *
             * @param kind Required. Indicates the type of storage account.
             * @return the next definition stage.
             */
            WithCreate withKind(Kind kind);
        }
        /**
         * The stage of the StorageAccount definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithCustomDomain,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithNetworkRuleSet,
                DefinitionStages.WithAccessTier,
                DefinitionStages.WithAzureFilesIdentityBasedAuthentication,
                DefinitionStages.WithEnableHttpsTrafficOnly,
                DefinitionStages.WithIsHnsEnabled,
                DefinitionStages.WithLargeFileSharesState,
                DefinitionStages.WithRoutingPreference,
                DefinitionStages.WithAllowBlobPublicAccess,
                DefinitionStages.WithMinimumTlsVersion {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StorageAccount create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StorageAccount create(Context context);
        }
        /** The stage of the StorageAccount definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets a list of key value pairs that describe the resource. These
             * tags can be used for viewing and grouping this resource (across resource groups). A maximum of 15 tags
             * can be provided for a resource. Each tag must have a key with a length no greater than 128 characters and
             * a value with a length no greater than 256 characters..
             *
             * @param tags Gets or sets a list of key value pairs that describe the resource. These tags can be used for
             *     viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for
             *     a resource. Each tag must have a key with a length no greater than 128 characters and a value with a
             *     length no greater than 256 characters.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the StorageAccount definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the StorageAccount definition allowing to specify customDomain. */
        interface WithCustomDomain {
            /**
             * Specifies the customDomain property: User domain assigned to the storage account. Name is the CNAME
             * source. Only one custom domain is supported per storage account at this time. To clear the existing
             * custom domain, use an empty string for the custom domain name property..
             *
             * @param customDomain User domain assigned to the storage account. Name is the CNAME source. Only one
             *     custom domain is supported per storage account at this time. To clear the existing custom domain, use
             *     an empty string for the custom domain name property.
             * @return the next definition stage.
             */
            WithCreate withCustomDomain(CustomDomain customDomain);
        }
        /** The stage of the StorageAccount definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Not applicable. Azure Storage encryption is enabled for all storage
             * accounts and cannot be disabled..
             *
             * @param encryption Not applicable. Azure Storage encryption is enabled for all storage accounts and cannot
             *     be disabled.
             * @return the next definition stage.
             */
            WithCreate withEncryption(Encryption encryption);
        }
        /** The stage of the StorageAccount definition allowing to specify networkRuleSet. */
        interface WithNetworkRuleSet {
            /**
             * Specifies the networkRuleSet property: Network rule set.
             *
             * @param networkRuleSet Network rule set.
             * @return the next definition stage.
             */
            WithCreate withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }
        /** The stage of the StorageAccount definition allowing to specify accessTier. */
        interface WithAccessTier {
            /**
             * Specifies the accessTier property: Required for storage accounts where kind = BlobStorage. The access
             * tier used for billing..
             *
             * @param accessTier Required for storage accounts where kind = BlobStorage. The access tier used for
             *     billing.
             * @return the next definition stage.
             */
            WithCreate withAccessTier(AccessTier accessTier);
        }
        /** The stage of the StorageAccount definition allowing to specify azureFilesIdentityBasedAuthentication. */
        interface WithAzureFilesIdentityBasedAuthentication {
            /**
             * Specifies the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication
             * settings for Azure Files..
             *
             * @param azureFilesIdentityBasedAuthentication Provides the identity based authentication settings for
             *     Azure Files.
             * @return the next definition stage.
             */
            WithCreate withAzureFilesIdentityBasedAuthentication(
                AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication);
        }
        /** The stage of the StorageAccount definition allowing to specify enableHttpsTrafficOnly. */
        interface WithEnableHttpsTrafficOnly {
            /**
             * Specifies the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to
             * true. The default value is true since API version 2019-04-01..
             *
             * @param enableHttpsTrafficOnly Allows https traffic only to storage service if sets to true. The default
             *     value is true since API version 2019-04-01.
             * @return the next definition stage.
             */
            WithCreate withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly);
        }
        /** The stage of the StorageAccount definition allowing to specify isHnsEnabled. */
        interface WithIsHnsEnabled {
            /**
             * Specifies the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true..
             *
             * @param isHnsEnabled Account HierarchicalNamespace enabled if sets to true.
             * @return the next definition stage.
             */
            WithCreate withIsHnsEnabled(Boolean isHnsEnabled);
        }
        /** The stage of the StorageAccount definition allowing to specify largeFileSharesState. */
        interface WithLargeFileSharesState {
            /**
             * Specifies the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be
             * disabled once it is enabled..
             *
             * @param largeFileSharesState Allow large file shares if sets to Enabled. It cannot be disabled once it is
             *     enabled.
             * @return the next definition stage.
             */
            WithCreate withLargeFileSharesState(LargeFileSharesState largeFileSharesState);
        }
        /** The stage of the StorageAccount definition allowing to specify routingPreference. */
        interface WithRoutingPreference {
            /**
             * Specifies the routingPreference property: Maintains information about the network routing choice opted by
             * the user for data transfer.
             *
             * @param routingPreference Maintains information about the network routing choice opted by the user for
             *     data transfer.
             * @return the next definition stage.
             */
            WithCreate withRoutingPreference(RoutingPreference routingPreference);
        }
        /** The stage of the StorageAccount definition allowing to specify allowBlobPublicAccess. */
        interface WithAllowBlobPublicAccess {
            /**
             * Specifies the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers
             * in the storage account. The default interpretation is true for this property..
             *
             * @param allowBlobPublicAccess Allow or disallow public access to all blobs or containers in the storage
             *     account. The default interpretation is true for this property.
             * @return the next definition stage.
             */
            WithCreate withAllowBlobPublicAccess(Boolean allowBlobPublicAccess);
        }
        /** The stage of the StorageAccount definition allowing to specify minimumTlsVersion. */
        interface WithMinimumTlsVersion {
            /**
             * Specifies the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to
             * storage. The default interpretation is TLS 1.0 for this property..
             *
             * @param minimumTlsVersion Set the minimum TLS version to be permitted on requests to storage. The default
             *     interpretation is TLS 1.0 for this property.
             * @return the next definition stage.
             */
            WithCreate withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion);
        }
    }
    /**
     * Begins update for the StorageAccount resource.
     *
     * @return the stage of resource update.
     */
    StorageAccount.Update update();

    /** The template for StorageAccount update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity,
            UpdateStages.WithKind,
            UpdateStages.WithCustomDomain,
            UpdateStages.WithEncryption,
            UpdateStages.WithAccessTier,
            UpdateStages.WithAzureFilesIdentityBasedAuthentication,
            UpdateStages.WithEnableHttpsTrafficOnly,
            UpdateStages.WithNetworkRuleSet,
            UpdateStages.WithLargeFileSharesState,
            UpdateStages.WithRoutingPreference,
            UpdateStages.WithAllowBlobPublicAccess,
            UpdateStages.WithMinimumTlsVersion {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        StorageAccount apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StorageAccount apply(Context context);
    }
    /** The StorageAccount update stages. */
    interface UpdateStages {
        /** The stage of the StorageAccount update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets a list of key value pairs that describe the resource. These
             * tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can
             * be provided for a resource. Each tag must have a key no greater in length than 128 characters and a value
             * no greater in length than 256 characters..
             *
             * @param tags Gets or sets a list of key value pairs that describe the resource. These tags can be used in
             *     viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for
             *     a resource. Each tag must have a key no greater in length than 128 characters and a value no greater
             *     in length than 256 characters.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the StorageAccount update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Gets or sets the SKU name. Note that the SKU name cannot be updated to
             * Standard_ZRS, Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other
             * value..
             *
             * @param sku Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS,
             *     Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other value.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the StorageAccount update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the StorageAccount update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Optional. Indicates the type of storage account. Currently only StorageV2
             * value supported by server..
             *
             * @param kind Optional. Indicates the type of storage account. Currently only StorageV2 value supported by
             *     server.
             * @return the next definition stage.
             */
            Update withKind(Kind kind);
        }
        /** The stage of the StorageAccount update allowing to specify customDomain. */
        interface WithCustomDomain {
            /**
             * Specifies the customDomain property: Custom domain assigned to the storage account by the user. Name is
             * the CNAME source. Only one custom domain is supported per storage account at this time. To clear the
             * existing custom domain, use an empty string for the custom domain name property..
             *
             * @param customDomain Custom domain assigned to the storage account by the user. Name is the CNAME source.
             *     Only one custom domain is supported per storage account at this time. To clear the existing custom
             *     domain, use an empty string for the custom domain name property.
             * @return the next definition stage.
             */
            Update withCustomDomain(CustomDomain customDomain);
        }
        /** The stage of the StorageAccount update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Provides the encryption settings on the account. The default setting
             * is unencrypted..
             *
             * @param encryption Provides the encryption settings on the account. The default setting is unencrypted.
             * @return the next definition stage.
             */
            Update withEncryption(Encryption encryption);
        }
        /** The stage of the StorageAccount update allowing to specify accessTier. */
        interface WithAccessTier {
            /**
             * Specifies the accessTier property: Required for storage accounts where kind = BlobStorage. The access
             * tier used for billing..
             *
             * @param accessTier Required for storage accounts where kind = BlobStorage. The access tier used for
             *     billing.
             * @return the next definition stage.
             */
            Update withAccessTier(AccessTier accessTier);
        }
        /** The stage of the StorageAccount update allowing to specify azureFilesIdentityBasedAuthentication. */
        interface WithAzureFilesIdentityBasedAuthentication {
            /**
             * Specifies the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication
             * settings for Azure Files..
             *
             * @param azureFilesIdentityBasedAuthentication Provides the identity based authentication settings for
             *     Azure Files.
             * @return the next definition stage.
             */
            Update withAzureFilesIdentityBasedAuthentication(
                AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication);
        }
        /** The stage of the StorageAccount update allowing to specify enableHttpsTrafficOnly. */
        interface WithEnableHttpsTrafficOnly {
            /**
             * Specifies the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to
             * true..
             *
             * @param enableHttpsTrafficOnly Allows https traffic only to storage service if sets to true.
             * @return the next definition stage.
             */
            Update withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly);
        }
        /** The stage of the StorageAccount update allowing to specify networkRuleSet. */
        interface WithNetworkRuleSet {
            /**
             * Specifies the networkRuleSet property: Network rule set.
             *
             * @param networkRuleSet Network rule set.
             * @return the next definition stage.
             */
            Update withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }
        /** The stage of the StorageAccount update allowing to specify largeFileSharesState. */
        interface WithLargeFileSharesState {
            /**
             * Specifies the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be
             * disabled once it is enabled..
             *
             * @param largeFileSharesState Allow large file shares if sets to Enabled. It cannot be disabled once it is
             *     enabled.
             * @return the next definition stage.
             */
            Update withLargeFileSharesState(LargeFileSharesState largeFileSharesState);
        }
        /** The stage of the StorageAccount update allowing to specify routingPreference. */
        interface WithRoutingPreference {
            /**
             * Specifies the routingPreference property: Maintains information about the network routing choice opted by
             * the user for data transfer.
             *
             * @param routingPreference Maintains information about the network routing choice opted by the user for
             *     data transfer.
             * @return the next definition stage.
             */
            Update withRoutingPreference(RoutingPreference routingPreference);
        }
        /** The stage of the StorageAccount update allowing to specify allowBlobPublicAccess. */
        interface WithAllowBlobPublicAccess {
            /**
             * Specifies the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers
             * in the storage account. The default interpretation is true for this property..
             *
             * @param allowBlobPublicAccess Allow or disallow public access to all blobs or containers in the storage
             *     account. The default interpretation is true for this property.
             * @return the next definition stage.
             */
            Update withAllowBlobPublicAccess(Boolean allowBlobPublicAccess);
        }
        /** The stage of the StorageAccount update allowing to specify minimumTlsVersion. */
        interface WithMinimumTlsVersion {
            /**
             * Specifies the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to
             * storage. The default interpretation is TLS 1.0 for this property..
             *
             * @param minimumTlsVersion Set the minimum TLS version to be permitted on requests to storage. The default
             *     interpretation is TLS 1.0 for this property.
             * @return the next definition stage.
             */
            Update withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StorageAccount refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StorageAccount refresh(Context context);
}
