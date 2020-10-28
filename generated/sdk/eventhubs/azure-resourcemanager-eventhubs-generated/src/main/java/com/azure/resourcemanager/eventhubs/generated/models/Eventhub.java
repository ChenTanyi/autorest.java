// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EventhubInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Eventhub. */
@Immutable
public interface Eventhub {
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
     * Gets the partitionIds property: Current number of shards on the Event Hub.
     *
     * @return the partitionIds value.
     */
    List<String> partitionIds();

    /**
     * Gets the createdAt property: Exact time the Event Hub was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime createdAt();

    /**
     * Gets the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime updatedAt();

    /**
     * Gets the messageRetentionInDays property: Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     *
     * @return the messageRetentionInDays value.
     */
    Long messageRetentionInDays();

    /**
     * Gets the partitionCount property: Number of partitions created for the Event Hub, allowed values are from 1 to 32
     * partitions.
     *
     * @return the partitionCount value.
     */
    Long partitionCount();

    /**
     * Gets the status property: Enumerates the possible values for the status of the Event Hub.
     *
     * @return the status value.
     */
    EntityStatus status();

    /**
     * Gets the captureDescription property: Properties of capture description.
     *
     * @return the captureDescription value.
     */
    CaptureDescription captureDescription();

    /**
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.EventhubInner object.
     *
     * @return the inner object.
     */
    EventhubInner innerModel();

    /** The entirety of the Eventhub definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Eventhub definition stages. */
    interface DefinitionStages {
        /** The first stage of the Eventhub definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Eventhub definition allowing to specify parent resource. */
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
         * The stage of the Eventhub definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithMessageRetentionInDays,
                DefinitionStages.WithPartitionCount,
                DefinitionStages.WithStatus,
                DefinitionStages.WithCaptureDescription {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Eventhub create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Eventhub create(Context context);
        }
        /** The stage of the Eventhub definition allowing to specify messageRetentionInDays. */
        interface WithMessageRetentionInDays {
            /**
             * Specifies the messageRetentionInDays property: Number of days to retain the events for this Event Hub,
             * value should be 1 to 7 days.
             *
             * @param messageRetentionInDays Number of days to retain the events for this Event Hub, value should be 1
             *     to 7 days.
             * @return the next definition stage.
             */
            WithCreate withMessageRetentionInDays(Long messageRetentionInDays);
        }
        /** The stage of the Eventhub definition allowing to specify partitionCount. */
        interface WithPartitionCount {
            /**
             * Specifies the partitionCount property: Number of partitions created for the Event Hub, allowed values are
             * from 1 to 32 partitions..
             *
             * @param partitionCount Number of partitions created for the Event Hub, allowed values are from 1 to 32
             *     partitions.
             * @return the next definition stage.
             */
            WithCreate withPartitionCount(Long partitionCount);
        }
        /** The stage of the Eventhub definition allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: Enumerates the possible values for the status of the Event Hub..
             *
             * @param status Enumerates the possible values for the status of the Event Hub.
             * @return the next definition stage.
             */
            WithCreate withStatus(EntityStatus status);
        }
        /** The stage of the Eventhub definition allowing to specify captureDescription. */
        interface WithCaptureDescription {
            /**
             * Specifies the captureDescription property: Properties of capture description.
             *
             * @param captureDescription Properties of capture description.
             * @return the next definition stage.
             */
            WithCreate withCaptureDescription(CaptureDescription captureDescription);
        }
    }
    /**
     * Begins update for the Eventhub resource.
     *
     * @return the stage of resource update.
     */
    Eventhub.Update update();

    /** The template for Eventhub update. */
    interface Update
        extends UpdateStages.WithMessageRetentionInDays,
            UpdateStages.WithPartitionCount,
            UpdateStages.WithStatus,
            UpdateStages.WithCaptureDescription {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Eventhub apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Eventhub apply(Context context);
    }
    /** The Eventhub update stages. */
    interface UpdateStages {
        /** The stage of the Eventhub update allowing to specify messageRetentionInDays. */
        interface WithMessageRetentionInDays {
            /**
             * Specifies the messageRetentionInDays property: Number of days to retain the events for this Event Hub,
             * value should be 1 to 7 days.
             *
             * @param messageRetentionInDays Number of days to retain the events for this Event Hub, value should be 1
             *     to 7 days.
             * @return the next definition stage.
             */
            Update withMessageRetentionInDays(Long messageRetentionInDays);
        }
        /** The stage of the Eventhub update allowing to specify partitionCount. */
        interface WithPartitionCount {
            /**
             * Specifies the partitionCount property: Number of partitions created for the Event Hub, allowed values are
             * from 1 to 32 partitions..
             *
             * @param partitionCount Number of partitions created for the Event Hub, allowed values are from 1 to 32
             *     partitions.
             * @return the next definition stage.
             */
            Update withPartitionCount(Long partitionCount);
        }
        /** The stage of the Eventhub update allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: Enumerates the possible values for the status of the Event Hub..
             *
             * @param status Enumerates the possible values for the status of the Event Hub.
             * @return the next definition stage.
             */
            Update withStatus(EntityStatus status);
        }
        /** The stage of the Eventhub update allowing to specify captureDescription. */
        interface WithCaptureDescription {
            /**
             * Specifies the captureDescription property: Properties of capture description.
             *
             * @param captureDescription Properties of capture description.
             * @return the next definition stage.
             */
            Update withCaptureDescription(CaptureDescription captureDescription);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Eventhub refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Eventhub refresh(Context context);
}
