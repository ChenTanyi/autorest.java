// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.IpGroupInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of IpGroup. */
@Immutable
public interface IpGroup {
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
     * Gets the provisioningState property: The provisioning state of the IpGroups resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource.
     *
     * @return the ipAddresses value.
     */
    List<String> ipAddresses();

    /**
     * Gets the firewalls property: List of references to Firewall resources that this IpGroups is associated with.
     *
     * @return the firewalls value.
     */
    List<SubResource> firewalls();

    /**
     * Gets the firewallPolicies property: List of references to Firewall Policies resources that this IpGroups is
     * associated with.
     *
     * @return the firewallPolicies value.
     */
    List<SubResource> firewallPolicies();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.IpGroupInner object.
     *
     * @return the inner object.
     */
    IpGroupInner innerModel();

    /** The entirety of the IpGroup definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The IpGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the IpGroup definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the IpGroup definition allowing to specify location. */
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
        /** The stage of the IpGroup definition allowing to specify parent resource. */
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
         * The stage of the IpGroup definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIpAddresses {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IpGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IpGroup create(Context context);
        }
        /** The stage of the IpGroup definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the IpGroup definition allowing to specify ipAddresses. */
        interface WithIpAddresses {
            /**
             * Specifies the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource..
             *
             * @param ipAddresses IpAddresses/IpAddressPrefixes in the IpGroups resource.
             * @return the next definition stage.
             */
            WithCreate withIpAddresses(List<String> ipAddresses);
        }
    }
    /**
     * Begins update for the IpGroup resource.
     *
     * @return the stage of resource update.
     */
    IpGroup.Update update();

    /** The template for IpGroup update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IpGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IpGroup apply(Context context);
    }
    /** The IpGroup update stages. */
    interface UpdateStages {
        /** The stage of the IpGroup update allowing to specify tags. */
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
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IpGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IpGroup refresh(Context context);
}
