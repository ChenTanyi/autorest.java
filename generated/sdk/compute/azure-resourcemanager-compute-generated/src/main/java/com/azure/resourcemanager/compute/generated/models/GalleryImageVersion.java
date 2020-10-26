// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageVersionInner;
import java.util.Map;

/** An immutable client-side representation of GalleryImageVersion. */
@Immutable
public interface GalleryImageVersion {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the publishingProfile property: Describes the basic gallery artifact publishing profile.
     *
     * @return the publishingProfile value.
     */
    GalleryArtifactPublishingProfileBase publishingProfile();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    GalleryImageVersionPropertiesProvisioningState provisioningState();

    /**
     * Gets the storageProfile property: This is the storage profile of a Gallery Image Version.
     *
     * @return the storageProfile value.
     */
    GalleryImageVersionStorageProfile storageProfile();

    /**
     * Gets the replicationStatus property: This is the replication status of the gallery image version.
     *
     * @return the replicationStatus value.
     */
    ReplicationStatus replicationStatus();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageVersionInner object.
     *
     * @return the inner object.
     */
    GalleryImageVersionInner innerModel();

    /** The entirety of the GalleryImageVersion definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The GalleryImageVersion definition stages. */
    interface DefinitionStages {
        /** The first stage of the GalleryImageVersion definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the GalleryImageVersion definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the GalleryImageVersion definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, galleryName, galleryImageName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
             * @param galleryImageName The name of the gallery image definition in which the Image Version is to be
             *     created.
             * @return the next definition stage.
             */
            WithCreate withExistingImage(String resourceGroupName, String galleryName, String galleryImageName);
        }
        /**
         * The stage of the GalleryImageVersion definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithPublishingProfile,
                DefinitionStages.WithStorageProfile {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GalleryImageVersion create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GalleryImageVersion create(Context context);
        }
        /** The stage of the GalleryImageVersion definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryImageVersion definition allowing to specify publishingProfile. */
        interface WithPublishingProfile {
            /**
             * Specifies the publishingProfile property: Describes the basic gallery artifact publishing profile..
             *
             * @param publishingProfile Describes the basic gallery artifact publishing profile.
             * @return the next definition stage.
             */
            WithCreate withPublishingProfile(GalleryArtifactPublishingProfileBase publishingProfile);
        }
        /** The stage of the GalleryImageVersion definition allowing to specify storageProfile. */
        interface WithStorageProfile {
            /**
             * Specifies the storageProfile property: This is the storage profile of a Gallery Image Version..
             *
             * @param storageProfile This is the storage profile of a Gallery Image Version.
             * @return the next definition stage.
             */
            WithCreate withStorageProfile(GalleryImageVersionStorageProfile storageProfile);
        }
    }
    /**
     * Begins update for the GalleryImageVersion resource.
     *
     * @return the stage of resource update.
     */
    GalleryImageVersion.Update update();

    /** The template for GalleryImageVersion update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithPublishingProfile, UpdateStages.WithStorageProfile {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GalleryImageVersion apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GalleryImageVersion apply(Context context);
    }
    /** The GalleryImageVersion update stages. */
    interface UpdateStages {
        /** The stage of the GalleryImageVersion update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryImageVersion update allowing to specify publishingProfile. */
        interface WithPublishingProfile {
            /**
             * Specifies the publishingProfile property: Describes the basic gallery artifact publishing profile..
             *
             * @param publishingProfile Describes the basic gallery artifact publishing profile.
             * @return the next definition stage.
             */
            Update withPublishingProfile(GalleryArtifactPublishingProfileBase publishingProfile);
        }
        /** The stage of the GalleryImageVersion update allowing to specify storageProfile. */
        interface WithStorageProfile {
            /**
             * Specifies the storageProfile property: This is the storage profile of a Gallery Image Version..
             *
             * @param storageProfile This is the storage profile of a Gallery Image Version.
             * @return the next definition stage.
             */
            Update withStorageProfile(GalleryImageVersionStorageProfile storageProfile);
        }
    }
}
