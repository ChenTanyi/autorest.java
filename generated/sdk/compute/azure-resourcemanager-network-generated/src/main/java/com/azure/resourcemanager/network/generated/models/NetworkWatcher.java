// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner;
import java.util.Map;

/** An immutable client-side representation of NetworkWatcher. */
@Immutable
public interface NetworkWatcher {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the provisioningState property: The provisioning state of the network watcher resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner object.
     *
     * @return the inner object.
     */
    NetworkWatcherInner innerModel();

    /** The entirety of the NetworkWatcher definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The NetworkWatcher definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkWatcher definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the NetworkWatcher definition allowing to specify location. */
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
        /** The stage of the NetworkWatcher definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the NetworkWatcher definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkWatcher create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkWatcher create(Context context);
        }
        /** The stage of the NetworkWatcher definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the NetworkWatcher definition allowing to specify id. */
        interface WithId {
            /**
             * Specifies the id property: Resource ID..
             *
             * @param id Resource ID.
             * @return the next definition stage.
             */
            WithCreate withId(String id);
        }
    }
    /**
     * Begins update for the NetworkWatcher resource.
     *
     * @return the stage of resource update.
     */
    NetworkWatcher.Update update();

    /** The template for NetworkWatcher update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkWatcher apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkWatcher apply(Context context);
    }
    /** The NetworkWatcher update stages. */
    interface UpdateStages {
        /** The stage of the NetworkWatcher update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
}
