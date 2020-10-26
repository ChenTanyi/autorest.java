// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.MSDeployProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** MSDeploy ARM response. */
@JsonFlatten
@Immutable
public class MSDeployStatusInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MSDeployStatusInner.class);

    /*
     * Username of deployer
     */
    @JsonProperty(value = "properties.deployer", access = JsonProperty.Access.WRITE_ONLY)
    private String deployer;

    /*
     * Provisioning state
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private MSDeployProvisioningState provisioningState;

    /*
     * Start time of deploy operation
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * End time of deploy operation
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * Whether the deployment operation has completed
     */
    @JsonProperty(value = "properties.complete", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean complete;

    /**
     * Get the deployer property: Username of deployer.
     *
     * @return the deployer value.
     */
    public String deployer() {
        return this.deployer;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public MSDeployProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the startTime property: Start time of deploy operation.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: End time of deploy operation.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the complete property: Whether the deployment operation has completed.
     *
     * @return the complete value.
     */
    public Boolean complete() {
        return this.complete;
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
