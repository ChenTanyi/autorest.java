// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportExecutionListResultInner;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.ExportInner;
import com.azure.resourcemanager.costmanagement.generated.models.Export;
import com.azure.resourcemanager.costmanagement.generated.models.ExportDefinition;
import com.azure.resourcemanager.costmanagement.generated.models.ExportDeliveryInfo;
import com.azure.resourcemanager.costmanagement.generated.models.ExportExecutionListResult;
import com.azure.resourcemanager.costmanagement.generated.models.ExportSchedule;
import com.azure.resourcemanager.costmanagement.generated.models.FormatType;
import java.time.OffsetDateTime;

public final class ExportImpl implements Export, Export.Definition, Export.Update {
    private ExportInner innerObject;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public FormatType format() {
        return this.innerModel().format();
    }

    public ExportDeliveryInfo deliveryInfo() {
        return this.innerModel().deliveryInfo();
    }

    public ExportDefinition definition() {
        return this.innerModel().definition();
    }

    public ExportExecutionListResult runHistory() {
        ExportExecutionListResultInner inner = this.innerModel().runHistory();
        if (inner != null) {
            return new ExportExecutionListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OffsetDateTime nextRunTimeEstimate() {
        return this.innerModel().nextRunTimeEstimate();
    }

    public ExportSchedule schedule() {
        return this.innerModel().schedule();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ExportInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String exportName;

    public ExportImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public Export create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExports()
                .createOrUpdateWithResponse(scope, exportName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Export create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExports()
                .createOrUpdateWithResponse(scope, exportName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ExportImpl(String name, com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
        this.innerObject = new ExportInner();
        this.serviceManager = serviceManager;
        this.exportName = name;
    }

    public ExportImpl update() {
        return this;
    }

    public Export apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExports()
                .createOrUpdateWithResponse(scope, exportName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Export apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExports()
                .createOrUpdateWithResponse(scope, exportName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ExportImpl(
        ExportInner innerObject,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.scope =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(), "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        this.exportName =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(), "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
    }

    public Export refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExports()
                .getWithResponse(scope, exportName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public Export refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExports()
                .getWithResponse(scope, exportName, localExpand, context)
                .getValue();
        return this;
    }

    public void execute() {
        serviceManager.exports().execute(scope, exportName);
    }

    public Response<Void> executeWithResponse(Context context) {
        return serviceManager.exports().executeWithResponse(scope, exportName, context);
    }

    public ExportImpl withFormat(FormatType format) {
        this.innerModel().withFormat(format);
        return this;
    }

    public ExportImpl withDeliveryInfo(ExportDeliveryInfo deliveryInfo) {
        this.innerModel().withDeliveryInfo(deliveryInfo);
        return this;
    }

    public ExportImpl withDefinition(ExportDefinition definition) {
        this.innerModel().withDefinition(definition);
        return this;
    }

    public ExportImpl withRunHistory(ExportExecutionListResultInner runHistory) {
        this.innerModel().withRunHistory(runHistory);
        return this;
    }

    public ExportImpl withSchedule(ExportSchedule schedule) {
        this.innerModel().withSchedule(schedule);
        return this;
    }

    public ExportImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
