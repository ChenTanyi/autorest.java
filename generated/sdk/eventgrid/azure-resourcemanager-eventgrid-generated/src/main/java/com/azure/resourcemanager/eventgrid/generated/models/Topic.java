// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.TopicInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Topic. */
public interface Topic {
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
     * Gets the sku property: The Sku pricing tier for the topic.
     *
     * @return the sku value.
     */
    ResourceSku sku();

    /**
     * Gets the identity property: Identity information for the resource.
     *
     * @return the identity value.
     */
    IdentityInfo identity();

    /**
     * Gets the kind property: Kind of the resource.
     *
     * @return the kind value.
     */
    ResourceKind kind();

    /**
     * Gets the extendedLocation property: Extended location of the resource.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: The system metadata relating to Topic resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the privateEndpointConnections property: The privateEndpointConnections property.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the provisioningState property: Provisioning state of the topic.
     *
     * @return the provisioningState value.
     */
    TopicProvisioningState provisioningState();

    /**
     * Gets the endpoint property: Endpoint for the topic.
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Gets the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the topic.
     *
     * @return the inputSchema value.
     */
    InputSchema inputSchema();

    /**
     * Gets the inputSchemaMapping property: This enables publishing using custom event schemas. An InputSchemaMapping
     * can be specified to map various properties of a source schema to various required properties of the
     * EventGridEvent schema.
     *
     * @return the inputSchemaMapping value.
     */
    InputSchemaMapping inputSchemaMapping();

    /**
     * Gets the metricResourceId property: Metric resource id for the topic.
     *
     * @return the metricResourceId value.
     */
    String metricResourceId();

    /**
     * Gets the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    List<InboundIpRule> inboundIpRules();

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
     * Gets the inner com.azure.resourcemanager.eventgrid.generated.fluent.models.TopicInner object.
     *
     * @return the inner object.
     */
    TopicInner innerModel();

    /** The entirety of the Topic definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Topic definition stages. */
    interface DefinitionStages {
        /** The first stage of the Topic definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Topic definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Topic definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Topic definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithKind,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithPrivateEndpointConnections,
                DefinitionStages.WithInputSchema,
                DefinitionStages.WithInputSchemaMapping,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithInboundIpRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Topic create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Topic create(Context context);
        }
        /** The stage of the Topic definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Topic definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The Sku pricing tier for the topic..
             *
             * @param sku The Sku pricing tier for the topic.
             * @return the next definition stage.
             */
            WithCreate withSku(ResourceSku sku);
        }
        /** The stage of the Topic definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity information for the resource..
             *
             * @param identity Identity information for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityInfo identity);
        }
        /** The stage of the Topic definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of the resource..
             *
             * @param kind Kind of the resource.
             * @return the next definition stage.
             */
            WithCreate withKind(ResourceKind kind);
        }
        /** The stage of the Topic definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: Extended location of the resource..
             *
             * @param extendedLocation Extended location of the resource.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the Topic definition allowing to specify privateEndpointConnections. */
        interface WithPrivateEndpointConnections {
            /**
             * Specifies the privateEndpointConnections property: The privateEndpointConnections property..
             *
             * @param privateEndpointConnections The privateEndpointConnections property.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections);
        }
        /** The stage of the Topic definition allowing to specify inputSchema. */
        interface WithInputSchema {
            /**
             * Specifies the inputSchema property: This determines the format that Event Grid should expect for incoming
             * events published to the topic..
             *
             * @param inputSchema This determines the format that Event Grid should expect for incoming events published
             *     to the topic.
             * @return the next definition stage.
             */
            WithCreate withInputSchema(InputSchema inputSchema);
        }
        /** The stage of the Topic definition allowing to specify inputSchemaMapping. */
        interface WithInputSchemaMapping {
            /**
             * Specifies the inputSchemaMapping property: This enables publishing using custom event schemas. An
             * InputSchemaMapping can be specified to map various properties of a source schema to various required
             * properties of the EventGridEvent schema..
             *
             * @param inputSchemaMapping This enables publishing using custom event schemas. An InputSchemaMapping can
             *     be specified to map various properties of a source schema to various required properties of the
             *     EventGridEvent schema.
             * @return the next definition stage.
             */
            WithCreate withInputSchemaMapping(InputSchemaMapping inputSchemaMapping);
        }
        /** The stage of the Topic definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Topic definition allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            WithCreate withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
    }
    /**
     * Begins update for the Topic resource.
     *
     * @return the stage of resource update.
     */
    Topic.Update update();

    /** The template for Topic update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithSku,
            UpdateStages.WithPublicNetworkAccess,
            UpdateStages.WithInboundIpRules {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Topic apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Topic apply(Context context);
    }
    /** The Topic update stages. */
    interface UpdateStages {
        /** The stage of the Topic update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the resource..
             *
             * @param tags Tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Topic update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Resource identity information..
             *
             * @param identity Resource identity information.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityInfo identity);
        }
        /** The stage of the Topic update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The Sku pricing tier for the topic..
             *
             * @param sku The Sku pricing tier for the topic.
             * @return the next definition stage.
             */
            Update withSku(ResourceSku sku);
        }
        /** The stage of the Topic update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicUpdateParameterProperties"
                 + ".InboundIpRules"
             * /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicUpdateParameterProperties"
                 + ".InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Topic update allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            Update withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Topic refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Topic refresh(Context context);

    /**
     * List the two keys used to publish to a topic.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys listSharedAccessKeys();

    /**
     * List the two keys used to publish to a topic.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    Response<TopicSharedAccessKeys> listSharedAccessKeysWithResponse(Context context);

    /**
     * Regenerate a shared access key for a topic.
     *
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate a shared access key for a topic.
     *
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest, Context context);
}
