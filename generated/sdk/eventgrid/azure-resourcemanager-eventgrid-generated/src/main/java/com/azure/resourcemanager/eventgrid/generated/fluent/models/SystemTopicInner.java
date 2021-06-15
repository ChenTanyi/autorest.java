// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** EventGrid System Topic. */
@JsonFlatten
@Fluent
public class SystemTopicInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SystemTopicInner.class);

    /*
     * The system metadata relating to System Topic resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Identity information for the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /*
     * Provisioning state of the system topic.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProvisioningState provisioningState;

    /*
     * Source for the system topic.
     */
    @JsonProperty(value = "properties.source")
    private String source;

    /*
     * TopicType for the system topic.
     */
    @JsonProperty(value = "properties.topicType")
    private String topicType;

    /*
     * Metric resource id for the system topic.
     */
    @JsonProperty(value = "properties.metricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricResourceId;

    /**
     * Get the systemData property: The system metadata relating to System Topic resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the identity property: Identity information for the resource.
     *
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity information for the resource.
     *
     * @param identity the identity value to set.
     * @return the SystemTopicInner object itself.
     */
    public SystemTopicInner withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the system topic.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the source property: Source for the system topic.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Source for the system topic.
     *
     * @param source the source value to set.
     * @return the SystemTopicInner object itself.
     */
    public SystemTopicInner withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the topicType property: TopicType for the system topic.
     *
     * @return the topicType value.
     */
    public String topicType() {
        return this.topicType;
    }

    /**
     * Set the topicType property: TopicType for the system topic.
     *
     * @param topicType the topicType value to set.
     * @return the SystemTopicInner object itself.
     */
    public SystemTopicInner withTopicType(String topicType) {
        this.topicType = topicType;
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the system topic.
     *
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /** {@inheritDoc} */
    @Override
    public SystemTopicInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SystemTopicInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
