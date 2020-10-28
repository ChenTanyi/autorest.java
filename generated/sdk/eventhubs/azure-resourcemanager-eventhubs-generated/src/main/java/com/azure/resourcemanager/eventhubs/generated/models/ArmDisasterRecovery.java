// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ArmDisasterRecoveryInner;

/** An immutable client-side representation of ArmDisasterRecovery. */
@Immutable
public interface ArmDisasterRecovery {
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
     * Gets the provisioningState property: Provisioning state of the Alias(Disaster Recovery configuration) - possible
     * values 'Accepted' or 'Succeeded' or 'Failed'.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateDR provisioningState();

    /**
     * Gets the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     *
     * @return the partnerNamespace value.
     */
    String partnerNamespace();

    /**
     * Gets the alternateName property: Alternate name specified when alias and namespace names are same.
     *
     * @return the alternateName value.
     */
    String alternateName();

    /**
     * Gets the role property: role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or
     * 'Secondary'.
     *
     * @return the role value.
     */
    RoleDisasterRecovery role();

    /**
     * Gets the pendingReplicationOperationsCount property: Number of entities pending to be replicated.
     *
     * @return the pendingReplicationOperationsCount value.
     */
    Long pendingReplicationOperationsCount();

    /**
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.ArmDisasterRecoveryInner object.
     *
     * @return the inner object.
     */
    ArmDisasterRecoveryInner innerModel();

    /** The entirety of the ArmDisasterRecovery definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ArmDisasterRecovery definition stages. */
    interface DefinitionStages {
        /** The first stage of the ArmDisasterRecovery definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ArmDisasterRecovery definition allowing to specify parent resource. */
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
         * The stage of the ArmDisasterRecovery definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPartnerNamespace, DefinitionStages.WithAlternateName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ArmDisasterRecovery create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ArmDisasterRecovery create(Context context);
        }
        /** The stage of the ArmDisasterRecovery definition allowing to specify partnerNamespace. */
        interface WithPartnerNamespace {
            /**
             * Specifies the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which
             * is part of GEO DR pairing.
             *
             * @param partnerNamespace ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR
             *     pairing.
             * @return the next definition stage.
             */
            WithCreate withPartnerNamespace(String partnerNamespace);
        }
        /** The stage of the ArmDisasterRecovery definition allowing to specify alternateName. */
        interface WithAlternateName {
            /**
             * Specifies the alternateName property: Alternate name specified when alias and namespace names are same..
             *
             * @param alternateName Alternate name specified when alias and namespace names are same.
             * @return the next definition stage.
             */
            WithCreate withAlternateName(String alternateName);
        }
    }
    /**
     * Begins update for the ArmDisasterRecovery resource.
     *
     * @return the stage of resource update.
     */
    ArmDisasterRecovery.Update update();

    /** The template for ArmDisasterRecovery update. */
    interface Update extends UpdateStages.WithPartnerNamespace, UpdateStages.WithAlternateName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ArmDisasterRecovery apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ArmDisasterRecovery apply(Context context);
    }
    /** The ArmDisasterRecovery update stages. */
    interface UpdateStages {
        /** The stage of the ArmDisasterRecovery update allowing to specify partnerNamespace. */
        interface WithPartnerNamespace {
            /**
             * Specifies the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which
             * is part of GEO DR pairing.
             *
             * @param partnerNamespace ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR
             *     pairing.
             * @return the next definition stage.
             */
            Update withPartnerNamespace(String partnerNamespace);
        }
        /** The stage of the ArmDisasterRecovery update allowing to specify alternateName. */
        interface WithAlternateName {
            /**
             * Specifies the alternateName property: Alternate name specified when alias and namespace names are same..
             *
             * @param alternateName Alternate name specified when alias and namespace names are same.
             * @return the next definition stage.
             */
            Update withAlternateName(String alternateName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ArmDisasterRecovery refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ArmDisasterRecovery refresh(Context context);
}
