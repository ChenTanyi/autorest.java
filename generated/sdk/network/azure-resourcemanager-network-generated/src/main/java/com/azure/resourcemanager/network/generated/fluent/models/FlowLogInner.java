// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RetentionPolicyParameters;
import com.azure.resourcemanager.network.generated.models.TrafficAnalyticsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A flow log resource. */
@JsonFlatten
@Fluent
public class FlowLogInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FlowLogInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * ID of network security group to which flow log will be applied.
     */
    @JsonProperty(value = "properties.targetResourceId")
    private String targetResourceId;

    /*
     * Guid of network security group to which flow log will be applied.
     */
    @JsonProperty(value = "properties.targetResourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceGuid;

    /*
     * ID of the storage account which is used to store the flow log.
     */
    @JsonProperty(value = "properties.storageId")
    private String storageId;

    /*
     * Flag to enable/disable flow logging.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * Parameters that define the retention policy for flow log.
     */
    @JsonProperty(value = "properties.retentionPolicy")
    private RetentionPolicyParameters retentionPolicy;

    /*
     * Parameters that define the flow log format.
     */
    @JsonProperty(value = "properties.format")
    private FlowLogFormatParameters format;

    /*
     * Parameters that define the configuration of traffic analytics.
     */
    @JsonProperty(value = "properties.flowAnalyticsConfiguration")
    private TrafficAnalyticsProperties flowAnalyticsConfiguration;

    /*
     * The provisioning state of the flow log.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the targetResourceId property: ID of network security group to which flow log will be applied.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: ID of network security group to which flow log will be applied.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the targetResourceGuid property: Guid of network security group to which flow log will be applied.
     *
     * @return the targetResourceGuid value.
     */
    public String targetResourceGuid() {
        return this.targetResourceGuid;
    }

    /**
     * Get the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @param storageId the storageId value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the enabled property: Flag to enable/disable flow logging.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Flag to enable/disable flow logging.
     *
     * @param enabled the enabled value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the format property: Parameters that define the flow log format.
     *
     * @return the format value.
     */
    public FlowLogFormatParameters format() {
        return this.format;
    }

    /**
     * Set the format property: Parameters that define the flow log format.
     *
     * @param format the format value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withFormat(FlowLogFormatParameters format) {
        this.format = format;
        return this;
    }

    /**
     * Get the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @return the flowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration;
    }

    /**
     * Set the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @param flowAnalyticsConfiguration the flowAnalyticsConfiguration value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration) {
        this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the flow log.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
        if (format() != null) {
            format().validate();
        }
        if (flowAnalyticsConfiguration() != null) {
            flowAnalyticsConfiguration().validate();
        }
    }
}
