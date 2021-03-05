// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The parameters for a specific changes request. */
@Fluent
public final class ResourceChangesRequestParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceChangesRequestParameters.class);

    /*
     * Specifies the list of resources for a changes request.
     */
    @JsonProperty(value = "resourceIds")
    private List<String> resourceIds;

    /*
     * The subscription id of resources to query the changes from.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * Specifies the date and time interval for a changes request.
     */
    @JsonProperty(value = "interval", required = true)
    private ResourceChangesRequestParametersInterval interval;

    /*
     * Acts as the continuation token for paged responses.
     */
    @JsonProperty(value = "$skipToken")
    private String skipToken;

    /*
     * The maximum number of changes the client can accept in a paged response.
     */
    @JsonProperty(value = "$top")
    private Integer top;

    /*
     * The table name to query resources from.
     */
    @JsonProperty(value = "table")
    private String table;

    /*
     * The flag if set to true will fetch property changes
     */
    @JsonProperty(value = "fetchPropertyChanges")
    private Boolean fetchPropertyChanges;

    /*
     * The flag if set to true will fetch change snapshots
     */
    @JsonProperty(value = "fetchSnapshots")
    private Boolean fetchSnapshots;

    /**
     * Get the resourceIds property: Specifies the list of resources for a changes request.
     *
     * @return the resourceIds value.
     */
    public List<String> resourceIds() {
        return this.resourceIds;
    }

    /**
     * Set the resourceIds property: Specifies the list of resources for a changes request.
     *
     * @param resourceIds the resourceIds value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription id of resources to query the changes from.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription id of resources to query the changes from.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the interval property: Specifies the date and time interval for a changes request.
     *
     * @return the interval value.
     */
    public ResourceChangesRequestParametersInterval interval() {
        return this.interval;
    }

    /**
     * Set the interval property: Specifies the date and time interval for a changes request.
     *
     * @param interval the interval value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withInterval(ResourceChangesRequestParametersInterval interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the skipToken property: Acts as the continuation token for paged responses.
     *
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: Acts as the continuation token for paged responses.
     *
     * @param skipToken the skipToken value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
    }

    /**
     * Get the top property: The maximum number of changes the client can accept in a paged response.
     *
     * @return the top value.
     */
    public Integer top() {
        return this.top;
    }

    /**
     * Set the top property: The maximum number of changes the client can accept in a paged response.
     *
     * @param top the top value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get the table property: The table name to query resources from.
     *
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: The table name to query resources from.
     *
     * @param table the table value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the fetchPropertyChanges property: The flag if set to true will fetch property changes.
     *
     * @return the fetchPropertyChanges value.
     */
    public Boolean fetchPropertyChanges() {
        return this.fetchPropertyChanges;
    }

    /**
     * Set the fetchPropertyChanges property: The flag if set to true will fetch property changes.
     *
     * @param fetchPropertyChanges the fetchPropertyChanges value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withFetchPropertyChanges(Boolean fetchPropertyChanges) {
        this.fetchPropertyChanges = fetchPropertyChanges;
        return this;
    }

    /**
     * Get the fetchSnapshots property: The flag if set to true will fetch change snapshots.
     *
     * @return the fetchSnapshots value.
     */
    public Boolean fetchSnapshots() {
        return this.fetchSnapshots;
    }

    /**
     * Set the fetchSnapshots property: The flag if set to true will fetch change snapshots.
     *
     * @param fetchSnapshots the fetchSnapshots value to set.
     * @return the ResourceChangesRequestParameters object itself.
     */
    public ResourceChangesRequestParameters withFetchSnapshots(Boolean fetchSnapshots) {
        this.fetchSnapshots = fetchSnapshots;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (interval() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property interval in model ResourceChangesRequestParameters"));
        } else {
            interval().validate();
        }
    }
}
