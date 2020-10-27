// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.models.AdministratorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Represents a and external administrator to be created. */
@JsonFlatten
@Fluent
public class ServerAdministratorResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAdministratorResourceInner.class);

    /*
     * The type of administrator.
     */
    @JsonProperty(value = "properties.administratorType")
    private AdministratorType administratorType;

    /*
     * The server administrator login account name.
     */
    @JsonProperty(value = "properties.login")
    private String login;

    /*
     * The server administrator Sid (Secure ID).
     */
    @JsonProperty(value = "properties.sid")
    private UUID sid;

    /*
     * The server Active Directory Administrator tenant id.
     */
    @JsonProperty(value = "properties.tenantId")
    private UUID tenantId;

    /**
     * Get the administratorType property: The type of administrator.
     *
     * @return the administratorType value.
     */
    public AdministratorType administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType property: The type of administrator.
     *
     * @param administratorType the administratorType value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withAdministratorType(AdministratorType administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the login property: The server administrator login account name.
     *
     * @return the login value.
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login property: The server administrator login account name.
     *
     * @param login the login value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the sid property: The server administrator Sid (Secure ID).
     *
     * @return the sid value.
     */
    public UUID sid() {
        return this.sid;
    }

    /**
     * Set the sid property: The server administrator Sid (Secure ID).
     *
     * @param sid the sid value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withSid(UUID sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get the tenantId property: The server Active Directory Administrator tenant id.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The server Active Directory Administrator tenant id.
     *
     * @param tenantId the tenantId value to set.
     * @return the ServerAdministratorResourceInner object itself.
     */
    public ServerAdministratorResourceInner withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
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
