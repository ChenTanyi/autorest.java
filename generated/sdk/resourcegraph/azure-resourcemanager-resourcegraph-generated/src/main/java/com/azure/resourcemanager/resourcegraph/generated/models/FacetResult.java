// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Successfully executed facet containing additional statistics on the response of a query. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("FacetResult")
@Fluent
public final class FacetResult extends Facet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FacetResult.class);

    /*
     * Number of total records in the facet results.
     */
    @JsonProperty(value = "totalRecords", required = true)
    private long totalRecords;

    /*
     * Number of records returned in the facet response.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * A table containing the desired facets. Only present if the facet is
     * valid.
     */
    @JsonProperty(value = "data", required = true)
    private Object data;

    /**
     * Get the totalRecords property: Number of total records in the facet results.
     *
     * @return the totalRecords value.
     */
    public long totalRecords() {
        return this.totalRecords;
    }

    /**
     * Set the totalRecords property: Number of total records in the facet results.
     *
     * @param totalRecords the totalRecords value to set.
     * @return the FacetResult object itself.
     */
    public FacetResult withTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * Get the count property: Number of records returned in the facet response.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Number of records returned in the facet response.
     *
     * @param count the count value to set.
     * @return the FacetResult object itself.
     */
    public FacetResult withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the data property: A table containing the desired facets. Only present if the facet is valid.
     *
     * @return the data value.
     */
    public Object data() {
        return this.data;
    }

    /**
     * Set the data property: A table containing the desired facets. Only present if the facet is valid.
     *
     * @param data the data value to set.
     * @return the FacetResult object itself.
     */
    public FacetResult withData(Object data) {
        this.data = data;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FacetResult withExpression(String expression) {
        super.withExpression(expression);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (data() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property data in model FacetResult"));
        }
    }
}
