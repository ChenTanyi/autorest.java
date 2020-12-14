// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A management group that is connected to a workspace. */
@JsonFlatten
@Fluent
public class ManagementGroupInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementGroupInner.class);

    /*
     * The number of servers connected to the management group.
     */
    @JsonProperty(value = "properties.serverCount")
    private Integer serverCount;

    /*
     * Gets or sets a value indicating whether the management group is a
     * gateway.
     */
    @JsonProperty(value = "properties.isGateway")
    private Boolean isGateway;

    /*
     * The name of the management group.
     */
    @JsonProperty(value = "properties.name")
    private String name;

    /*
     * The unique ID of the management group.
     */
    @JsonProperty(value = "properties.id")
    private String id;

    /*
     * The datetime that the management group was created.
     */
    @JsonProperty(value = "properties.created")
    private OffsetDateTime created;

    /*
     * The last datetime that the management group received data.
     */
    @JsonProperty(value = "properties.dataReceived")
    private OffsetDateTime dataReceived;

    /*
     * The version of System Center that is managing the management group.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /*
     * The SKU of System Center that is managing the management group.
     */
    @JsonProperty(value = "properties.sku")
    private String sku;

    /**
     * Get the serverCount property: The number of servers connected to the management group.
     *
     * @return the serverCount value.
     */
    public Integer serverCount() {
        return this.serverCount;
    }

    /**
     * Set the serverCount property: The number of servers connected to the management group.
     *
     * @param serverCount the serverCount value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withServerCount(Integer serverCount) {
        this.serverCount = serverCount;
        return this;
    }

    /**
     * Get the isGateway property: Gets or sets a value indicating whether the management group is a gateway.
     *
     * @return the isGateway value.
     */
    public Boolean isGateway() {
        return this.isGateway;
    }

    /**
     * Set the isGateway property: Gets or sets a value indicating whether the management group is a gateway.
     *
     * @param isGateway the isGateway value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withIsGateway(Boolean isGateway) {
        this.isGateway = isGateway;
        return this;
    }

    /**
     * Get the name property: The name of the management group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the management group.
     *
     * @param name the name value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The unique ID of the management group.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The unique ID of the management group.
     *
     * @param id the id value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the created property: The datetime that the management group was created.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Set the created property: The datetime that the management group was created.
     *
     * @param created the created value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get the dataReceived property: The last datetime that the management group received data.
     *
     * @return the dataReceived value.
     */
    public OffsetDateTime dataReceived() {
        return this.dataReceived;
    }

    /**
     * Set the dataReceived property: The last datetime that the management group received data.
     *
     * @param dataReceived the dataReceived value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withDataReceived(OffsetDateTime dataReceived) {
        this.dataReceived = dataReceived;
        return this;
    }

    /**
     * Get the version property: The version of System Center that is managing the management group.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of System Center that is managing the management group.
     *
     * @param version the version value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sku property: The SKU of System Center that is managing the management group.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of System Center that is managing the management group.
     *
     * @param sku the sku value to set.
     * @return the ManagementGroupInner object itself.
     */
    public ManagementGroupInner withSku(String sku) {
        this.sku = sku;
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
