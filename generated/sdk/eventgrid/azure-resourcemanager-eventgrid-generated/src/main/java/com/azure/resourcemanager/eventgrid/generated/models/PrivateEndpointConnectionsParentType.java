// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrivateEndpointConnectionsParentType. */
public final class PrivateEndpointConnectionsParentType
    extends ExpandableStringEnum<PrivateEndpointConnectionsParentType> {
    /** Static value topics for PrivateEndpointConnectionsParentType. */
    public static final PrivateEndpointConnectionsParentType TOPICS = fromString("topics");

    /** Static value domains for PrivateEndpointConnectionsParentType. */
    public static final PrivateEndpointConnectionsParentType DOMAINS = fromString("domains");

    /** Static value partnerNamespaces for PrivateEndpointConnectionsParentType. */
    public static final PrivateEndpointConnectionsParentType PARTNER_NAMESPACES = fromString("partnerNamespaces");

    /**
     * Creates or finds a PrivateEndpointConnectionsParentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointConnectionsParentType.
     */
    @JsonCreator
    public static PrivateEndpointConnectionsParentType fromString(String name) {
        return fromString(name, PrivateEndpointConnectionsParentType.class);
    }

    /** @return known PrivateEndpointConnectionsParentType values. */
    public static Collection<PrivateEndpointConnectionsParentType> values() {
        return values(PrivateEndpointConnectionsParentType.class);
    }
}
