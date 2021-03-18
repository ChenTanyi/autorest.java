// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a query to be executed. */
@Fluent
public final class QueryRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryRequest.class);

    /*
     * Azure subscriptions against which to execute the query.
     */
    @JsonProperty(value = "subscriptions")
    private List<String> subscriptions;

    /*
     * Azure management groups against which to execute the query. Example: [
     * 'mg1', 'mg2' ]
     */
    @JsonProperty(value = "managementGroups")
    private List<String> managementGroups;

    /*
     * The resources query.
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /*
     * The query evaluation options
     */
    @JsonProperty(value = "options")
    private QueryRequestOptions options;

    /*
     * An array of facet requests to be computed against the query result.
     */
    @JsonProperty(value = "facets")
    private List<FacetRequest> facets;

    /**
     * Get the subscriptions property: Azure subscriptions against which to execute the query.
     *
     * @return the subscriptions value.
     */
    public List<String> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the subscriptions property: Azure subscriptions against which to execute the query.
     *
     * @param subscriptions the subscriptions value to set.
     * @return the QueryRequest object itself.
     */
    public QueryRequest withSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /**
     * Get the managementGroups property: Azure management groups against which to execute the query. Example: [ 'mg1',
     * 'mg2' ].
     *
     * @return the managementGroups value.
     */
    public List<String> managementGroups() {
        return this.managementGroups;
    }

    /**
     * Set the managementGroups property: Azure management groups against which to execute the query. Example: [ 'mg1',
     * 'mg2' ].
     *
     * @param managementGroups the managementGroups value to set.
     * @return the QueryRequest object itself.
     */
    public QueryRequest withManagementGroups(List<String> managementGroups) {
        this.managementGroups = managementGroups;
        return this;
    }

    /**
     * Get the query property: The resources query.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The resources query.
     *
     * @param query the query value to set.
     * @return the QueryRequest object itself.
     */
    public QueryRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the options property: The query evaluation options.
     *
     * @return the options value.
     */
    public QueryRequestOptions options() {
        return this.options;
    }

    /**
     * Set the options property: The query evaluation options.
     *
     * @param options the options value to set.
     * @return the QueryRequest object itself.
     */
    public QueryRequest withOptions(QueryRequestOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Get the facets property: An array of facet requests to be computed against the query result.
     *
     * @return the facets value.
     */
    public List<FacetRequest> facets() {
        return this.facets;
    }

    /**
     * Set the facets property: An array of facet requests to be computed against the query result.
     *
     * @param facets the facets value to set.
     * @return the QueryRequest object itself.
     */
    public QueryRequest withFacets(List<FacetRequest> facets) {
        this.facets = facets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (query() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property query in model QueryRequest"));
        }
        if (options() != null) {
            options().validate();
        }
        if (facets() != null) {
            facets().forEach(e -> e.validate());
        }
    }
}
