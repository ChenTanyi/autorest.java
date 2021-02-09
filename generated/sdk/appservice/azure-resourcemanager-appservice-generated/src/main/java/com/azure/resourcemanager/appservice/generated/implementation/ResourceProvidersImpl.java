// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppserviceGithubTokenInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.BillingMeterInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentLocationsInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.GeoRegionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.IdentifierInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.PremierAddOnOfferInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceNameAvailabilityInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SkuInfosInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SourceControlInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.UserInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.ValidateResponseInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetValidationFailureDetailsInner;
import com.azure.resourcemanager.appservice.generated.models.AppserviceGithubToken;
import com.azure.resourcemanager.appservice.generated.models.AppserviceGithubTokenRequest;
import com.azure.resourcemanager.appservice.generated.models.BillingMeter;
import com.azure.resourcemanager.appservice.generated.models.CsmMoveResourceEnvelope;
import com.azure.resourcemanager.appservice.generated.models.DeploymentLocations;
import com.azure.resourcemanager.appservice.generated.models.GeoRegion;
import com.azure.resourcemanager.appservice.generated.models.Identifier;
import com.azure.resourcemanager.appservice.generated.models.PremierAddOnOffer;
import com.azure.resourcemanager.appservice.generated.models.ResourceNameAvailability;
import com.azure.resourcemanager.appservice.generated.models.ResourceNameAvailabilityRequest;
import com.azure.resourcemanager.appservice.generated.models.ResourceProviders;
import com.azure.resourcemanager.appservice.generated.models.SkuInfos;
import com.azure.resourcemanager.appservice.generated.models.SkuName;
import com.azure.resourcemanager.appservice.generated.models.SourceControl;
import com.azure.resourcemanager.appservice.generated.models.User;
import com.azure.resourcemanager.appservice.generated.models.ValidateRequest;
import com.azure.resourcemanager.appservice.generated.models.ValidateResponse;
import com.azure.resourcemanager.appservice.generated.models.VnetParameters;
import com.azure.resourcemanager.appservice.generated.models.VnetValidationFailureDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final WebSiteManager serviceManager;

    public ResourceProvidersImpl(ResourceProvidersClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AppserviceGithubToken generateGithubAccessTokenForAppserviceCliAsync(AppserviceGithubTokenRequest request) {
        AppserviceGithubTokenInner inner = this.serviceClient().generateGithubAccessTokenForAppserviceCliAsync(request);
        if (inner != null) {
            return new AppserviceGithubTokenImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AppserviceGithubToken> generateGithubAccessTokenForAppserviceCliAsyncWithResponse(
        AppserviceGithubTokenRequest request, Context context) {
        Response<AppserviceGithubTokenInner> inner =
            this.serviceClient().generateGithubAccessTokenForAppserviceCliAsyncWithResponse(request, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AppserviceGithubTokenImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public User getPublishingUser() {
        UserInner inner = this.serviceClient().getPublishingUser();
        if (inner != null) {
            return new UserImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<User> getPublishingUserWithResponse(Context context) {
        Response<UserInner> inner = this.serviceClient().getPublishingUserWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UserImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public User updatePublishingUser(UserInner userDetails) {
        UserInner inner = this.serviceClient().updatePublishingUser(userDetails);
        if (inner != null) {
            return new UserImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<User> updatePublishingUserWithResponse(UserInner userDetails, Context context) {
        Response<UserInner> inner = this.serviceClient().updatePublishingUserWithResponse(userDetails, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UserImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SourceControl> listSourceControls() {
        PagedIterable<SourceControlInner> inner = this.serviceClient().listSourceControls();
        return Utils.mapPage(inner, inner1 -> new SourceControlImpl(inner1, this.manager()));
    }

    public PagedIterable<SourceControl> listSourceControls(Context context) {
        PagedIterable<SourceControlInner> inner = this.serviceClient().listSourceControls(context);
        return Utils.mapPage(inner, inner1 -> new SourceControlImpl(inner1, this.manager()));
    }

    public SourceControl getSourceControl(String sourceControlType) {
        SourceControlInner inner = this.serviceClient().getSourceControl(sourceControlType);
        if (inner != null) {
            return new SourceControlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SourceControl> getSourceControlWithResponse(String sourceControlType, Context context) {
        Response<SourceControlInner> inner =
            this.serviceClient().getSourceControlWithResponse(sourceControlType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SourceControlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SourceControl updateSourceControl(String sourceControlType, SourceControlInner requestMessage) {
        SourceControlInner inner = this.serviceClient().updateSourceControl(sourceControlType, requestMessage);
        if (inner != null) {
            return new SourceControlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SourceControl> updateSourceControlWithResponse(
        String sourceControlType, SourceControlInner requestMessage, Context context) {
        Response<SourceControlInner> inner =
            this.serviceClient().updateSourceControlWithResponse(sourceControlType, requestMessage, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SourceControlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<BillingMeter> list() {
        PagedIterable<BillingMeterInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new BillingMeterImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingMeter> list(String billingLocation, String osType, Context context) {
        PagedIterable<BillingMeterInner> inner = this.serviceClient().list(billingLocation, osType, context);
        return Utils.mapPage(inner, inner1 -> new BillingMeterImpl(inner1, this.manager()));
    }

    public ResourceNameAvailability checkNameAvailability(ResourceNameAvailabilityRequest request) {
        ResourceNameAvailabilityInner inner = this.serviceClient().checkNameAvailability(request);
        if (inner != null) {
            return new ResourceNameAvailabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceNameAvailability> checkNameAvailabilityWithResponse(
        ResourceNameAvailabilityRequest request, Context context) {
        Response<ResourceNameAvailabilityInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(request, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceNameAvailabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeploymentLocations getSubscriptionDeploymentLocations() {
        DeploymentLocationsInner inner = this.serviceClient().getSubscriptionDeploymentLocations();
        if (inner != null) {
            return new DeploymentLocationsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentLocations> getSubscriptionDeploymentLocationsWithResponse(Context context) {
        Response<DeploymentLocationsInner> inner =
            this.serviceClient().getSubscriptionDeploymentLocationsWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentLocationsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<GeoRegion> listGeoRegions() {
        PagedIterable<GeoRegionInner> inner = this.serviceClient().listGeoRegions();
        return Utils.mapPage(inner, inner1 -> new GeoRegionImpl(inner1, this.manager()));
    }

    public PagedIterable<GeoRegion> listGeoRegions(
        SkuName sku,
        Boolean linuxWorkersEnabled,
        Boolean xenonWorkersEnabled,
        Boolean linuxDynamicWorkersEnabled,
        Context context) {
        PagedIterable<GeoRegionInner> inner =
            this
                .serviceClient()
                .listGeoRegions(sku, linuxWorkersEnabled, xenonWorkersEnabled, linuxDynamicWorkersEnabled, context);
        return Utils.mapPage(inner, inner1 -> new GeoRegionImpl(inner1, this.manager()));
    }

    public PagedIterable<Identifier> listSiteIdentifiersAssignedToHostname(NameIdentifierInner nameIdentifier) {
        PagedIterable<IdentifierInner> inner =
            this.serviceClient().listSiteIdentifiersAssignedToHostname(nameIdentifier);
        return Utils.mapPage(inner, inner1 -> new IdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<Identifier> listSiteIdentifiersAssignedToHostname(
        NameIdentifierInner nameIdentifier, Context context) {
        PagedIterable<IdentifierInner> inner =
            this.serviceClient().listSiteIdentifiersAssignedToHostname(nameIdentifier, context);
        return Utils.mapPage(inner, inner1 -> new IdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<PremierAddOnOffer> listPremierAddOnOffers() {
        PagedIterable<PremierAddOnOfferInner> inner = this.serviceClient().listPremierAddOnOffers();
        return Utils.mapPage(inner, inner1 -> new PremierAddOnOfferImpl(inner1, this.manager()));
    }

    public PagedIterable<PremierAddOnOffer> listPremierAddOnOffers(Context context) {
        PagedIterable<PremierAddOnOfferInner> inner = this.serviceClient().listPremierAddOnOffers(context);
        return Utils.mapPage(inner, inner1 -> new PremierAddOnOfferImpl(inner1, this.manager()));
    }

    public SkuInfos listSkus() {
        SkuInfosInner inner = this.serviceClient().listSkus();
        if (inner != null) {
            return new SkuInfosImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SkuInfos> listSkusWithResponse(Context context) {
        Response<SkuInfosInner> inner = this.serviceClient().listSkusWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SkuInfosImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VnetValidationFailureDetails verifyHostingEnvironmentVnet(VnetParameters parameters) {
        VnetValidationFailureDetailsInner inner = this.serviceClient().verifyHostingEnvironmentVnet(parameters);
        if (inner != null) {
            return new VnetValidationFailureDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VnetValidationFailureDetails> verifyHostingEnvironmentVnetWithResponse(
        VnetParameters parameters, Context context) {
        Response<VnetValidationFailureDetailsInner> inner =
            this.serviceClient().verifyHostingEnvironmentVnetWithResponse(parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VnetValidationFailureDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void move(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope) {
        this.serviceClient().move(resourceGroupName, moveResourceEnvelope);
    }

    public Response<Void> moveWithResponse(
        String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope, Context context) {
        return this.serviceClient().moveWithResponse(resourceGroupName, moveResourceEnvelope, context);
    }

    public ValidateResponse validate(String resourceGroupName, ValidateRequest validateRequest) {
        ValidateResponseInner inner = this.serviceClient().validate(resourceGroupName, validateRequest);
        if (inner != null) {
            return new ValidateResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateResponse> validateWithResponse(
        String resourceGroupName, ValidateRequest validateRequest, Context context) {
        Response<ValidateResponseInner> inner =
            this.serviceClient().validateWithResponse(resourceGroupName, validateRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void validateMove(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope) {
        this.serviceClient().validateMove(resourceGroupName, moveResourceEnvelope);
    }

    public Response<Void> validateMoveWithResponse(
        String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope, Context context) {
        return this.serviceClient().validateMoveWithResponse(resourceGroupName, moveResourceEnvelope, context);
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
