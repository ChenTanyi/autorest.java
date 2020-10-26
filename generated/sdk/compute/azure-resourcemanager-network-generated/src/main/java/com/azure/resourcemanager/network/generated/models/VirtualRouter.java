// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VirtualRouter. */
@Immutable
public interface VirtualRouter {
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
     * Gets the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @return the virtualRouterAsn value.
     */
    Long virtualRouterAsn();

    /**
     * Gets the virtualRouterIps property: VirtualRouter IPs.
     *
     * @return the virtualRouterIps value.
     */
    List<String> virtualRouterIps();

    /**
     * Gets the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     *
     * @return the hostedSubnet value.
     */
    SubResource hostedSubnet();

    /**
     * Gets the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     *
     * @return the hostedGateway value.
     */
    SubResource hostedGateway();

    /**
     * Gets the peerings property: List of references to VirtualRouterPeerings.
     *
     * @return the peerings value.
     */
    List<SubResource> peerings();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterInner object.
     *
     * @return the inner object.
     */
    VirtualRouterInner innerModel();

    /** The entirety of the VirtualRouter definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The VirtualRouter definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualRouter definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VirtualRouter definition allowing to specify location. */
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
        /** The stage of the VirtualRouter definition allowing to specify parent resource. */
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
         * The stage of the VirtualRouter definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithVirtualRouterAsn,
                DefinitionStages.WithVirtualRouterIps,
                DefinitionStages.WithHostedSubnet,
                DefinitionStages.WithHostedGateway,
                DefinitionStages.WithId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualRouter create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualRouter create(Context context);
        }
        /** The stage of the VirtualRouter definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualRouter definition allowing to specify virtualRouterAsn. */
        interface WithVirtualRouterAsn {
            /**
             * Specifies the virtualRouterAsn property: VirtualRouter ASN..
             *
             * @param virtualRouterAsn VirtualRouter ASN.
             * @return the next definition stage.
             */
            WithCreate withVirtualRouterAsn(Long virtualRouterAsn);
        }
        /** The stage of the VirtualRouter definition allowing to specify virtualRouterIps. */
        interface WithVirtualRouterIps {
            /**
             * Specifies the virtualRouterIps property: VirtualRouter IPs..
             *
             * @param virtualRouterIps VirtualRouter IPs.
             * @return the next definition stage.
             */
            WithCreate withVirtualRouterIps(List<String> virtualRouterIps);
        }
        /** The stage of the VirtualRouter definition allowing to specify hostedSubnet. */
        interface WithHostedSubnet {
            /**
             * Specifies the hostedSubnet property: The Subnet on which VirtualRouter is hosted..
             *
             * @param hostedSubnet The Subnet on which VirtualRouter is hosted.
             * @return the next definition stage.
             */
            WithCreate withHostedSubnet(SubResource hostedSubnet);
        }
        /** The stage of the VirtualRouter definition allowing to specify hostedGateway. */
        interface WithHostedGateway {
            /**
             * Specifies the hostedGateway property: The Gateway on which VirtualRouter is hosted..
             *
             * @param hostedGateway The Gateway on which VirtualRouter is hosted.
             * @return the next definition stage.
             */
            WithCreate withHostedGateway(SubResource hostedGateway);
        }
        /** The stage of the VirtualRouter definition allowing to specify id. */
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
     * Begins update for the VirtualRouter resource.
     *
     * @return the stage of resource update.
     */
    VirtualRouter.Update update();

    /** The template for VirtualRouter update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithVirtualRouterAsn,
            UpdateStages.WithVirtualRouterIps,
            UpdateStages.WithHostedSubnet,
            UpdateStages.WithHostedGateway,
            UpdateStages.WithId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualRouter apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualRouter apply(Context context);
    }
    /** The VirtualRouter update stages. */
    interface UpdateStages {
        /** The stage of the VirtualRouter update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualRouter update allowing to specify virtualRouterAsn. */
        interface WithVirtualRouterAsn {
            /**
             * Specifies the virtualRouterAsn property: VirtualRouter ASN..
             *
             * @param virtualRouterAsn VirtualRouter ASN.
             * @return the next definition stage.
             */
            Update withVirtualRouterAsn(Long virtualRouterAsn);
        }
        /** The stage of the VirtualRouter update allowing to specify virtualRouterIps. */
        interface WithVirtualRouterIps {
            /**
             * Specifies the virtualRouterIps property: VirtualRouter IPs..
             *
             * @param virtualRouterIps VirtualRouter IPs.
             * @return the next definition stage.
             */
            Update withVirtualRouterIps(List<String> virtualRouterIps);
        }
        /** The stage of the VirtualRouter update allowing to specify hostedSubnet. */
        interface WithHostedSubnet {
            /**
             * Specifies the hostedSubnet property: The Subnet on which VirtualRouter is hosted..
             *
             * @param hostedSubnet The Subnet on which VirtualRouter is hosted.
             * @return the next definition stage.
             */
            Update withHostedSubnet(SubResource hostedSubnet);
        }
        /** The stage of the VirtualRouter update allowing to specify hostedGateway. */
        interface WithHostedGateway {
            /**
             * Specifies the hostedGateway property: The Gateway on which VirtualRouter is hosted..
             *
             * @param hostedGateway The Gateway on which VirtualRouter is hosted.
             * @return the next definition stage.
             */
            Update withHostedGateway(SubResource hostedGateway);
        }
        /** The stage of the VirtualRouter update allowing to specify id. */
        interface WithId {
            /**
             * Specifies the id property: Resource ID..
             *
             * @param id Resource ID.
             * @return the next definition stage.
             */
            Update withId(String id);
        }
    }
}