// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkConnectionInner;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VpnConnectionStatus;
import com.azure.resourcemanager.network.generated.models.VpnSiteLinkConnection;
import java.util.Collections;
import java.util.List;

public final class VpnSiteLinkConnectionImpl implements VpnSiteLinkConnection {
    private VpnSiteLinkConnectionInner innerObject;

    private final NetworkManager serviceManager;

    public VpnSiteLinkConnectionImpl(VpnSiteLinkConnectionInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SubResource vpnSiteLink() {
        return this.innerModel().vpnSiteLink();
    }

    public Integer routingWeight() {
        return this.innerModel().routingWeight();
    }

    public VpnConnectionStatus connectionStatus() {
        return this.innerModel().connectionStatus();
    }

    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.innerModel().vpnConnectionProtocolType();
    }

    public Long ingressBytesTransferred() {
        return this.innerModel().ingressBytesTransferred();
    }

    public Long egressBytesTransferred() {
        return this.innerModel().egressBytesTransferred();
    }

    public Integer connectionBandwidth() {
        return this.innerModel().connectionBandwidth();
    }

    public String sharedKey() {
        return this.innerModel().sharedKey();
    }

    public Boolean enableBgp() {
        return this.innerModel().enableBgp();
    }

    public Boolean usePolicyBasedTrafficSelectors() {
        return this.innerModel().usePolicyBasedTrafficSelectors();
    }

    public List<IpsecPolicy> ipsecPolicies() {
        List<IpsecPolicy> inner = this.innerModel().ipsecPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public Boolean enableRateLimiting() {
        return this.innerModel().enableRateLimiting();
    }

    public Boolean useLocalAzureIpAddress() {
        return this.innerModel().useLocalAzureIpAddress();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VpnSiteLinkConnectionInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}