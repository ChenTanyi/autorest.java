// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This is the base type that represents an advanced filter. To configure an advanced filter, do not directly
 * instantiate an object of this class. Instead, instantiate an object of a derived class such as
 * BoolEqualsAdvancedFilter, NumberInAdvancedFilter, StringEqualsAdvancedFilter etc. depending on the type of the key
 * based on which you want to filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "operatorType",
    defaultImpl = AdvancedFilter.class)
@JsonTypeName("AdvancedFilter")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "NumberIn", value = NumberInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberNotIn", value = NumberNotInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberLessThan", value = NumberLessThanAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberGreaterThan", value = NumberGreaterThanAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberLessThanOrEquals", value = NumberLessThanOrEqualsAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberGreaterThanOrEquals", value = NumberGreaterThanOrEqualsAdvancedFilter.class),
    @JsonSubTypes.Type(name = "BoolEquals", value = BoolEqualsAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringIn", value = StringInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringNotIn", value = StringNotInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringBeginsWith", value = StringBeginsWithAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringEndsWith", value = StringEndsWithAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringContains", value = StringContainsAdvancedFilter.class)
})
@Fluent
public class AdvancedFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdvancedFilter.class);

    /*
     * The field/property in the event based on which you want to filter.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the key property: The field/property in the event based on which you want to filter.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The field/property in the event based on which you want to filter.
     *
     * @param key the key value to set.
     * @return the AdvancedFilter object itself.
     */
    public AdvancedFilter withKey(String key) {
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
