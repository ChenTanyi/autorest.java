// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.MembershipType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Effective Virtual Network. */
@Fluent
public final class EffectiveVirtualNetworkInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EffectiveVirtualNetworkInner.class);

    /*
     * Effective vnet Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Location of vnet.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Membership Type.
     */
    @JsonProperty(value = "membershipType")
    private MembershipType membershipType;

    /**
     * Get the id property: Effective vnet Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Effective vnet Id.
     *
     * @param id the id value to set.
     * @return the EffectiveVirtualNetworkInner object itself.
     */
    public EffectiveVirtualNetworkInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location property: Location of vnet.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of vnet.
     *
     * @param location the location value to set.
     * @return the EffectiveVirtualNetworkInner object itself.
     */
    public EffectiveVirtualNetworkInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the membershipType property: Membership Type.
     *
     * @return the membershipType value.
     */
    public MembershipType membershipType() {
        return this.membershipType;
    }

    /**
     * Set the membershipType property: Membership Type.
     *
     * @param membershipType the membershipType value to set.
     * @return the EffectiveVirtualNetworkInner object itself.
     */
    public EffectiveVirtualNetworkInner withMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
