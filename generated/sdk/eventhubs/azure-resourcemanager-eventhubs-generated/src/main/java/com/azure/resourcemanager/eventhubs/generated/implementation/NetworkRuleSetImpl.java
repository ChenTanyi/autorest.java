// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.resourcemanager.eventhubs.generated.EventHubManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetInner;
import com.azure.resourcemanager.eventhubs.generated.models.DefaultAction;
import com.azure.resourcemanager.eventhubs.generated.models.NWRuleSetIpRules;
import com.azure.resourcemanager.eventhubs.generated.models.NWRuleSetVirtualNetworkRules;
import com.azure.resourcemanager.eventhubs.generated.models.NetworkRuleSet;
import java.util.Collections;
import java.util.List;

public final class NetworkRuleSetImpl implements NetworkRuleSet {
    private NetworkRuleSetInner innerObject;

    private final EventHubManager serviceManager;

    public NetworkRuleSetImpl(NetworkRuleSetInner innerObject, EventHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Boolean trustedServiceAccessEnabled() {
        return this.innerModel().trustedServiceAccessEnabled();
    }

    public DefaultAction defaultAction() {
        return this.innerModel().defaultAction();
    }

    public List<NWRuleSetVirtualNetworkRules> virtualNetworkRules() {
        List<NWRuleSetVirtualNetworkRules> inner = this.innerModel().virtualNetworkRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<NWRuleSetIpRules> ipRules() {
        List<NWRuleSetIpRules> inner = this.innerModel().ipRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public NetworkRuleSetInner innerModel() {
        return this.innerObject;
    }

    private EventHubManager manager() {
        return this.serviceManager;
    }
}