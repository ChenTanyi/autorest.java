// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorResultInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ConnectionMonitorResult. */
public interface ConnectionMonitorResult {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the source property: Describes the source of connection monitor.
     *
     * @return the source value.
     */
    ConnectionMonitorSource source();

    /**
     * Gets the destination property: Describes the destination of connection monitor.
     *
     * @return the destination value.
     */
    ConnectionMonitorDestination destination();

    /**
     * Gets the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value.
     */
    Boolean autoStart();

    /**
     * Gets the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value.
     */
    Integer monitoringIntervalInSeconds();

    /**
     * Gets the endpoints property: List of connection monitor endpoints.
     *
     * @return the endpoints value.
     */
    List<ConnectionMonitorEndpoint> endpoints();

    /**
     * Gets the testConfigurations property: List of connection monitor test configurations.
     *
     * @return the testConfigurations value.
     */
    List<ConnectionMonitorTestConfiguration> testConfigurations();

    /**
     * Gets the testGroups property: List of connection monitor test groups.
     *
     * @return the testGroups value.
     */
    List<ConnectionMonitorTestGroup> testGroups();

    /**
     * Gets the outputs property: List of connection monitor outputs.
     *
     * @return the outputs value.
     */
    List<ConnectionMonitorOutput> outputs();

    /**
     * Gets the notes property: Optional notes to be associated with the connection monitor.
     *
     * @return the notes value.
     */
    String notes();

    /**
     * Gets the provisioningState property: The provisioning state of the connection monitor.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the startTime property: The date and time when the connection monitor was started.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @return the monitoringStatus value.
     */
    String monitoringStatus();

    /**
     * Gets the connectionMonitorType property: Type of connection monitor.
     *
     * @return the connectionMonitorType value.
     */
    ConnectionMonitorType connectionMonitorType();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorResultInner object.
     *
     * @return the inner object.
     */
    ConnectionMonitorResultInner innerModel();

    /** The entirety of the ConnectionMonitorResult definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ConnectionMonitorResult definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConnectionMonitorResult definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkWatcherName.
             *
             * @param resourceGroupName The name of the resource group containing Network Watcher.
             * @param networkWatcherName The name of the Network Watcher resource.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName);
        }
        /**
         * The stage of the ConnectionMonitorResult definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithSource,
                DefinitionStages.WithDestination,
                DefinitionStages.WithAutoStart,
                DefinitionStages.WithMonitoringIntervalInSeconds,
                DefinitionStages.WithEndpoints,
                DefinitionStages.WithTestConfigurations,
                DefinitionStages.WithTestGroups,
                DefinitionStages.WithOutputs,
                DefinitionStages.WithNotes,
                DefinitionStages.WithMigrate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConnectionMonitorResult create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConnectionMonitorResult create(Context context);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Connection monitor location.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Connection monitor location.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Connection monitor tags..
             *
             * @param tags Connection monitor tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: Describes the source of connection monitor..
             *
             * @param source Describes the source of connection monitor.
             * @return the next definition stage.
             */
            WithCreate withSource(ConnectionMonitorSource source);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify destination. */
        interface WithDestination {
            /**
             * Specifies the destination property: Describes the destination of connection monitor..
             *
             * @param destination Describes the destination of connection monitor.
             * @return the next definition stage.
             */
            WithCreate withDestination(ConnectionMonitorDestination destination);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify autoStart. */
        interface WithAutoStart {
            /**
             * Specifies the autoStart property: Determines if the connection monitor will start automatically once
             * created..
             *
             * @param autoStart Determines if the connection monitor will start automatically once created.
             * @return the next definition stage.
             */
            WithCreate withAutoStart(Boolean autoStart);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify monitoringIntervalInSeconds. */
        interface WithMonitoringIntervalInSeconds {
            /**
             * Specifies the monitoringIntervalInSeconds property: Monitoring interval in seconds..
             *
             * @param monitoringIntervalInSeconds Monitoring interval in seconds.
             * @return the next definition stage.
             */
            WithCreate withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify endpoints. */
        interface WithEndpoints {
            /**
             * Specifies the endpoints property: List of connection monitor endpoints..
             *
             * @param endpoints List of connection monitor endpoints.
             * @return the next definition stage.
             */
            WithCreate withEndpoints(List<ConnectionMonitorEndpoint> endpoints);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify testConfigurations. */
        interface WithTestConfigurations {
            /**
             * Specifies the testConfigurations property: List of connection monitor test configurations..
             *
             * @param testConfigurations List of connection monitor test configurations.
             * @return the next definition stage.
             */
            WithCreate withTestConfigurations(List<ConnectionMonitorTestConfiguration> testConfigurations);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify testGroups. */
        interface WithTestGroups {
            /**
             * Specifies the testGroups property: List of connection monitor test groups..
             *
             * @param testGroups List of connection monitor test groups.
             * @return the next definition stage.
             */
            WithCreate withTestGroups(List<ConnectionMonitorTestGroup> testGroups);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify outputs. */
        interface WithOutputs {
            /**
             * Specifies the outputs property: List of connection monitor outputs..
             *
             * @param outputs List of connection monitor outputs.
             * @return the next definition stage.
             */
            WithCreate withOutputs(List<ConnectionMonitorOutput> outputs);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify notes. */
        interface WithNotes {
            /**
             * Specifies the notes property: Optional notes to be associated with the connection monitor..
             *
             * @param notes Optional notes to be associated with the connection monitor.
             * @return the next definition stage.
             */
            WithCreate withNotes(String notes);
        }
        /** The stage of the ConnectionMonitorResult definition allowing to specify migrate. */
        interface WithMigrate {
            /**
             * Specifies the migrate property: Value indicating whether connection monitor V1 should be migrated to V2
             * format..
             *
             * @param migrate Value indicating whether connection monitor V1 should be migrated to V2 format.
             * @return the next definition stage.
             */
            WithCreate withWithMigrate(String migrate);
        }
    }
    /**
     * Begins update for the ConnectionMonitorResult resource.
     *
     * @return the stage of resource update.
     */
    ConnectionMonitorResult.Update update();

    /** The template for ConnectionMonitorResult update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConnectionMonitorResult apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConnectionMonitorResult apply(Context context);
    }
    /** The ConnectionMonitorResult update stages. */
    interface UpdateStages {
        /** The stage of the ConnectionMonitorResult update allowing to specify tags. */
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
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConnectionMonitorResult refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConnectionMonitorResult refresh(Context context);

    /**
     * Stops the specified connection monitor.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stops the specified connection monitor.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);

    /**
     * Starts the specified connection monitor.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Starts the specified connection monitor.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    ConnectionMonitorQueryResult query();

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    ConnectionMonitorQueryResult query(Context context);
}
