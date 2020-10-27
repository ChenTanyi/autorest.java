// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.implementation;

import com.azure.resourcemanager.dns.generated.DnsManager;
import com.azure.resourcemanager.dns.generated.fluent.models.DnsResourceReferenceResultInner;
import com.azure.resourcemanager.dns.generated.models.DnsResourceReference;
import com.azure.resourcemanager.dns.generated.models.DnsResourceReferenceResult;
import java.util.Collections;
import java.util.List;

public final class DnsResourceReferenceResultImpl implements DnsResourceReferenceResult {
    private DnsResourceReferenceResultInner innerObject;

    private final DnsManager serviceManager;

    public DnsResourceReferenceResultImpl(DnsResourceReferenceResultInner innerObject, DnsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<DnsResourceReference> dnsResourceReferences() {
        List<DnsResourceReference> inner = this.innerModel().dnsResourceReferences();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public DnsResourceReferenceResultInner innerModel() {
        return this.innerObject;
    }

    private DnsManager manager() {
        return this.serviceManager;
    }
}
