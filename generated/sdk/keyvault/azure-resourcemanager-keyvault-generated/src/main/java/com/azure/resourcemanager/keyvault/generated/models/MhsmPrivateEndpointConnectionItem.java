// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private endpoint connection item. */
@JsonFlatten
@Fluent
public class MhsmPrivateEndpointConnectionItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MhsmPrivateEndpointConnectionItem.class);

    /*
     * Properties of the private endpoint object.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private MhsmPrivateEndpoint privateEndpoint;

    /*
     * Approval state of the private link connection.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private MhsmPrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /*
     * Provisioning state of the private endpoint connection.
     */
    @JsonProperty(value = "properties.provisioningState")
    private PrivateEndpointConnectionProvisioningState provisioningState;

    /**
     * Get the privateEndpoint property: Properties of the private endpoint object.
     *
     * @return the privateEndpoint value.
     */
    public MhsmPrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Properties of the private endpoint object.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withPrivateEndpoint(MhsmPrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Approval state of the private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public MhsmPrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Approval state of the private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withPrivateLinkServiceConnectionState(
        MhsmPrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the private endpoint connection.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withProvisioningState(
        PrivateEndpointConnectionProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
