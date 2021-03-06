// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration settings of the HTTP requests for authentication and authorization requests made against App
 * Service Authentication/Authorization.
 */
@JsonFlatten
@Fluent
public class HttpSettings extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HttpSettings.class);

    /*
     * <code>false</code> if the authentication/authorization responses not
     * having the HTTPS scheme are permissible; otherwise, <code>true</code>.
     */
    @JsonProperty(value = "properties.requireHttps")
    private Boolean requireHttps;

    /*
     * The configuration settings of the paths HTTP requests.
     */
    @JsonProperty(value = "properties.routes")
    private HttpSettingsRoutes routes;

    /*
     * The configuration settings of a forward proxy used to make the requests.
     */
    @JsonProperty(value = "properties.forwardProxy")
    private ForwardProxy forwardProxy;

    /**
     * Get the requireHttps property: &lt;code&gt;false&lt;/code&gt; if the authentication/authorization responses not
     * having the HTTPS scheme are permissible; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the requireHttps value.
     */
    public Boolean requireHttps() {
        return this.requireHttps;
    }

    /**
     * Set the requireHttps property: &lt;code&gt;false&lt;/code&gt; if the authentication/authorization responses not
     * having the HTTPS scheme are permissible; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param requireHttps the requireHttps value to set.
     * @return the HttpSettings object itself.
     */
    public HttpSettings withRequireHttps(Boolean requireHttps) {
        this.requireHttps = requireHttps;
        return this;
    }

    /**
     * Get the routes property: The configuration settings of the paths HTTP requests.
     *
     * @return the routes value.
     */
    public HttpSettingsRoutes routes() {
        return this.routes;
    }

    /**
     * Set the routes property: The configuration settings of the paths HTTP requests.
     *
     * @param routes the routes value to set.
     * @return the HttpSettings object itself.
     */
    public HttpSettings withRoutes(HttpSettingsRoutes routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the forwardProxy property: The configuration settings of a forward proxy used to make the requests.
     *
     * @return the forwardProxy value.
     */
    public ForwardProxy forwardProxy() {
        return this.forwardProxy;
    }

    /**
     * Set the forwardProxy property: The configuration settings of a forward proxy used to make the requests.
     *
     * @param forwardProxy the forwardProxy value to set.
     * @return the HttpSettings object itself.
     */
    public HttpSettings withForwardProxy(ForwardProxy forwardProxy) {
        this.forwardProxy = forwardProxy;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpSettings withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (routes() != null) {
            routes().validate();
        }
        if (forwardProxy() != null) {
            forwardProxy().validate();
        }
    }
}
