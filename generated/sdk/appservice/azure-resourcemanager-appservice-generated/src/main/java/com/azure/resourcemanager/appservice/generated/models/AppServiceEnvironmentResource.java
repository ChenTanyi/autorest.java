// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceEnvironmentResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AppServiceEnvironmentResource. */
public interface AppServiceEnvironmentResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

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
     * Gets the provisioningState property: Provisioning state of the App Service Environment.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the status property: Current status of the App Service Environment.
     *
     * @return the status value.
     */
    HostingEnvironmentStatus status();

    /**
     * Gets the virtualNetwork property: Description of the Virtual Network.
     *
     * @return the virtualNetwork value.
     */
    VirtualNetworkProfile virtualNetwork();

    /**
     * Gets the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     *
     * @return the internalLoadBalancingMode value.
     */
    LoadBalancingMode internalLoadBalancingMode();

    /**
     * Gets the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     *
     * @return the multiSize value.
     */
    String multiSize();

    /**
     * Gets the multiRoleCount property: Number of front-end instances.
     *
     * @return the multiRoleCount value.
     */
    Integer multiRoleCount();

    /**
     * Gets the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     *
     * @return the ipsslAddressCount value.
     */
    Integer ipsslAddressCount();

    /**
     * Gets the dnsSuffix property: DNS suffix of the App Service Environment.
     *
     * @return the dnsSuffix value.
     */
    String dnsSuffix();

    /**
     * Gets the maximumNumberOfMachines property: Maximum number of VMs in the App Service Environment.
     *
     * @return the maximumNumberOfMachines value.
     */
    Integer maximumNumberOfMachines();

    /**
     * Gets the frontEndScaleFactor property: Scale factor for front-ends.
     *
     * @return the frontEndScaleFactor value.
     */
    Integer frontEndScaleFactor();

    /**
     * Gets the suspended property: &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is
     * no longer available (most likely because NSG blocked the incoming traffic).
     *
     * @return the suspended value.
     */
    Boolean suspended();

    /**
     * Gets the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     *
     * @return the clusterSettings value.
     */
    List<NameValuePair> clusterSettings();

    /**
     * Gets the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     *
     * @return the userWhitelistedIpRanges value.
     */
    List<String> userWhitelistedIpRanges();

    /**
     * Gets the hasLinuxWorkers property: Flag that displays whether an ASE has linux workers or not.
     *
     * @return the hasLinuxWorkers value.
     */
    Boolean hasLinuxWorkers();

    /**
     * Gets the dedicatedHostCount property: Dedicated Host Count.
     *
     * @return the dedicatedHostCount value.
     */
    Integer dedicatedHostCount();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

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
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceEnvironmentResourceInner
     * object.
     *
     * @return the inner object.
     */
    AppServiceEnvironmentResourceInner innerModel();

    /** The entirety of the AppServiceEnvironmentResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The AppServiceEnvironmentResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the AppServiceEnvironmentResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify location. */
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
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the AppServiceEnvironmentResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithVirtualNetwork,
                DefinitionStages.WithInternalLoadBalancingMode,
                DefinitionStages.WithMultiSize,
                DefinitionStages.WithIpsslAddressCount,
                DefinitionStages.WithDnsSuffix,
                DefinitionStages.WithFrontEndScaleFactor,
                DefinitionStages.WithClusterSettings,
                DefinitionStages.WithUserWhitelistedIpRanges,
                DefinitionStages.WithKind {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AppServiceEnvironmentResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AppServiceEnvironmentResource create(Context context);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify virtualNetwork. */
        interface WithVirtualNetwork {
            /**
             * Specifies the virtualNetwork property: Description of the Virtual Network..
             *
             * @param virtualNetwork Description of the Virtual Network.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetwork(VirtualNetworkProfile virtualNetwork);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify internalLoadBalancingMode. */
        interface WithInternalLoadBalancingMode {
            /**
             * Specifies the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the
             * Virtual Network for the App Service Environment..
             *
             * @param internalLoadBalancingMode Specifies which endpoints to serve internally in the Virtual Network for
             *     the App Service Environment.
             * @return the next definition stage.
             */
            WithCreate withInternalLoadBalancingMode(LoadBalancingMode internalLoadBalancingMode);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify multiSize. */
        interface WithMultiSize {
            /**
             * Specifies the multiSize property: Front-end VM size, e.g. "Medium", "Large"..
             *
             * @param multiSize Front-end VM size, e.g. "Medium", "Large".
             * @return the next definition stage.
             */
            WithCreate withMultiSize(String multiSize);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify ipsslAddressCount. */
        interface WithIpsslAddressCount {
            /**
             * Specifies the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service
             * Environment..
             *
             * @param ipsslAddressCount Number of IP SSL addresses reserved for the App Service Environment.
             * @return the next definition stage.
             */
            WithCreate withIpsslAddressCount(Integer ipsslAddressCount);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify dnsSuffix. */
        interface WithDnsSuffix {
            /**
             * Specifies the dnsSuffix property: DNS suffix of the App Service Environment..
             *
             * @param dnsSuffix DNS suffix of the App Service Environment.
             * @return the next definition stage.
             */
            WithCreate withDnsSuffix(String dnsSuffix);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify frontEndScaleFactor. */
        interface WithFrontEndScaleFactor {
            /**
             * Specifies the frontEndScaleFactor property: Scale factor for front-ends..
             *
             * @param frontEndScaleFactor Scale factor for front-ends.
             * @return the next definition stage.
             */
            WithCreate withFrontEndScaleFactor(Integer frontEndScaleFactor);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify clusterSettings. */
        interface WithClusterSettings {
            /**
             * Specifies the clusterSettings property: Custom settings for changing the behavior of the App Service
             * Environment..
             *
             * @param clusterSettings Custom settings for changing the behavior of the App Service Environment.
             * @return the next definition stage.
             */
            WithCreate withClusterSettings(List<NameValuePair> clusterSettings);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify userWhitelistedIpRanges. */
        interface WithUserWhitelistedIpRanges {
            /**
             * Specifies the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
             *
             * @param userWhitelistedIpRanges User added ip ranges to whitelist on ASE db.
             * @return the next definition stage.
             */
            WithCreate withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges);
        }
        /** The stage of the AppServiceEnvironmentResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
    }
    /**
     * Begins update for the AppServiceEnvironmentResource resource.
     *
     * @return the stage of resource update.
     */
    AppServiceEnvironmentResource.Update update();

    /** The template for AppServiceEnvironmentResource update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithVirtualNetwork,
            UpdateStages.WithInternalLoadBalancingMode,
            UpdateStages.WithMultiSize,
            UpdateStages.WithIpsslAddressCount,
            UpdateStages.WithDnsSuffix,
            UpdateStages.WithFrontEndScaleFactor,
            UpdateStages.WithClusterSettings,
            UpdateStages.WithUserWhitelistedIpRanges {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AppServiceEnvironmentResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AppServiceEnvironmentResource apply(Context context);
    }
    /** The AppServiceEnvironmentResource update stages. */
    interface UpdateStages {
        /** The stage of the AppServiceEnvironmentResource update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify virtualNetwork. */
        interface WithVirtualNetwork {
            /**
             * Specifies the virtualNetwork property: Description of the Virtual Network..
             *
             * @param virtualNetwork Description of the Virtual Network.
             * @return the next definition stage.
             */
            Update withVirtualNetwork(VirtualNetworkProfile virtualNetwork);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify internalLoadBalancingMode. */
        interface WithInternalLoadBalancingMode {
            /**
             * Specifies the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the
             * Virtual Network for the App Service Environment..
             *
             * @param internalLoadBalancingMode Specifies which endpoints to serve internally in the Virtual Network for
             *     the App Service Environment.
             * @return the next definition stage.
             */
            Update withInternalLoadBalancingMode(LoadBalancingMode internalLoadBalancingMode);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify multiSize. */
        interface WithMultiSize {
            /**
             * Specifies the multiSize property: Front-end VM size, e.g. "Medium", "Large"..
             *
             * @param multiSize Front-end VM size, e.g. "Medium", "Large".
             * @return the next definition stage.
             */
            Update withMultiSize(String multiSize);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify ipsslAddressCount. */
        interface WithIpsslAddressCount {
            /**
             * Specifies the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service
             * Environment..
             *
             * @param ipsslAddressCount Number of IP SSL addresses reserved for the App Service Environment.
             * @return the next definition stage.
             */
            Update withIpsslAddressCount(Integer ipsslAddressCount);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify dnsSuffix. */
        interface WithDnsSuffix {
            /**
             * Specifies the dnsSuffix property: DNS suffix of the App Service Environment..
             *
             * @param dnsSuffix DNS suffix of the App Service Environment.
             * @return the next definition stage.
             */
            Update withDnsSuffix(String dnsSuffix);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify frontEndScaleFactor. */
        interface WithFrontEndScaleFactor {
            /**
             * Specifies the frontEndScaleFactor property: Scale factor for front-ends..
             *
             * @param frontEndScaleFactor Scale factor for front-ends.
             * @return the next definition stage.
             */
            Update withFrontEndScaleFactor(Integer frontEndScaleFactor);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify clusterSettings. */
        interface WithClusterSettings {
            /**
             * Specifies the clusterSettings property: Custom settings for changing the behavior of the App Service
             * Environment..
             *
             * @param clusterSettings Custom settings for changing the behavior of the App Service Environment.
             * @return the next definition stage.
             */
            Update withClusterSettings(List<NameValuePair> clusterSettings);
        }
        /** The stage of the AppServiceEnvironmentResource update allowing to specify userWhitelistedIpRanges. */
        interface WithUserWhitelistedIpRanges {
            /**
             * Specifies the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
             *
             * @param userWhitelistedIpRanges User added ip ranges to whitelist on ASE db.
             * @return the next definition stage.
             */
            Update withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AppServiceEnvironmentResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AppServiceEnvironmentResource refresh(Context context);

    /**
     * Description for Move an App Service Environment to a different VNET.
     *
     * @param vnetInfo Details for the new virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of App Service apps.
     */
    PagedIterable<Site> changeVnet(VirtualNetworkProfile vnetInfo);

    /**
     * Description for Move an App Service Environment to a different VNET.
     *
     * @param vnetInfo Details for the new virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of App Service apps.
     */
    PagedIterable<Site> changeVnet(VirtualNetworkProfile vnetInfo, Context context);

    /**
     * Description for Reboot all machines in an App Service Environment.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reboot();

    /**
     * Description for Reboot all machines in an App Service Environment.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> rebootWithResponse(Context context);

    /**
     * Description for Resume an App Service Environment.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of App Service apps.
     */
    PagedIterable<Site> resume();

    /**
     * Description for Resume an App Service Environment.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of App Service apps.
     */
    PagedIterable<Site> resume(Context context);

    /**
     * Description for Suspend an App Service Environment.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of App Service apps.
     */
    PagedIterable<Site> suspend();

    /**
     * Description for Suspend an App Service Environment.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of App Service apps.
     */
    PagedIterable<Site> suspend(Context context);
}
