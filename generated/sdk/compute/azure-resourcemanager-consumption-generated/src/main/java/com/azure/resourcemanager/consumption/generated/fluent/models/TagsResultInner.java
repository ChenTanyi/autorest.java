// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.models.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A resource listing all tags. */
@JsonFlatten
@Fluent
public class TagsResultInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagsResultInner.class);

    /*
     * A list of Tag.
     */
    @JsonProperty(value = "properties.tags")
    private List<Tag> tags;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "properties.nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * The link (url) to the previous page of results.
     */
    @JsonProperty(value = "properties.previousLink", access = JsonProperty.Access.WRITE_ONLY)
    private String previousLink;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field
     * will be used to determine whether the user is updating the latest
     * version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Get the tags property: A list of Tag.
     *
     * @return the tags value.
     */
    public List<Tag> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: A list of Tag.
     *
     * @param tags the tags value to set.
     * @return the TagsResultInner object itself.
     */
    public TagsResultInner withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the previousLink property: The link (url) to the previous page of results.
     *
     * @return the previousLink value.
     */
    public String previousLink() {
        return this.previousLink;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @param etag the etag value to set.
     * @return the TagsResultInner object itself.
     */
    public TagsResultInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tags() != null) {
            tags().forEach(e -> e.validate());
        }
    }
}
