// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VirtualNetworkPrivateEndpointNetworkPolicies. */
public final class VirtualNetworkPrivateEndpointNetworkPolicies
    extends ExpandableStringEnum<VirtualNetworkPrivateEndpointNetworkPolicies> {
    /** Static value Enabled for VirtualNetworkPrivateEndpointNetworkPolicies. */
    public static final VirtualNetworkPrivateEndpointNetworkPolicies ENABLED = fromString("Enabled");

    /** Static value Disabled for VirtualNetworkPrivateEndpointNetworkPolicies. */
    public static final VirtualNetworkPrivateEndpointNetworkPolicies DISABLED = fromString("Disabled");

    /**
     * Creates or finds a VirtualNetworkPrivateEndpointNetworkPolicies from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkPrivateEndpointNetworkPolicies.
     */
    @JsonCreator
    public static VirtualNetworkPrivateEndpointNetworkPolicies fromString(String name) {
        return fromString(name, VirtualNetworkPrivateEndpointNetworkPolicies.class);
    }

    /** @return known VirtualNetworkPrivateEndpointNetworkPolicies values. */
    public static Collection<VirtualNetworkPrivateEndpointNetworkPolicies> values() {
        return values(VirtualNetworkPrivateEndpointNetworkPolicies.class);
    }
}