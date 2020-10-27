// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.DatabaseInner;

/** An immutable client-side representation of Database. */
@Immutable
public interface Database {
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
     * Gets the charset property: The charset of the database.
     *
     * @return the charset value.
     */
    String charset();

    /**
     * Gets the collation property: The collation of the database.
     *
     * @return the collation value.
     */
    String collation();

    /**
     * Gets the inner com.azure.resourcemanager.mysql.generated.fluent.models.DatabaseInner object.
     *
     * @return the inner object.
     */
    DatabaseInner innerModel();

    /** The entirety of the Database definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Database definition stages. */
    interface DefinitionStages {
        /** The first stage of the Database definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Database definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }
        /**
         * The stage of the Database definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithCharset, DefinitionStages.WithCollation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Database create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Database create(Context context);
        }
        /** The stage of the Database definition allowing to specify charset. */
        interface WithCharset {
            /**
             * Specifies the charset property: The charset of the database..
             *
             * @param charset The charset of the database.
             * @return the next definition stage.
             */
            WithCreate withCharset(String charset);
        }
        /** The stage of the Database definition allowing to specify collation. */
        interface WithCollation {
            /**
             * Specifies the collation property: The collation of the database..
             *
             * @param collation The collation of the database.
             * @return the next definition stage.
             */
            WithCreate withCollation(String collation);
        }
    }
    /**
     * Begins update for the Database resource.
     *
     * @return the stage of resource update.
     */
    Database.Update update();

    /** The template for Database update. */
    interface Update extends UpdateStages.WithCharset, UpdateStages.WithCollation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Database apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Database apply(Context context);
    }
    /** The Database update stages. */
    interface UpdateStages {
        /** The stage of the Database update allowing to specify charset. */
        interface WithCharset {
            /**
             * Specifies the charset property: The charset of the database..
             *
             * @param charset The charset of the database.
             * @return the next definition stage.
             */
            Update withCharset(String charset);
        }
        /** The stage of the Database update allowing to specify collation. */
        interface WithCollation {
            /**
             * Specifies the collation property: The collation of the database..
             *
             * @param collation The collation of the database.
             * @return the next definition stage.
             */
            Update withCollation(String collation);
        }
    }
}