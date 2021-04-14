// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dns.generated.fluent.models.ZoneInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Zone. */
public interface Zone {
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
     * Gets the etag property: The etag of the zone.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the maxNumberOfRecordSets property: The maximum number of record sets that can be created in this DNS zone.
     * This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordSets value.
     */
    Long maxNumberOfRecordSets();

    /**
     * Gets the maxNumberOfRecordsPerRecordSet property: The maximum number of records per record set that can be
     * created in this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordsPerRecordSet value.
     */
    Long maxNumberOfRecordsPerRecordSet();

    /**
     * Gets the numberOfRecordSets property: The current number of record sets in this DNS zone. This is a read-only
     * property and any attempt to set this value will be ignored.
     *
     * @return the numberOfRecordSets value.
     */
    Long numberOfRecordSets();

    /**
     * Gets the nameServers property: The name servers for this DNS zone. This is a read-only property and any attempt
     * to set this value will be ignored.
     *
     * @return the nameServers value.
     */
    List<String> nameServers();

    /**
     * Gets the zoneType property: The type of this DNS zone (Public or Private).
     *
     * @return the zoneType value.
     */
    ZoneType zoneType();

    /**
     * Gets the registrationVirtualNetworks property: A list of references to virtual networks that register hostnames
     * in this DNS zone. This is a only when ZoneType is Private.
     *
     * @return the registrationVirtualNetworks value.
     */
    List<SubResource> registrationVirtualNetworks();

    /**
     * Gets the resolutionVirtualNetworks property: A list of references to virtual networks that resolve records in
     * this DNS zone. This is a only when ZoneType is Private.
     *
     * @return the resolutionVirtualNetworks value.
     */
    List<SubResource> resolutionVirtualNetworks();

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
     * Gets the inner com.azure.resourcemanager.dns.generated.fluent.models.ZoneInner object.
     *
     * @return the inner object.
     */
    ZoneInner innerModel();

    /** The entirety of the Zone definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Zone definition stages. */
    interface DefinitionStages {
        /** The first stage of the Zone definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Zone definition allowing to specify location. */
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
        /** The stage of the Zone definition allowing to specify parent resource. */
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
         * The stage of the Zone definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithZoneType,
                DefinitionStages.WithRegistrationVirtualNetworks,
                DefinitionStages.WithResolutionVirtualNetworks,
                DefinitionStages.WithIfMatch,
                DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Zone create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Zone create(Context context);
        }
        /** The stage of the Zone definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Zone definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The etag of the zone..
             *
             * @param etag The etag of the zone.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the Zone definition allowing to specify zoneType. */
        interface WithZoneType {
            /**
             * Specifies the zoneType property: The type of this DNS zone (Public or Private)..
             *
             * @param zoneType The type of this DNS zone (Public or Private).
             * @return the next definition stage.
             */
            WithCreate withZoneType(ZoneType zoneType);
        }
        /** The stage of the Zone definition allowing to specify registrationVirtualNetworks. */
        interface WithRegistrationVirtualNetworks {
            /**
             * Specifies the registrationVirtualNetworks property: A list of references to virtual networks that
             * register hostnames in this DNS zone. This is a only when ZoneType is Private..
             *
             * @param registrationVirtualNetworks A list of references to virtual networks that register hostnames in
             *     this DNS zone. This is a only when ZoneType is Private.
             * @return the next definition stage.
             */
            WithCreate withRegistrationVirtualNetworks(List<SubResource> registrationVirtualNetworks);
        }
        /** The stage of the Zone definition allowing to specify resolutionVirtualNetworks. */
        interface WithResolutionVirtualNetworks {
            /**
             * Specifies the resolutionVirtualNetworks property: A list of references to virtual networks that resolve
             * records in this DNS zone. This is a only when ZoneType is Private..
             *
             * @param resolutionVirtualNetworks A list of references to virtual networks that resolve records in this
             *     DNS zone. This is a only when ZoneType is Private.
             * @return the next definition stage.
             */
            WithCreate withResolutionVirtualNetworks(List<SubResource> resolutionVirtualNetworks);
        }
        /** The stage of the Zone definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The etag of the DNS zone. Omit this value to always overwrite the current
             * zone. Specify the last-seen etag value to prevent accidentally overwriting any concurrent changes..
             *
             * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify
             *     the last-seen etag value to prevent accidentally overwriting any concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the Zone definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new DNS zone to be created, but to prevent
             * updating an existing zone. Other values will be ignored..
             *
             * @param ifNoneMatch Set to '*' to allow a new DNS zone to be created, but to prevent updating an existing
             *     zone. Other values will be ignored.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the Zone resource.
     *
     * @return the stage of resource update.
     */
    Zone.Update update();

    /** The template for Zone update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithifMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Zone apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Zone apply(Context context);
    }
    /** The Zone update stages. */
    interface UpdateStages {
        /** The stage of the Zone update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Zone update allowing to specify ifMatch. */
        interface WithifMatch {
            /**
             * Specifies the ifMatch property: The etag of the DNS zone. Omit this value to always overwrite the current
             * zone. Specify the last-seen etag value to prevent accidentally overwriting any concurrent changes..
             *
             * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify
             *     the last-seen etag value to prevent accidentally overwriting any concurrent changes.
             * @return the next definition stage.
             */
            Update ifMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Zone refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Zone refresh(Context context);
}
