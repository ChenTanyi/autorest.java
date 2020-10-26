// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.BgpServiceCommunitiesClient;
import com.azure.resourcemanager.network.generated.fluent.models.BgpServiceCommunityInner;
import com.azure.resourcemanager.network.generated.models.BgpServiceCommunities;
import com.azure.resourcemanager.network.generated.models.BgpServiceCommunity;

public final class BgpServiceCommunitiesImpl implements BgpServiceCommunities {
    private final BgpServiceCommunitiesClient innerClient;

    private final NetworkManager serviceManager;

    public BgpServiceCommunitiesImpl(BgpServiceCommunitiesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BgpServiceCommunity> list() {
        PagedIterable<BgpServiceCommunityInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new BgpServiceCommunityImpl(inner1, this.manager()));
    }

    public PagedIterable<BgpServiceCommunity> list(Context context) {
        PagedIterable<BgpServiceCommunityInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new BgpServiceCommunityImpl(inner1, this.manager()));
    }

    private BgpServiceCommunitiesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}