// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitAuthorizationInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ExpressRouteCircuit. */
@Immutable
public interface ExpressRouteCircuit {
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
     * Gets the sku property: The SKU.
     *
     * @return the sku value.
     */
    ExpressRouteCircuitSku sku();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the allowClassicOperations property: Allow classic operations.
     *
     * @return the allowClassicOperations value.
     */
    Boolean allowClassicOperations();

    /**
     * Gets the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     *
     * @return the circuitProvisioningState value.
     */
    String circuitProvisioningState();

    /**
     * Gets the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     *
     * @return the serviceProviderProvisioningState value.
     */
    ServiceProviderProvisioningState serviceProviderProvisioningState();

    /**
     * Gets the authorizations property: The list of authorizations.
     *
     * @return the authorizations value.
     */
    List<ExpressRouteCircuitAuthorization> authorizations();

    /**
     * Gets the peerings property: The list of peerings.
     *
     * @return the peerings value.
     */
    List<ExpressRouteCircuitPeering> peerings();

    /**
     * Gets the serviceKey property: The ServiceKey.
     *
     * @return the serviceKey value.
     */
    String serviceKey();

    /**
     * Gets the serviceProviderNotes property: The ServiceProviderNotes.
     *
     * @return the serviceProviderNotes value.
     */
    String serviceProviderNotes();

    /**
     * Gets the serviceProviderProperties property: The ServiceProviderProperties.
     *
     * @return the serviceProviderProperties value.
     */
    ExpressRouteCircuitServiceProviderProperties serviceProviderProperties();

    /**
     * Gets the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is
     * provisioned on an ExpressRoutePort resource.
     *
     * @return the expressRoutePort value.
     */
    SubResource expressRoutePort();

    /**
     * Gets the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     *
     * @return the bandwidthInGbps value.
     */
    Float bandwidthInGbps();

    /**
     * Gets the stag property: The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     *
     * @return the stag value.
     */
    Integer stag();

    /**
     * Gets the provisioningState property: The provisioning state of the express route circuit resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value.
     */
    String gatewayManagerEtag();

    /**
     * Gets the globalReachEnabled property: Flag denoting global reach status.
     *
     * @return the globalReachEnabled value.
     */
    Boolean globalReachEnabled();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitInner object.
     *
     * @return the inner object.
     */
    ExpressRouteCircuitInner innerModel();

    /** The entirety of the ExpressRouteCircuit definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ExpressRouteCircuit definition stages. */
    interface DefinitionStages {
        /** The first stage of the ExpressRouteCircuit definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify location. */
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
        /** The stage of the ExpressRouteCircuit definition allowing to specify parent resource. */
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
         * The stage of the ExpressRouteCircuit definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithAllowClassicOperations,
                DefinitionStages.WithCircuitProvisioningState,
                DefinitionStages.WithServiceProviderProvisioningState,
                DefinitionStages.WithAuthorizations,
                DefinitionStages.WithPeerings,
                DefinitionStages.WithServiceKey,
                DefinitionStages.WithServiceProviderNotes,
                DefinitionStages.WithServiceProviderProperties,
                DefinitionStages.WithExpressRoutePort,
                DefinitionStages.WithBandwidthInGbps,
                DefinitionStages.WithGatewayManagerEtag,
                DefinitionStages.WithGlobalReachEnabled,
                DefinitionStages.WithId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ExpressRouteCircuit create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ExpressRouteCircuit create(Context context);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU..
             *
             * @param sku The SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(ExpressRouteCircuitSku sku);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify allowClassicOperations. */
        interface WithAllowClassicOperations {
            /**
             * Specifies the allowClassicOperations property: Allow classic operations..
             *
             * @param allowClassicOperations Allow classic operations.
             * @return the next definition stage.
             */
            WithCreate withAllowClassicOperations(Boolean allowClassicOperations);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify circuitProvisioningState. */
        interface WithCircuitProvisioningState {
            /**
             * Specifies the circuitProvisioningState property: The CircuitProvisioningState state of the resource..
             *
             * @param circuitProvisioningState The CircuitProvisioningState state of the resource.
             * @return the next definition stage.
             */
            WithCreate withCircuitProvisioningState(String circuitProvisioningState);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify serviceProviderProvisioningState. */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of
             * the resource..
             *
             * @param serviceProviderProvisioningState The ServiceProviderProvisioningState state of the resource.
             * @return the next definition stage.
             */
            WithCreate withServiceProviderProvisioningState(
                ServiceProviderProvisioningState serviceProviderProvisioningState);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify authorizations. */
        interface WithAuthorizations {
            /**
             * Specifies the authorizations property: The list of authorizations..
             *
             * @param authorizations The list of authorizations.
             * @return the next definition stage.
             */
            WithCreate withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify peerings. */
        interface WithPeerings {
            /**
             * Specifies the peerings property: The list of peerings..
             *
             * @param peerings The list of peerings.
             * @return the next definition stage.
             */
            WithCreate withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify serviceKey. */
        interface WithServiceKey {
            /**
             * Specifies the serviceKey property: The ServiceKey..
             *
             * @param serviceKey The ServiceKey.
             * @return the next definition stage.
             */
            WithCreate withServiceKey(String serviceKey);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify serviceProviderNotes. */
        interface WithServiceProviderNotes {
            /**
             * Specifies the serviceProviderNotes property: The ServiceProviderNotes..
             *
             * @param serviceProviderNotes The ServiceProviderNotes.
             * @return the next definition stage.
             */
            WithCreate withServiceProviderNotes(String serviceProviderNotes);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify serviceProviderProperties. */
        interface WithServiceProviderProperties {
            /**
             * Specifies the serviceProviderProperties property: The ServiceProviderProperties..
             *
             * @param serviceProviderProperties The ServiceProviderProperties.
             * @return the next definition stage.
             */
            WithCreate withServiceProviderProperties(
                ExpressRouteCircuitServiceProviderProperties serviceProviderProperties);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify expressRoutePort. */
        interface WithExpressRoutePort {
            /**
             * Specifies the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit
             * is provisioned on an ExpressRoutePort resource..
             *
             * @param expressRoutePort The reference to the ExpressRoutePort resource when the circuit is provisioned on
             *     an ExpressRoutePort resource.
             * @return the next definition stage.
             */
            WithCreate withExpressRoutePort(SubResource expressRoutePort);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify bandwidthInGbps. */
        interface WithBandwidthInGbps {
            /**
             * Specifies the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on
             * an ExpressRoutePort resource..
             *
             * @param bandwidthInGbps The bandwidth of the circuit when the circuit is provisioned on an
             *     ExpressRoutePort resource.
             * @return the next definition stage.
             */
            WithCreate withBandwidthInGbps(Float bandwidthInGbps);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify gatewayManagerEtag. */
        interface WithGatewayManagerEtag {
            /**
             * Specifies the gatewayManagerEtag property: The GatewayManager Etag..
             *
             * @param gatewayManagerEtag The GatewayManager Etag.
             * @return the next definition stage.
             */
            WithCreate withGatewayManagerEtag(String gatewayManagerEtag);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify globalReachEnabled. */
        interface WithGlobalReachEnabled {
            /**
             * Specifies the globalReachEnabled property: Flag denoting global reach status..
             *
             * @param globalReachEnabled Flag denoting global reach status.
             * @return the next definition stage.
             */
            WithCreate withGlobalReachEnabled(Boolean globalReachEnabled);
        }
        /** The stage of the ExpressRouteCircuit definition allowing to specify id. */
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
     * Begins update for the ExpressRouteCircuit resource.
     *
     * @return the stage of resource update.
     */
    ExpressRouteCircuit.Update update();

    /** The template for ExpressRouteCircuit update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ExpressRouteCircuit apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ExpressRouteCircuit apply(Context context);
    }
    /** The ExpressRouteCircuit update stages. */
    interface UpdateStages {
        /** The stage of the ExpressRouteCircuit update allowing to specify tags. */
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
