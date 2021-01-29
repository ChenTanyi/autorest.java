// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Properties of the Topic update. */
@JsonFlatten
@Fluent
public class TopicUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopicUpdateParameters.class);

    /*
     * Tags of the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Resource identity information.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /*
     * The Sku pricing tier for the topic.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicUpdateParameterProperties.InboundIpRules"
     * />
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all
     * IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "properties.inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /**
     * Get the tags property: Tags of the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the resource.
     *
     * @param tags the tags value to set.
     * @return the TopicUpdateParameters object itself.
     */
    public TopicUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Resource identity information.
     *
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Resource identity information.
     *
     * @param identity the identity value to set.
     * @return the TopicUpdateParameters object itself.
     */
    public TopicUpdateParameters withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The Sku pricing tier for the topic.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Sku pricing tier for the topic.
     *
     * @param sku the sku value to set.
     * @return the TopicUpdateParameters object itself.
     */
    public TopicUpdateParameters withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the TopicUpdateParameters object itself.
     */
    public TopicUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the TopicUpdateParameters object itself.
     */
    public TopicUpdateParameters withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
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
        if (sku() != null) {
            sku().validate();
        }
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
