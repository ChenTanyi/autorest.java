// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkPeeringInner;

/** An immutable client-side representation of VirtualNetworkPeering. */
@Immutable
public interface VirtualNetworkPeering {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
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
     * Gets the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @return the allowVirtualNetworkAccess value.
     */
    Boolean allowVirtualNetworkAccess();

    /**
     * Gets the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @return the allowForwardedTraffic value.
     */
    Boolean allowForwardedTraffic();

    /**
     * Gets the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @return the allowGatewayTransit value.
     */
    Boolean allowGatewayTransit();

    /**
     * Gets the useRemoteGateways property: If remote gateways can be used on this virtual network. If the flag is set
     * to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote
     * virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual
     * network already has a gateway.
     *
     * @return the useRemoteGateways value.
     */
    Boolean useRemoteGateways();

    /**
     * Gets the remoteVirtualNetwork property: The reference to the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @return the remoteVirtualNetwork value.
     */
    SubResource remoteVirtualNetwork();

    /**
     * Gets the remoteAddressSpace property: The reference to the address space peered with the remote virtual network.
     *
     * @return the remoteAddressSpace value.
     */
    AddressSpace remoteAddressSpace();

    /**
     * Gets the remoteVirtualNetworkAddressSpace property: The reference to the current address space of the remote
     * virtual network.
     *
     * @return the remoteVirtualNetworkAddressSpace value.
     */
    AddressSpace remoteVirtualNetworkAddressSpace();

    /**
     * Gets the remoteBgpCommunities property: The reference to the remote virtual network's Bgp Communities.
     *
     * @return the remoteBgpCommunities value.
     */
    VirtualNetworkBgpCommunities remoteBgpCommunities();

    /**
     * Gets the peeringState property: The status of the virtual network peering.
     *
     * @return the peeringState value.
     */
    VirtualNetworkPeeringState peeringState();

    /**
     * Gets the peeringSyncLevel property: The peering sync status of the virtual network peering.
     *
     * @return the peeringSyncLevel value.
     */
    VirtualNetworkPeeringLevel peeringSyncLevel();

    /**
     * Gets the syncRemoteAddressSpace property: Provided when user wants to sync the peering with address space on the
     * remote virtual network after the address space is updated.
     *
     * @return the syncRemoteAddressSpace value.
     */
    Boolean syncRemoteAddressSpace();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual network peering resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkPeeringInner object.
     *
     * @return the inner object.
     */
    VirtualNetworkPeeringInner innerModel();
}
