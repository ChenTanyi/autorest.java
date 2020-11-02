// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.InboundSecurityRuleInner;
import java.util.List;

/** An immutable client-side representation of InboundSecurityRule. */
@Immutable
public interface InboundSecurityRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of security rule collection.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: NVA inbound security rule type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the rules property: List of allowed rules.
     *
     * @return the rules value.
     */
    List<InboundSecurityRules> rules();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.InboundSecurityRuleInner object.
     *
     * @return the inner object.
     */
    InboundSecurityRuleInner innerModel();

    /** The entirety of the InboundSecurityRule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The InboundSecurityRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the InboundSecurityRule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the InboundSecurityRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkVirtualApplianceName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkVirtualAppliance(
                String resourceGroupName, String networkVirtualApplianceName);
        }
        /**
         * The stage of the InboundSecurityRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithName, DefinitionStages.WithRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            InboundSecurityRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            InboundSecurityRule create(Context context);
        }
        /** The stage of the InboundSecurityRule definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Name of security rule collection..
             *
             * @param name Name of security rule collection.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the InboundSecurityRule definition allowing to specify rules. */
        interface WithRules {
            /**
             * Specifies the rules property: List of allowed rules..
             *
             * @param rules List of allowed rules.
             * @return the next definition stage.
             */
            WithCreate withRules(List<InboundSecurityRules> rules);
        }
    }
    /**
     * Begins update for the InboundSecurityRule resource.
     *
     * @return the stage of resource update.
     */
    InboundSecurityRule.Update update();

    /** The template for InboundSecurityRule update. */
    interface Update extends UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithRules {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        InboundSecurityRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        InboundSecurityRule apply(Context context);
    }
    /** The InboundSecurityRule update stages. */
    interface UpdateStages {
        /** The stage of the InboundSecurityRule update allowing to specify id. */
        interface WithId {
            /**
             * Specifies the id property: Fully qualified resource Id for the resource..
             *
             * @param id Fully qualified resource Id for the resource.
             * @return the next definition stage.
             */
            Update withId(String id);
        }
        /** The stage of the InboundSecurityRule update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Name of security rule collection..
             *
             * @param name Name of security rule collection.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the InboundSecurityRule update allowing to specify rules. */
        interface WithRules {
            /**
             * Specifies the rules property: List of allowed rules..
             *
             * @param rules List of allowed rules.
             * @return the next definition stage.
             */
            Update withRules(List<InboundSecurityRules> rules);
        }
    }
}
