// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.RecommendationInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** An immutable client-side representation of Recommendation. */
@Immutable
public interface Recommendation {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the creationTime property: Timestamp when this instance was created.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the recommendationId property: A GUID value that each recommendation object is associated with.
     *
     * @return the recommendationId value.
     */
    UUID recommendationId();

    /**
     * Gets the resourceId property: Full ARM resource ID string that this recommendation object is associated with.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the resourceScope property: Name of a resource type this recommendation applies, e.g. Subscription,
     * ServerFarm, Site.
     *
     * @return the resourceScope value.
     */
    ResourceScopeType resourceScope();

    /**
     * Gets the ruleName property: Unique name of the rule.
     *
     * @return the ruleName value.
     */
    String ruleName();

    /**
     * Gets the displayName property: UI friendly name of the rule (may not be unique).
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the message property: Recommendation text.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the level property: Level indicating how critical this recommendation can impact.
     *
     * @return the level value.
     */
    NotificationLevel level();

    /**
     * Gets the channels property: List of channels that this recommendation can apply.
     *
     * @return the channels value.
     */
    Channels channels();

    /**
     * Gets the categoryTags property: The list of category tags that this recommendation belongs to.
     *
     * @return the categoryTags value.
     */
    List<String> categoryTags();

    /**
     * Gets the actionName property: Name of action recommended by this object.
     *
     * @return the actionName value.
     */
    String actionName();

    /**
     * Gets the enabled property: True if this recommendation is still valid (i.e. "actionable"). False if it is
     * invalid.
     *
     * @return the enabled value.
     */
    Integer enabled();

    /**
     * Gets the states property: The list of states of this recommendation. If it's null then it should be considered
     * "Active".
     *
     * @return the states value.
     */
    List<String> states();

    /**
     * Gets the startTime property: The beginning time in UTC of a range that the recommendation refers to.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time in UTC of a range that the recommendation refers to.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the nextNotificationTime property: When to notify this recommendation next in UTC. Null means that this will
     * never be notified anymore.
     *
     * @return the nextNotificationTime value.
     */
    OffsetDateTime nextNotificationTime();

    /**
     * Gets the notificationExpirationTime property: Date and time in UTC when this notification expires.
     *
     * @return the notificationExpirationTime value.
     */
    OffsetDateTime notificationExpirationTime();

    /**
     * Gets the notifiedTime property: Last timestamp in UTC this instance was actually notified. Null means that this
     * recommendation hasn't been notified yet.
     *
     * @return the notifiedTime value.
     */
    OffsetDateTime notifiedTime();

    /**
     * Gets the score property: A metric value measured by the rule.
     *
     * @return the score value.
     */
    Double score();

    /**
     * Gets the isDynamic property: True if this is associated with a dynamically added rule.
     *
     * @return the isDynamic value.
     */
    Boolean isDynamic();

    /**
     * Gets the extensionName property: Extension name of the portal if exists.
     *
     * @return the extensionName value.
     */
    String extensionName();

    /**
     * Gets the bladeName property: Deep link to a blade on the portal.
     *
     * @return the bladeName value.
     */
    String bladeName();

    /**
     * Gets the forwardLink property: Forward link to an external document associated with the rule.
     *
     * @return the forwardLink value.
     */
    String forwardLink();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.RecommendationInner object.
     *
     * @return the inner object.
     */
    RecommendationInner innerModel();
}
