package com.azure;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestBase;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.resourcemanager.resources.generated.ResourceManager;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public class Base extends TestBase {
    private static final String HTTPS_PROXY_HOST = "https.proxyHost";
    private static final String HTTPS_PROXY_PORT = "https.proxyPort";
    private static final String HTTP_PROXY_HOST = "http.proxyHost";
    private static final String HTTP_PROXY_PORT = "http.proxyPort";
    private static final String USE_SYSTEM_PROXY = "java.net.useSystemProxies";
    private static final String VALUE_TRUE = "true";

    protected TokenCredential credential;
    protected AzureProfile profile;
    protected HttpClient client;
    protected ResourceManager resourceManager;
    protected String rgName;

    @Override
    protected void beforeTest() {
        super.beforeTest();
        credential = new EnvironmentCredentialBuilder().build();
        profile = new AzureProfile(AzureEnvironment.AZURE);
        client = generateHttpClientWithProxy(null, null);
        resourceManager = ResourceManager.configure().withHttpClient(client).authenticate(credential, profile);
        rgName = randomString("rg", 15);
    }

    @Override
    protected void afterTest() {
        super.afterTest();
        try {
            resourceManager.serviceClient().getResourceGroups().beginDelete(rgName);
        } catch (Exception e) {
        }
    }

    protected String randomString(String prefix, int length) {
        StringBuilder randomString = new StringBuilder();
        while (randomString.length() < length) {
            randomString.append(UUID.randomUUID().toString().replace("-", ""));
        }
        return prefix + randomString.substring(0, length - prefix.length());
    }

    protected HttpClient generateHttpClientWithProxy(NettyAsyncHttpClientBuilder clientBuilder, ProxyOptions proxyOptions) {
        if (clientBuilder == null) {
            clientBuilder = new NettyAsyncHttpClientBuilder();
        }
        if (proxyOptions != null) {
            clientBuilder.proxy(proxyOptions);
        } else {
            try {
                System.setProperty(USE_SYSTEM_PROXY, VALUE_TRUE);
                List<Proxy> proxies = ProxySelector.getDefault().select(new URI(AzureEnvironment.AZURE.getResourceManagerEndpoint()));
                if (!proxies.isEmpty()) {
                    for (Proxy proxy : proxies) {
                        if (proxy.address() instanceof InetSocketAddress) {
                            String host = ((InetSocketAddress) proxy.address()).getHostName();
                            int port = ((InetSocketAddress) proxy.address()).getPort();
                            switch (proxy.type()) {
                                case HTTP:
                                    return clientBuilder.proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress(host, port))).build();
                                case SOCKS:
                                    return clientBuilder.proxy(new ProxyOptions(ProxyOptions.Type.SOCKS5, new InetSocketAddress(host, port))).build();
                                default:
                            }
                        }
                    }
                }
                String host = null;
                int port = 0;
                if (System.getProperty(HTTPS_PROXY_HOST) != null && System.getProperty(HTTPS_PROXY_PORT) != null) {
                    host = System.getProperty(HTTPS_PROXY_HOST);
                    port = Integer.parseInt(System.getProperty(HTTPS_PROXY_PORT));
                } else if (System.getProperty(HTTP_PROXY_HOST) != null && System.getProperty(HTTP_PROXY_PORT) != null) {
                    host = System.getProperty(HTTP_PROXY_HOST);
                    port = Integer.parseInt(System.getProperty(HTTP_PROXY_PORT));
                }
                if (host != null) {
                    clientBuilder.proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress(host, port)));
                }
            } catch (URISyntaxException e) { }
        }
        return clientBuilder.build();
    }
}