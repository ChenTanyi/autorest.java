// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CacheItem model. */
@Fluent
public final class CacheItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheItem.class);

    /*
     * Resource ID used by Resource Manager to uniquely identify the scope.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Display name for the scope.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Indicates the account type. Allowed values include: EA, PAYG, Modern,
     * Internal, Unknown.
     */
    @JsonProperty(value = "channel", required = true)
    private String channel;

    /*
     * Indicates the type of modern account. Allowed values include:
     * Individual, Enterprise, Partner, Indirect, NotApplicable
     */
    @JsonProperty(value = "subchannel", required = true)
    private String subchannel;

    /*
     * Resource ID of the parent scope. For instance, subscription's resource
     * ID for a resource group or a management group resource ID for a
     * subscription.
     */
    @JsonProperty(value = "parent")
    private String parent;

    /*
     * Indicates the status of the scope. Status only applies to subscriptions
     * and billing accounts.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the id property: Resource ID used by Resource Manager to uniquely identify the scope.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID used by Resource Manager to uniquely identify the scope.
     *
     * @param id the id value to set.
     * @return the CacheItem object itself.
     */
    public CacheItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Display name for the scope.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Display name for the scope.
     *
     * @param name the name value to set.
     * @return the CacheItem object itself.
     */
    public CacheItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the channel property: Indicates the account type. Allowed values include: EA, PAYG, Modern, Internal,
     * Unknown.
     *
     * @return the channel value.
     */
    public String channel() {
        return this.channel;
    }

    /**
     * Set the channel property: Indicates the account type. Allowed values include: EA, PAYG, Modern, Internal,
     * Unknown.
     *
     * @param channel the channel value to set.
     * @return the CacheItem object itself.
     */
    public CacheItem withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Get the subchannel property: Indicates the type of modern account. Allowed values include: Individual,
     * Enterprise, Partner, Indirect, NotApplicable.
     *
     * @return the subchannel value.
     */
    public String subchannel() {
        return this.subchannel;
    }

    /**
     * Set the subchannel property: Indicates the type of modern account. Allowed values include: Individual,
     * Enterprise, Partner, Indirect, NotApplicable.
     *
     * @param subchannel the subchannel value to set.
     * @return the CacheItem object itself.
     */
    public CacheItem withSubchannel(String subchannel) {
        this.subchannel = subchannel;
        return this;
    }

    /**
     * Get the parent property: Resource ID of the parent scope. For instance, subscription's resource ID for a resource
     * group or a management group resource ID for a subscription.
     *
     * @return the parent value.
     */
    public String parent() {
        return this.parent;
    }

    /**
     * Set the parent property: Resource ID of the parent scope. For instance, subscription's resource ID for a resource
     * group or a management group resource ID for a subscription.
     *
     * @param parent the parent value to set.
     * @return the CacheItem object itself.
     */
    public CacheItem withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get the status property: Indicates the status of the scope. Status only applies to subscriptions and billing
     * accounts.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates the status of the scope. Status only applies to subscriptions and billing
     * accounts.
     *
     * @param status the status value to set.
     * @return the CacheItem object itself.
     */
    public CacheItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property id in model CacheItem"));
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model CacheItem"));
        }
        if (channel() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property channel in model CacheItem"));
        }
        if (subchannel() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property subchannel in model CacheItem"));
        }
    }
}
