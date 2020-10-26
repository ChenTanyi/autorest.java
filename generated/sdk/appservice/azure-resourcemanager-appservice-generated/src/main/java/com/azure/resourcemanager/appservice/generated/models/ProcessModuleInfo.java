// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.ProcessModuleInfoInner;

/** An immutable client-side representation of ProcessModuleInfo. */
@Immutable
public interface ProcessModuleInfo {
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
     * Gets the baseAddress property: Base address. Used as module identifier in ARM resource URI.
     *
     * @return the baseAddress value.
     */
    String baseAddress();

    /**
     * Gets the fileName property: File name.
     *
     * @return the fileName value.
     */
    String fileName();

    /**
     * Gets the href property: HRef URI.
     *
     * @return the href value.
     */
    String href();

    /**
     * Gets the filePath property: File path.
     *
     * @return the filePath value.
     */
    String filePath();

    /**
     * Gets the moduleMemorySize property: Module memory size.
     *
     * @return the moduleMemorySize value.
     */
    Integer moduleMemorySize();

    /**
     * Gets the fileVersion property: File version.
     *
     * @return the fileVersion value.
     */
    String fileVersion();

    /**
     * Gets the fileDescription property: File description.
     *
     * @return the fileDescription value.
     */
    String fileDescription();

    /**
     * Gets the product property: Product name.
     *
     * @return the product value.
     */
    String product();

    /**
     * Gets the productVersion property: Product version.
     *
     * @return the productVersion value.
     */
    String productVersion();

    /**
     * Gets the isDebug property: Is debug?.
     *
     * @return the isDebug value.
     */
    Boolean isDebug();

    /**
     * Gets the language property: Module language (locale).
     *
     * @return the language value.
     */
    String language();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ProcessModuleInfoInner object.
     *
     * @return the inner object.
     */
    ProcessModuleInfoInner innerModel();
}