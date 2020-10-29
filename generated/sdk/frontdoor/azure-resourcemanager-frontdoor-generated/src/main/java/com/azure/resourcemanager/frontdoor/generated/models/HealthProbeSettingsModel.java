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

/** Load balancing settings for a backend pool. */
@JsonFlatten
@Fluent
public class HealthProbeSettingsModel extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthProbeSettingsModel.class);

    /*
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The path to use for the health probe. Default is /
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /*
     * Protocol scheme to use for this probe
     */
    @JsonProperty(value = "properties.protocol")
    private FrontDoorProtocol protocol;

    /*
     * The number of seconds between health probes.
     */
    @JsonProperty(value = "properties.intervalInSeconds")
    private Integer intervalInSeconds;

    /*
     * Configures which HTTP method to use to probe the backends defined under
     * backendPools.
     */
    @JsonProperty(value = "properties.healthProbeMethod")
    private FrontDoorHealthProbeMethod healthProbeMethod;

    /*
     * Whether to enable health probes to be made against backends defined
     * under backendPools. Health probes can only be disabled if there is a
     * single enabled backend in single enabled backend pool.
     */
    @JsonProperty(value = "properties.enabledState")
    private HealthProbeEnabled enabledState;

    /*
     * Resource status.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the path property: The path to use for the health probe. Default is /.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path to use for the health probe. Default is /.
     *
     * @param path the path value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the protocol property: Protocol scheme to use for this probe.
     *
     * @return the protocol value.
     */
    public FrontDoorProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol scheme to use for this probe.
     *
     * @param protocol the protocol value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withProtocol(FrontDoorProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the intervalInSeconds property: The number of seconds between health probes.
     *
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: The number of seconds between health probes.
     *
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the healthProbeMethod property: Configures which HTTP method to use to probe the backends defined under
     * backendPools.
     *
     * @return the healthProbeMethod value.
     */
    public FrontDoorHealthProbeMethod healthProbeMethod() {
        return this.healthProbeMethod;
    }

    /**
     * Set the healthProbeMethod property: Configures which HTTP method to use to probe the backends defined under
     * backendPools.
     *
     * @param healthProbeMethod the healthProbeMethod value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withHealthProbeMethod(FrontDoorHealthProbeMethod healthProbeMethod) {
        this.healthProbeMethod = healthProbeMethod;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @return the enabledState value.
     */
    public HealthProbeEnabled enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @param enabledState the enabledState value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withEnabledState(HealthProbeEnabled enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the resourceState property: Resource status.
     *
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
