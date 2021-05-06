// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.models.MeterDetails;
import com.azure.resourcemanager.consumption.generated.models.PriceSheetProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An pricesheet resource. */
@JsonFlatten
@Immutable
public class PriceSheetResultInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PriceSheetResultInner.class);

    /*
     * Price sheet
     */
    @JsonProperty(value = "properties.pricesheets", access = JsonProperty.Access.WRITE_ONLY)
    private List<PriceSheetProperties> pricesheets;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "properties.nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Pricesheet download details.
     */
    @JsonProperty(value = "properties.download", access = JsonProperty.Access.WRITE_ONLY)
    private MeterDetails download;

    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the pricesheets property: Price sheet.
     *
     * @return the pricesheets value.
     */
    public List<PriceSheetProperties> pricesheets() {
        return this.pricesheets;
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
     * Get the download property: Pricesheet download details.
     *
     * @return the download value.
     */
    public MeterDetails download() {
        return this.download;
    }

    /**
     * Get the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pricesheets() != null) {
            pricesheets().forEach(e -> e.validate());
        }
        if (download() != null) {
            download().validate();
        }
    }
}
