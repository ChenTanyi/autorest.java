// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ApplicationGateway. */
@Immutable
public interface ApplicationGateway {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the identity property: The identity of the application gateway, if configured.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the sku property: SKU of the application gateway resource.
     *
     * @return the sku value.
     */
    ApplicationGatewaySku sku();

    /**
     * Gets the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @return the sslPolicy value.
     */
    ApplicationGatewaySslPolicy sslPolicy();

    /**
     * Gets the operationalState property: Operational state of the application gateway resource.
     *
     * @return the operationalState value.
     */
    ApplicationGatewayOperationalState operationalState();

    /**
     * Gets the gatewayIpConfigurations property: Subnets of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the gatewayIpConfigurations value.
     */
    List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations();

    /**
     * Gets the authenticationCertificates property: Authentication certificates of the application gateway resource.
     * For default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the authenticationCertificates value.
     */
    List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates();

    /**
     * Gets the trustedRootCertificates property: Trusted Root certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the trustedRootCertificates value.
     */
    List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates();

    /**
     * Gets the trustedClientCertificates property: Trusted client certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the trustedClientCertificates value.
     */
    List<ApplicationGatewayTrustedClientCertificate> trustedClientCertificates();

    /**
     * Gets the sslCertificates property: SSL certificates of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the sslCertificates value.
     */
    List<ApplicationGatewaySslCertificate> sslCertificates();

    /**
     * Gets the frontendIpConfigurations property: Frontend IP addresses of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the frontendIpConfigurations value.
     */
    List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations();

    /**
     * Gets the frontendPorts property: Frontend ports of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the frontendPorts value.
     */
    List<ApplicationGatewayFrontendPort> frontendPorts();

    /**
     * Gets the probes property: Probes of the application gateway resource.
     *
     * @return the probes value.
     */
    List<ApplicationGatewayProbe> probes();

    /**
     * Gets the backendAddressPools property: Backend address pool of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the backendAddressPools value.
     */
    List<ApplicationGatewayBackendAddressPool> backendAddressPools();

    /**
     * Gets the backendHttpSettingsCollection property: Backend http settings of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the backendHttpSettingsCollection value.
     */
    List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection();

    /**
     * Gets the httpListeners property: Http listeners of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the httpListeners value.
     */
    List<ApplicationGatewayHttpListener> httpListeners();

    /**
     * Gets the sslProfiles property: SSL profiles of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the sslProfiles value.
     */
    List<ApplicationGatewaySslProfile> sslProfiles();

    /**
     * Gets the urlPathMaps property: URL path map of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the urlPathMaps value.
     */
    List<ApplicationGatewayUrlPathMap> urlPathMaps();

    /**
     * Gets the requestRoutingRules property: Request routing rules of the application gateway resource.
     *
     * @return the requestRoutingRules value.
     */
    List<ApplicationGatewayRequestRoutingRule> requestRoutingRules();

    /**
     * Gets the rewriteRuleSets property: Rewrite rules for the application gateway resource.
     *
     * @return the rewriteRuleSets value.
     */
    List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets();

    /**
     * Gets the redirectConfigurations property: Redirect configurations of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the redirectConfigurations value.
     */
    List<ApplicationGatewayRedirectConfiguration> redirectConfigurations();

    /**
     * Gets the webApplicationFirewallConfiguration property: Web application firewall configuration.
     *
     * @return the webApplicationFirewallConfiguration value.
     */
    ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration();

    /**
     * Gets the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    SubResource firewallPolicy();

    /**
     * Gets the enableHttp2 property: Whether HTTP2 is enabled on the application gateway resource.
     *
     * @return the enableHttp2 value.
     */
    Boolean enableHttp2();

    /**
     * Gets the enableFips property: Whether FIPS is enabled on the application gateway resource.
     *
     * @return the enableFips value.
     */
    Boolean enableFips();

    /**
     * Gets the autoscaleConfiguration property: Autoscale Configuration.
     *
     * @return the autoscaleConfiguration value.
     */
    ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration();

    /**
     * Gets the privateLinkConfigurations property: PrivateLink configurations on application gateway.
     *
     * @return the privateLinkConfigurations value.
     */
    List<ApplicationGatewayPrivateLinkConfiguration> privateLinkConfigurations();

    /**
     * Gets the privateEndpointConnections property: Private Endpoint connections on application gateway.
     *
     * @return the privateEndpointConnections value.
     */
    List<ApplicationGatewayPrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the resourceGuid property: The resource GUID property of the application gateway resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the application gateway resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the customErrorConfigurations property: Custom error configurations of the application gateway resource.
     *
     * @return the customErrorConfigurations value.
     */
    List<ApplicationGatewayCustomError> customErrorConfigurations();

    /**
     * Gets the forceFirewallPolicyAssociation property: If true, associates a firewall policy with an application
     * gateway regardless whether the policy differs from the WAF Config.
     *
     * @return the forceFirewallPolicyAssociation value.
     */
    Boolean forceFirewallPolicyAssociation();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayInner object.
     *
     * @return the inner object.
     */
    ApplicationGatewayInner innerModel();

    /** The entirety of the ApplicationGateway definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ApplicationGateway definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationGateway definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ApplicationGateway definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ApplicationGateway definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the ApplicationGateway definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithZones,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSku,
                DefinitionStages.WithSslPolicy,
                DefinitionStages.WithGatewayIpConfigurations,
                DefinitionStages.WithAuthenticationCertificates,
                DefinitionStages.WithTrustedRootCertificates,
                DefinitionStages.WithTrustedClientCertificates,
                DefinitionStages.WithSslCertificates,
                DefinitionStages.WithFrontendIpConfigurations,
                DefinitionStages.WithFrontendPorts,
                DefinitionStages.WithProbes,
                DefinitionStages.WithBackendAddressPools,
                DefinitionStages.WithBackendHttpSettingsCollection,
                DefinitionStages.WithHttpListeners,
                DefinitionStages.WithSslProfiles,
                DefinitionStages.WithUrlPathMaps,
                DefinitionStages.WithRequestRoutingRules,
                DefinitionStages.WithRewriteRuleSets,
                DefinitionStages.WithRedirectConfigurations,
                DefinitionStages.WithWebApplicationFirewallConfiguration,
                DefinitionStages.WithFirewallPolicy,
                DefinitionStages.WithEnableHttp2,
                DefinitionStages.WithEnableFips,
                DefinitionStages.WithAutoscaleConfiguration,
                DefinitionStages.WithPrivateLinkConfigurations,
                DefinitionStages.WithCustomErrorConfigurations,
                DefinitionStages.WithForceFirewallPolicyAssociation,
                DefinitionStages.WithId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationGateway create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationGateway create(Context context);
        }
        /** The stage of the ApplicationGateway definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ApplicationGateway definition allowing to specify zones. */
        interface WithZones {
            /**
             * Specifies the zones property: A list of availability zones denoting where the resource needs to come
             * from..
             *
             * @param zones A list of availability zones denoting where the resource needs to come from.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }
        /** The stage of the ApplicationGateway definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the application gateway, if configured..
             *
             * @param identity The identity of the application gateway, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the application gateway resource..
             *
             * @param sku SKU of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withSku(ApplicationGatewaySku sku);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sslPolicy. */
        interface WithSslPolicy {
            /**
             * Specifies the sslPolicy property: SSL policy of the application gateway resource..
             *
             * @param sslPolicy SSL policy of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withSslPolicy(ApplicationGatewaySslPolicy sslPolicy);
        }
        /** The stage of the ApplicationGateway definition allowing to specify gatewayIpConfigurations. */
        interface WithGatewayIpConfigurations {
            /**
             * Specifies the gatewayIpConfigurations property: Subnets of the application gateway resource. For default
             * limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param gatewayIpConfigurations Subnets of the application gateway resource. For default limits, see
             *     [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withGatewayIpConfigurations(List<ApplicationGatewayIpConfiguration> gatewayIpConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify authenticationCertificates. */
        interface WithAuthenticationCertificates {
            /**
             * Specifies the authenticationCertificates property: Authentication certificates of the application gateway
             * resource. For default limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param authenticationCertificates Authentication certificates of the application gateway resource. For
             *     default limits, see [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withAuthenticationCertificates(
                List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates);
        }
        /** The stage of the ApplicationGateway definition allowing to specify trustedRootCertificates. */
        interface WithTrustedRootCertificates {
            /**
             * Specifies the trustedRootCertificates property: Trusted Root certificates of the application gateway
             * resource. For default limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param trustedRootCertificates Trusted Root certificates of the application gateway resource. For default
             *     limits, see [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withTrustedRootCertificates(
                List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates);
        }
        /** The stage of the ApplicationGateway definition allowing to specify trustedClientCertificates. */
        interface WithTrustedClientCertificates {
            /**
             * Specifies the trustedClientCertificates property: Trusted client certificates of the application gateway
             * resource. For default limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param trustedClientCertificates Trusted client certificates of the application gateway resource. For
             *     default limits, see [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withTrustedClientCertificates(
                List<ApplicationGatewayTrustedClientCertificate> trustedClientCertificates);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sslCertificates. */
        interface WithSslCertificates {
            /**
             * Specifies the sslCertificates property: SSL certificates of the application gateway resource. For default
             * limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param sslCertificates SSL certificates of the application gateway resource. For default limits, see
             *     [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates);
        }
        /** The stage of the ApplicationGateway definition allowing to specify frontendIpConfigurations. */
        interface WithFrontendIpConfigurations {
            /**
             * Specifies the frontendIpConfigurations property: Frontend IP addresses of the application gateway
             * resource. For default limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param frontendIpConfigurations Frontend IP addresses of the application gateway resource. For default
             *     limits, see [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withFrontendIpConfigurations(
                List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify frontendPorts. */
        interface WithFrontendPorts {
            /**
             * Specifies the frontendPorts property: Frontend ports of the application gateway resource. For default
             * limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param frontendPorts Frontend ports of the application gateway resource. For default limits, see
             *     [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts);
        }
        /** The stage of the ApplicationGateway definition allowing to specify probes. */
        interface WithProbes {
            /**
             * Specifies the probes property: Probes of the application gateway resource..
             *
             * @param probes Probes of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withProbes(List<ApplicationGatewayProbe> probes);
        }
        /** The stage of the ApplicationGateway definition allowing to specify backendAddressPools. */
        interface WithBackendAddressPools {
            /**
             * Specifies the backendAddressPools property: Backend address pool of the application gateway resource. For
             * default limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param backendAddressPools Backend address pool of the application gateway resource. For default limits,
             *     see [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools);
        }
        /** The stage of the ApplicationGateway definition allowing to specify backendHttpSettingsCollection. */
        interface WithBackendHttpSettingsCollection {
            /**
             * Specifies the backendHttpSettingsCollection property: Backend http settings of the application gateway
             * resource. For default limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param backendHttpSettingsCollection Backend http settings of the application gateway resource. For
             *     default limits, see [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withBackendHttpSettingsCollection(
                List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection);
        }
        /** The stage of the ApplicationGateway definition allowing to specify httpListeners. */
        interface WithHttpListeners {
            /**
             * Specifies the httpListeners property: Http listeners of the application gateway resource. For default
             * limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param httpListeners Http listeners of the application gateway resource. For default limits, see
             *     [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners);
        }
        /** The stage of the ApplicationGateway definition allowing to specify sslProfiles. */
        interface WithSslProfiles {
            /**
             * Specifies the sslProfiles property: SSL profiles of the application gateway resource. For default limits,
             * see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param sslProfiles SSL profiles of the application gateway resource. For default limits, see [Application
             *     Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withSslProfiles(List<ApplicationGatewaySslProfile> sslProfiles);
        }
        /** The stage of the ApplicationGateway definition allowing to specify urlPathMaps. */
        interface WithUrlPathMaps {
            /**
             * Specifies the urlPathMaps property: URL path map of the application gateway resource. For default limits,
             * see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param urlPathMaps URL path map of the application gateway resource. For default limits, see [Application
             *     Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps);
        }
        /** The stage of the ApplicationGateway definition allowing to specify requestRoutingRules. */
        interface WithRequestRoutingRules {
            /**
             * Specifies the requestRoutingRules property: Request routing rules of the application gateway resource..
             *
             * @param requestRoutingRules Request routing rules of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules);
        }
        /** The stage of the ApplicationGateway definition allowing to specify rewriteRuleSets. */
        interface WithRewriteRuleSets {
            /**
             * Specifies the rewriteRuleSets property: Rewrite rules for the application gateway resource..
             *
             * @param rewriteRuleSets Rewrite rules for the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withRewriteRuleSets(List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets);
        }
        /** The stage of the ApplicationGateway definition allowing to specify redirectConfigurations. */
        interface WithRedirectConfigurations {
            /**
             * Specifies the redirectConfigurations property: Redirect configurations of the application gateway
             * resource. For default limits, see [Application Gateway
             * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits)..
             *
             * @param redirectConfigurations Redirect configurations of the application gateway resource. For default
             *     limits, see [Application Gateway
             *     limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
             * @return the next definition stage.
             */
            WithCreate withRedirectConfigurations(List<ApplicationGatewayRedirectConfiguration> redirectConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify webApplicationFirewallConfiguration. */
        interface WithWebApplicationFirewallConfiguration {
            /**
             * Specifies the webApplicationFirewallConfiguration property: Web application firewall configuration..
             *
             * @param webApplicationFirewallConfiguration Web application firewall configuration.
             * @return the next definition stage.
             */
            WithCreate withWebApplicationFirewallConfiguration(
                ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration);
        }
        /** The stage of the ApplicationGateway definition allowing to specify firewallPolicy. */
        interface WithFirewallPolicy {
            /**
             * Specifies the firewallPolicy property: Reference to the FirewallPolicy resource..
             *
             * @param firewallPolicy Reference to the FirewallPolicy resource.
             * @return the next definition stage.
             */
            WithCreate withFirewallPolicy(SubResource firewallPolicy);
        }
        /** The stage of the ApplicationGateway definition allowing to specify enableHttp2. */
        interface WithEnableHttp2 {
            /**
             * Specifies the enableHttp2 property: Whether HTTP2 is enabled on the application gateway resource..
             *
             * @param enableHttp2 Whether HTTP2 is enabled on the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withEnableHttp2(Boolean enableHttp2);
        }
        /** The stage of the ApplicationGateway definition allowing to specify enableFips. */
        interface WithEnableFips {
            /**
             * Specifies the enableFips property: Whether FIPS is enabled on the application gateway resource..
             *
             * @param enableFips Whether FIPS is enabled on the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withEnableFips(Boolean enableFips);
        }
        /** The stage of the ApplicationGateway definition allowing to specify autoscaleConfiguration. */
        interface WithAutoscaleConfiguration {
            /**
             * Specifies the autoscaleConfiguration property: Autoscale Configuration..
             *
             * @param autoscaleConfiguration Autoscale Configuration.
             * @return the next definition stage.
             */
            WithCreate withAutoscaleConfiguration(ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration);
        }
        /** The stage of the ApplicationGateway definition allowing to specify privateLinkConfigurations. */
        interface WithPrivateLinkConfigurations {
            /**
             * Specifies the privateLinkConfigurations property: PrivateLink configurations on application gateway..
             *
             * @param privateLinkConfigurations PrivateLink configurations on application gateway.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkConfigurations(
                List<ApplicationGatewayPrivateLinkConfiguration> privateLinkConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify customErrorConfigurations. */
        interface WithCustomErrorConfigurations {
            /**
             * Specifies the customErrorConfigurations property: Custom error configurations of the application gateway
             * resource..
             *
             * @param customErrorConfigurations Custom error configurations of the application gateway resource.
             * @return the next definition stage.
             */
            WithCreate withCustomErrorConfigurations(List<ApplicationGatewayCustomError> customErrorConfigurations);
        }
        /** The stage of the ApplicationGateway definition allowing to specify forceFirewallPolicyAssociation. */
        interface WithForceFirewallPolicyAssociation {
            /**
             * Specifies the forceFirewallPolicyAssociation property: If true, associates a firewall policy with an
             * application gateway regardless whether the policy differs from the WAF Config..
             *
             * @param forceFirewallPolicyAssociation If true, associates a firewall policy with an application gateway
             *     regardless whether the policy differs from the WAF Config.
             * @return the next definition stage.
             */
            WithCreate withForceFirewallPolicyAssociation(Boolean forceFirewallPolicyAssociation);
        }
        /** The stage of the ApplicationGateway definition allowing to specify id. */
        interface WithId {
            /**
             * Specifies the id property: Resource ID..
             *
             * @param id Resource ID.
             * @return the next definition stage.
             */
            WithCreate withId(String id);
        }
    }
    /**
     * Begins update for the ApplicationGateway resource.
     *
     * @return the stage of resource update.
     */
    ApplicationGateway.Update update();

    /** The template for ApplicationGateway update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ApplicationGateway apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ApplicationGateway apply(Context context);
    }
    /** The ApplicationGateway update stages. */
    interface UpdateStages {
        /** The stage of the ApplicationGateway update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
}