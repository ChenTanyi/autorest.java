// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultInner;
import java.util.Map;

/** An immutable client-side representation of Vault. */
public interface Vault {
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
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    IdentityData identity();

    /**
     * Gets the properties property: Properties of the vault.
     *
     * @return the properties value.
     */
    VaultProperties properties();

    /**
     * Gets the sku property: Identifies the unique system identifier for each Azure resource.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultInner object.
     *
     * @return the inner object.
     */
    VaultInner innerModel();

    /** The entirety of the Vault definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Vault definition stages. */
    interface DefinitionStages {
        /** The first stage of the Vault definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Vault definition allowing to specify location. */
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
        /** The stage of the Vault definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Vault definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithProperties,
                DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Vault create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Vault create(Context context);
        }
        /** The stage of the Vault definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Vault definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityData identity);
        }
        /** The stage of the Vault definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the vault..
             *
             * @param properties Properties of the vault.
             * @return the next definition stage.
             */
            WithCreate withProperties(VaultProperties properties);
        }
        /** The stage of the Vault definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Identifies the unique system identifier for each Azure resource..
             *
             * @param sku Identifies the unique system identifier for each Azure resource.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
    }
    /**
     * Begins update for the Vault resource.
     *
     * @return the stage of resource update.
     */
    Vault.Update update();

    /** The template for Vault update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithEtag,
            UpdateStages.WithProperties,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Vault apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Vault apply(Context context);
    }
    /** The Vault update stages. */
    interface UpdateStages {
        /** The stage of the Vault update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Vault update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Optional ETag..
             *
             * @param etag Optional ETag.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the Vault update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the vault..
             *
             * @param properties Properties of the vault.
             * @return the next definition stage.
             */
            Update withProperties(VaultProperties properties);
        }
        /** The stage of the Vault update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Identifies the unique system identifier for each Azure resource..
             *
             * @param sku Identifies the unique system identifier for each Azure resource.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the Vault update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityData identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Vault refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Vault refresh(Context context);
}
