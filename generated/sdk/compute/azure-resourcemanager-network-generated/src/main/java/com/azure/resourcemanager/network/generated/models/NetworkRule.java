// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Rule of type network. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("NetworkRule")
@Fluent
public final class NetworkRule extends FirewallPolicyRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkRule.class);

    /*
     * Array of FirewallPolicyRuleNetworkProtocols.
     */
    @JsonProperty(value = "ipProtocols")
    private List<FirewallPolicyRuleNetworkProtocol> ipProtocols;

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses or Service Tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /*
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /*
     * List of destination IpGroups for this rule.
     */
    @JsonProperty(value = "destinationIpGroups")
    private List<String> destinationIpGroups;

    /*
     * List of destination FQDNs.
     */
    @JsonProperty(value = "destinationFqdns")
    private List<String> destinationFqdns;

    /**
     * Get the ipProtocols property: Array of FirewallPolicyRuleNetworkProtocols.
     *
     * @return the ipProtocols value.
     */
    public List<FirewallPolicyRuleNetworkProtocol> ipProtocols() {
        return this.ipProtocols;
    }

    /**
     * Set the ipProtocols property: Array of FirewallPolicyRuleNetworkProtocols.
     *
     * @param ipProtocols the ipProtocols value to set.
     * @return the NetworkRule object itself.
     */
    public NetworkRule withIpProtocols(List<FirewallPolicyRuleNetworkProtocol> ipProtocols) {
        this.ipProtocols = ipProtocols;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the NetworkRule object itself.
     */
    public NetworkRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports.
     *
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports.
     *
     * @param destinationPorts the destinationPorts value to set.
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the sourceIpGroups property: List of source IpGroups for this rule.
     *
     * @return the sourceIpGroups value.
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set the sourceIpGroups property: List of source IpGroups for this rule.
     *
     * @param sourceIpGroups the sourceIpGroups value to set.
     * @return the NetworkRule object itself.
     */
    public NetworkRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Get the destinationIpGroups property: List of destination IpGroups for this rule.
     *
     * @return the destinationIpGroups value.
     */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups;
    }

    /**
     * Set the destinationIpGroups property: List of destination IpGroups for this rule.
     *
     * @param destinationIpGroups the destinationIpGroups value to set.
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationIpGroups(List<String> destinationIpGroups) {
        this.destinationIpGroups = destinationIpGroups;
        return this;
    }

    /**
     * Get the destinationFqdns property: List of destination FQDNs.
     *
     * @return the destinationFqdns value.
     */
    public List<String> destinationFqdns() {
        return this.destinationFqdns;
    }

    /**
     * Set the destinationFqdns property: List of destination FQDNs.
     *
     * @param destinationFqdns the destinationFqdns value to set.
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationFqdns(List<String> destinationFqdns) {
        this.destinationFqdns = destinationFqdns;
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
    }
}
