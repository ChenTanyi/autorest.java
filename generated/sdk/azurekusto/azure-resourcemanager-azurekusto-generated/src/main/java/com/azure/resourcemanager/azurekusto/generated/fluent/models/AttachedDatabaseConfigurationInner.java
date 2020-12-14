// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class representing an attached database configuration. */
@JsonFlatten
@Fluent
public class AttachedDatabaseConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AttachedDatabaseConfigurationInner.class);

    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The name of the database which you would like to attach, use * if you
     * want to follow all current and future databases.
     */
    @JsonProperty(value = "properties.databaseName")
    private String databaseName;

    /*
     * The resource id of the cluster where the databases you would like to
     * attach reside.
     */
    @JsonProperty(value = "properties.clusterResourceId")
    private String clusterResourceId;

    /*
     * The list of databases from the clusterResourceId which are currently
     * attached to the cluster.
     */
    @JsonProperty(value = "properties.attachedDatabaseNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> attachedDatabaseNames;

    /*
     * The default principals modification kind
     */
    @JsonProperty(value = "properties.defaultPrincipalsModificationKind")
    private DefaultPrincipalsModificationKind defaultPrincipalsModificationKind;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     *
     * @param databaseName the databaseName value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the clusterResourceId property: The resource id of the cluster where the databases you would like to attach
     * reside.
     *
     * @return the clusterResourceId value.
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Set the clusterResourceId property: The resource id of the cluster where the databases you would like to attach
     * reside.
     *
     * @param clusterResourceId the clusterResourceId value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }

    /**
     * Get the attachedDatabaseNames property: The list of databases from the clusterResourceId which are currently
     * attached to the cluster.
     *
     * @return the attachedDatabaseNames value.
     */
    public List<String> attachedDatabaseNames() {
        return this.attachedDatabaseNames;
    }

    /**
     * Get the defaultPrincipalsModificationKind property: The default principals modification kind.
     *
     * @return the defaultPrincipalsModificationKind value.
     */
    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }

    /**
     * Set the defaultPrincipalsModificationKind property: The default principals modification kind.
     *
     * @param defaultPrincipalsModificationKind the defaultPrincipalsModificationKind value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withDefaultPrincipalsModificationKind(
        DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        this.defaultPrincipalsModificationKind = defaultPrincipalsModificationKind;
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
