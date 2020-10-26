// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.RecommendationsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.RecommendationInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.RecommendationRuleInner;
import com.azure.resourcemanager.appservice.generated.models.Recommendation;
import com.azure.resourcemanager.appservice.generated.models.RecommendationRule;
import com.azure.resourcemanager.appservice.generated.models.Recommendations;

public final class RecommendationsImpl implements Recommendations {
    private final RecommendationsClient innerClient;

    private final WebSiteManager serviceManager;

    public RecommendationsImpl(RecommendationsClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Recommendation> list() {
        PagedIterable<RecommendationInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<Recommendation> list(Boolean featured, String filter, Context context) {
        PagedIterable<RecommendationInner> inner = this.serviceClient().list(featured, filter, context);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public void resetAllFilters() {
        this.serviceClient().resetAllFilters();
    }

    public Response<Void> resetAllFiltersWithResponse(Context context) {
        return this.serviceClient().resetAllFiltersWithResponse(context);
    }

    public void disableRecommendationForSubscription(String name) {
        this.serviceClient().disableRecommendationForSubscription(name);
    }

    public Response<Void> disableRecommendationForSubscriptionWithResponse(String name, Context context) {
        return this.serviceClient().disableRecommendationForSubscriptionWithResponse(name, context);
    }

    public PagedIterable<Recommendation> listHistoryForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName) {
        PagedIterable<RecommendationInner> inner =
            this.serviceClient().listHistoryForHostingEnvironment(resourceGroupName, hostingEnvironmentName);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<Recommendation> listHistoryForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName, Boolean expiredOnly, String filter, Context context) {
        PagedIterable<RecommendationInner> inner =
            this
                .serviceClient()
                .listHistoryForHostingEnvironment(
                    resourceGroupName, hostingEnvironmentName, expiredOnly, filter, context);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<Recommendation> listRecommendedRulesForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName) {
        PagedIterable<RecommendationInner> inner =
            this.serviceClient().listRecommendedRulesForHostingEnvironment(resourceGroupName, hostingEnvironmentName);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<Recommendation> listRecommendedRulesForHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName, Boolean featured, String filter, Context context) {
        PagedIterable<RecommendationInner> inner =
            this
                .serviceClient()
                .listRecommendedRulesForHostingEnvironment(
                    resourceGroupName, hostingEnvironmentName, featured, filter, context);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public void disableAllForHostingEnvironment(
        String resourceGroupName, String environmentName, String hostingEnvironmentName) {
        this
            .serviceClient()
            .disableAllForHostingEnvironment(resourceGroupName, environmentName, hostingEnvironmentName);
    }

    public Response<Void> disableAllForHostingEnvironmentWithResponse(
        String resourceGroupName, String environmentName, String hostingEnvironmentName, Context context) {
        return this
            .serviceClient()
            .disableAllForHostingEnvironmentWithResponse(
                resourceGroupName, environmentName, hostingEnvironmentName, context);
    }

    public void resetAllFiltersForHostingEnvironment(
        String resourceGroupName, String environmentName, String hostingEnvironmentName) {
        this
            .serviceClient()
            .resetAllFiltersForHostingEnvironment(resourceGroupName, environmentName, hostingEnvironmentName);
    }

    public Response<Void> resetAllFiltersForHostingEnvironmentWithResponse(
        String resourceGroupName, String environmentName, String hostingEnvironmentName, Context context) {
        return this
            .serviceClient()
            .resetAllFiltersForHostingEnvironmentWithResponse(
                resourceGroupName, environmentName, hostingEnvironmentName, context);
    }

    public RecommendationRule getRuleDetailsByHostingEnvironment(
        String resourceGroupName, String hostingEnvironmentName, String name) {
        RecommendationRuleInner inner =
            this.serviceClient().getRuleDetailsByHostingEnvironment(resourceGroupName, hostingEnvironmentName, name);
        if (inner != null) {
            return new RecommendationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecommendationRule> getRuleDetailsByHostingEnvironmentWithResponse(
        String resourceGroupName,
        String hostingEnvironmentName,
        String name,
        Boolean updateSeen,
        String recommendationId,
        Context context) {
        Response<RecommendationRuleInner> inner =
            this
                .serviceClient()
                .getRuleDetailsByHostingEnvironmentWithResponse(
                    resourceGroupName, hostingEnvironmentName, name, updateSeen, recommendationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecommendationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void disableRecommendationForHostingEnvironment(
        String resourceGroupName, String environmentName, String name, String hostingEnvironmentName) {
        this
            .serviceClient()
            .disableRecommendationForHostingEnvironment(
                resourceGroupName, environmentName, name, hostingEnvironmentName);
    }

    public Response<Void> disableRecommendationForHostingEnvironmentWithResponse(
        String resourceGroupName, String environmentName, String name, String hostingEnvironmentName, Context context) {
        return this
            .serviceClient()
            .disableRecommendationForHostingEnvironmentWithResponse(
                resourceGroupName, environmentName, name, hostingEnvironmentName, context);
    }

    public PagedIterable<Recommendation> listHistoryForWebApp(String resourceGroupName, String siteName) {
        PagedIterable<RecommendationInner> inner =
            this.serviceClient().listHistoryForWebApp(resourceGroupName, siteName);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<Recommendation> listHistoryForWebApp(
        String resourceGroupName, String siteName, Boolean expiredOnly, String filter, Context context) {
        PagedIterable<RecommendationInner> inner =
            this.serviceClient().listHistoryForWebApp(resourceGroupName, siteName, expiredOnly, filter, context);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<Recommendation> listRecommendedRulesForWebApp(String resourceGroupName, String siteName) {
        PagedIterable<RecommendationInner> inner =
            this.serviceClient().listRecommendedRulesForWebApp(resourceGroupName, siteName);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<Recommendation> listRecommendedRulesForWebApp(
        String resourceGroupName, String siteName, Boolean featured, String filter, Context context) {
        PagedIterable<RecommendationInner> inner =
            this.serviceClient().listRecommendedRulesForWebApp(resourceGroupName, siteName, featured, filter, context);
        return inner.mapPage(inner1 -> new RecommendationImpl(inner1, this.manager()));
    }

    public void disableAllForWebApp(String resourceGroupName, String siteName) {
        this.serviceClient().disableAllForWebApp(resourceGroupName, siteName);
    }

    public Response<Void> disableAllForWebAppWithResponse(String resourceGroupName, String siteName, Context context) {
        return this.serviceClient().disableAllForWebAppWithResponse(resourceGroupName, siteName, context);
    }

    public void resetAllFiltersForWebApp(String resourceGroupName, String siteName) {
        this.serviceClient().resetAllFiltersForWebApp(resourceGroupName, siteName);
    }

    public Response<Void> resetAllFiltersForWebAppWithResponse(
        String resourceGroupName, String siteName, Context context) {
        return this.serviceClient().resetAllFiltersForWebAppWithResponse(resourceGroupName, siteName, context);
    }

    public RecommendationRule getRuleDetailsByWebApp(String resourceGroupName, String siteName, String name) {
        RecommendationRuleInner inner = this.serviceClient().getRuleDetailsByWebApp(resourceGroupName, siteName, name);
        if (inner != null) {
            return new RecommendationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecommendationRule> getRuleDetailsByWebAppWithResponse(
        String resourceGroupName,
        String siteName,
        String name,
        Boolean updateSeen,
        String recommendationId,
        Context context) {
        Response<RecommendationRuleInner> inner =
            this
                .serviceClient()
                .getRuleDetailsByWebAppWithResponse(
                    resourceGroupName, siteName, name, updateSeen, recommendationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecommendationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void disableRecommendationForSite(String resourceGroupName, String siteName, String name) {
        this.serviceClient().disableRecommendationForSite(resourceGroupName, siteName, name);
    }

    public Response<Void> disableRecommendationForSiteWithResponse(
        String resourceGroupName, String siteName, String name, Context context) {
        return this
            .serviceClient()
            .disableRecommendationForSiteWithResponse(resourceGroupName, siteName, name, context);
    }

    private RecommendationsClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
