// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.TopicInner;
import com.azure.resourcemanager.eventgrid.generated.models.ExtendedLocation;
import com.azure.resourcemanager.eventgrid.generated.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.InputSchema;
import com.azure.resourcemanager.eventgrid.generated.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceKind;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceSku;
import com.azure.resourcemanager.eventgrid.generated.models.Topic;
import com.azure.resourcemanager.eventgrid.generated.models.TopicProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.TopicRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.generated.models.TopicSharedAccessKeys;
import com.azure.resourcemanager.eventgrid.generated.models.TopicUpdateParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class TopicImpl implements Topic, Topic.Definition, Topic.Update {
    private TopicInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceSku sku() {
        return this.innerModel().sku();
    }

    public IdentityInfo identity() {
        return this.innerModel().identity();
    }

    public ResourceKind kind() {
        return this.innerModel().kind();
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public TopicProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String endpoint() {
        return this.innerModel().endpoint();
    }

    public InputSchema inputSchema() {
        return this.innerModel().inputSchema();
    }

    public InputSchemaMapping inputSchemaMapping() {
        return this.innerModel().inputSchemaMapping();
    }

    public String metricResourceId() {
        return this.innerModel().metricResourceId();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<InboundIpRule> inboundIpRules() {
        List<InboundIpRule> inner = this.innerModel().inboundIpRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public TopicInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String topicName;

    private TopicUpdateParameters updateTopicUpdateParameters;

    public TopicImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Topic create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .createOrUpdate(resourceGroupName, topicName, this.innerModel(), Context.NONE);
        return this;
    }

    public Topic create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .createOrUpdate(resourceGroupName, topicName, this.innerModel(), context);
        return this;
    }

    TopicImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new TopicInner();
        this.serviceManager = serviceManager;
        this.topicName = name;
    }

    public TopicImpl update() {
        this.updateTopicUpdateParameters = new TopicUpdateParameters();
        return this;
    }

    public Topic apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .update(resourceGroupName, topicName, updateTopicUpdateParameters, Context.NONE);
        return this;
    }

    public Topic apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .update(resourceGroupName, topicName, updateTopicUpdateParameters, context);
        return this;
    }

    TopicImpl(TopicInner innerObject, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.topicName = Utils.getValueFromIdByName(innerObject.id(), "topics");
    }

    public Topic refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .getByResourceGroupWithResponse(resourceGroupName, topicName, Context.NONE)
                .getValue();
        return this;
    }

    public Topic refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .getByResourceGroupWithResponse(resourceGroupName, topicName, context)
                .getValue();
        return this;
    }

    public TopicSharedAccessKeys listSharedAccessKeys() {
        return serviceManager.topics().listSharedAccessKeys(resourceGroupName, topicName);
    }

    public Response<TopicSharedAccessKeys> listSharedAccessKeysWithResponse(Context context) {
        return serviceManager.topics().listSharedAccessKeysWithResponse(resourceGroupName, topicName, context);
    }

    public TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest) {
        return serviceManager.topics().regenerateKey(resourceGroupName, topicName, regenerateKeyRequest);
    }

    public TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest, Context context) {
        return serviceManager.topics().regenerateKey(resourceGroupName, topicName, regenerateKeyRequest, context);
    }

    public TopicImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public TopicImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public TopicImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateTopicUpdateParameters.withTags(tags);
            return this;
        }
    }

    public TopicImpl withSku(ResourceSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateTopicUpdateParameters.withSku(sku);
            return this;
        }
    }

    public TopicImpl withIdentity(IdentityInfo identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateTopicUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public TopicImpl withKind(ResourceKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public TopicImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public TopicImpl withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.innerModel().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    public TopicImpl withInputSchema(InputSchema inputSchema) {
        this.innerModel().withInputSchema(inputSchema);
        return this;
    }

    public TopicImpl withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.innerModel().withInputSchemaMapping(inputSchemaMapping);
        return this;
    }

    public TopicImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateTopicUpdateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public TopicImpl withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (isInCreateMode()) {
            this.innerModel().withInboundIpRules(inboundIpRules);
            return this;
        } else {
            this.updateTopicUpdateParameters.withInboundIpRules(inboundIpRules);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
