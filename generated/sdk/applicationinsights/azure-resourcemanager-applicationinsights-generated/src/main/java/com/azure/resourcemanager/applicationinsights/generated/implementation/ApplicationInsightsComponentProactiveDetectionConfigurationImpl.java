// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentProactiveDetectionConfigurationInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentProactiveDetectionConfiguration;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions;
import java.util.Collections;
import java.util.List;

public final class ApplicationInsightsComponentProactiveDetectionConfigurationImpl
    implements ApplicationInsightsComponentProactiveDetectionConfiguration {
    private ApplicationInsightsComponentProactiveDetectionConfigurationInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    ApplicationInsightsComponentProactiveDetectionConfigurationImpl(
        ApplicationInsightsComponentProactiveDetectionConfigurationInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public Boolean sendEmailsToSubscriptionOwners() {
        return this.innerModel().sendEmailsToSubscriptionOwners();
    }

    public List<String> customEmails() {
        List<String> inner = this.innerModel().customEmails();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String lastUpdatedTime() {
        return this.innerModel().lastUpdatedTime();
    }

    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions ruleDefinitions() {
        return this.innerModel().ruleDefinitions();
    }

    public ApplicationInsightsComponentProactiveDetectionConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}