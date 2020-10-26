// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.IdentifierInner;

/** An immutable client-side representation of Identifier. */
@Immutable
public interface Identifier {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the value property: String representation of the identity.
     *
     * @return the value value.
     */
    String value();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.IdentifierInner object.
     *
     * @return the inner object.
     */
    IdentifierInner innerModel();

    /** The entirety of the Identifier definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Identifier definition stages. */
    interface DefinitionStages {
        /** The first stage of the Identifier definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Identifier definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the app.
             * @return the next definition stage.
             */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }
        /**
         * The stage of the Identifier definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithKind, DefinitionStages.WithValue {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Identifier create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Identifier create(Context context);
        }
        /** The stage of the Identifier definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the Identifier definition allowing to specify value. */
        interface WithValue {
            /**
             * Specifies the value property: String representation of the identity..
             *
             * @param value String representation of the identity.
             * @return the next definition stage.
             */
            WithCreate withValue(String value);
        }
    }
    /**
     * Begins update for the Identifier resource.
     *
     * @return the stage of resource update.
     */
    Identifier.Update update();

    /** The template for Identifier update. */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithValue {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Identifier apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Identifier apply(Context context);
    }
    /** The Identifier update stages. */
    interface UpdateStages {
        /** The stage of the Identifier update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the Identifier update allowing to specify value. */
        interface WithValue {
            /**
             * Specifies the value property: String representation of the identity..
             *
             * @param value String representation of the identity.
             * @return the next definition stage.
             */
            Update withValue(String value);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Identifier refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Identifier refresh(Context context);
}
