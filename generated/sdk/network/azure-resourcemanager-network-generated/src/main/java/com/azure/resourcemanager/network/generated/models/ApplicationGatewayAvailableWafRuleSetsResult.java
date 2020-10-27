// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayAvailableWafRuleSetsResultInner;
import java.util.List;

/** An immutable client-side representation of ApplicationGatewayAvailableWafRuleSetsResult. */
@Immutable
public interface ApplicationGatewayAvailableWafRuleSetsResult {
    /**
     * Gets the value property: The list of application gateway rule sets.
     *
     * @return the value value.
     */
    List<ApplicationGatewayFirewallRuleSet> value();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayAvailableWafRuleSetsResultInner
     * object.
     *
     * @return the inner object.
     */
    ApplicationGatewayAvailableWafRuleSetsResultInner innerModel();
}