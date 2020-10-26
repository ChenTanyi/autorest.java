// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SitePatchResourceInner;
import com.azure.resourcemanager.appservice.generated.models.CloningInfo;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.HostnameSslState;
import com.azure.resourcemanager.appservice.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appservice.generated.models.RedundancyMode;
import com.azure.resourcemanager.appservice.generated.models.Site;
import com.azure.resourcemanager.appservice.generated.models.SiteAvailabilityState;
import com.azure.resourcemanager.appservice.generated.models.SiteConfig;
import com.azure.resourcemanager.appservice.generated.models.SlotSwapStatus;
import com.azure.resourcemanager.appservice.generated.models.UsageState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class SiteImpl implements Site, Site.Definition, Site.Update {
    private SiteInner innerObject;

    private final WebSiteManager serviceManager;

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
            return null;
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String state() {
        return this.innerModel().state();
    }

    public List<String> hostNames() {
        List<String> inner = this.innerModel().hostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String repositorySiteName() {
        return this.innerModel().repositorySiteName();
    }

    public UsageState usageState() {
        return this.innerModel().usageState();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public List<String> enabledHostNames() {
        List<String> inner = this.innerModel().enabledHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public SiteAvailabilityState availabilityState() {
        return this.innerModel().availabilityState();
    }

    public List<HostnameSslState> hostnameSslStates() {
        List<HostnameSslState> inner = this.innerModel().hostnameSslStates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public String serverFarmId() {
        return this.innerModel().serverFarmId();
    }

    public Boolean reserved() {
        return this.innerModel().reserved();
    }

    public Boolean isXenon() {
        return this.innerModel().isXenon();
    }

    public Boolean hyperV() {
        return this.innerModel().hyperV();
    }

    public OffsetDateTime lastModifiedTimeUtc() {
        return this.innerModel().lastModifiedTimeUtc();
    }

    public SiteConfig siteConfig() {
        SiteConfigInner inner = this.innerModel().siteConfig();
        if (inner != null) {
            return new SiteConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<String> trafficManagerHostNames() {
        List<String> inner = this.innerModel().trafficManagerHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public Boolean scmSiteAlsoStopped() {
        return this.innerModel().scmSiteAlsoStopped();
    }

    public String targetSwapSlot() {
        return this.innerModel().targetSwapSlot();
    }

    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerModel().hostingEnvironmentProfile();
    }

    public Boolean clientAffinityEnabled() {
        return this.innerModel().clientAffinityEnabled();
    }

    public Boolean clientCertEnabled() {
        return this.innerModel().clientCertEnabled();
    }

    public String clientCertExclusionPaths() {
        return this.innerModel().clientCertExclusionPaths();
    }

    public Boolean hostNamesDisabled() {
        return this.innerModel().hostNamesDisabled();
    }

    public String outboundIpAddresses() {
        return this.innerModel().outboundIpAddresses();
    }

    public String possibleOutboundIpAddresses() {
        return this.innerModel().possibleOutboundIpAddresses();
    }

    public Integer containerSize() {
        return this.innerModel().containerSize();
    }

    public Integer dailyMemoryTimeQuota() {
        return this.innerModel().dailyMemoryTimeQuota();
    }

    public OffsetDateTime suspendedTill() {
        return this.innerModel().suspendedTill();
    }

    public Integer maxNumberOfWorkers() {
        return this.innerModel().maxNumberOfWorkers();
    }

    public CloningInfo cloningInfo() {
        return this.innerModel().cloningInfo();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public Boolean isDefaultContainer() {
        return this.innerModel().isDefaultContainer();
    }

    public String defaultHostname() {
        return this.innerModel().defaultHostname();
    }

    public SlotSwapStatus slotSwapStatus() {
        return this.innerModel().slotSwapStatus();
    }

    public Boolean httpsOnly() {
        return this.innerModel().httpsOnly();
    }

    public RedundancyMode redundancyMode() {
        return this.innerModel().redundancyMode();
    }

    public UUID inProgressOperationId() {
        return this.innerModel().inProgressOperationId();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SiteInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private SitePatchResourceInner updateSiteEnvelope;

    private String name;

    public SiteImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Site create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdate(resourceGroupName, name, innerObject, Context.NONE);
        return this;
    }

    public Site create(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getWebApps().createOrUpdate(resourceGroupName, name, innerObject, context);
        return this;
    }

    public SiteImpl(String name, WebSiteManager serviceManager) {
        this.innerObject = new SiteInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public SiteImpl update() {
        this.updateSiteEnvelope = new SitePatchResourceInner();
        return this;
    }

    public Site apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateWithResponse(resourceGroupName, name, updateSiteEnvelope, Context.NONE)
                .getValue();
        return this;
    }

    public Site apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateWithResponse(resourceGroupName, name, updateSiteEnvelope, context)
                .getValue();
        return this;
    }

    public SiteImpl(SiteInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
    }

    public Site refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
                .getValue();
        return this;
    }

    public Site refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getByResourceGroupWithResponse(resourceGroupName, name, context)
                .getValue();
        return this;
    }

    public SiteImpl withHyperV(Boolean hyperV) {
        this.innerModel().withHyperV(hyperV);
        return this;
    }

    public SiteImpl withServerFarmId(String serverFarmId) {
        if (isInCreateMode()) {
            this.innerModel().withServerFarmId(serverFarmId);
            return this;
        } else {
            this.updateSiteEnvelope.withServerFarmId(serverFarmId);
            return this;
        }
    }

    public SiteImpl withSiteConfig(SiteConfigInner siteConfig) {
        if (isInCreateMode()) {
            this.innerModel().withSiteConfig(siteConfig);
            return this;
        } else {
            this.updateSiteEnvelope.withSiteConfig(siteConfig);
            return this;
        }
    }

    public SiteImpl withReserved(Boolean reserved) {
        this.innerModel().withReserved(reserved);
        return this;
    }

    public SiteImpl withClientCertExclusionPaths(String clientCertExclusionPaths) {
        if (isInCreateMode()) {
            this.innerModel().withClientCertExclusionPaths(clientCertExclusionPaths);
            return this;
        } else {
            this.updateSiteEnvelope.withClientCertExclusionPaths(clientCertExclusionPaths);
            return this;
        }
    }

    public SiteImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateSiteEnvelope.withIdentity(identity);
            return this;
        }
    }

    public SiteImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateSiteEnvelope.withKind(kind);
            return this;
        }
    }

    public SiteImpl withContainerSize(Integer containerSize) {
        if (isInCreateMode()) {
            this.innerModel().withContainerSize(containerSize);
            return this;
        } else {
            this.updateSiteEnvelope.withContainerSize(containerSize);
            return this;
        }
    }

    public SiteImpl withHttpsOnly(Boolean httpsOnly) {
        if (isInCreateMode()) {
            this.innerModel().withHttpsOnly(httpsOnly);
            return this;
        } else {
            this.updateSiteEnvelope.withHttpsOnly(httpsOnly);
            return this;
        }
    }

    public SiteImpl withClientCertEnabled(Boolean clientCertEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withClientCertEnabled(clientCertEnabled);
            return this;
        } else {
            this.updateSiteEnvelope.withClientCertEnabled(clientCertEnabled);
            return this;
        }
    }

    public SiteImpl withRedundancyMode(RedundancyMode redundancyMode) {
        if (isInCreateMode()) {
            this.innerModel().withRedundancyMode(redundancyMode);
            return this;
        } else {
            this.updateSiteEnvelope.withRedundancyMode(redundancyMode);
            return this;
        }
    }

    public SiteImpl withHostNamesDisabled(Boolean hostNamesDisabled) {
        if (isInCreateMode()) {
            this.innerModel().withHostNamesDisabled(hostNamesDisabled);
            return this;
        } else {
            this.updateSiteEnvelope.withHostNamesDisabled(hostNamesDisabled);
            return this;
        }
    }

    public SiteImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SiteImpl withCloningInfo(CloningInfo cloningInfo) {
        this.innerModel().withCloningInfo(cloningInfo);
        return this;
    }

    public SiteImpl withHostnameSslStates(List<HostnameSslState> hostnameSslStates) {
        if (isInCreateMode()) {
            this.innerModel().withHostnameSslStates(hostnameSslStates);
            return this;
        } else {
            this.updateSiteEnvelope.withHostnameSslStates(hostnameSslStates);
            return this;
        }
    }

    public SiteImpl withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        if (isInCreateMode()) {
            this.innerModel().withDailyMemoryTimeQuota(dailyMemoryTimeQuota);
            return this;
        } else {
            this.updateSiteEnvelope.withDailyMemoryTimeQuota(dailyMemoryTimeQuota);
            return this;
        }
    }

    public SiteImpl withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withClientAffinityEnabled(clientAffinityEnabled);
            return this;
        } else {
            this.updateSiteEnvelope.withClientAffinityEnabled(clientAffinityEnabled);
            return this;
        }
    }

    public SiteImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SiteImpl withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.innerModel().withHostingEnvironmentProfile(hostingEnvironmentProfile);
        return this;
    }

    public SiteImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public SiteImpl withIsXenon(Boolean isXenon) {
        this.innerModel().withIsXenon(isXenon);
        return this;
    }

    public SiteImpl withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        if (isInCreateMode()) {
            this.innerModel().withScmSiteAlsoStopped(scmSiteAlsoStopped);
            return this;
        } else {
            this.updateSiteEnvelope.withScmSiteAlsoStopped(scmSiteAlsoStopped);
            return this;
        }
    }

    public SiteImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.innerModel().withEnabled(enabled);
            return this;
        } else {
            this.updateSiteEnvelope.withEnabled(enabled);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}