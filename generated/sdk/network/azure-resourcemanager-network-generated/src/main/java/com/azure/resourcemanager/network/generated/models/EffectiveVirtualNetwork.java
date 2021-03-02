// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.EffectiveVirtualNetworkInner;

/** An immutable client-side representation of EffectiveVirtualNetwork. */
public interface EffectiveVirtualNetwork {
    /**
     * Gets the id property: Effective vnet Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the location property: Location of vnet.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the membershipType property: Membership Type.
     *
     * @return the membershipType value.
     */
    MembershipType membershipType();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.EffectiveVirtualNetworkInner object.
     *
     * @return the inner object.
     */
    EffectiveVirtualNetworkInner innerModel();
}
