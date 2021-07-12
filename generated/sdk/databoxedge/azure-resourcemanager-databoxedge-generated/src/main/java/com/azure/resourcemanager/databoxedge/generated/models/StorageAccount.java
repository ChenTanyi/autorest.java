// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountInner;

/** An immutable client-side representation of StorageAccount. */
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
     * Gets the systemData property: StorageAccount object on ASE device.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: Description for the storage Account.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the storageAccountStatus property: Current status of the storage account.
     *
     * @return the storageAccountStatus value.
     */
    StorageAccountStatus storageAccountStatus();

    /**
     * Gets the dataPolicy property: Data policy of the storage Account.
     *
     * @return the dataPolicy value.
     */
    DataPolicy dataPolicy();

    /**
     * Gets the storageAccountCredentialId property: Storage Account Credential Id.
     *
     * @return the storageAccountCredentialId value.
     */
    String storageAccountCredentialId();

    /**
     * Gets the blobEndpoint property: BlobEndpoint of Storage Account.
     *
     * @return the blobEndpoint value.
     */
    String blobEndpoint();

    /**
     * Gets the containerCount property: The Container Count. Present only for Storage Accounts with DataPolicy set to
     * Cloud.
     *
     * @return the containerCount value.
     */
    Integer containerCount();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountInner object.
     *
     * @return the inner object.
     */
    StorageAccountInner innerModel();

    /** The entirety of the StorageAccount definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithDataPolicy,
            DefinitionStages.WithCreate {
    }
    /** The StorageAccount definition stages. */
    interface DefinitionStages {
        /** The first stage of the StorageAccount definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the StorageAccount definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies deviceName, resourceGroupName.
             *
             * @param deviceName The device name.
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithDataPolicy withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }
        /** The stage of the StorageAccount definition allowing to specify dataPolicy. */
        interface WithDataPolicy {
            /**
             * Specifies the dataPolicy property: Data policy of the storage Account..
             *
             * @param dataPolicy Data policy of the storage Account.
             * @return the next definition stage.
             */
            WithCreate withDataPolicy(DataPolicy dataPolicy);
        }
        /**
         * The stage of the StorageAccount definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDescription,
                DefinitionStages.WithStorageAccountStatus,
                DefinitionStages.WithStorageAccountCredentialId {
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
        /** The stage of the StorageAccount definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description for the storage Account..
             *
             * @param description Description for the storage Account.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the StorageAccount definition allowing to specify storageAccountStatus. */
        interface WithStorageAccountStatus {
            /**
             * Specifies the storageAccountStatus property: Current status of the storage account.
             *
             * @param storageAccountStatus Current status of the storage account.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountStatus(StorageAccountStatus storageAccountStatus);
        }
        /** The stage of the StorageAccount definition allowing to specify storageAccountCredentialId. */
        interface WithStorageAccountCredentialId {
            /**
             * Specifies the storageAccountCredentialId property: Storage Account Credential Id.
             *
             * @param storageAccountCredentialId Storage Account Credential Id.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountCredentialId(String storageAccountCredentialId);
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
        extends UpdateStages.WithDescription,
            UpdateStages.WithStorageAccountStatus,
            UpdateStages.WithDataPolicy,
            UpdateStages.WithStorageAccountCredentialId {
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
        /** The stage of the StorageAccount update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description for the storage Account..
             *
             * @param description Description for the storage Account.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the StorageAccount update allowing to specify storageAccountStatus. */
        interface WithStorageAccountStatus {
            /**
             * Specifies the storageAccountStatus property: Current status of the storage account.
             *
             * @param storageAccountStatus Current status of the storage account.
             * @return the next definition stage.
             */
            Update withStorageAccountStatus(StorageAccountStatus storageAccountStatus);
        }
        /** The stage of the StorageAccount update allowing to specify dataPolicy. */
        interface WithDataPolicy {
            /**
             * Specifies the dataPolicy property: Data policy of the storage Account..
             *
             * @param dataPolicy Data policy of the storage Account.
             * @return the next definition stage.
             */
            Update withDataPolicy(DataPolicy dataPolicy);
        }
        /** The stage of the StorageAccount update allowing to specify storageAccountCredentialId. */
        interface WithStorageAccountCredentialId {
            /**
             * Specifies the storageAccountCredentialId property: Storage Account Credential Id.
             *
             * @param storageAccountCredentialId Storage Account Credential Id.
             * @return the next definition stage.
             */
            Update withStorageAccountCredentialId(String storageAccountCredentialId);
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
