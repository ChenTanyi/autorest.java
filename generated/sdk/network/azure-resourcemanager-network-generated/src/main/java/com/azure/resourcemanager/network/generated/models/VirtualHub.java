// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubRouteTableV2Inner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VirtualHub. */
@Immutable
public interface VirtualHub {
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
     * Gets the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @return the virtualWan value.
     */
    SubResource virtualWan();

    /**
     * Gets the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @return the vpnGateway value.
     */
    SubResource vpnGateway();

    /**
     * Gets the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @return the p2SVpnGateway value.
     */
    SubResource p2SVpnGateway();

    /**
     * Gets the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @return the expressRouteGateway value.
     */
    SubResource expressRouteGateway();

    /**
     * Gets the azureFirewall property: The azureFirewall associated with this VirtualHub.
     *
     * @return the azureFirewall value.
     */
    SubResource azureFirewall();

    /**
     * Gets the securityPartnerProvider property: The securityPartnerProvider associated with this VirtualHub.
     *
     * @return the securityPartnerProvider value.
     */
    SubResource securityPartnerProvider();

    /**
     * Gets the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * Gets the routeTable property: The routeTable associated with this virtual hub.
     *
     * @return the routeTable value.
     */
    VirtualHubRouteTable routeTable();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual hub resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the securityProviderName property: The Security Provider name.
     *
     * @return the securityProviderName value.
     */
    String securityProviderName();

    /**
     * Gets the virtualHubRouteTableV2S property: List of all virtual hub route table v2s associated with this
     * VirtualHub.
     *
     * @return the virtualHubRouteTableV2S value.
     */
    List<VirtualHubRouteTableV2> virtualHubRouteTableV2S();

    /**
     * Gets the sku property: The sku of this VirtualHub.
     *
     * @return the sku value.
     */
    String sku();

    /**
     * Gets the routingState property: The routing state.
     *
     * @return the routingState value.
     */
    RoutingState routingState();

    /**
     * Gets the bgpConnections property: List of references to Bgp Connections.
     *
     * @return the bgpConnections value.
     */
    List<SubResource> bgpConnections();

    /**
     * Gets the ipConfigurations property: List of references to IpConfigurations.
     *
     * @return the ipConfigurations value.
     */
    List<SubResource> ipConfigurations();

    /**
     * Gets the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @return the virtualRouterAsn value.
     */
    Long virtualRouterAsn();

    /**
     * Gets the virtualRouterIps property: VirtualRouter IPs.
     *
     * @return the virtualRouterIps value.
     */
    List<String> virtualRouterIps();

    /**
     * Gets the enableVirtualRouterRoutePropogation property: Flag to control route propogation for VirtualRouter hub.
     *
     * @return the enableVirtualRouterRoutePropogation value.
     */
    Boolean enableVirtualRouterRoutePropogation();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner object.
     *
     * @return the inner object.
     */
    VirtualHubInner innerModel();

    /** The entirety of the VirtualHub definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The VirtualHub definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualHub definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VirtualHub definition allowing to specify location. */
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
        /** The stage of the VirtualHub definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name of the VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the VirtualHub definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithVirtualWan,
                DefinitionStages.WithVpnGateway,
                DefinitionStages.WithP2SVpnGateway,
                DefinitionStages.WithExpressRouteGateway,
                DefinitionStages.WithAzureFirewall,
                DefinitionStages.WithSecurityPartnerProvider,
                DefinitionStages.WithAddressPrefix,
                DefinitionStages.WithRouteTable,
                DefinitionStages.WithSecurityProviderName,
                DefinitionStages.WithVirtualHubRouteTableV2S,
                DefinitionStages.WithSku,
                DefinitionStages.WithVirtualRouterAsn,
                DefinitionStages.WithVirtualRouterIps,
                DefinitionStages.WithEnableVirtualRouterRoutePropogation,
                DefinitionStages.WithId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualHub create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualHub create(Context context);
        }
        /** The stage of the VirtualHub definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualHub definition allowing to specify virtualWan. */
        interface WithVirtualWan {
            /**
             * Specifies the virtualWan property: The VirtualWAN to which the VirtualHub belongs..
             *
             * @param virtualWan The VirtualWAN to which the VirtualHub belongs.
             * @return the next definition stage.
             */
            WithCreate withVirtualWan(SubResource virtualWan);
        }
        /** The stage of the VirtualHub definition allowing to specify vpnGateway. */
        interface WithVpnGateway {
            /**
             * Specifies the vpnGateway property: The VpnGateway associated with this VirtualHub..
             *
             * @param vpnGateway The VpnGateway associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withVpnGateway(SubResource vpnGateway);
        }
        /** The stage of the VirtualHub definition allowing to specify p2SVpnGateway. */
        interface WithP2SVpnGateway {
            /**
             * Specifies the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub..
             *
             * @param p2SVpnGateway The P2SVpnGateway associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withP2SVpnGateway(SubResource p2SVpnGateway);
        }
        /** The stage of the VirtualHub definition allowing to specify expressRouteGateway. */
        interface WithExpressRouteGateway {
            /**
             * Specifies the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub..
             *
             * @param expressRouteGateway The expressRouteGateway associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withExpressRouteGateway(SubResource expressRouteGateway);
        }
        /** The stage of the VirtualHub definition allowing to specify azureFirewall. */
        interface WithAzureFirewall {
            /**
             * Specifies the azureFirewall property: The azureFirewall associated with this VirtualHub..
             *
             * @param azureFirewall The azureFirewall associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withAzureFirewall(SubResource azureFirewall);
        }
        /** The stage of the VirtualHub definition allowing to specify securityPartnerProvider. */
        interface WithSecurityPartnerProvider {
            /**
             * Specifies the securityPartnerProvider property: The securityPartnerProvider associated with this
             * VirtualHub..
             *
             * @param securityPartnerProvider The securityPartnerProvider associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withSecurityPartnerProvider(SubResource securityPartnerProvider);
        }
        /** The stage of the VirtualHub definition allowing to specify addressPrefix. */
        interface WithAddressPrefix {
            /**
             * Specifies the addressPrefix property: Address-prefix for this VirtualHub..
             *
             * @param addressPrefix Address-prefix for this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }
        /** The stage of the VirtualHub definition allowing to specify routeTable. */
        interface WithRouteTable {
            /**
             * Specifies the routeTable property: The routeTable associated with this virtual hub..
             *
             * @param routeTable The routeTable associated with this virtual hub.
             * @return the next definition stage.
             */
            WithCreate withRouteTable(VirtualHubRouteTable routeTable);
        }
        /** The stage of the VirtualHub definition allowing to specify securityProviderName. */
        interface WithSecurityProviderName {
            /**
             * Specifies the securityProviderName property: The Security Provider name..
             *
             * @param securityProviderName The Security Provider name.
             * @return the next definition stage.
             */
            WithCreate withSecurityProviderName(String securityProviderName);
        }
        /** The stage of the VirtualHub definition allowing to specify virtualHubRouteTableV2S. */
        interface WithVirtualHubRouteTableV2S {
            /**
             * Specifies the virtualHubRouteTableV2S property: List of all virtual hub route table v2s associated with
             * this VirtualHub..
             *
             * @param virtualHubRouteTableV2S List of all virtual hub route table v2s associated with this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withVirtualHubRouteTableV2S(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2S);
        }
        /** The stage of the VirtualHub definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of this VirtualHub..
             *
             * @param sku The sku of this VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withSku(String sku);
        }
        /** The stage of the VirtualHub definition allowing to specify virtualRouterAsn. */
        interface WithVirtualRouterAsn {
            /**
             * Specifies the virtualRouterAsn property: VirtualRouter ASN..
             *
             * @param virtualRouterAsn VirtualRouter ASN.
             * @return the next definition stage.
             */
            WithCreate withVirtualRouterAsn(Long virtualRouterAsn);
        }
        /** The stage of the VirtualHub definition allowing to specify virtualRouterIps. */
        interface WithVirtualRouterIps {
            /**
             * Specifies the virtualRouterIps property: VirtualRouter IPs..
             *
             * @param virtualRouterIps VirtualRouter IPs.
             * @return the next definition stage.
             */
            WithCreate withVirtualRouterIps(List<String> virtualRouterIps);
        }
        /** The stage of the VirtualHub definition allowing to specify enableVirtualRouterRoutePropogation. */
        interface WithEnableVirtualRouterRoutePropogation {
            /**
             * Specifies the enableVirtualRouterRoutePropogation property: Flag to control route propogation for
             * VirtualRouter hub..
             *
             * @param enableVirtualRouterRoutePropogation Flag to control route propogation for VirtualRouter hub.
             * @return the next definition stage.
             */
            WithCreate withEnableVirtualRouterRoutePropogation(Boolean enableVirtualRouterRoutePropogation);
        }
        /** The stage of the VirtualHub definition allowing to specify id. */
        interface WithId {
            /**
             * Specifies the id property: Resource ID..
             *
             * @param id Resource ID.
             * @return the next definition stage.
             */
            WithCreate withId(String id);
        }
    }
    /**
     * Begins update for the VirtualHub resource.
     *
     * @return the stage of resource update.
     */
    VirtualHub.Update update();

    /** The template for VirtualHub update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualHub apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualHub apply(Context context);
    }
    /** The VirtualHub update stages. */
    interface UpdateStages {
        /** The stage of the VirtualHub update allowing to specify tags. */
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
    VirtualHub refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualHub refresh(Context context);
}
