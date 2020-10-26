// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentInner;
import com.azure.resourcemanager.appservice.generated.models.Deployment;
import java.time.OffsetDateTime;

public final class DeploymentImpl implements Deployment, Deployment.Definition {
    private DeploymentInner innerObject;

    private final WebSiteManager serviceManager;

    public DeploymentImpl(DeploymentInner innerObject, WebSiteManager serviceManager) {
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

    public Integer status() {
        return this.innerModel().status();
    }

    public String message() {
        return this.innerModel().message();
    }

    public String author() {
        return this.innerModel().author();
    }

    public String deployer() {
        return this.innerModel().deployer();
    }

    public String authorEmail() {
        return this.innerModel().authorEmail();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Boolean active() {
        return this.innerModel().active();
    }

    public String details() {
        return this.innerModel().details();
    }

    public DeploymentInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String id;

    public DeploymentImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public Deployment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createDeploymentWithResponse(resourceGroupName, name, id, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public Deployment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createDeploymentWithResponse(resourceGroupName, name, id, innerObject, context)
                .getValue();
        return this;
    }

    public DeploymentImpl(String name, WebSiteManager serviceManager) {
        this.innerObject = new DeploymentInner();
        this.serviceManager = serviceManager;
        this.id = name;
    }

    public Deployment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getDeploymentWithResponse(resourceGroupName, name, id, Context.NONE)
                .getValue();
        return this;
    }

    public Deployment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getDeploymentWithResponse(resourceGroupName, name, id, context)
                .getValue();
        return this;
    }

    public DeploymentImpl withAuthorEmail(String authorEmail) {
        this.innerModel().withAuthorEmail(authorEmail);
        return this;
    }

    public DeploymentImpl withEndTime(OffsetDateTime endTime) {
        this.innerModel().withEndTime(endTime);
        return this;
    }

    public DeploymentImpl withDetails(String details) {
        this.innerModel().withDetails(details);
        return this;
    }

    public DeploymentImpl withActive(Boolean active) {
        this.innerModel().withActive(active);
        return this;
    }

    public DeploymentImpl withMessage(String message) {
        this.innerModel().withMessage(message);
        return this;
    }

    public DeploymentImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public DeploymentImpl withStatus(Integer status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public DeploymentImpl withAuthor(String author) {
        this.innerModel().withAuthor(author);
        return this;
    }

    public DeploymentImpl withStartTime(OffsetDateTime startTime) {
        this.innerModel().withStartTime(startTime);
        return this;
    }

    public DeploymentImpl withDeployer(String deployer) {
        this.innerModel().withDeployer(deployer);
        return this;
    }
}
