// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.HubVirtualNetworkConnectionInner;

/** An immutable client-side representation of HubVirtualNetworkConnection. */
@Immutable
public interface HubVirtualNetworkConnection {
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
     * Gets the remoteVirtualNetwork property: Reference to the remote virtual network.
     *
     * @return the remoteVirtualNetwork value.
     */
    SubResource remoteVirtualNetwork();

    /**
     * Gets the allowHubToRemoteVnetTransit property: Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     *
     * @return the allowHubToRemoteVnetTransit value.
     */
    Boolean allowHubToRemoteVnetTransit();

    /**
     * Gets the allowRemoteVnetToUseHubVnetGateways property: Deprecated: Allow RemoteVnet to use Virtual Hub's
     * gateways.
     *
     * @return the allowRemoteVnetToUseHubVnetGateways value.
     */
    Boolean allowRemoteVnetToUseHubVnetGateways();

    /**
     * Gets the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    Boolean enableInternetSecurity();

    /**
     * Gets the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    RoutingConfiguration routingConfiguration();

    /**
     * Gets the provisioningState property: The provisioning state of the hub virtual network connection resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.HubVirtualNetworkConnectionInner object.
     *
     * @return the inner object.
     */
    HubVirtualNetworkConnectionInner innerModel();
}
