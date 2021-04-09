// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.ManagedHsmInner;
import java.util.Map;

/** An immutable client-side representation of ManagedHsm. */
public interface ManagedHsm {
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
     * Gets the sku property: SKU details.
     *
     * @return the sku value.
     */
    ManagedHsmSku sku();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the key vault resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: Properties of the managed HSM.
     *
     * @return the properties value.
     */
    ManagedHsmProperties properties();

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
     * Gets the inner com.azure.resourcemanager.keyvault.generated.fluent.models.ManagedHsmInner object.
     *
     * @return the inner object.
     */
    ManagedHsmInner innerModel();

    /** The entirety of the ManagedHsm definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ManagedHsm definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagedHsm definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ManagedHsm definition allowing to specify location. */
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
        /** The stage of the ManagedHsm definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the ManagedHsm definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithSku, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagedHsm create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedHsm create(Context context);
        }
        /** The stage of the ManagedHsm definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ManagedHsm definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU details.
             *
             * @param sku SKU details.
             * @return the next definition stage.
             */
            WithCreate withSku(ManagedHsmSku sku);
        }
        /** The stage of the ManagedHsm definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the managed HSM.
             *
             * @param properties Properties of the managed HSM.
             * @return the next definition stage.
             */
            WithCreate withProperties(ManagedHsmProperties properties);
        }
    }
    /**
     * Begins update for the ManagedHsm resource.
     *
     * @return the stage of resource update.
     */
    ManagedHsm.Update update();

    /** The template for ManagedHsm update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSku, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagedHsm apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedHsm apply(Context context);
    }
    /** The ManagedHsm update stages. */
    interface UpdateStages {
        /** The stage of the ManagedHsm update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ManagedHsm update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU details.
             *
             * @param sku SKU details.
             * @return the next definition stage.
             */
            Update withSku(ManagedHsmSku sku);
        }
        /** The stage of the ManagedHsm update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the managed HSM.
             *
             * @param properties Properties of the managed HSM.
             * @return the next definition stage.
             */
            Update withProperties(ManagedHsmProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagedHsm refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedHsm refresh(Context context);
}