// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteCustomDomainOverviewArmResourceInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of StaticSiteCustomDomainOverviewArmResource. */
public interface StaticSiteCustomDomainOverviewArmResource {
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
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the domainName property: The domain name for the static site custom domain.
     *
     * @return the domainName value.
     */
    String domainName();

    /**
     * Gets the createdOn property: The date and time on which the custom domain was created for the static site.
     *
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the inner
     * com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteCustomDomainOverviewArmResourceInner
     * object.
     *
     * @return the inner object.
     */
    StaticSiteCustomDomainOverviewArmResourceInner innerModel();
}
