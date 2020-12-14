// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User-defined filters to return data which will be purged from the table. */
@Fluent
public final class WorkspacePurgeBodyFilters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspacePurgeBodyFilters.class);

    /*
     * The column of the table over which the given query should run
     */
    @JsonProperty(value = "column")
    private String column;

    /*
     * A query operator to evaluate over the provided column and value(s).
     * Supported operators are ==, =~, in, in~, >, >=, <, <=, between, and have
     * the same behavior as they would in a KQL query.
     */
    @JsonProperty(value = "operator")
    private String operator;

    /*
     * the value for the operator to function over. This can be a number (e.g.,
     * > 100), a string (timestamp >= '2017-09-01') or array of values.
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * When filtering over custom dimensions, this key will be used as the name
     * of the custom dimension.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the column property: The column of the table over which the given query should run.
     *
     * @return the column value.
     */
    public String column() {
        return this.column;
    }

    /**
     * Set the column property: The column of the table over which the given query should run.
     *
     * @param column the column value to set.
     * @return the WorkspacePurgeBodyFilters object itself.
     */
    public WorkspacePurgeBodyFilters withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * Get the operator property: A query operator to evaluate over the provided column and value(s). Supported
     * operators are ==, =~, in, in~, &gt;, &gt;=, &lt;, &lt;=, between, and have the same behavior as they would in a
     * KQL query.
     *
     * @return the operator value.
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator property: A query operator to evaluate over the provided column and value(s). Supported
     * operators are ==, =~, in, in~, &gt;, &gt;=, &lt;, &lt;=, between, and have the same behavior as they would in a
     * KQL query.
     *
     * @param operator the operator value to set.
     * @return the WorkspacePurgeBodyFilters object itself.
     */
    public WorkspacePurgeBodyFilters withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the value property: the value for the operator to function over. This can be a number (e.g., &gt; 100), a
     * string (timestamp &gt;= '2017-09-01') or array of values.
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: the value for the operator to function over. This can be a number (e.g., &gt; 100), a
     * string (timestamp &gt;= '2017-09-01') or array of values.
     *
     * @param value the value value to set.
     * @return the WorkspacePurgeBodyFilters object itself.
     */
    public WorkspacePurgeBodyFilters withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the key property: When filtering over custom dimensions, this key will be used as the name of the custom
     * dimension.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: When filtering over custom dimensions, this key will be used as the name of the custom
     * dimension.
     *
     * @param key the key value to set.
     * @return the WorkspacePurgeBodyFilters object itself.
     */
    public WorkspacePurgeBodyFilters withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
