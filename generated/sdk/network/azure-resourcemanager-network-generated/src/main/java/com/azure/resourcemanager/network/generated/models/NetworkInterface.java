// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of NetworkInterface. */
@Immutable
public interface NetworkInterface {
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
     * Gets the virtualMachine property: The reference to a virtual machine.
     *
     * @return the virtualMachine value.
     */
    SubResource virtualMachine();

    /**
     * Gets the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value.
     */
    NetworkSecurityGroup networkSecurityGroup();

    /**
     * Gets the privateEndpoint property: A reference to the private endpoint to which the network interface is linked.
     *
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * Gets the ipConfigurations property: A list of IPConfigurations of the network interface.
     *
     * @return the ipConfigurations value.
     */
    List<NetworkInterfaceIpConfiguration> ipConfigurations();

    /**
     * Gets the tapConfigurations property: A list of TapConfigurations of the network interface.
     *
     * @return the tapConfigurations value.
     */
    List<NetworkInterfaceTapConfiguration> tapConfigurations();

    /**
     * Gets the dnsSettings property: The DNS settings in network interface.
     *
     * @return the dnsSettings value.
     */
    NetworkInterfaceDnsSettings dnsSettings();

    /**
     * Gets the macAddress property: The MAC address of the network interface.
     *
     * @return the macAddress value.
     */
    String macAddress();

    /**
     * Gets the primary property: Whether this is a primary network interface on a virtual machine.
     *
     * @return the primary value.
     */
    Boolean primary();

    /**
     * Gets the enableAcceleratedNetworking property: If the network interface is accelerated networking enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    Boolean enableAcceleratedNetworking();

    /**
     * Gets the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     *
     * @return the enableIpForwarding value.
     */
    Boolean enableIpForwarding();

    /**
     * Gets the hostedWorkloads property: A list of references to linked BareMetal resources.
     *
     * @return the hostedWorkloads value.
     */
    List<String> hostedWorkloads();

    /**
     * Gets the dscpConfiguration property: A reference to the dscp configuration to which the network interface is
     * linked.
     *
     * @return the dscpConfiguration value.
     */
    SubResource dscpConfiguration();

    /**
     * Gets the resourceGuid property: The resource GUID property of the network interface resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the network interface resource.
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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner object.
     *
     * @return the inner object.
     */
    NetworkInterfaceInner innerModel();

    /** The entirety of the NetworkInterface definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The NetworkInterface definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkInterface definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the NetworkInterface definition allowing to specify location. */
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
        /** The stage of the NetworkInterface definition allowing to specify parent resource. */
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
         * The stage of the NetworkInterface definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithNetworkSecurityGroup,
                DefinitionStages.WithIpConfigurations,
                DefinitionStages.WithDnsSettings,
                DefinitionStages.WithEnableAcceleratedNetworking,
                DefinitionStages.WithEnableIpForwarding {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkInterface create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkInterface create(Context context);
        }
        /** The stage of the NetworkInterface definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the NetworkInterface definition allowing to specify networkSecurityGroup. */
        interface WithNetworkSecurityGroup {
            /**
             * Specifies the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource..
             *
             * @param networkSecurityGroup The reference to the NetworkSecurityGroup resource.
             * @return the next definition stage.
             */
            WithCreate withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup);
        }
        /** The stage of the NetworkInterface definition allowing to specify ipConfigurations. */
        interface WithIpConfigurations {
            /**
             * Specifies the ipConfigurations property: A list of IPConfigurations of the network interface..
             *
             * @param ipConfigurations A list of IPConfigurations of the network interface.
             * @return the next definition stage.
             */
            WithCreate withIpConfigurations(List<NetworkInterfaceIpConfigurationInner> ipConfigurations);
        }
        /** The stage of the NetworkInterface definition allowing to specify dnsSettings. */
        interface WithDnsSettings {
            /**
             * Specifies the dnsSettings property: The DNS settings in network interface..
             *
             * @param dnsSettings The DNS settings in network interface.
             * @return the next definition stage.
             */
            WithCreate withDnsSettings(NetworkInterfaceDnsSettings dnsSettings);
        }
        /** The stage of the NetworkInterface definition allowing to specify enableAcceleratedNetworking. */
        interface WithEnableAcceleratedNetworking {
            /**
             * Specifies the enableAcceleratedNetworking property: If the network interface is accelerated networking
             * enabled..
             *
             * @param enableAcceleratedNetworking If the network interface is accelerated networking enabled.
             * @return the next definition stage.
             */
            WithCreate withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking);
        }
        /** The stage of the NetworkInterface definition allowing to specify enableIpForwarding. */
        interface WithEnableIpForwarding {
            /**
             * Specifies the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network
             * interface..
             *
             * @param enableIpForwarding Indicates whether IP forwarding is enabled on this network interface.
             * @return the next definition stage.
             */
            WithCreate withEnableIpForwarding(Boolean enableIpForwarding);
        }
    }
    /**
     * Begins update for the NetworkInterface resource.
     *
     * @return the stage of resource update.
     */
    NetworkInterface.Update update();

    /** The template for NetworkInterface update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkInterface apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkInterface apply(Context context);
    }
    /** The NetworkInterface update stages. */
    interface UpdateStages {
        /** The stage of the NetworkInterface update allowing to specify tags. */
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
    NetworkInterface refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkInterface refresh(Context context);
}
