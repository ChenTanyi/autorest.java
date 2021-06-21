// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.generated.fluent.models.ServerInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Server. */
public interface Server {
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
     * Gets the identity property: The Azure Active Directory identity of the server.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the sku property: The SKU (pricing tier) of the server.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * Gets the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @return the administratorLoginPassword value.
     */
    String administratorLoginPassword();

    /**
     * Gets the version property: PostgreSQL Server version.
     *
     * @return the version value.
     */
    ServerVersion version();

    /**
     * Gets the minorVersion property: The minor version of the server.
     *
     * @return the minorVersion value.
     */
    String minorVersion();

    /**
     * Gets the state property: A state of a server that is visible to user.
     *
     * @return the state value.
     */
    ServerState state();

    /**
     * Gets the fullyQualifiedDomainName property: The fully qualified domain name of a server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * Gets the storage property: Storage properties of a server.
     *
     * @return the storage value.
     */
    Storage storage();

    /**
     * Gets the backup property: Backup properties of a server.
     *
     * @return the backup value.
     */
    Backup backup();

    /**
     * Gets the network property: Network properties of a server.
     *
     * @return the network value.
     */
    Network network();

    /**
     * Gets the highAvailability property: High availability properties of a server.
     *
     * @return the highAvailability value.
     */
    HighAvailability highAvailability();

    /**
     * Gets the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @return the maintenanceWindow value.
     */
    MaintenanceWindow maintenanceWindow();

    /**
     * Gets the sourceServerResourceId property: The source server resource ID to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @return the sourceServerResourceId value.
     */
    String sourceServerResourceId();

    /**
     * Gets the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from. It's required when 'createMode' is 'PointInTimeRestore'.
     *
     * @return the pointInTimeUtc value.
     */
    OffsetDateTime pointInTimeUtc();

    /**
     * Gets the availabilityZone property: availability zone information of the server.
     *
     * @return the availabilityZone value.
     */
    String availabilityZone();

    /**
     * Gets the createMode property: The mode to create a new PostgreSQL server.
     *
     * @return the createMode value.
     */
    CreateMode createMode();

    /**
     * Gets the tagsPropertiesTags property: Application-specific metadata in the form of key-value pairs.
     *
     * @return the tagsPropertiesTags value.
     */
    Map<String, String> tagsPropertiesTags();

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
     * Gets the inner com.azure.resourcemanager.postgresql.generated.fluent.models.ServerInner object.
     *
     * @return the inner object.
     */
    ServerInner innerModel();

    /** The entirety of the Server definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Server definition stages. */
    interface DefinitionStages {
        /** The first stage of the Server definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Server definition allowing to specify location. */
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
        /** The stage of the Server definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Server definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSku,
                DefinitionStages.WithAdministratorLogin,
                DefinitionStages.WithAdministratorLoginPassword,
                DefinitionStages.WithVersion,
                DefinitionStages.WithStorage,
                DefinitionStages.WithBackup,
                DefinitionStages.WithNetwork,
                DefinitionStages.WithHighAvailability,
                DefinitionStages.WithSourceServerResourceId,
                DefinitionStages.WithPointInTimeUtc,
                DefinitionStages.WithAvailabilityZone,
                DefinitionStages.WithCreateMode,
                DefinitionStages.WithTagsPropertiesTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Server create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Server create(Context context);
        }
        /** The stage of the Server definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Server definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The Azure Active Directory identity of the server..
             *
             * @param identity The Azure Active Directory identity of the server.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the Server definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU (pricing tier) of the server..
             *
             * @param sku The SKU (pricing tier) of the server.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the Server definition allowing to specify administratorLogin. */
        interface WithAdministratorLogin {
            /**
             * Specifies the administratorLogin property: The administrator's login name of a server. Can only be
             * specified when the server is being created (and is required for creation)..
             *
             * @param administratorLogin The administrator's login name of a server. Can only be specified when the
             *     server is being created (and is required for creation).
             * @return the next definition stage.
             */
            WithCreate withAdministratorLogin(String administratorLogin);
        }
        /** The stage of the Server definition allowing to specify administratorLoginPassword. */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies the administratorLoginPassword property: The administrator login password (required for server
             * creation)..
             *
             * @param administratorLoginPassword The administrator login password (required for server creation).
             * @return the next definition stage.
             */
            WithCreate withAdministratorLoginPassword(String administratorLoginPassword);
        }
        /** The stage of the Server definition allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: PostgreSQL Server version..
             *
             * @param version PostgreSQL Server version.
             * @return the next definition stage.
             */
            WithCreate withVersion(ServerVersion version);
        }
        /** The stage of the Server definition allowing to specify storage. */
        interface WithStorage {
            /**
             * Specifies the storage property: Storage properties of a server..
             *
             * @param storage Storage properties of a server.
             * @return the next definition stage.
             */
            WithCreate withStorage(Storage storage);
        }
        /** The stage of the Server definition allowing to specify backup. */
        interface WithBackup {
            /**
             * Specifies the backup property: Backup properties of a server..
             *
             * @param backup Backup properties of a server.
             * @return the next definition stage.
             */
            WithCreate withBackup(Backup backup);
        }
        /** The stage of the Server definition allowing to specify network. */
        interface WithNetwork {
            /**
             * Specifies the network property: Network properties of a server..
             *
             * @param network Network properties of a server.
             * @return the next definition stage.
             */
            WithCreate withNetwork(Network network);
        }
        /** The stage of the Server definition allowing to specify highAvailability. */
        interface WithHighAvailability {
            /**
             * Specifies the highAvailability property: High availability properties of a server..
             *
             * @param highAvailability High availability properties of a server.
             * @return the next definition stage.
             */
            WithCreate withHighAvailability(HighAvailability highAvailability);
        }
        /** The stage of the Server definition allowing to specify sourceServerResourceId. */
        interface WithSourceServerResourceId {
            /**
             * Specifies the sourceServerResourceId property: The source server resource ID to restore from. It's
             * required when 'createMode' is 'PointInTimeRestore'..
             *
             * @param sourceServerResourceId The source server resource ID to restore from. It's required when
             *     'createMode' is 'PointInTimeRestore'.
             * @return the next definition stage.
             */
            WithCreate withSourceServerResourceId(String sourceServerResourceId);
        }
        /** The stage of the Server definition allowing to specify pointInTimeUtc. */
        interface WithPointInTimeUtc {
            /**
             * Specifies the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time
             * to restore from. It's required when 'createMode' is 'PointInTimeRestore'..
             *
             * @param pointInTimeUtc Restore point creation time (ISO8601 format), specifying the time to restore from.
             *     It's required when 'createMode' is 'PointInTimeRestore'.
             * @return the next definition stage.
             */
            WithCreate withPointInTimeUtc(OffsetDateTime pointInTimeUtc);
        }
        /** The stage of the Server definition allowing to specify availabilityZone. */
        interface WithAvailabilityZone {
            /**
             * Specifies the availabilityZone property: availability zone information of the server..
             *
             * @param availabilityZone availability zone information of the server.
             * @return the next definition stage.
             */
            WithCreate withAvailabilityZone(String availabilityZone);
        }
        /** The stage of the Server definition allowing to specify createMode. */
        interface WithCreateMode {
            /**
             * Specifies the createMode property: The mode to create a new PostgreSQL server..
             *
             * @param createMode The mode to create a new PostgreSQL server.
             * @return the next definition stage.
             */
            WithCreate withCreateMode(CreateMode createMode);
        }
        /** The stage of the Server definition allowing to specify tagsPropertiesTags. */
        interface WithTagsPropertiesTags {
            /**
             * Specifies the tagsPropertiesTags property: Application-specific metadata in the form of key-value pairs..
             *
             * @param tagsPropertiesTags Application-specific metadata in the form of key-value pairs.
             * @return the next definition stage.
             */
            WithCreate withTagsPropertiesTags(Map<String, String> tagsPropertiesTags);
        }
    }
    /**
     * Begins update for the Server resource.
     *
     * @return the stage of resource update.
     */
    Server.Update update();

    /** The template for Server update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithAdministratorLoginPassword,
            UpdateStages.WithStorage,
            UpdateStages.WithBackup,
            UpdateStages.WithHighAvailability,
            UpdateStages.WithMaintenanceWindow,
            UpdateStages.WithCreateMode {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Server apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Server apply(Context context);
    }
    /** The Server update stages. */
    interface UpdateStages {
        /** The stage of the Server update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Application-specific metadata in the form of key-value pairs..
             *
             * @param tags Application-specific metadata in the form of key-value pairs.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Server update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU (pricing tier) of the server..
             *
             * @param sku The SKU (pricing tier) of the server.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the Server update allowing to specify administratorLoginPassword. */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies the administratorLoginPassword property: The password of the administrator login..
             *
             * @param administratorLoginPassword The password of the administrator login.
             * @return the next definition stage.
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }
        /** The stage of the Server update allowing to specify storage. */
        interface WithStorage {
            /**
             * Specifies the storage property: Storage properties of a server..
             *
             * @param storage Storage properties of a server.
             * @return the next definition stage.
             */
            Update withStorage(Storage storage);
        }
        /** The stage of the Server update allowing to specify backup. */
        interface WithBackup {
            /**
             * Specifies the backup property: Backup properties of a server..
             *
             * @param backup Backup properties of a server.
             * @return the next definition stage.
             */
            Update withBackup(Backup backup);
        }
        /** The stage of the Server update allowing to specify highAvailability. */
        interface WithHighAvailability {
            /**
             * Specifies the highAvailability property: High availability properties of a server..
             *
             * @param highAvailability High availability properties of a server.
             * @return the next definition stage.
             */
            Update withHighAvailability(HighAvailability highAvailability);
        }
        /** The stage of the Server update allowing to specify maintenanceWindow. */
        interface WithMaintenanceWindow {
            /**
             * Specifies the maintenanceWindow property: Maintenance window properties of a server..
             *
             * @param maintenanceWindow Maintenance window properties of a server.
             * @return the next definition stage.
             */
            Update withMaintenanceWindow(MaintenanceWindow maintenanceWindow);
        }
        /** The stage of the Server update allowing to specify createMode. */
        interface WithCreateMode {
            /**
             * Specifies the createMode property: The mode to update a new PostgreSQL server..
             *
             * @param createMode The mode to update a new PostgreSQL server.
             * @return the next definition stage.
             */
            Update withCreateMode(CreateModeForUpdate createMode);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Server refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Server refresh(Context context);

    /**
     * Restarts a server.
     *
     * @param parameters The parameters for restarting a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(RestartParameter parameters);

    /**
     * Restarts a server.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart();

    /**
     * Restarts a server.
     *
     * @param parameters The parameters for restarting a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(RestartParameter parameters, Context context);

    /**
     * Starts a server.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Starts a server.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Stops a server.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stops a server.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);
}
