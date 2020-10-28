// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.generated.fluent.models.VirtualNetworkRuleInner;

/** An immutable client-side representation of VirtualNetworkRule. */
@Immutable
public interface VirtualNetworkRule {
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
     * Gets the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     *
     * @return the virtualNetworkSubnetId value.
     */
    String virtualNetworkSubnetId();

    /**
     * Gets the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     *
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    Boolean ignoreMissingVnetServiceEndpoint();

    /**
     * Gets the state property: Virtual Network Rule State.
     *
     * @return the state value.
     */
    VirtualNetworkRuleState state();

    /**
     * Gets the inner com.azure.resourcemanager.postgresql.generated.fluent.models.VirtualNetworkRuleInner object.
     *
     * @return the inner object.
     */
    VirtualNetworkRuleInner innerModel();

    /** The entirety of the VirtualNetworkRule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The VirtualNetworkRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualNetworkRule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the VirtualNetworkRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }
        /**
         * The stage of the VirtualNetworkRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithVirtualNetworkSubnetId, DefinitionStages.WithIgnoreMissingVnetServiceEndpoint {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualNetworkRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualNetworkRule create(Context context);
        }
        /** The stage of the VirtualNetworkRule definition allowing to specify virtualNetworkSubnetId. */
        interface WithVirtualNetworkSubnetId {
            /**
             * Specifies the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet..
             *
             * @param virtualNetworkSubnetId The ARM resource id of the virtual network subnet.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetworkSubnetId(String virtualNetworkSubnetId);
        }
        /** The stage of the VirtualNetworkRule definition allowing to specify ignoreMissingVnetServiceEndpoint. */
        interface WithIgnoreMissingVnetServiceEndpoint {
            /**
             * Specifies the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network
             * has vnet service endpoint enabled..
             *
             * @param ignoreMissingVnetServiceEndpoint Create firewall rule before the virtual network has vnet service
             *     endpoint enabled.
             * @return the next definition stage.
             */
            WithCreate withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint);
        }
    }
    /**
     * Begins update for the VirtualNetworkRule resource.
     *
     * @return the stage of resource update.
     */
    VirtualNetworkRule.Update update();

    /** The template for VirtualNetworkRule update. */
    interface Update
        extends UpdateStages.WithVirtualNetworkSubnetId, UpdateStages.WithIgnoreMissingVnetServiceEndpoint {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualNetworkRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualNetworkRule apply(Context context);
    }
    /** The VirtualNetworkRule update stages. */
    interface UpdateStages {
        /** The stage of the VirtualNetworkRule update allowing to specify virtualNetworkSubnetId. */
        interface WithVirtualNetworkSubnetId {
            /**
             * Specifies the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet..
             *
             * @param virtualNetworkSubnetId The ARM resource id of the virtual network subnet.
             * @return the next definition stage.
             */
            Update withVirtualNetworkSubnetId(String virtualNetworkSubnetId);
        }
        /** The stage of the VirtualNetworkRule update allowing to specify ignoreMissingVnetServiceEndpoint. */
        interface WithIgnoreMissingVnetServiceEndpoint {
            /**
             * Specifies the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network
             * has vnet service endpoint enabled..
             *
             * @param ignoreMissingVnetServiceEndpoint Create firewall rule before the virtual network has vnet service
             *     endpoint enabled.
             * @return the next definition stage.
             */
            Update withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualNetworkRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualNetworkRule refresh(Context context);
}
