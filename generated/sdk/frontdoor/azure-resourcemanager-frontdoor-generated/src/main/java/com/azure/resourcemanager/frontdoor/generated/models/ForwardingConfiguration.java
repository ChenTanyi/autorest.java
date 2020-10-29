// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes Forwarding Route. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration")
@JsonFlatten
@Fluent
public class ForwardingConfiguration extends RouteConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ForwardingConfiguration.class);

    /*
     * A custom path used to rewrite resource paths matched by this rule. Leave
     * empty to use incoming path.
     */
    @JsonProperty(value = "customForwardingPath")
    private String customForwardingPath;

    /*
     * Protocol this rule will use when forwarding traffic to backends.
     */
    @JsonProperty(value = "forwardingProtocol")
    private FrontDoorForwardingProtocol forwardingProtocol;

    /*
     * The caching configuration associated with this rule.
     */
    @JsonProperty(value = "cacheConfiguration")
    private CacheConfiguration cacheConfiguration;

    /*
     * A reference to the BackendPool which this rule routes to.
     */
    @JsonProperty(value = "backendPool")
    private SubResource backendPool;

    /**
     * Get the customForwardingPath property: A custom path used to rewrite resource paths matched by this rule. Leave
     * empty to use incoming path.
     *
     * @return the customForwardingPath value.
     */
    public String customForwardingPath() {
        return this.customForwardingPath;
    }

    /**
     * Set the customForwardingPath property: A custom path used to rewrite resource paths matched by this rule. Leave
     * empty to use incoming path.
     *
     * @param customForwardingPath the customForwardingPath value to set.
     * @return the ForwardingConfiguration object itself.
     */
    public ForwardingConfiguration withCustomForwardingPath(String customForwardingPath) {
        this.customForwardingPath = customForwardingPath;
        return this;
    }

    /**
     * Get the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     *
     * @return the forwardingProtocol value.
     */
    public FrontDoorForwardingProtocol forwardingProtocol() {
        return this.forwardingProtocol;
    }

    /**
     * Set the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     *
     * @param forwardingProtocol the forwardingProtocol value to set.
     * @return the ForwardingConfiguration object itself.
     */
    public ForwardingConfiguration withForwardingProtocol(FrontDoorForwardingProtocol forwardingProtocol) {
        this.forwardingProtocol = forwardingProtocol;
        return this;
    }

    /**
     * Get the cacheConfiguration property: The caching configuration associated with this rule.
     *
     * @return the cacheConfiguration value.
     */
    public CacheConfiguration cacheConfiguration() {
        return this.cacheConfiguration;
    }

    /**
     * Set the cacheConfiguration property: The caching configuration associated with this rule.
     *
     * @param cacheConfiguration the cacheConfiguration value to set.
     * @return the ForwardingConfiguration object itself.
     */
    public ForwardingConfiguration withCacheConfiguration(CacheConfiguration cacheConfiguration) {
        this.cacheConfiguration = cacheConfiguration;
        return this;
    }

    /**
     * Get the backendPool property: A reference to the BackendPool which this rule routes to.
     *
     * @return the backendPool value.
     */
    public SubResource backendPool() {
        return this.backendPool;
    }

    /**
     * Set the backendPool property: A reference to the BackendPool which this rule routes to.
     *
     * @param backendPool the backendPool value to set.
     * @return the ForwardingConfiguration object itself.
     */
    public ForwardingConfiguration withBackendPool(SubResource backendPool) {
        this.backendPool = backendPool;
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
        if (cacheConfiguration() != null) {
            cacheConfiguration().validate();
        }
    }
}
