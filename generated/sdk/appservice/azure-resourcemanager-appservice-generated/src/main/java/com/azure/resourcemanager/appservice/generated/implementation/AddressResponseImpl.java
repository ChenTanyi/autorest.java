// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.AddressResponseInner;
import com.azure.resourcemanager.appservice.generated.models.AddressResponse;
import com.azure.resourcemanager.appservice.generated.models.VirtualIpMapping;
import java.util.Collections;
import java.util.List;

public final class AddressResponseImpl implements AddressResponse {
    private AddressResponseInner innerObject;

    private final WebSiteManager serviceManager;

    public AddressResponseImpl(AddressResponseInner innerObject, WebSiteManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String serviceIpAddress() {
        return this.innerModel().serviceIpAddress();
    }

    public String internalIpAddress() {
        return this.innerModel().internalIpAddress();
    }

    public List<String> outboundIpAddresses() {
        List<String> inner = this.innerModel().outboundIpAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<VirtualIpMapping> vipMappings() {
        List<VirtualIpMapping> inner = this.innerModel().vipMappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public AddressResponseInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
