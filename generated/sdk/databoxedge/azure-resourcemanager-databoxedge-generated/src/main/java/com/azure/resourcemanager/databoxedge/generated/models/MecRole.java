// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.RoleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** MEC role. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MEC")
@JsonFlatten
@Fluent
public class MecRole extends RoleInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MecRole.class);

    /*
     * Activation key of the MEC.
     */
    @JsonProperty(value = "properties.connectionString")
    private AsymmetricEncryptedSecret connectionString;

    /*
     * Controller Endpoint.
     */
    @JsonProperty(value = "properties.controllerEndpoint")
    private String controllerEndpoint;

    /*
     * Unique Id of the Resource.
     */
    @JsonProperty(value = "properties.resourceUniqueId")
    private String resourceUniqueId;

    /*
     * Role status.
     */
    @JsonProperty(value = "properties.roleStatus")
    private RoleStatus roleStatus;

    /**
     * Get the connectionString property: Activation key of the MEC.
     *
     * @return the connectionString value.
     */
    public AsymmetricEncryptedSecret connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Activation key of the MEC.
     *
     * @param connectionString the connectionString value to set.
     * @return the MecRole object itself.
     */
    public MecRole withConnectionString(AsymmetricEncryptedSecret connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the controllerEndpoint property: Controller Endpoint.
     *
     * @return the controllerEndpoint value.
     */
    public String controllerEndpoint() {
        return this.controllerEndpoint;
    }

    /**
     * Set the controllerEndpoint property: Controller Endpoint.
     *
     * @param controllerEndpoint the controllerEndpoint value to set.
     * @return the MecRole object itself.
     */
    public MecRole withControllerEndpoint(String controllerEndpoint) {
        this.controllerEndpoint = controllerEndpoint;
        return this;
    }

    /**
     * Get the resourceUniqueId property: Unique Id of the Resource.
     *
     * @return the resourceUniqueId value.
     */
    public String resourceUniqueId() {
        return this.resourceUniqueId;
    }

    /**
     * Set the resourceUniqueId property: Unique Id of the Resource.
     *
     * @param resourceUniqueId the resourceUniqueId value to set.
     * @return the MecRole object itself.
     */
    public MecRole withResourceUniqueId(String resourceUniqueId) {
        this.resourceUniqueId = resourceUniqueId;
        return this;
    }

    /**
     * Get the roleStatus property: Role status.
     *
     * @return the roleStatus value.
     */
    public RoleStatus roleStatus() {
        return this.roleStatus;
    }

    /**
     * Set the roleStatus property: Role status.
     *
     * @param roleStatus the roleStatus value to set.
     * @return the MecRole object itself.
     */
    public MecRole withRoleStatus(RoleStatus roleStatus) {
        this.roleStatus = roleStatus;
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
        if (connectionString() != null) {
            connectionString().validate();
        }
    }
}
