// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ApplicationInsightsComponent. */
public interface ApplicationInsightsComponent {
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
     * Gets the kind property: The kind of application that this component refers to, used to customize UI. This value
     * is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the applicationId property: The unique ID of your application. This field mirrors the 'Name' field and
     * cannot be changed.
     *
     * @return the applicationId value.
     */
    String applicationId();

    /**
     * Gets the appId property: Application Insights Unique ID for your Application.
     *
     * @return the appId value.
     */
    String appId();

    /**
     * Gets the applicationType property: Type of application being monitored.
     *
     * @return the applicationType value.
     */
    ApplicationType applicationType();

    /**
     * Gets the flowType property: Used by the Application Insights system to determine what kind of flow this component
     * was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API.
     *
     * @return the flowType value.
     */
    FlowType flowType();

    /**
     * Gets the requestSource property: Describes what tool created this Application Insights component. Customers using
     * this API should set this to the default 'rest'.
     *
     * @return the requestSource value.
     */
    RequestSource requestSource();

    /**
     * Gets the instrumentationKey property: Application Insights Instrumentation key. A read-only value that
     * applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value
     * will be supplied upon construction of each new Application Insights component.
     *
     * @return the instrumentationKey value.
     */
    String instrumentationKey();

    /**
     * Gets the creationDate property: Creation Date for the Application Insights component, in ISO 8601 format.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the tenantId property: Azure Tenant Id.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the hockeyAppId property: The unique application ID created when a new application is added to HockeyApp,
     * used for communications with HockeyApp.
     *
     * @return the hockeyAppId value.
     */
    String hockeyAppId();

    /**
     * Gets the hockeyAppToken property: Token used to authenticate communications with between Application Insights and
     * HockeyApp.
     *
     * @return the hockeyAppToken value.
     */
    String hockeyAppToken();

    /**
     * Gets the provisioningState property: Current state of this component: whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value but are able to read from it. Values will
     * include Succeeded, Deploying, Canceled, and Failed.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the samplingPercentage property: Percentage of the data produced by the application being monitored that is
     * being sampled for Application Insights telemetry.
     *
     * @return the samplingPercentage value.
     */
    Double samplingPercentage();

    /**
     * Gets the connectionString property: Application Insights component connection string.
     *
     * @return the connectionString value.
     */
    String connectionString();

    /**
     * Gets the retentionInDays property: Retention period in days.
     *
     * @return the retentionInDays value.
     */
    Integer retentionInDays();

    /**
     * Gets the disableIpMasking property: Disable IP masking.
     *
     * @return the disableIpMasking value.
     */
    Boolean disableIpMasking();

    /**
     * Gets the immediatePurgeDataOn30Days property: Purge data immediately after 30 days.
     *
     * @return the immediatePurgeDataOn30Days value.
     */
    Boolean immediatePurgeDataOn30Days();

    /**
     * Gets the privateLinkScopedResources property: List of linked private link scope resources.
     *
     * @return the privateLinkScopedResources value.
     */
    List<PrivateLinkScopedResource> privateLinkScopedResources();

    /**
     * Gets the publicNetworkAccessForIngestion property: The network access type for accessing Application Insights
     * ingestion.
     *
     * @return the publicNetworkAccessForIngestion value.
     */
    PublicNetworkAccessType publicNetworkAccessForIngestion();

    /**
     * Gets the publicNetworkAccessForQuery property: The network access type for accessing Application Insights query.
     *
     * @return the publicNetworkAccessForQuery value.
     */
    PublicNetworkAccessType publicNetworkAccessForQuery();

    /**
     * Gets the ingestionMode property: Indicates the flow of the ingestion.
     *
     * @return the ingestionMode value.
     */
    IngestionMode ingestionMode();

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
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentInner object.
     *
     * @return the inner object.
     */
    ApplicationInsightsComponentInner innerModel();

    /** The entirety of the ApplicationInsightsComponent definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithKind,
            DefinitionStages.WithCreate {
    }
    /** The ApplicationInsightsComponent definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationInsightsComponent definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify location. */
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
        /** The stage of the ApplicationInsightsComponent definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithKind withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of application that this component refers to, used to customize UI.
             * This value is a freeform string, values should typically be one of the following: web, ios, other, store,
             * java, phone..
             *
             * @param kind The kind of application that this component refers to, used to customize UI. This value is a
             *     freeform string, values should typically be one of the following: web, ios, other, store, java,
             *     phone.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /**
         * The stage of the ApplicationInsightsComponent definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithApplicationType,
                DefinitionStages.WithFlowType,
                DefinitionStages.WithRequestSource,
                DefinitionStages.WithHockeyAppId,
                DefinitionStages.WithSamplingPercentage,
                DefinitionStages.WithRetentionInDays,
                DefinitionStages.WithDisableIpMasking,
                DefinitionStages.WithImmediatePurgeDataOn30Days,
                DefinitionStages.WithPublicNetworkAccessForIngestion,
                DefinitionStages.WithPublicNetworkAccessForQuery,
                DefinitionStages.WithIngestionMode {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationInsightsComponent create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationInsightsComponent create(Context context);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify applicationType. */
        interface WithApplicationType {
            /**
             * Specifies the applicationType property: Type of application being monitored..
             *
             * @param applicationType Type of application being monitored.
             * @return the next definition stage.
             */
            WithCreate withApplicationType(ApplicationType applicationType);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify flowType. */
        interface WithFlowType {
            /**
             * Specifies the flowType property: Used by the Application Insights system to determine what kind of flow
             * this component was created by. This is to be set to 'Bluefield' when creating/updating a component via
             * the REST API..
             *
             * @param flowType Used by the Application Insights system to determine what kind of flow this component was
             *     created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API.
             * @return the next definition stage.
             */
            WithCreate withFlowType(FlowType flowType);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify requestSource. */
        interface WithRequestSource {
            /**
             * Specifies the requestSource property: Describes what tool created this Application Insights component.
             * Customers using this API should set this to the default 'rest'..
             *
             * @param requestSource Describes what tool created this Application Insights component. Customers using
             *     this API should set this to the default 'rest'.
             * @return the next definition stage.
             */
            WithCreate withRequestSource(RequestSource requestSource);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify hockeyAppId. */
        interface WithHockeyAppId {
            /**
             * Specifies the hockeyAppId property: The unique application ID created when a new application is added to
             * HockeyApp, used for communications with HockeyApp..
             *
             * @param hockeyAppId The unique application ID created when a new application is added to HockeyApp, used
             *     for communications with HockeyApp.
             * @return the next definition stage.
             */
            WithCreate withHockeyAppId(String hockeyAppId);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify samplingPercentage. */
        interface WithSamplingPercentage {
            /**
             * Specifies the samplingPercentage property: Percentage of the data produced by the application being
             * monitored that is being sampled for Application Insights telemetry..
             *
             * @param samplingPercentage Percentage of the data produced by the application being monitored that is
             *     being sampled for Application Insights telemetry.
             * @return the next definition stage.
             */
            WithCreate withSamplingPercentage(Double samplingPercentage);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify retentionInDays. */
        interface WithRetentionInDays {
            /**
             * Specifies the retentionInDays property: Retention period in days..
             *
             * @param retentionInDays Retention period in days.
             * @return the next definition stage.
             */
            WithCreate withRetentionInDays(Integer retentionInDays);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify disableIpMasking. */
        interface WithDisableIpMasking {
            /**
             * Specifies the disableIpMasking property: Disable IP masking..
             *
             * @param disableIpMasking Disable IP masking.
             * @return the next definition stage.
             */
            WithCreate withDisableIpMasking(Boolean disableIpMasking);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify immediatePurgeDataOn30Days. */
        interface WithImmediatePurgeDataOn30Days {
            /**
             * Specifies the immediatePurgeDataOn30Days property: Purge data immediately after 30 days..
             *
             * @param immediatePurgeDataOn30Days Purge data immediately after 30 days.
             * @return the next definition stage.
             */
            WithCreate withImmediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days);
        }
        /**
         * The stage of the ApplicationInsightsComponent definition allowing to specify publicNetworkAccessForIngestion.
         */
        interface WithPublicNetworkAccessForIngestion {
            /**
             * Specifies the publicNetworkAccessForIngestion property: The network access type for accessing Application
             * Insights ingestion..
             *
             * @param publicNetworkAccessForIngestion The network access type for accessing Application Insights
             *     ingestion.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify publicNetworkAccessForQuery. */
        interface WithPublicNetworkAccessForQuery {
            /**
             * Specifies the publicNetworkAccessForQuery property: The network access type for accessing Application
             * Insights query..
             *
             * @param publicNetworkAccessForQuery The network access type for accessing Application Insights query.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery);
        }
        /** The stage of the ApplicationInsightsComponent definition allowing to specify ingestionMode. */
        interface WithIngestionMode {
            /**
             * Specifies the ingestionMode property: Indicates the flow of the ingestion..
             *
             * @param ingestionMode Indicates the flow of the ingestion.
             * @return the next definition stage.
             */
            WithCreate withIngestionMode(IngestionMode ingestionMode);
        }
    }
    /**
     * Begins update for the ApplicationInsightsComponent resource.
     *
     * @return the stage of resource update.
     */
    ApplicationInsightsComponent.Update update();

    /** The template for ApplicationInsightsComponent update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ApplicationInsightsComponent apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ApplicationInsightsComponent apply(Context context);
    }
    /** The ApplicationInsightsComponent update stages. */
    interface UpdateStages {
        /** The stage of the ApplicationInsightsComponent update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ApplicationInsightsComponent refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ApplicationInsightsComponent refresh(Context context);

    /**
     * Purges data in an Application Insights component by a set of user-defined filters.
     *
     * <p>In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch
     * the execution of purge requests by sending a single command whose predicate includes all user identities that
     * require purging. Use the in operator to specify multiple identities. You should run the query prior to using for
     * a purge request to verify that the results are expected.
     *
     * @param body Describes the body of a request to purge data in a single table of an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    ComponentPurgeResponse purge(ComponentPurgeBody body);

    /**
     * Purges data in an Application Insights component by a set of user-defined filters.
     *
     * <p>In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch
     * the execution of purge requests by sending a single command whose predicate includes all user identities that
     * require purging. Use the in operator to specify multiple identities. You should run the query prior to using for
     * a purge request to verify that the results are expected.
     *
     * @param body Describes the body of a request to purge data in a single table of an Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    Response<ComponentPurgeResponse> purgeWithResponse(ComponentPurgeBody body, Context context);
}
