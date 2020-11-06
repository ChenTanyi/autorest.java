// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of PrivateEndpoint. */
public interface PrivateEndpoint {
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
     * Gets the subnet property: The ID of the subnet from which the private IP will be allocated.
     *
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the networkInterfaces property: An array of references to the network interfaces created for this private
     * endpoint.
     *
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * Gets the provisioningState property: The provisioning state of the private endpoint resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the privateLinkServiceConnections property: A grouping of information about the connection to the remote
     * resource.
     *
     * @return the privateLinkServiceConnections value.
     */
    List<PrivateLinkServiceConnection> privateLinkServiceConnections();

    /**
     * Gets the manualPrivateLinkServiceConnections property: A grouping of information about the connection to the
     * remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     *
     * @return the manualPrivateLinkServiceConnections value.
     */
    List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections();

    /**
     * Gets the customDnsConfigs property: An array of custom dns configurations.
     *
     * @return the customDnsConfigs value.
     */
    List<CustomDnsConfigPropertiesFormat> customDnsConfigs();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner object.
     *
     * @return the inner object.
     */
    PrivateEndpointInner innerModel();

    /** The entirety of the PrivateEndpoint definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The PrivateEndpoint definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateEndpoint definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PrivateEndpoint definition allowing to specify location. */
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
        /** The stage of the PrivateEndpoint definition allowing to specify parent resource. */
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
         * The stage of the PrivateEndpoint definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSubnet,
                DefinitionStages.WithPrivateLinkServiceConnections,
                DefinitionStages.WithManualPrivateLinkServiceConnections,
                DefinitionStages.WithCustomDnsConfigs {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PrivateEndpoint create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateEndpoint create(Context context);
        }
        /** The stage of the PrivateEndpoint definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PrivateEndpoint definition allowing to specify subnet. */
        interface WithSubnet {
            /**
             * Specifies the subnet property: The ID of the subnet from which the private IP will be allocated..
             *
             * @param subnet The ID of the subnet from which the private IP will be allocated.
             * @return the next definition stage.
             */
            WithCreate withSubnet(SubnetInner subnet);
        }
        /** The stage of the PrivateEndpoint definition allowing to specify privateLinkServiceConnections. */
        interface WithPrivateLinkServiceConnections {
            /**
             * Specifies the privateLinkServiceConnections property: A grouping of information about the connection to
             * the remote resource..
             *
             * @param privateLinkServiceConnections A grouping of information about the connection to the remote
             *     resource.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkServiceConnections(
                List<PrivateLinkServiceConnection> privateLinkServiceConnections);
        }
        /** The stage of the PrivateEndpoint definition allowing to specify manualPrivateLinkServiceConnections. */
        interface WithManualPrivateLinkServiceConnections {
            /**
             * Specifies the manualPrivateLinkServiceConnections property: A grouping of information about the
             * connection to the remote resource. Used when the network admin does not have access to approve
             * connections to the remote resource..
             *
             * @param manualPrivateLinkServiceConnections A grouping of information about the connection to the remote
             *     resource. Used when the network admin does not have access to approve connections to the remote
             *     resource.
             * @return the next definition stage.
             */
            WithCreate withManualPrivateLinkServiceConnections(
                List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections);
        }
        /** The stage of the PrivateEndpoint definition allowing to specify customDnsConfigs. */
        interface WithCustomDnsConfigs {
            /**
             * Specifies the customDnsConfigs property: An array of custom dns configurations..
             *
             * @param customDnsConfigs An array of custom dns configurations.
             * @return the next definition stage.
             */
            WithCreate withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs);
        }
    }
    /**
     * Begins update for the PrivateEndpoint resource.
     *
     * @return the stage of resource update.
     */
    PrivateEndpoint.Update update();

    /** The template for PrivateEndpoint update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSubnet,
            UpdateStages.WithPrivateLinkServiceConnections,
            UpdateStages.WithManualPrivateLinkServiceConnections,
            UpdateStages.WithCustomDnsConfigs {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PrivateEndpoint apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateEndpoint apply(Context context);
    }
    /** The PrivateEndpoint update stages. */
    interface UpdateStages {
        /** The stage of the PrivateEndpoint update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the PrivateEndpoint update allowing to specify subnet. */
        interface WithSubnet {
            /**
             * Specifies the subnet property: The ID of the subnet from which the private IP will be allocated..
             *
             * @param subnet The ID of the subnet from which the private IP will be allocated.
             * @return the next definition stage.
             */
            Update withSubnet(SubnetInner subnet);
        }
        /** The stage of the PrivateEndpoint update allowing to specify privateLinkServiceConnections. */
        interface WithPrivateLinkServiceConnections {
            /**
             * Specifies the privateLinkServiceConnections property: A grouping of information about the connection to
             * the remote resource..
             *
             * @param privateLinkServiceConnections A grouping of information about the connection to the remote
             *     resource.
             * @return the next definition stage.
             */
            Update withPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> privateLinkServiceConnections);
        }
        /** The stage of the PrivateEndpoint update allowing to specify manualPrivateLinkServiceConnections. */
        interface WithManualPrivateLinkServiceConnections {
            /**
             * Specifies the manualPrivateLinkServiceConnections property: A grouping of information about the
             * connection to the remote resource. Used when the network admin does not have access to approve
             * connections to the remote resource..
             *
             * @param manualPrivateLinkServiceConnections A grouping of information about the connection to the remote
             *     resource. Used when the network admin does not have access to approve connections to the remote
             *     resource.
             * @return the next definition stage.
             */
            Update withManualPrivateLinkServiceConnections(
                List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections);
        }
        /** The stage of the PrivateEndpoint update allowing to specify customDnsConfigs. */
        interface WithCustomDnsConfigs {
            /**
             * Specifies the customDnsConfigs property: An array of custom dns configurations..
             *
             * @param customDnsConfigs An array of custom dns configurations.
             * @return the next definition stage.
             */
            Update withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PrivateEndpoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateEndpoint refresh(Context context);
}
