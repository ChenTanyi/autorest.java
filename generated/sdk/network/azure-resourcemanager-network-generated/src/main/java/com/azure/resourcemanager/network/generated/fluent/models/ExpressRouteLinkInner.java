// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinkAdminState;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinkConnectorType;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinkMacSecConfig;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ExpressRouteLink child resource definition. */
@JsonFlatten
@Fluent
public class ExpressRouteLinkInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteLinkInner.class);

    /*
     * Name of child port resource that is unique among child port resources of
     * the parent.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Name of Azure router associated with physical port.
     */
    @JsonProperty(value = "properties.routerName", access = JsonProperty.Access.WRITE_ONLY)
    private String routerName;

    /*
     * Name of Azure router interface.
     */
    @JsonProperty(value = "properties.interfaceName", access = JsonProperty.Access.WRITE_ONLY)
    private String interfaceName;

    /*
     * Mapping between physical port to patch panel port.
     */
    @JsonProperty(value = "properties.patchPanelId", access = JsonProperty.Access.WRITE_ONLY)
    private String patchPanelId;

    /*
     * Mapping of physical patch panel to rack.
     */
    @JsonProperty(value = "properties.rackId", access = JsonProperty.Access.WRITE_ONLY)
    private String rackId;

    /*
     * Physical fiber port type.
     */
    @JsonProperty(value = "properties.connectorType", access = JsonProperty.Access.WRITE_ONLY)
    private ExpressRouteLinkConnectorType connectorType;

    /*
     * Administrative state of the physical port.
     */
    @JsonProperty(value = "properties.adminState")
    private ExpressRouteLinkAdminState adminState;

    /*
     * The provisioning state of the express route link resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * MacSec configuration.
     */
    @JsonProperty(value = "properties.macSecConfig")
    private ExpressRouteLinkMacSecConfig macSecConfig;

    /**
     * Get the name property: Name of child port resource that is unique among child port resources of the parent.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of child port resource that is unique among child port resources of the parent.
     *
     * @param name the name value to set.
     * @return the ExpressRouteLinkInner object itself.
     */
    public ExpressRouteLinkInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the routerName property: Name of Azure router associated with physical port.
     *
     * @return the routerName value.
     */
    public String routerName() {
        return this.routerName;
    }

    /**
     * Get the interfaceName property: Name of Azure router interface.
     *
     * @return the interfaceName value.
     */
    public String interfaceName() {
        return this.interfaceName;
    }

    /**
     * Get the patchPanelId property: Mapping between physical port to patch panel port.
     *
     * @return the patchPanelId value.
     */
    public String patchPanelId() {
        return this.patchPanelId;
    }

    /**
     * Get the rackId property: Mapping of physical patch panel to rack.
     *
     * @return the rackId value.
     */
    public String rackId() {
        return this.rackId;
    }

    /**
     * Get the connectorType property: Physical fiber port type.
     *
     * @return the connectorType value.
     */
    public ExpressRouteLinkConnectorType connectorType() {
        return this.connectorType;
    }

    /**
     * Get the adminState property: Administrative state of the physical port.
     *
     * @return the adminState value.
     */
    public ExpressRouteLinkAdminState adminState() {
        return this.adminState;
    }

    /**
     * Set the adminState property: Administrative state of the physical port.
     *
     * @param adminState the adminState value to set.
     * @return the ExpressRouteLinkInner object itself.
     */
    public ExpressRouteLinkInner withAdminState(ExpressRouteLinkAdminState adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route link resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the macSecConfig property: MacSec configuration.
     *
     * @return the macSecConfig value.
     */
    public ExpressRouteLinkMacSecConfig macSecConfig() {
        return this.macSecConfig;
    }

    /**
     * Set the macSecConfig property: MacSec configuration.
     *
     * @param macSecConfig the macSecConfig value to set.
     * @return the ExpressRouteLinkInner object itself.
     */
    public ExpressRouteLinkInner withMacSecConfig(ExpressRouteLinkMacSecConfig macSecConfig) {
        this.macSecConfig = macSecConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (macSecConfig() != null) {
            macSecConfig().validate();
        }
    }
}
