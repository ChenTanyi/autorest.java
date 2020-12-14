// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.SavedSearchInner;
import java.util.List;

/** An immutable client-side representation of SavedSearch. */
public interface SavedSearch {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: The ETag of the saved search.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the category property: The category of the saved search. This helps the user to find a saved search faster.
     *
     * @return the category value.
     */
    String category();

    /**
     * Gets the displayName property: Saved search display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the query property: The query expression for the saved search.
     *
     * @return the query value.
     */
    String query();

    /**
     * Gets the functionAlias property: The function alias if query serves as a function.
     *
     * @return the functionAlias value.
     */
    String functionAlias();

    /**
     * Gets the functionParameters property: The optional function parameters if query serves as a function. Value
     * should be in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'. For
     * more examples and proper syntax please refer to
     * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     *
     * @return the functionParameters value.
     */
    String functionParameters();

    /**
     * Gets the version property: The version number of the query language. The current version is 2 and is the default.
     *
     * @return the version value.
     */
    Long version();

    /**
     * Gets the tags property: The tags attached to the saved search.
     *
     * @return the tags value.
     */
    List<Tag> tags();

    /**
     * Gets the inner com.azure.resourcemanager.operationalinsights.generated.fluent.models.SavedSearchInner object.
     *
     * @return the inner object.
     */
    SavedSearchInner innerModel();

    /** The entirety of the SavedSearch definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCategory,
            DefinitionStages.WithDisplayName,
            DefinitionStages.WithQuery,
            DefinitionStages.WithCreate {
    }
    /** The SavedSearch definition stages. */
    interface DefinitionStages {
        /** The first stage of the SavedSearch definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SavedSearch definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithCategory withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /** The stage of the SavedSearch definition allowing to specify category. */
        interface WithCategory {
            /**
             * Specifies the category property: The category of the saved search. This helps the user to find a saved
             * search faster. .
             *
             * @param category The category of the saved search. This helps the user to find a saved search faster.
             * @return the next definition stage.
             */
            WithDisplayName withCategory(String category);
        }
        /** The stage of the SavedSearch definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Saved search display name..
             *
             * @param displayName Saved search display name.
             * @return the next definition stage.
             */
            WithQuery withDisplayName(String displayName);
        }
        /** The stage of the SavedSearch definition allowing to specify query. */
        interface WithQuery {
            /**
             * Specifies the query property: The query expression for the saved search..
             *
             * @param query The query expression for the saved search.
             * @return the next definition stage.
             */
            WithCreate withQuery(String query);
        }
        /**
         * The stage of the SavedSearch definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithFunctionAlias,
                DefinitionStages.WithFunctionParameters,
                DefinitionStages.WithVersion {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SavedSearch create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SavedSearch create(Context context);
        }
        /** The stage of the SavedSearch definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags attached to the saved search..
             *
             * @param tags The tags attached to the saved search.
             * @return the next definition stage.
             */
            WithCreate withTags(List<Tag> tags);
        }
        /** The stage of the SavedSearch definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag of the saved search..
             *
             * @param etag The ETag of the saved search.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the SavedSearch definition allowing to specify functionAlias. */
        interface WithFunctionAlias {
            /**
             * Specifies the functionAlias property: The function alias if query serves as a function..
             *
             * @param functionAlias The function alias if query serves as a function.
             * @return the next definition stage.
             */
            WithCreate withFunctionAlias(String functionAlias);
        }
        /** The stage of the SavedSearch definition allowing to specify functionParameters. */
        interface WithFunctionParameters {
            /**
             * Specifies the functionParameters property: The optional function parameters if query serves as a
             * function. Value should be in the following format: 'param-name1:type1 = default_value1, param-name2:type2
             * = default_value2'. For more examples and proper syntax please refer to
             * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions..
             *
             * @param functionParameters The optional function parameters if query serves as a function. Value should be
             *     in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'.
             *     For more examples and proper syntax please refer to
             *     https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
             * @return the next definition stage.
             */
            WithCreate withFunctionParameters(String functionParameters);
        }
        /** The stage of the SavedSearch definition allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: The version number of the query language. The current version is 2 and is
             * the default..
             *
             * @param version The version number of the query language. The current version is 2 and is the default.
             * @return the next definition stage.
             */
            WithCreate withVersion(Long version);
        }
    }
    /**
     * Begins update for the SavedSearch resource.
     *
     * @return the stage of resource update.
     */
    SavedSearch.Update update();

    /** The template for SavedSearch update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithEtag,
            UpdateStages.WithCategory,
            UpdateStages.WithDisplayName,
            UpdateStages.WithQuery,
            UpdateStages.WithFunctionAlias,
            UpdateStages.WithFunctionParameters,
            UpdateStages.WithVersion {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SavedSearch apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SavedSearch apply(Context context);
    }
    /** The SavedSearch update stages. */
    interface UpdateStages {
        /** The stage of the SavedSearch update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags attached to the saved search..
             *
             * @param tags The tags attached to the saved search.
             * @return the next definition stage.
             */
            Update withTags(List<Tag> tags);
        }
        /** The stage of the SavedSearch update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag of the saved search..
             *
             * @param etag The ETag of the saved search.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the SavedSearch update allowing to specify category. */
        interface WithCategory {
            /**
             * Specifies the category property: The category of the saved search. This helps the user to find a saved
             * search faster. .
             *
             * @param category The category of the saved search. This helps the user to find a saved search faster.
             * @return the next definition stage.
             */
            Update withCategory(String category);
        }
        /** The stage of the SavedSearch update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Saved search display name..
             *
             * @param displayName Saved search display name.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the SavedSearch update allowing to specify query. */
        interface WithQuery {
            /**
             * Specifies the query property: The query expression for the saved search..
             *
             * @param query The query expression for the saved search.
             * @return the next definition stage.
             */
            Update withQuery(String query);
        }
        /** The stage of the SavedSearch update allowing to specify functionAlias. */
        interface WithFunctionAlias {
            /**
             * Specifies the functionAlias property: The function alias if query serves as a function..
             *
             * @param functionAlias The function alias if query serves as a function.
             * @return the next definition stage.
             */
            Update withFunctionAlias(String functionAlias);
        }
        /** The stage of the SavedSearch update allowing to specify functionParameters. */
        interface WithFunctionParameters {
            /**
             * Specifies the functionParameters property: The optional function parameters if query serves as a
             * function. Value should be in the following format: 'param-name1:type1 = default_value1, param-name2:type2
             * = default_value2'. For more examples and proper syntax please refer to
             * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions..
             *
             * @param functionParameters The optional function parameters if query serves as a function. Value should be
             *     in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'.
             *     For more examples and proper syntax please refer to
             *     https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
             * @return the next definition stage.
             */
            Update withFunctionParameters(String functionParameters);
        }
        /** The stage of the SavedSearch update allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: The version number of the query language. The current version is 2 and is
             * the default..
             *
             * @param version The version number of the query language. The current version is 2 and is the default.
             * @return the next definition stage.
             */
            Update withVersion(Long version);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SavedSearch refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SavedSearch refresh(Context context);
}
