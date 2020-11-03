// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteConnectionInner;

/** An immutable client-side representation of ExpressRouteConnection. */
@Immutable
public interface ExpressRouteConnection {
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
     * Gets the provisioningState property: The provisioning state of the express route connection resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the expressRouteCircuitPeering property: The ExpressRoute circuit peering.
     *
     * @return the expressRouteCircuitPeering value.
     */
    ExpressRouteCircuitPeeringId expressRouteCircuitPeering();

    /**
     * Gets the authorizationKey property: Authorization key to establish the connection.
     *
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * Gets the routingWeight property: The routing weight associated to the connection.
     *
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * Gets the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    Boolean enableInternetSecurity();

    /**
     * Gets the expressRouteGatewayBypass property: Enable FastPath to vWan Firewall hub.
     *
     * @return the expressRouteGatewayBypass value.
     */
    Boolean expressRouteGatewayBypass();

    /**
     * Gets the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    RoutingConfiguration routingConfiguration();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteConnectionInner object.
     *
     * @return the inner object.
     */
    ExpressRouteConnectionInner innerModel();
}
