// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.TopLevelDomainsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.TldLegalAgreementInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.TopLevelDomainInner;
import com.azure.resourcemanager.appservice.generated.models.TldLegalAgreement;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomain;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomainAgreementOption;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomains;

public final class TopLevelDomainsImpl implements TopLevelDomains {
    private final TopLevelDomainsClient innerClient;

    private final WebSiteManager serviceManager;

    public TopLevelDomainsImpl(TopLevelDomainsClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TopLevelDomain> list() {
        PagedIterable<TopLevelDomainInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new TopLevelDomainImpl(inner1, this.manager()));
    }

    public PagedIterable<TopLevelDomain> list(Context context) {
        PagedIterable<TopLevelDomainInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new TopLevelDomainImpl(inner1, this.manager()));
    }

    public TopLevelDomain get(String name) {
        TopLevelDomainInner inner = this.serviceClient().get(name);
        if (inner != null) {
            return new TopLevelDomainImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TopLevelDomain> getWithResponse(String name, Context context) {
        Response<TopLevelDomainInner> inner = this.serviceClient().getWithResponse(name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TopLevelDomainImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<TldLegalAgreement> listAgreements(String name, TopLevelDomainAgreementOption agreementOption) {
        PagedIterable<TldLegalAgreementInner> inner = this.serviceClient().listAgreements(name, agreementOption);
        return inner.mapPage(inner1 -> new TldLegalAgreementImpl(inner1, this.manager()));
    }

    public PagedIterable<TldLegalAgreement> listAgreements(
        String name, TopLevelDomainAgreementOption agreementOption, Context context) {
        PagedIterable<TldLegalAgreementInner> inner =
            this.serviceClient().listAgreements(name, agreementOption, context);
        return inner.mapPage(inner1 -> new TldLegalAgreementImpl(inner1, this.manager()));
    }

    private TopLevelDomainsClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
