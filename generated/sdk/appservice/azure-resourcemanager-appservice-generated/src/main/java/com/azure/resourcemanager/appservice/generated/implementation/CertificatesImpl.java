// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.CertificatesClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateInner;
import com.azure.resourcemanager.appservice.generated.models.Certificate;
import com.azure.resourcemanager.appservice.generated.models.Certificates;

public final class CertificatesImpl implements Certificates {
    private final CertificatesClient innerClient;

    private final WebSiteManager serviceManager;

    public CertificatesImpl(CertificatesClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Certificate> list() {
        PagedIterable<CertificateInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<Certificate> list(Context context) {
        PagedIterable<CertificateInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<Certificate> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CertificateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<Certificate> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CertificateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public Certificate getByResourceGroup(String resourceGroupName, String name) {
        CertificateInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new CertificateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Certificate> getByResourceGroupWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<CertificateInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, name, context);
    }

    private CertificatesClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    public CertificateImpl define(String name) {
        return new CertificateImpl(name, this.manager());
    }
}
