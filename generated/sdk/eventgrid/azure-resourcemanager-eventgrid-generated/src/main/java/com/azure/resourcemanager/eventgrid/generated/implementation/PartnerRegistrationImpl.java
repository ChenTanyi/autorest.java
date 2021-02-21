// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.EventGridManager;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerRegistrationInner;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistration;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationUpdateParameters;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationVisibilityState;
import com.azure.resourcemanager.eventgrid.generated.models.SystemData;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PartnerRegistrationImpl
    implements PartnerRegistration, PartnerRegistration.Definition, PartnerRegistration.Update {
    private PartnerRegistrationInner innerObject;

    private final EventGridManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public PartnerRegistrationProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String partnerName() {
        return this.innerModel().partnerName();
    }

    public String partnerResourceTypeName() {
        return this.innerModel().partnerResourceTypeName();
    }

    public String partnerResourceTypeDisplayName() {
        return this.innerModel().partnerResourceTypeDisplayName();
    }

    public String partnerResourceTypeDescription() {
        return this.innerModel().partnerResourceTypeDescription();
    }

    public String longDescription() {
        return this.innerModel().longDescription();
    }

    public String partnerCustomerServiceNumber() {
        return this.innerModel().partnerCustomerServiceNumber();
    }

    public String partnerCustomerServiceExtension() {
        return this.innerModel().partnerCustomerServiceExtension();
    }

    public String customerServiceUri() {
        return this.innerModel().customerServiceUri();
    }

    public String setupUri() {
        return this.innerModel().setupUri();
    }

    public String logoUri() {
        return this.innerModel().logoUri();
    }

    public PartnerRegistrationVisibilityState visibilityState() {
        return this.innerModel().visibilityState();
    }

    public List<String> authorizedAzureSubscriptionIds() {
        List<String> inner = this.innerModel().authorizedAzureSubscriptionIds();
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

    public PartnerRegistrationInner innerModel() {
        return this.innerObject;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String partnerRegistrationName;

    private PartnerRegistrationUpdateParameters updatePartnerRegistrationUpdateParameters;

    public PartnerRegistrationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PartnerRegistration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerRegistrations()
                .createOrUpdateWithResponse(resourceGroupName, partnerRegistrationName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PartnerRegistration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerRegistrations()
                .createOrUpdateWithResponse(resourceGroupName, partnerRegistrationName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PartnerRegistrationImpl(String name, EventGridManager serviceManager) {
        this.innerObject = new PartnerRegistrationInner();
        this.serviceManager = serviceManager;
        this.partnerRegistrationName = name;
    }

    public PartnerRegistrationImpl update() {
        this.updatePartnerRegistrationUpdateParameters = new PartnerRegistrationUpdateParameters();
        return this;
    }

    public PartnerRegistration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerRegistrations()
                .updateWithResponse(
                    resourceGroupName, partnerRegistrationName, updatePartnerRegistrationUpdateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public PartnerRegistration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerRegistrations()
                .updateWithResponse(
                    resourceGroupName, partnerRegistrationName, updatePartnerRegistrationUpdateParameters, context)
                .getValue();
        return this;
    }

    PartnerRegistrationImpl(PartnerRegistrationInner innerObject, EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.partnerRegistrationName = Utils.getValueFromIdByName(innerObject.id(), "partnerRegistrations");
    }

    public PartnerRegistration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerRegistrations()
                .getByResourceGroupWithResponse(resourceGroupName, partnerRegistrationName, Context.NONE)
                .getValue();
        return this;
    }

    public PartnerRegistration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerRegistrations()
                .getByResourceGroupWithResponse(resourceGroupName, partnerRegistrationName, context)
                .getValue();
        return this;
    }

    public PartnerRegistrationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PartnerRegistrationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PartnerRegistrationImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePartnerRegistrationUpdateParameters.withTags(tags);
            return this;
        }
    }

    public PartnerRegistrationImpl withPartnerName(String partnerName) {
        this.innerModel().withPartnerName(partnerName);
        return this;
    }

    public PartnerRegistrationImpl withPartnerResourceTypeName(String partnerResourceTypeName) {
        this.innerModel().withPartnerResourceTypeName(partnerResourceTypeName);
        return this;
    }

    public PartnerRegistrationImpl withPartnerResourceTypeDisplayName(String partnerResourceTypeDisplayName) {
        this.innerModel().withPartnerResourceTypeDisplayName(partnerResourceTypeDisplayName);
        return this;
    }

    public PartnerRegistrationImpl withPartnerResourceTypeDescription(String partnerResourceTypeDescription) {
        this.innerModel().withPartnerResourceTypeDescription(partnerResourceTypeDescription);
        return this;
    }

    public PartnerRegistrationImpl withLongDescription(String longDescription) {
        this.innerModel().withLongDescription(longDescription);
        return this;
    }

    public PartnerRegistrationImpl withPartnerCustomerServiceNumber(String partnerCustomerServiceNumber) {
        this.innerModel().withPartnerCustomerServiceNumber(partnerCustomerServiceNumber);
        return this;
    }

    public PartnerRegistrationImpl withPartnerCustomerServiceExtension(String partnerCustomerServiceExtension) {
        this.innerModel().withPartnerCustomerServiceExtension(partnerCustomerServiceExtension);
        return this;
    }

    public PartnerRegistrationImpl withCustomerServiceUri(String customerServiceUri) {
        this.innerModel().withCustomerServiceUri(customerServiceUri);
        return this;
    }

    public PartnerRegistrationImpl withSetupUri(String setupUri) {
        if (isInCreateMode()) {
            this.innerModel().withSetupUri(setupUri);
            return this;
        } else {
            this.updatePartnerRegistrationUpdateParameters.withSetupUri(setupUri);
            return this;
        }
    }

    public PartnerRegistrationImpl withLogoUri(String logoUri) {
        if (isInCreateMode()) {
            this.innerModel().withLogoUri(logoUri);
            return this;
        } else {
            this.updatePartnerRegistrationUpdateParameters.withLogoUri(logoUri);
            return this;
        }
    }

    public PartnerRegistrationImpl withVisibilityState(PartnerRegistrationVisibilityState visibilityState) {
        this.innerModel().withVisibilityState(visibilityState);
        return this;
    }

    public PartnerRegistrationImpl withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds) {
        if (isInCreateMode()) {
            this.innerModel().withAuthorizedAzureSubscriptionIds(authorizedAzureSubscriptionIds);
            return this;
        } else {
            this
                .updatePartnerRegistrationUpdateParameters
                .withAuthorizedAzureSubscriptionIds(authorizedAzureSubscriptionIds);
            return this;
        }
    }

    public PartnerRegistrationImpl withPartnerTopicTypeName(String partnerTopicTypeName) {
        this.updatePartnerRegistrationUpdateParameters.withPartnerTopicTypeName(partnerTopicTypeName);
        return this;
    }

    public PartnerRegistrationImpl withPartnerTopicTypeDisplayName(String partnerTopicTypeDisplayName) {
        this.updatePartnerRegistrationUpdateParameters.withPartnerTopicTypeDisplayName(partnerTopicTypeDisplayName);
        return this;
    }

    public PartnerRegistrationImpl withPartnerTopicTypeDescription(String partnerTopicTypeDescription) {
        this.updatePartnerRegistrationUpdateParameters.withPartnerTopicTypeDescription(partnerTopicTypeDescription);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}