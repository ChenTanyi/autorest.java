// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.LiveEventInner;
import com.azure.resourcemanager.mediaservices.generated.models.CrossSiteAccessPolicies;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEvent;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventActionInput;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventEncoding;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventInput;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventPreview;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventResourceState;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventTranscription;
import com.azure.resourcemanager.mediaservices.generated.models.StreamOptionsFlag;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class LiveEventImpl implements LiveEvent, LiveEvent.Definition, LiveEvent.Update {
    private LiveEventInner innerObject;

    private final MediaservicesManager serviceManager;

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

    public String description() {
        return this.innerModel().description();
    }

    public LiveEventInput input() {
        return this.innerModel().input();
    }

    public LiveEventPreview preview() {
        return this.innerModel().preview();
    }

    public LiveEventEncoding encoding() {
        return this.innerModel().encoding();
    }

    public List<LiveEventTranscription> transcriptions() {
        List<LiveEventTranscription> inner = this.innerModel().transcriptions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public LiveEventResourceState resourceState() {
        return this.innerModel().resourceState();
    }

    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.innerModel().crossSiteAccessPolicies();
    }

    public Boolean useStaticHostname() {
        return this.innerModel().useStaticHostname();
    }

    public String hostnamePrefix() {
        return this.innerModel().hostnamePrefix();
    }

    public List<StreamOptionsFlag> streamOptions() {
        List<StreamOptionsFlag> inner = this.innerModel().streamOptions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public LiveEventInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String liveEventName;

    private Boolean createAutoStart;

    public LiveEventImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public LiveEvent create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveEvents()
                .create(
                    resourceGroupName, accountName, liveEventName, this.innerModel(), createAutoStart, Context.NONE);
        return this;
    }

    public LiveEvent create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveEvents()
                .create(resourceGroupName, accountName, liveEventName, this.innerModel(), createAutoStart, context);
        return this;
    }

    LiveEventImpl(String name, MediaservicesManager serviceManager) {
        this.innerObject = new LiveEventInner();
        this.serviceManager = serviceManager;
        this.liveEventName = name;
        this.createAutoStart = null;
    }

    public LiveEventImpl update() {
        return this;
    }

    public LiveEvent apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveEvents()
                .update(resourceGroupName, accountName, liveEventName, this.innerModel(), Context.NONE);
        return this;
    }

    public LiveEvent apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveEvents()
                .update(resourceGroupName, accountName, liveEventName, this.innerModel(), context);
        return this;
    }

    LiveEventImpl(LiveEventInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaservices");
        this.liveEventName = Utils.getValueFromIdByName(innerObject.id(), "liveEvents");
    }

    public LiveEvent refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveEvents()
                .getWithResponse(resourceGroupName, accountName, liveEventName, Context.NONE)
                .getValue();
        return this;
    }

    public LiveEvent refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLiveEvents()
                .getWithResponse(resourceGroupName, accountName, liveEventName, context)
                .getValue();
        return this;
    }

    public void allocate() {
        serviceManager.liveEvents().allocate(resourceGroupName, accountName, liveEventName);
    }

    public void allocate(Context context) {
        serviceManager.liveEvents().allocate(resourceGroupName, accountName, liveEventName, context);
    }

    public void start() {
        serviceManager.liveEvents().start(resourceGroupName, accountName, liveEventName);
    }

    public void start(Context context) {
        serviceManager.liveEvents().start(resourceGroupName, accountName, liveEventName, context);
    }

    public void stop(LiveEventActionInput parameters) {
        serviceManager.liveEvents().stop(resourceGroupName, accountName, liveEventName, parameters);
    }

    public void stop(LiveEventActionInput parameters, Context context) {
        serviceManager.liveEvents().stop(resourceGroupName, accountName, liveEventName, parameters, context);
    }

    public void reset() {
        serviceManager.liveEvents().reset(resourceGroupName, accountName, liveEventName);
    }

    public void reset(Context context) {
        serviceManager.liveEvents().reset(resourceGroupName, accountName, liveEventName, context);
    }

    public LiveEventImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public LiveEventImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public LiveEventImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public LiveEventImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public LiveEventImpl withInput(LiveEventInput input) {
        this.innerModel().withInput(input);
        return this;
    }

    public LiveEventImpl withPreview(LiveEventPreview preview) {
        this.innerModel().withPreview(preview);
        return this;
    }

    public LiveEventImpl withEncoding(LiveEventEncoding encoding) {
        this.innerModel().withEncoding(encoding);
        return this;
    }

    public LiveEventImpl withTranscriptions(List<LiveEventTranscription> transcriptions) {
        this.innerModel().withTranscriptions(transcriptions);
        return this;
    }

    public LiveEventImpl withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        this.innerModel().withCrossSiteAccessPolicies(crossSiteAccessPolicies);
        return this;
    }

    public LiveEventImpl withUseStaticHostname(Boolean useStaticHostname) {
        this.innerModel().withUseStaticHostname(useStaticHostname);
        return this;
    }

    public LiveEventImpl withHostnamePrefix(String hostnamePrefix) {
        this.innerModel().withHostnamePrefix(hostnamePrefix);
        return this;
    }

    public LiveEventImpl withStreamOptions(List<StreamOptionsFlag> streamOptions) {
        this.innerModel().withStreamOptions(streamOptions);
        return this;
    }

    public LiveEventImpl withAutoStart(Boolean autoStart) {
        this.createAutoStart = autoStart;
        return this;
    }
}
