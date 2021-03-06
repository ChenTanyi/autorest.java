// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** May be used to filter budgets by resource group, resource, or meter. */
@Fluent
public final class BudgetFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BudgetFilter.class);

    /*
     * The logical "AND" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "and")
    private List<BudgetFilterProperties> and;

    /*
     * The logical "NOT" expression.
     */
    @JsonProperty(value = "not")
    private BudgetFilterProperties not;

    /*
     * Has comparison expression for a dimension
     */
    @JsonProperty(value = "dimensions")
    private BudgetComparisonExpression dimensions;

    /*
     * Has comparison expression for a tag
     */
    @JsonProperty(value = "tags")
    private BudgetComparisonExpression tags;

    /**
     * Get the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @return the and value.
     */
    public List<BudgetFilterProperties> and() {
        return this.and;
    }

    /**
     * Set the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @param and the and value to set.
     * @return the BudgetFilter object itself.
     */
    public BudgetFilter withAnd(List<BudgetFilterProperties> and) {
        this.and = and;
        return this;
    }

    /**
     * Get the not property: The logical "NOT" expression.
     *
     * @return the not value.
     */
    public BudgetFilterProperties not() {
        return this.not;
    }

    /**
     * Set the not property: The logical "NOT" expression.
     *
     * @param not the not value to set.
     * @return the BudgetFilter object itself.
     */
    public BudgetFilter withNot(BudgetFilterProperties not) {
        this.not = not;
        return this;
    }

    /**
     * Get the dimensions property: Has comparison expression for a dimension.
     *
     * @return the dimensions value.
     */
    public BudgetComparisonExpression dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Has comparison expression for a dimension.
     *
     * @param dimensions the dimensions value to set.
     * @return the BudgetFilter object itself.
     */
    public BudgetFilter withDimensions(BudgetComparisonExpression dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the tags property: Has comparison expression for a tag.
     *
     * @return the tags value.
     */
    public BudgetComparisonExpression tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Has comparison expression for a tag.
     *
     * @param tags the tags value to set.
     * @return the BudgetFilter object itself.
     */
    public BudgetFilter withTags(BudgetComparisonExpression tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (and() != null) {
            and().forEach(e -> e.validate());
        }
        if (not() != null) {
            not().validate();
        }
        if (dimensions() != null) {
            dimensions().validate();
        }
        if (tags() != null) {
            tags().validate();
        }
    }
}
