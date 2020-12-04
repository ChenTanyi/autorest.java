// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.resourcemanager.iothub.generated.IotHubManager;
import com.azure.resourcemanager.iothub.generated.fluent.models.CertificateDescriptionInner;
import com.azure.resourcemanager.iothub.generated.fluent.models.CertificateListDescriptionInner;
import com.azure.resourcemanager.iothub.generated.models.CertificateDescription;
import com.azure.resourcemanager.iothub.generated.models.CertificateListDescription;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class CertificateListDescriptionImpl implements CertificateListDescription {
    private CertificateListDescriptionInner innerObject;

    private final IotHubManager serviceManager;

    CertificateListDescriptionImpl(CertificateListDescriptionInner innerObject, IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<CertificateDescription> value() {
        List<CertificateDescriptionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new CertificateDescriptionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public CertificateListDescriptionInner innerModel() {
        return this.innerObject;
    }

    private IotHubManager manager() {
        return this.serviceManager;
    }
}
