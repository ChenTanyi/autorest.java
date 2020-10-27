// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.IpFilterRuleInner;

/** An immutable client-side representation of IpFilterRule. */
@Immutable
public interface IpFilterRule {
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
     * Gets the ipMask property: IP Mask.
     *
     * @return the ipMask value.
     */
    String ipMask();

    /**
     * Gets the action property: The IP Filter Action.
     *
     * @return the action value.
     */
    IpAction action();

    /**
     * Gets the filterName property: IP Filter name.
     *
     * @return the filterName value.
     */
    String filterName();

    /**
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.IpFilterRuleInner object.
     *
     * @return the inner object.
     */
    IpFilterRuleInner innerModel();

    /** The entirety of the IpFilterRule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The IpFilterRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the IpFilterRule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the IpFilterRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             *
             * @param resourceGroupName Name of the resource group within the azure subscription.
             * @param namespaceName The Namespace name.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }
        /**
         * The stage of the IpFilterRule definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithIpMask, DefinitionStages.WithAction, DefinitionStages.WithFilterName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IpFilterRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IpFilterRule create(Context context);
        }
        /** The stage of the IpFilterRule definition allowing to specify ipMask. */
        interface WithIpMask {
            /**
             * Specifies the ipMask property: IP Mask.
             *
             * @param ipMask IP Mask.
             * @return the next definition stage.
             */
            WithCreate withIpMask(String ipMask);
        }
        /** The stage of the IpFilterRule definition allowing to specify action. */
        interface WithAction {
            /**
             * Specifies the action property: The IP Filter Action.
             *
             * @param action The IP Filter Action.
             * @return the next definition stage.
             */
            WithCreate withAction(IpAction action);
        }
        /** The stage of the IpFilterRule definition allowing to specify filterName. */
        interface WithFilterName {
            /**
             * Specifies the filterName property: IP Filter name.
             *
             * @param filterName IP Filter name.
             * @return the next definition stage.
             */
            WithCreate withFilterName(String filterName);
        }
    }
    /**
     * Begins update for the IpFilterRule resource.
     *
     * @return the stage of resource update.
     */
    IpFilterRule.Update update();

    /** The template for IpFilterRule update. */
    interface Update extends UpdateStages.WithIpMask, UpdateStages.WithAction, UpdateStages.WithFilterName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IpFilterRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IpFilterRule apply(Context context);
    }
    /** The IpFilterRule update stages. */
    interface UpdateStages {
        /** The stage of the IpFilterRule update allowing to specify ipMask. */
        interface WithIpMask {
            /**
             * Specifies the ipMask property: IP Mask.
             *
             * @param ipMask IP Mask.
             * @return the next definition stage.
             */
            Update withIpMask(String ipMask);
        }
        /** The stage of the IpFilterRule update allowing to specify action. */
        interface WithAction {
            /**
             * Specifies the action property: The IP Filter Action.
             *
             * @param action The IP Filter Action.
             * @return the next definition stage.
             */
            Update withAction(IpAction action);
        }
        /** The stage of the IpFilterRule update allowing to specify filterName. */
        interface WithFilterName {
            /**
             * Specifies the filterName property: IP Filter name.
             *
             * @param filterName IP Filter name.
             * @return the next definition stage.
             */
            Update withFilterName(String filterName);
        }
    }
}
