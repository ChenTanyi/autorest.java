// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayAvailableSslOptionsInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ApplicationGatewayAvailableSslOptions. */
@Immutable
public interface ApplicationGatewayAvailableSslOptions {
    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the predefinedPolicies property: List of available Ssl predefined policy.
     *
     * @return the predefinedPolicies value.
     */
    List<SubResource> predefinedPolicies();

    /**
     * Gets the defaultPolicy property: Name of the Ssl predefined policy applied by default to application gateway.
     *
     * @return the defaultPolicy value.
     */
    ApplicationGatewaySslPolicyName defaultPolicy();

    /**
     * Gets the availableCipherSuites property: List of available Ssl cipher suites.
     *
     * @return the availableCipherSuites value.
     */
    List<ApplicationGatewaySslCipherSuite> availableCipherSuites();

    /**
     * Gets the availableProtocols property: List of available Ssl protocols.
     *
     * @return the availableProtocols value.
     */
    List<ApplicationGatewaySslProtocol> availableProtocols();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayAvailableSslOptionsInner object.
     *
     * @return the inner object.
     */
    ApplicationGatewayAvailableSslOptionsInner innerModel();
}