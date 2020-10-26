// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import java.util.List;

/** An immutable client-side representation of FrontendIpConfiguration. */
@Immutable
public interface FrontendIpConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within the set of frontend IP configurations used
     * by the load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the inboundNatRules property: An array of references to inbound rules that use this frontend IP.
     *
     * @return the inboundNatRules value.
     */
    List<SubResource> inboundNatRules();

    /**
     * Gets the inboundNatPools property: An array of references to inbound pools that use this frontend IP.
     *
     * @return the inboundNatPools value.
     */
    List<SubResource> inboundNatPools();

    /**
     * Gets the outboundRules property: An array of references to outbound rules that use this frontend IP.
     *
     * @return the outboundRules value.
     */
    List<SubResource> outboundRules();

    /**
     * Gets the loadBalancingRules property: An array of references to load balancing rules that use this frontend IP.
     *
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * Gets the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: The Private IP allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the privateIpAddressVersion property: Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken
     * as IPv4.
     *
     * @return the privateIpAddressVersion value.
     */
    IpVersion privateIpAddressVersion();

    /**
     * Gets the subnet property: The reference to the subnet resource.
     *
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the publicIpAddress property: The reference to the Public IP resource.
     *
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the publicIpPrefix property: The reference to the Public IP Prefix resource.
     *
     * @return the publicIpPrefix value.
     */
    SubResource publicIpPrefix();

    /**
     * Gets the provisioningState property: The provisioning state of the frontend IP configuration resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner object.
     *
     * @return the inner object.
     */
    FrontendIpConfigurationInner innerModel();
}
