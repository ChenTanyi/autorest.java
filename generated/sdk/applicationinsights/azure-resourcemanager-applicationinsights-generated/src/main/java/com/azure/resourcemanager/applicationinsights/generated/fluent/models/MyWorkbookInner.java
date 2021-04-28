// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.models.MyWorkbookResource;
import com.azure.resourcemanager.applicationinsights.generated.models.SharedTypeKind;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An Application Insights private workbook definition. */
@JsonFlatten
@Fluent
public class MyWorkbookInner extends MyWorkbookResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MyWorkbookInner.class);

    /*
     * The kind of workbook. Choices are user and shared.
     */
    @JsonProperty(value = "kind")
    private SharedTypeKind kind;

    /*
     * The user-defined name of the private workbook.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Configuration of this particular private workbook. Configuration data is
     * a string containing valid JSON
     */
    @JsonProperty(value = "properties.serializedData")
    private String serializedData;

    /*
     * This instance's version of the data model. This can change as new
     * features are added that can be marked private workbook.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /*
     * Date and time in UTC of the last modification that was made to this
     * private workbook definition.
     */
    @JsonProperty(value = "properties.timeModified", access = JsonProperty.Access.WRITE_ONLY)
    private String timeModified;

    /*
     * Workbook category, as defined by the user at creation time.
     */
    @JsonProperty(value = "properties.category")
    private String category;

    /*
     * A list of 0 or more tags that are associated with this private workbook
     * definition
     */
    @JsonProperty(value = "properties.tags")
    private List<String> tagsPropertiesTags;

    /*
     * Unique user id of the specific user that owns this private workbook.
     */
    @JsonProperty(value = "properties.userId", access = JsonProperty.Access.WRITE_ONLY)
    private String userId;

    /*
     * Optional resourceId for a source resource.
     */
    @JsonProperty(value = "properties.sourceId")
    private String sourceId;

    /**
     * Get the kind property: The kind of workbook. Choices are user and shared.
     *
     * @return the kind value.
     */
    public SharedTypeKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of workbook. Choices are user and shared.
     *
     * @param kind the kind value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withKind(SharedTypeKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the displayName property: The user-defined name of the private workbook.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The user-defined name of the private workbook.
     *
     * @param displayName the displayName value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the serializedData property: Configuration of this particular private workbook. Configuration data is a
     * string containing valid JSON.
     *
     * @return the serializedData value.
     */
    public String serializedData() {
        return this.serializedData;
    }

    /**
     * Set the serializedData property: Configuration of this particular private workbook. Configuration data is a
     * string containing valid JSON.
     *
     * @param serializedData the serializedData value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withSerializedData(String serializedData) {
        this.serializedData = serializedData;
        return this;
    }

    /**
     * Get the version property: This instance's version of the data model. This can change as new features are added
     * that can be marked private workbook.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: This instance's version of the data model. This can change as new features are added
     * that can be marked private workbook.
     *
     * @param version the version value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the timeModified property: Date and time in UTC of the last modification that was made to this private
     * workbook definition.
     *
     * @return the timeModified value.
     */
    public String timeModified() {
        return this.timeModified;
    }

    /**
     * Get the category property: Workbook category, as defined by the user at creation time.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Workbook category, as defined by the user at creation time.
     *
     * @param category the category value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the tagsPropertiesTags property: A list of 0 or more tags that are associated with this private workbook
     * definition.
     *
     * @return the tagsPropertiesTags value.
     */
    public List<String> tagsPropertiesTags() {
        return this.tagsPropertiesTags;
    }

    /**
     * Set the tagsPropertiesTags property: A list of 0 or more tags that are associated with this private workbook
     * definition.
     *
     * @param tagsPropertiesTags the tagsPropertiesTags value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withTagsPropertiesTags(List<String> tagsPropertiesTags) {
        this.tagsPropertiesTags = tagsPropertiesTags;
        return this;
    }

    /**
     * Get the userId property: Unique user id of the specific user that owns this private workbook.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Get the sourceId property: Optional resourceId for a source resource.
     *
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: Optional resourceId for a source resource.
     *
     * @param sourceId the sourceId value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withType(String type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
    }
}
