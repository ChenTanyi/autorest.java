// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.HubIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;

/** An immutable client-side representation of HubIpConfiguration. */
@Immutable
public interface HubIpConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of the Ip Configuration.
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
     * Gets the type property: Ipconfiguration type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the subnet property: The reference to the subnet resource.
     *
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the publicIpAddress property: The reference to the public IP resource.
     *
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the provisioningState property: The provisioning state of the IP configuration resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.HubIpConfigurationInner object.
     *
     * @return the inner object.
     */
    HubIpConfigurationInner innerModel();

    /** The entirety of the HubIpConfiguration definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The HubIpConfiguration definition stages. */
    interface DefinitionStages {
        /** The first stage of the HubIpConfiguration definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the HubIpConfiguration definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, virtualHubName.
             *
             * @param resourceGroupName The resource group name of the VirtualHub.
             * @param virtualHubName The name of the VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualHub(String resourceGroupName, String virtualHubName);
        }
        /**
         * The stage of the HubIpConfiguration definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName,
                DefinitionStages.WithPrivateIpAddress,
                DefinitionStages.WithPrivateIpAllocationMethod,
                DefinitionStages.WithSubnet,
                DefinitionStages.WithPublicIpAddress {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            HubIpConfiguration create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            HubIpConfiguration create(Context context);
        }
        /** The stage of the HubIpConfiguration definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Name of the Ip Configuration..
             *
             * @param name Name of the Ip Configuration.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the HubIpConfiguration definition allowing to specify privateIpAddress. */
        interface WithPrivateIpAddress {
            /**
             * Specifies the privateIpAddress property: The private IP address of the IP configuration..
             *
             * @param privateIpAddress The private IP address of the IP configuration.
             * @return the next definition stage.
             */
            WithCreate withPrivateIpAddress(String privateIpAddress);
        }
        /** The stage of the HubIpConfiguration definition allowing to specify privateIpAllocationMethod. */
        interface WithPrivateIpAllocationMethod {
            /**
             * Specifies the privateIpAllocationMethod property: The private IP address allocation method..
             *
             * @param privateIpAllocationMethod The private IP address allocation method.
             * @return the next definition stage.
             */
            WithCreate withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod);
        }
        /** The stage of the HubIpConfiguration definition allowing to specify subnet. */
        interface WithSubnet {
            /**
             * Specifies the subnet property: The reference to the subnet resource..
             *
             * @param subnet The reference to the subnet resource.
             * @return the next definition stage.
             */
            WithCreate withSubnet(SubnetInner subnet);
        }
        /** The stage of the HubIpConfiguration definition allowing to specify publicIpAddress. */
        interface WithPublicIpAddress {
            /**
             * Specifies the publicIpAddress property: The reference to the public IP resource..
             *
             * @param publicIpAddress The reference to the public IP resource.
             * @return the next definition stage.
             */
            WithCreate withPublicIpAddress(PublicIpAddressInner publicIpAddress);
        }
    }
    /**
     * Begins update for the HubIpConfiguration resource.
     *
     * @return the stage of resource update.
     */
    HubIpConfiguration.Update update();

    /** The template for HubIpConfiguration update. */
    interface Update
        extends UpdateStages.WithId,
            UpdateStages.WithName,
            UpdateStages.WithPrivateIpAddress,
            UpdateStages.WithPrivateIpAllocationMethod,
            UpdateStages.WithSubnet,
            UpdateStages.WithPublicIpAddress {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        HubIpConfiguration apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        HubIpConfiguration apply(Context context);
    }
    /** The HubIpConfiguration update stages. */
    interface UpdateStages {
        /** The stage of the HubIpConfiguration update allowing to specify id. */
        interface WithId {
            /**
             * Specifies the id property: Fully qualified resource Id for the resource..
             *
             * @param id Fully qualified resource Id for the resource.
             * @return the next definition stage.
             */
            Update withId(String id);
        }
        /** The stage of the HubIpConfiguration update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Name of the Ip Configuration..
             *
             * @param name Name of the Ip Configuration.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the HubIpConfiguration update allowing to specify privateIpAddress. */
        interface WithPrivateIpAddress {
            /**
             * Specifies the privateIpAddress property: The private IP address of the IP configuration..
             *
             * @param privateIpAddress The private IP address of the IP configuration.
             * @return the next definition stage.
             */
            Update withPrivateIpAddress(String privateIpAddress);
        }
        /** The stage of the HubIpConfiguration update allowing to specify privateIpAllocationMethod. */
        interface WithPrivateIpAllocationMethod {
            /**
             * Specifies the privateIpAllocationMethod property: The private IP address allocation method..
             *
             * @param privateIpAllocationMethod The private IP address allocation method.
             * @return the next definition stage.
             */
            Update withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod);
        }
        /** The stage of the HubIpConfiguration update allowing to specify subnet. */
        interface WithSubnet {
            /**
             * Specifies the subnet property: The reference to the subnet resource..
             *
             * @param subnet The reference to the subnet resource.
             * @return the next definition stage.
             */
            Update withSubnet(SubnetInner subnet);
        }
        /** The stage of the HubIpConfiguration update allowing to specify publicIpAddress. */
        interface WithPublicIpAddress {
            /**
             * Specifies the publicIpAddress property: The reference to the public IP resource..
             *
             * @param publicIpAddress The reference to the public IP resource.
             * @return the next definition stage.
             */
            Update withPublicIpAddress(PublicIpAddressInner publicIpAddress);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    HubIpConfiguration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    HubIpConfiguration refresh(Context context);
}
