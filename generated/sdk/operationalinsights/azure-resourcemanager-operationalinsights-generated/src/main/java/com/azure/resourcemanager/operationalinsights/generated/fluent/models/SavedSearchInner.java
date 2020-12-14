// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.models.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Value object for saved search results. */
@JsonFlatten
@Fluent
public class SavedSearchInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SavedSearchInner.class);

    /*
     * The ETag of the saved search.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The category of the saved search. This helps the user to find a saved
     * search faster.
     */
    @JsonProperty(value = "properties.category", required = true)
    private String category;

    /*
     * Saved search display name.
     */
    @JsonProperty(value = "properties.displayName", required = true)
    private String displayName;

    /*
     * The query expression for the saved search.
     */
    @JsonProperty(value = "properties.query", required = true)
    private String query;

    /*
     * The function alias if query serves as a function.
     */
    @JsonProperty(value = "properties.functionAlias")
    private String functionAlias;

    /*
     * The optional function parameters if query serves as a function. Value
     * should be in the following format: 'param-name1:type1 = default_value1,
     * param-name2:type2 = default_value2'. For more examples and proper syntax
     * please refer to
     * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     */
    @JsonProperty(value = "properties.functionParameters")
    private String functionParameters;

    /*
     * The version number of the query language. The current version is 2 and
     * is the default.
     */
    @JsonProperty(value = "properties.version")
    private Long version;

    /*
     * The tags attached to the saved search.
     */
    @JsonProperty(value = "properties.tags")
    private List<Tag> tags;

    /**
     * Get the etag property: The ETag of the saved search.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the saved search.
     *
     * @param etag the etag value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the category property: The category of the saved search. This helps the user to find a saved search faster.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category of the saved search. This helps the user to find a saved search faster.
     *
     * @param category the category value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the displayName property: Saved search display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Saved search display name.
     *
     * @param displayName the displayName value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the query property: The query expression for the saved search.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The query expression for the saved search.
     *
     * @param query the query value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the functionAlias property: The function alias if query serves as a function.
     *
     * @return the functionAlias value.
     */
    public String functionAlias() {
        return this.functionAlias;
    }

    /**
     * Set the functionAlias property: The function alias if query serves as a function.
     *
     * @param functionAlias the functionAlias value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withFunctionAlias(String functionAlias) {
        this.functionAlias = functionAlias;
        return this;
    }

    /**
     * Get the functionParameters property: The optional function parameters if query serves as a function. Value should
     * be in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'. For more
     * examples and proper syntax please refer to
     * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     *
     * @return the functionParameters value.
     */
    public String functionParameters() {
        return this.functionParameters;
    }

    /**
     * Set the functionParameters property: The optional function parameters if query serves as a function. Value should
     * be in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'. For more
     * examples and proper syntax please refer to
     * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     *
     * @param functionParameters the functionParameters value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withFunctionParameters(String functionParameters) {
        this.functionParameters = functionParameters;
        return this;
    }

    /**
     * Get the version property: The version number of the query language. The current version is 2 and is the default.
     *
     * @return the version value.
     */
    public Long version() {
        return this.version;
    }

    /**
     * Set the version property: The version number of the query language. The current version is 2 and is the default.
     *
     * @param version the version value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the tags property: The tags attached to the saved search.
     *
     * @return the tags value.
     */
    public List<Tag> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags attached to the saved search.
     *
     * @param tags the tags value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (category() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property category in model SavedSearchInner"));
        }
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property displayName in model SavedSearchInner"));
        }
        if (query() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property query in model SavedSearchInner"));
        }
        if (tags() != null) {
            tags().forEach(e -> e.validate());
        }
    }
}
