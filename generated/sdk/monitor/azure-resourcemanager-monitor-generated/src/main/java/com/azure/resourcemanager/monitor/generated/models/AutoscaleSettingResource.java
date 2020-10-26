// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.AutoscaleSettingResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AutoscaleSettingResource. */
@Immutable
public interface AutoscaleSettingResource {
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
     * Gets the profiles property: the collection of automatic scaling profiles that specify different scaling
     * parameters for different time periods. A maximum of 20 profiles can be specified.
     *
     * @return the profiles value.
     */
    List<AutoscaleProfile> profiles();

    /**
     * Gets the notifications property: the collection of notifications.
     *
     * @return the notifications value.
     */
    List<AutoscaleNotification> notifications();

    /**
     * Gets the enabled property: the enabled flag. Specifies whether automatic scaling is enabled for the resource. The
     * default value is 'true'.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the namePropertiesName property: the name of the autoscale setting.
     *
     * @return the namePropertiesName value.
     */
    String namePropertiesName();

    /**
     * Gets the targetResourceUri property: the resource identifier of the resource that the autoscale setting should be
     * added to.
     *
     * @return the targetResourceUri value.
     */
    String targetResourceUri();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.AutoscaleSettingResourceInner object.
     *
     * @return the inner object.
     */
    AutoscaleSettingResourceInner innerModel();

    /** The entirety of the AutoscaleSettingResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithProfiles,
            DefinitionStages.WithCreate {
    }
    /** The AutoscaleSettingResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the AutoscaleSettingResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AutoscaleSettingResource definition allowing to specify location. */
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
        /** The stage of the AutoscaleSettingResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithProfiles withExistingResourcegroup(String resourceGroupName);
        }
        /** The stage of the AutoscaleSettingResource definition allowing to specify profiles. */
        interface WithProfiles {
            /**
             * Specifies the profiles property: the collection of automatic scaling profiles that specify different
             * scaling parameters for different time periods. A maximum of 20 profiles can be specified..
             *
             * @param profiles the collection of automatic scaling profiles that specify different scaling parameters
             *     for different time periods. A maximum of 20 profiles can be specified.
             * @return the next definition stage.
             */
            WithCreate withProfiles(List<AutoscaleProfile> profiles);
        }
        /**
         * The stage of the AutoscaleSettingResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithNotifications,
                DefinitionStages.WithEnabled,
                DefinitionStages.WithNamePropertiesName,
                DefinitionStages.WithTargetResourceUri {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AutoscaleSettingResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AutoscaleSettingResource create(Context context);
        }
        /** The stage of the AutoscaleSettingResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AutoscaleSettingResource definition allowing to specify notifications. */
        interface WithNotifications {
            /**
             * Specifies the notifications property: the collection of notifications..
             *
             * @param notifications the collection of notifications.
             * @return the next definition stage.
             */
            WithCreate withNotifications(List<AutoscaleNotification> notifications);
        }
        /** The stage of the AutoscaleSettingResource definition allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: the enabled flag. Specifies whether automatic scaling is enabled for the
             * resource. The default value is 'true'..
             *
             * @param enabled the enabled flag. Specifies whether automatic scaling is enabled for the resource. The
             *     default value is 'true'.
             * @return the next definition stage.
             */
            WithCreate withEnabled(Boolean enabled);
        }
        /** The stage of the AutoscaleSettingResource definition allowing to specify namePropertiesName. */
        interface WithNamePropertiesName {
            /**
             * Specifies the namePropertiesName property: the name of the autoscale setting..
             *
             * @param namePropertiesName the name of the autoscale setting.
             * @return the next definition stage.
             */
            WithCreate withNamePropertiesName(String namePropertiesName);
        }
        /** The stage of the AutoscaleSettingResource definition allowing to specify targetResourceUri. */
        interface WithTargetResourceUri {
            /**
             * Specifies the targetResourceUri property: the resource identifier of the resource that the autoscale
             * setting should be added to..
             *
             * @param targetResourceUri the resource identifier of the resource that the autoscale setting should be
             *     added to.
             * @return the next definition stage.
             */
            WithCreate withTargetResourceUri(String targetResourceUri);
        }
    }
    /**
     * Begins update for the AutoscaleSettingResource resource.
     *
     * @return the stage of resource update.
     */
    AutoscaleSettingResource.Update update();

    /** The template for AutoscaleSettingResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithProfiles,
            UpdateStages.WithNotifications,
            UpdateStages.WithEnabled,
            UpdateStages.WithName,
            UpdateStages.WithTargetResourceUri {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AutoscaleSettingResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AutoscaleSettingResource apply(Context context);
    }
    /** The AutoscaleSettingResource update stages. */
    interface UpdateStages {
        /** The stage of the AutoscaleSettingResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AutoscaleSettingResource update allowing to specify profiles. */
        interface WithProfiles {
            /**
             * Specifies the profiles property: the collection of automatic scaling profiles that specify different
             * scaling parameters for different time periods. A maximum of 20 profiles can be specified..
             *
             * @param profiles the collection of automatic scaling profiles that specify different scaling parameters
             *     for different time periods. A maximum of 20 profiles can be specified.
             * @return the next definition stage.
             */
            Update withProfiles(List<AutoscaleProfile> profiles);
        }
        /** The stage of the AutoscaleSettingResource update allowing to specify notifications. */
        interface WithNotifications {
            /**
             * Specifies the notifications property: the collection of notifications..
             *
             * @param notifications the collection of notifications.
             * @return the next definition stage.
             */
            Update withNotifications(List<AutoscaleNotification> notifications);
        }
        /** The stage of the AutoscaleSettingResource update allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: the enabled flag. Specifies whether automatic scaling is enabled for the
             * resource. The default value is 'true'..
             *
             * @param enabled the enabled flag. Specifies whether automatic scaling is enabled for the resource. The
             *     default value is 'true'.
             * @return the next definition stage.
             */
            Update withEnabled(Boolean enabled);
        }
        /** The stage of the AutoscaleSettingResource update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: the name of the autoscale setting..
             *
             * @param name the name of the autoscale setting.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the AutoscaleSettingResource update allowing to specify targetResourceUri. */
        interface WithTargetResourceUri {
            /**
             * Specifies the targetResourceUri property: the resource identifier of the resource that the autoscale
             * setting should be added to..
             *
             * @param targetResourceUri the resource identifier of the resource that the autoscale setting should be
             *     added to.
             * @return the next definition stage.
             */
            Update withTargetResourceUri(String targetResourceUri);
        }
    }
}
