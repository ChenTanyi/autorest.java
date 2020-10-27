// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of cluster. */
@Fluent
public final class ClusterGetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterGetProperties.class);

    /*
     * The version of the cluster.
     */
    @JsonProperty(value = "clusterVersion")
    private String clusterVersion;

    /*
     * The type of operating system.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /*
     * The cluster tier.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /*
     * The cluster id.
     */
    @JsonProperty(value = "clusterId")
    private String clusterId;

    /*
     * The cluster definition.
     */
    @JsonProperty(value = "clusterDefinition", required = true)
    private ClusterDefinition clusterDefinition;

    /*
     * The cluster kafka rest proxy configuration.
     */
    @JsonProperty(value = "kafkaRestProperties")
    private KafkaRestProperties kafkaRestProperties;

    /*
     * The security profile.
     */
    @JsonProperty(value = "securityProfile")
    private SecurityProfile securityProfile;

    /*
     * The compute profile.
     */
    @JsonProperty(value = "computeProfile")
    private ComputeProfile computeProfile;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState")
    private HDInsightClusterProvisioningState provisioningState;

    /*
     * The date on which the cluster was created.
     */
    @JsonProperty(value = "createdDate")
    private String createdDate;

    /*
     * The state of the cluster.
     */
    @JsonProperty(value = "clusterState")
    private String clusterState;

    /*
     * The quota information.
     */
    @JsonProperty(value = "quotaInfo")
    private QuotaInfo quotaInfo;

    /*
     * The list of errors.
     */
    @JsonProperty(value = "errors")
    private List<Errors> errors;

    /*
     * The list of connectivity endpoints.
     */
    @JsonProperty(value = "connectivityEndpoints")
    private List<ConnectivityEndpoint> connectivityEndpoints;

    /*
     * The disk encryption properties.
     */
    @JsonProperty(value = "diskEncryptionProperties")
    private DiskEncryptionProperties diskEncryptionProperties;

    /*
     * The encryption-in-transit properties.
     */
    @JsonProperty(value = "encryptionInTransitProperties")
    private EncryptionInTransitProperties encryptionInTransitProperties;

    /*
     * The minimal supported tls version.
     */
    @JsonProperty(value = "minSupportedTlsVersion")
    private String minSupportedTlsVersion;

    /*
     * The network properties.
     */
    @JsonProperty(value = "networkProperties")
    private NetworkProperties networkProperties;

    /**
     * Get the clusterVersion property: The version of the cluster.
     *
     * @return the clusterVersion value.
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Set the clusterVersion property: The version of the cluster.
     *
     * @param clusterVersion the clusterVersion value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * Get the osType property: The type of operating system.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The type of operating system.
     *
     * @param osType the osType value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the tier property: The cluster tier.
     *
     * @return the tier value.
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The cluster tier.
     *
     * @param tier the tier value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the clusterId property: The cluster id.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Set the clusterId property: The cluster id.
     *
     * @param clusterId the clusterId value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get the clusterDefinition property: The cluster definition.
     *
     * @return the clusterDefinition value.
     */
    public ClusterDefinition clusterDefinition() {
        return this.clusterDefinition;
    }

    /**
     * Set the clusterDefinition property: The cluster definition.
     *
     * @param clusterDefinition the clusterDefinition value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withClusterDefinition(ClusterDefinition clusterDefinition) {
        this.clusterDefinition = clusterDefinition;
        return this;
    }

    /**
     * Get the kafkaRestProperties property: The cluster kafka rest proxy configuration.
     *
     * @return the kafkaRestProperties value.
     */
    public KafkaRestProperties kafkaRestProperties() {
        return this.kafkaRestProperties;
    }

    /**
     * Set the kafkaRestProperties property: The cluster kafka rest proxy configuration.
     *
     * @param kafkaRestProperties the kafkaRestProperties value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withKafkaRestProperties(KafkaRestProperties kafkaRestProperties) {
        this.kafkaRestProperties = kafkaRestProperties;
        return this;
    }

    /**
     * Get the securityProfile property: The security profile.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: The security profile.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the computeProfile property: The compute profile.
     *
     * @return the computeProfile value.
     */
    public ComputeProfile computeProfile() {
        return this.computeProfile;
    }

    /**
     * Set the computeProfile property: The compute profile.
     *
     * @param computeProfile the computeProfile value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withComputeProfile(ComputeProfile computeProfile) {
        this.computeProfile = computeProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public HDInsightClusterProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withProvisioningState(HDInsightClusterProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the createdDate property: The date on which the cluster was created.
     *
     * @return the createdDate value.
     */
    public String createdDate() {
        return this.createdDate;
    }

    /**
     * Set the createdDate property: The date on which the cluster was created.
     *
     * @param createdDate the createdDate value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the clusterState property: The state of the cluster.
     *
     * @return the clusterState value.
     */
    public String clusterState() {
        return this.clusterState;
    }

    /**
     * Set the clusterState property: The state of the cluster.
     *
     * @param clusterState the clusterState value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }

    /**
     * Get the quotaInfo property: The quota information.
     *
     * @return the quotaInfo value.
     */
    public QuotaInfo quotaInfo() {
        return this.quotaInfo;
    }

    /**
     * Set the quotaInfo property: The quota information.
     *
     * @param quotaInfo the quotaInfo value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withQuotaInfo(QuotaInfo quotaInfo) {
        this.quotaInfo = quotaInfo;
        return this;
    }

    /**
     * Get the errors property: The list of errors.
     *
     * @return the errors value.
     */
    public List<Errors> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The list of errors.
     *
     * @param errors the errors value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withErrors(List<Errors> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the connectivityEndpoints property: The list of connectivity endpoints.
     *
     * @return the connectivityEndpoints value.
     */
    public List<ConnectivityEndpoint> connectivityEndpoints() {
        return this.connectivityEndpoints;
    }

    /**
     * Set the connectivityEndpoints property: The list of connectivity endpoints.
     *
     * @param connectivityEndpoints the connectivityEndpoints value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withConnectivityEndpoints(List<ConnectivityEndpoint> connectivityEndpoints) {
        this.connectivityEndpoints = connectivityEndpoints;
        return this;
    }

    /**
     * Get the diskEncryptionProperties property: The disk encryption properties.
     *
     * @return the diskEncryptionProperties value.
     */
    public DiskEncryptionProperties diskEncryptionProperties() {
        return this.diskEncryptionProperties;
    }

    /**
     * Set the diskEncryptionProperties property: The disk encryption properties.
     *
     * @param diskEncryptionProperties the diskEncryptionProperties value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withDiskEncryptionProperties(DiskEncryptionProperties diskEncryptionProperties) {
        this.diskEncryptionProperties = diskEncryptionProperties;
        return this;
    }

    /**
     * Get the encryptionInTransitProperties property: The encryption-in-transit properties.
     *
     * @return the encryptionInTransitProperties value.
     */
    public EncryptionInTransitProperties encryptionInTransitProperties() {
        return this.encryptionInTransitProperties;
    }

    /**
     * Set the encryptionInTransitProperties property: The encryption-in-transit properties.
     *
     * @param encryptionInTransitProperties the encryptionInTransitProperties value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withEncryptionInTransitProperties(
        EncryptionInTransitProperties encryptionInTransitProperties) {
        this.encryptionInTransitProperties = encryptionInTransitProperties;
        return this;
    }

    /**
     * Get the minSupportedTlsVersion property: The minimal supported tls version.
     *
     * @return the minSupportedTlsVersion value.
     */
    public String minSupportedTlsVersion() {
        return this.minSupportedTlsVersion;
    }

    /**
     * Set the minSupportedTlsVersion property: The minimal supported tls version.
     *
     * @param minSupportedTlsVersion the minSupportedTlsVersion value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withMinSupportedTlsVersion(String minSupportedTlsVersion) {
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        return this;
    }

    /**
     * Get the networkProperties property: The network properties.
     *
     * @return the networkProperties value.
     */
    public NetworkProperties networkProperties() {
        return this.networkProperties;
    }

    /**
     * Set the networkProperties property: The network properties.
     *
     * @param networkProperties the networkProperties value to set.
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withNetworkProperties(NetworkProperties networkProperties) {
        this.networkProperties = networkProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterDefinition() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clusterDefinition in model ClusterGetProperties"));
        } else {
            clusterDefinition().validate();
        }
        if (kafkaRestProperties() != null) {
            kafkaRestProperties().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
        if (computeProfile() != null) {
            computeProfile().validate();
        }
        if (quotaInfo() != null) {
            quotaInfo().validate();
        }
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
        if (connectivityEndpoints() != null) {
            connectivityEndpoints().forEach(e -> e.validate());
        }
        if (diskEncryptionProperties() != null) {
            diskEncryptionProperties().validate();
        }
        if (encryptionInTransitProperties() != null) {
            encryptionInTransitProperties().validate();
        }
        if (networkProperties() != null) {
            networkProperties().validate();
        }
    }
}
