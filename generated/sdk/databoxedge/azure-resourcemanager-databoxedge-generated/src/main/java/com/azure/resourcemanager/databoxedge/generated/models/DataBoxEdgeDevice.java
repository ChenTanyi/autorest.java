// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDeviceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DataBoxEdgeDevice. */
public interface DataBoxEdgeDevice {
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
     * Gets the location property: The location of the device. This is a supported and registered Azure geographical
     * region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed
     * once it is created, but if an identical geographical region is specified on update, the request will succeed.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: The list of tags that describe the device. These tags can be used to view and group this
     * device (across resource groups).
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The SKU type.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the etag property: The etag for the devices.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the dataBoxEdgeDeviceStatus property: The status of the Data Box Edge/Gateway device.
     *
     * @return the dataBoxEdgeDeviceStatus value.
     */
    DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus();

    /**
     * Gets the serialNumber property: The Serial Number of Data Box Edge/Gateway device.
     *
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * Gets the description property: The Description of the Data Box Edge/Gateway device.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the modelDescription property: The description of the Data Box Edge/Gateway device model.
     *
     * @return the modelDescription value.
     */
    String modelDescription();

    /**
     * Gets the deviceType property: The type of the Data Box Edge/Gateway device.
     *
     * @return the deviceType value.
     */
    DeviceType deviceType();

    /**
     * Gets the friendlyName property: The Data Box Edge/Gateway device name.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the culture property: The Data Box Edge/Gateway device culture.
     *
     * @return the culture value.
     */
    String culture();

    /**
     * Gets the deviceModel property: The Data Box Edge/Gateway device model.
     *
     * @return the deviceModel value.
     */
    String deviceModel();

    /**
     * Gets the deviceSoftwareVersion property: The Data Box Edge/Gateway device software version.
     *
     * @return the deviceSoftwareVersion value.
     */
    String deviceSoftwareVersion();

    /**
     * Gets the deviceLocalCapacity property: The Data Box Edge/Gateway device local capacity in MB.
     *
     * @return the deviceLocalCapacity value.
     */
    Long deviceLocalCapacity();

    /**
     * Gets the timeZone property: The Data Box Edge/Gateway device timezone.
     *
     * @return the timeZone value.
     */
    String timeZone();

    /**
     * Gets the deviceHcsVersion property: The device software version number of the device (eg: 1.2.18105.6).
     *
     * @return the deviceHcsVersion value.
     */
    String deviceHcsVersion();

    /**
     * Gets the configuredRoleTypes property: Type of compute roles configured.
     *
     * @return the configuredRoleTypes value.
     */
    List<RoleTypes> configuredRoleTypes();

    /**
     * Gets the nodeCount property: The number of nodes in the cluster.
     *
     * @return the nodeCount value.
     */
    Integer nodeCount();

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
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDeviceInner object.
     *
     * @return the inner object.
     */
    DataBoxEdgeDeviceInner innerModel();

    /** The entirety of the DataBoxEdgeDevice definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DataBoxEdgeDevice definition stages. */
    interface DefinitionStages {
        /** The first stage of the DataBoxEdgeDevice definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The location of the device. This is a supported and registered Azure geographical region
             *     (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be
             *     changed once it is created, but if an identical geographical region is specified on update, the
             *     request will succeed.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The location of the device. This is a supported and registered Azure geographical region
             *     (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be
             *     changed once it is created, but if an identical geographical region is specified on update, the
             *     request will succeed.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the DataBoxEdgeDevice definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithEtag,
                DefinitionStages.WithDataBoxEdgeDeviceStatus,
                DefinitionStages.WithDescription,
                DefinitionStages.WithModelDescription,
                DefinitionStages.WithFriendlyName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DataBoxEdgeDevice create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataBoxEdgeDevice create(Context context);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The list of tags that describe the device. These tags can be used to view
             * and group this device (across resource groups)..
             *
             * @param tags The list of tags that describe the device. These tags can be used to view and group this
             *     device (across resource groups).
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU type..
             *
             * @param sku The SKU type.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The etag for the devices..
             *
             * @param etag The etag for the devices.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify dataBoxEdgeDeviceStatus. */
        interface WithDataBoxEdgeDeviceStatus {
            /**
             * Specifies the dataBoxEdgeDeviceStatus property: The status of the Data Box Edge/Gateway device..
             *
             * @param dataBoxEdgeDeviceStatus The status of the Data Box Edge/Gateway device.
             * @return the next definition stage.
             */
            WithCreate withDataBoxEdgeDeviceStatus(DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The Description of the Data Box Edge/Gateway device..
             *
             * @param description The Description of the Data Box Edge/Gateway device.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify modelDescription. */
        interface WithModelDescription {
            /**
             * Specifies the modelDescription property: The description of the Data Box Edge/Gateway device model..
             *
             * @param modelDescription The description of the Data Box Edge/Gateway device model.
             * @return the next definition stage.
             */
            WithCreate withModelDescription(String modelDescription);
        }
        /** The stage of the DataBoxEdgeDevice definition allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: The Data Box Edge/Gateway device name..
             *
             * @param friendlyName The Data Box Edge/Gateway device name.
             * @return the next definition stage.
             */
            WithCreate withFriendlyName(String friendlyName);
        }
    }
    /**
     * Begins update for the DataBoxEdgeDevice resource.
     *
     * @return the stage of resource update.
     */
    DataBoxEdgeDevice.Update update();

    /** The template for DataBoxEdgeDevice update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DataBoxEdgeDevice apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataBoxEdgeDevice apply(Context context);
    }
    /** The DataBoxEdgeDevice update stages. */
    interface UpdateStages {
        /** The stage of the DataBoxEdgeDevice update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags attached to the Data Box Edge/Gateway resource..
             *
             * @param tags The tags attached to the Data Box Edge/Gateway resource.
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
    DataBoxEdgeDevice refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataBoxEdgeDevice refresh(Context context);
}
