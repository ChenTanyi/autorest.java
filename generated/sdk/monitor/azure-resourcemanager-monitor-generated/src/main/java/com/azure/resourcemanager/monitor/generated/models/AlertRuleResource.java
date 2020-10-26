// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.AlertRuleResourceInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AlertRuleResource. */
@Immutable
public interface AlertRuleResource {
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
     * Gets the namePropertiesName property: the name of the alert rule.
     *
     * @return the namePropertiesName value.
     */
    String namePropertiesName();

    /**
     * Gets the description property: the description of the alert rule that will be included in the alert email.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the isEnabled property: the flag that indicates whether the alert rule is enabled.
     *
     * @return the isEnabled value.
     */
    boolean isEnabled();

    /**
     * Gets the condition property: the condition that results in the alert rule being activated.
     *
     * @return the condition value.
     */
    RuleCondition condition();

    /**
     * Gets the actions property: the array of actions that are performed when the alert rule becomes active, and when
     * an alert condition is resolved.
     *
     * @return the actions value.
     */
    List<RuleAction> actions();

    /**
     * Gets the lastUpdatedTime property: Last time the rule was updated in ISO8601 format.
     *
     * @return the lastUpdatedTime value.
     */
    OffsetDateTime lastUpdatedTime();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.AlertRuleResourceInner object.
     *
     * @return the inner object.
     */
    AlertRuleResourceInner innerModel();

    /** The entirety of the AlertRuleResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithNamePropertiesName,
            DefinitionStages.WithIsEnabled,
            DefinitionStages.WithCondition,
            DefinitionStages.WithCreate {
    }
    /** The AlertRuleResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the AlertRuleResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AlertRuleResource definition allowing to specify location. */
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
        /** The stage of the AlertRuleResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithNamePropertiesName withExistingResourcegroup(String resourceGroupName);
        }
        /** The stage of the AlertRuleResource definition allowing to specify namePropertiesName. */
        interface WithNamePropertiesName {
            /**
             * Specifies the namePropertiesName property: the name of the alert rule..
             *
             * @param namePropertiesName the name of the alert rule.
             * @return the next definition stage.
             */
            WithIsEnabled withNamePropertiesName(String namePropertiesName);
        }
        /** The stage of the AlertRuleResource definition allowing to specify isEnabled. */
        interface WithIsEnabled {
            /**
             * Specifies the isEnabled property: the flag that indicates whether the alert rule is enabled..
             *
             * @param isEnabled the flag that indicates whether the alert rule is enabled.
             * @return the next definition stage.
             */
            WithCondition withIsEnabled(boolean isEnabled);
        }
        /** The stage of the AlertRuleResource definition allowing to specify condition. */
        interface WithCondition {
            /**
             * Specifies the condition property: the condition that results in the alert rule being activated..
             *
             * @param condition the condition that results in the alert rule being activated.
             * @return the next definition stage.
             */
            WithCreate withCondition(RuleCondition condition);
        }
        /**
         * The stage of the AlertRuleResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithDescription, DefinitionStages.WithActions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AlertRuleResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AlertRuleResource create(Context context);
        }
        /** The stage of the AlertRuleResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AlertRuleResource definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: the description of the alert rule that will be included in the alert
             * email..
             *
             * @param description the description of the alert rule that will be included in the alert email.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the AlertRuleResource definition allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: the array of actions that are performed when the alert rule becomes
             * active, and when an alert condition is resolved..
             *
             * @param actions the array of actions that are performed when the alert rule becomes active, and when an
             *     alert condition is resolved.
             * @return the next definition stage.
             */
            WithCreate withActions(List<RuleAction> actions);
        }
    }
    /**
     * Begins update for the AlertRuleResource resource.
     *
     * @return the stage of resource update.
     */
    AlertRuleResource.Update update();

    /** The template for AlertRuleResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithName,
            UpdateStages.WithDescription,
            UpdateStages.WithIsEnabled,
            UpdateStages.WithCondition,
            UpdateStages.WithActions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AlertRuleResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AlertRuleResource apply(Context context);
    }
    /** The AlertRuleResource update stages. */
    interface UpdateStages {
        /** The stage of the AlertRuleResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AlertRuleResource update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: the name of the alert rule..
             *
             * @param name the name of the alert rule.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the AlertRuleResource update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: the description of the alert rule that will be included in the alert
             * email..
             *
             * @param description the description of the alert rule that will be included in the alert email.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the AlertRuleResource update allowing to specify isEnabled. */
        interface WithIsEnabled {
            /**
             * Specifies the isEnabled property: the flag that indicates whether the alert rule is enabled..
             *
             * @param isEnabled the flag that indicates whether the alert rule is enabled.
             * @return the next definition stage.
             */
            Update withIsEnabled(Boolean isEnabled);
        }
        /** The stage of the AlertRuleResource update allowing to specify condition. */
        interface WithCondition {
            /**
             * Specifies the condition property: the condition that results in the alert rule being activated..
             *
             * @param condition the condition that results in the alert rule being activated.
             * @return the next definition stage.
             */
            Update withCondition(RuleCondition condition);
        }
        /** The stage of the AlertRuleResource update allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: the array of actions that are performed when the alert rule becomes
             * active, and when an alert condition is resolved..
             *
             * @param actions the array of actions that are performed when the alert rule becomes active, and when an
             *     alert condition is resolved.
             * @return the next definition stage.
             */
            Update withActions(List<RuleAction> actions);
        }
    }
}
