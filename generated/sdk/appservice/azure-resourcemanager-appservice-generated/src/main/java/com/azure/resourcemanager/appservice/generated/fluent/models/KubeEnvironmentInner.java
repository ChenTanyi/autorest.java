// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.AppLogsConfiguration;
import com.azure.resourcemanager.appservice.generated.models.ArcConfiguration;
import com.azure.resourcemanager.appservice.generated.models.ExtendedLocation;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironmentProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A Kubernetes cluster specialized for web workloads by Azure App Service. */
@JsonFlatten
@Fluent
public class KubeEnvironmentInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KubeEnvironmentInner.class);

    /*
     * Extended Location.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Provisioning state of the Kubernetes Environment.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KubeEnvironmentProvisioningState provisioningState;

    /*
     * Any errors that occurred during deployment or deployment validation
     */
    @JsonProperty(value = "properties.deploymentErrors", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentErrors;

    /*
     * Only visible within Vnet/Subnet
     */
    @JsonProperty(value = "properties.internalLoadBalancerEnabled")
    private Boolean internalLoadBalancerEnabled;

    /*
     * Default Domain Name for the cluster
     */
    @JsonProperty(value = "properties.defaultDomain", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultDomain;

    /*
     * Static IP of the KubeEnvironment
     */
    @JsonProperty(value = "properties.staticIp")
    private String staticIp;

    /*
     * Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     */
    @JsonProperty(value = "properties.arcConfiguration")
    private ArcConfiguration arcConfiguration;

    /*
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported
     */
    @JsonProperty(value = "properties.appLogsConfiguration")
    private AppLogsConfiguration appLogsConfiguration;

    /*
     * The aksResourceID property.
     */
    @JsonProperty(value = "properties.aksResourceID")
    private String aksResourceId;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the extendedLocation property: Extended Location.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Extended Location.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the KubeEnvironmentInner object itself.
     */
    public KubeEnvironmentInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Kubernetes Environment.
     *
     * @return the provisioningState value.
     */
    public KubeEnvironmentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentErrors property: Any errors that occurred during deployment or deployment validation.
     *
     * @return the deploymentErrors value.
     */
    public String deploymentErrors() {
        return this.deploymentErrors;
    }

    /**
     * Get the internalLoadBalancerEnabled property: Only visible within Vnet/Subnet.
     *
     * @return the internalLoadBalancerEnabled value.
     */
    public Boolean internalLoadBalancerEnabled() {
        return this.internalLoadBalancerEnabled;
    }

    /**
     * Set the internalLoadBalancerEnabled property: Only visible within Vnet/Subnet.
     *
     * @param internalLoadBalancerEnabled the internalLoadBalancerEnabled value to set.
     * @return the KubeEnvironmentInner object itself.
     */
    public KubeEnvironmentInner withInternalLoadBalancerEnabled(Boolean internalLoadBalancerEnabled) {
        this.internalLoadBalancerEnabled = internalLoadBalancerEnabled;
        return this;
    }

    /**
     * Get the defaultDomain property: Default Domain Name for the cluster.
     *
     * @return the defaultDomain value.
     */
    public String defaultDomain() {
        return this.defaultDomain;
    }

    /**
     * Get the staticIp property: Static IP of the KubeEnvironment.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.staticIp;
    }

    /**
     * Set the staticIp property: Static IP of the KubeEnvironment.
     *
     * @param staticIp the staticIp value to set.
     * @return the KubeEnvironmentInner object itself.
     */
    public KubeEnvironmentInner withStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }

    /**
     * Get the arcConfiguration property: Cluster configuration which determines the ARC cluster components types. Eg:
     * Choosing between BuildService kind, FrontEnd Service ArtifactsStorageType etc.
     *
     * @return the arcConfiguration value.
     */
    public ArcConfiguration arcConfiguration() {
        return this.arcConfiguration;
    }

    /**
     * Set the arcConfiguration property: Cluster configuration which determines the ARC cluster components types. Eg:
     * Choosing between BuildService kind, FrontEnd Service ArtifactsStorageType etc.
     *
     * @param arcConfiguration the arcConfiguration value to set.
     * @return the KubeEnvironmentInner object itself.
     */
    public KubeEnvironmentInner withArcConfiguration(ArcConfiguration arcConfiguration) {
        this.arcConfiguration = arcConfiguration;
        return this;
    }

    /**
     * Get the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @return the appLogsConfiguration value.
     */
    public AppLogsConfiguration appLogsConfiguration() {
        return this.appLogsConfiguration;
    }

    /**
     * Set the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @param appLogsConfiguration the appLogsConfiguration value to set.
     * @return the KubeEnvironmentInner object itself.
     */
    public KubeEnvironmentInner withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration) {
        this.appLogsConfiguration = appLogsConfiguration;
        return this;
    }

    /**
     * Get the aksResourceId property: The aksResourceID property.
     *
     * @return the aksResourceId value.
     */
    public String aksResourceId() {
        return this.aksResourceId;
    }

    /**
     * Set the aksResourceId property: The aksResourceID property.
     *
     * @param aksResourceId the aksResourceId value to set.
     * @return the KubeEnvironmentInner object itself.
     */
    public KubeEnvironmentInner withAksResourceId(String aksResourceId) {
        this.aksResourceId = aksResourceId;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the KubeEnvironmentInner object itself.
     */
    public KubeEnvironmentInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubeEnvironmentInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubeEnvironmentInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (arcConfiguration() != null) {
            arcConfiguration().validate();
        }
        if (appLogsConfiguration() != null) {
            appLogsConfiguration().validate();
        }
    }
}