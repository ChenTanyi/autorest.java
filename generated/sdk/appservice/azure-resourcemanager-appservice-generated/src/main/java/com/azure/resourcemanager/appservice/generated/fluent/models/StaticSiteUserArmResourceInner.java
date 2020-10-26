// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Static Site User ARM resource. */
@JsonFlatten
@Fluent
public class StaticSiteUserArmResourceInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticSiteUserArmResourceInner.class);

    /*
     * The identity provider for the static site user.
     */
    @JsonProperty(value = "properties.provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /*
     * The user id for the static site user.
     */
    @JsonProperty(value = "properties.userId", access = JsonProperty.Access.WRITE_ONLY)
    private String userId;

    /*
     * The display name for the static site user.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The roles for the static site user, in free-form string format
     */
    @JsonProperty(value = "properties.roles")
    private String roles;

    /**
     * Get the provider property: The identity provider for the static site user.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the userId property: The user id for the static site user.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Get the displayName property: The display name for the static site user.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the roles property: The roles for the static site user, in free-form string format.
     *
     * @return the roles value.
     */
    public String roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The roles for the static site user, in free-form string format.
     *
     * @param roles the roles value to set.
     * @return the StaticSiteUserArmResourceInner object itself.
     */
    public StaticSiteUserArmResourceInner withRoles(String roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
