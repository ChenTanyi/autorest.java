// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.DiagnosticsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.AnalysisDefinitionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorDefinitionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticAnalysisInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticCategoryInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticDetectorResponseInner;
import com.azure.resourcemanager.appservice.generated.models.AnalysisDefinition;
import com.azure.resourcemanager.appservice.generated.models.DetectorDefinition;
import com.azure.resourcemanager.appservice.generated.models.DetectorResponse;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticAnalysis;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticCategory;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticDetectorResponse;
import com.azure.resourcemanager.appservice.generated.models.Diagnostics;
import java.time.OffsetDateTime;

public final class DiagnosticsImpl implements Diagnostics {
    private final DiagnosticsClient innerClient;

    private final WebSiteManager serviceManager;

    public DiagnosticsImpl(DiagnosticsClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DetectorResponse> listHostingEnvironmentDetectorResponses(
        String resourceGroupName, String name) {
        PagedIterable<DetectorResponseInner> inner =
            this.serviceClient().listHostingEnvironmentDetectorResponses(resourceGroupName, name);
        return inner.mapPage(inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<DetectorResponse> listHostingEnvironmentDetectorResponses(
        String resourceGroupName, String name, Context context) {
        PagedIterable<DetectorResponseInner> inner =
            this.serviceClient().listHostingEnvironmentDetectorResponses(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public DetectorResponse getHostingEnvironmentDetectorResponse(
        String resourceGroupName, String name, String detectorName) {
        DetectorResponseInner inner =
            this.serviceClient().getHostingEnvironmentDetectorResponse(resourceGroupName, name, detectorName);
        if (inner != null) {
            return new DetectorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DetectorResponse> getHostingEnvironmentDetectorResponseWithResponse(
        String resourceGroupName,
        String name,
        String detectorName,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context) {
        Response<DetectorResponseInner> inner =
            this
                .serviceClient()
                .getHostingEnvironmentDetectorResponseWithResponse(
                    resourceGroupName, name, detectorName, startTime, endTime, timeGrain, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DetectorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DetectorResponse> listSiteDetectorResponses(String resourceGroupName, String siteName) {
        PagedIterable<DetectorResponseInner> inner =
            this.serviceClient().listSiteDetectorResponses(resourceGroupName, siteName);
        return inner.mapPage(inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<DetectorResponse> listSiteDetectorResponses(
        String resourceGroupName, String siteName, Context context) {
        PagedIterable<DetectorResponseInner> inner =
            this.serviceClient().listSiteDetectorResponses(resourceGroupName, siteName, context);
        return inner.mapPage(inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public DetectorResponse getSiteDetectorResponse(String resourceGroupName, String siteName, String detectorName) {
        DetectorResponseInner inner =
            this.serviceClient().getSiteDetectorResponse(resourceGroupName, siteName, detectorName);
        if (inner != null) {
            return new DetectorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DetectorResponse> getSiteDetectorResponseWithResponse(
        String resourceGroupName,
        String siteName,
        String detectorName,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context) {
        Response<DetectorResponseInner> inner =
            this
                .serviceClient()
                .getSiteDetectorResponseWithResponse(
                    resourceGroupName, siteName, detectorName, startTime, endTime, timeGrain, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DetectorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DiagnosticCategory> listSiteDiagnosticCategories(String resourceGroupName, String siteName) {
        PagedIterable<DiagnosticCategoryInner> inner =
            this.serviceClient().listSiteDiagnosticCategories(resourceGroupName, siteName);
        return inner.mapPage(inner1 -> new DiagnosticCategoryImpl(inner1, this.manager()));
    }

    public PagedIterable<DiagnosticCategory> listSiteDiagnosticCategories(
        String resourceGroupName, String siteName, Context context) {
        PagedIterable<DiagnosticCategoryInner> inner =
            this.serviceClient().listSiteDiagnosticCategories(resourceGroupName, siteName, context);
        return inner.mapPage(inner1 -> new DiagnosticCategoryImpl(inner1, this.manager()));
    }

    public DiagnosticCategory getSiteDiagnosticCategory(
        String resourceGroupName, String siteName, String diagnosticCategory) {
        DiagnosticCategoryInner inner =
            this.serviceClient().getSiteDiagnosticCategory(resourceGroupName, siteName, diagnosticCategory);
        if (inner != null) {
            return new DiagnosticCategoryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticCategory> getSiteDiagnosticCategoryWithResponse(
        String resourceGroupName, String siteName, String diagnosticCategory, Context context) {
        Response<DiagnosticCategoryInner> inner =
            this
                .serviceClient()
                .getSiteDiagnosticCategoryWithResponse(resourceGroupName, siteName, diagnosticCategory, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticCategoryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AnalysisDefinition> listSiteAnalyses(
        String resourceGroupName, String siteName, String diagnosticCategory) {
        PagedIterable<AnalysisDefinitionInner> inner =
            this.serviceClient().listSiteAnalyses(resourceGroupName, siteName, diagnosticCategory);
        return inner.mapPage(inner1 -> new AnalysisDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<AnalysisDefinition> listSiteAnalyses(
        String resourceGroupName, String siteName, String diagnosticCategory, Context context) {
        PagedIterable<AnalysisDefinitionInner> inner =
            this.serviceClient().listSiteAnalyses(resourceGroupName, siteName, diagnosticCategory, context);
        return inner.mapPage(inner1 -> new AnalysisDefinitionImpl(inner1, this.manager()));
    }

    public AnalysisDefinition getSiteAnalysis(
        String resourceGroupName, String siteName, String diagnosticCategory, String analysisName) {
        AnalysisDefinitionInner inner =
            this.serviceClient().getSiteAnalysis(resourceGroupName, siteName, diagnosticCategory, analysisName);
        if (inner != null) {
            return new AnalysisDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AnalysisDefinition> getSiteAnalysisWithResponse(
        String resourceGroupName, String siteName, String diagnosticCategory, String analysisName, Context context) {
        Response<AnalysisDefinitionInner> inner =
            this
                .serviceClient()
                .getSiteAnalysisWithResponse(resourceGroupName, siteName, diagnosticCategory, analysisName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AnalysisDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticAnalysis executeSiteAnalysis(
        String resourceGroupName, String siteName, String diagnosticCategory, String analysisName) {
        DiagnosticAnalysisInner inner =
            this.serviceClient().executeSiteAnalysis(resourceGroupName, siteName, diagnosticCategory, analysisName);
        if (inner != null) {
            return new DiagnosticAnalysisImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticAnalysis> executeSiteAnalysisWithResponse(
        String resourceGroupName,
        String siteName,
        String diagnosticCategory,
        String analysisName,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context) {
        Response<DiagnosticAnalysisInner> inner =
            this
                .serviceClient()
                .executeSiteAnalysisWithResponse(
                    resourceGroupName,
                    siteName,
                    diagnosticCategory,
                    analysisName,
                    startTime,
                    endTime,
                    timeGrain,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticAnalysisImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DetectorDefinition> listSiteDetectors(
        String resourceGroupName, String siteName, String diagnosticCategory) {
        PagedIterable<DetectorDefinitionInner> inner =
            this.serviceClient().listSiteDetectors(resourceGroupName, siteName, diagnosticCategory);
        return inner.mapPage(inner1 -> new DetectorDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<DetectorDefinition> listSiteDetectors(
        String resourceGroupName, String siteName, String diagnosticCategory, Context context) {
        PagedIterable<DetectorDefinitionInner> inner =
            this.serviceClient().listSiteDetectors(resourceGroupName, siteName, diagnosticCategory, context);
        return inner.mapPage(inner1 -> new DetectorDefinitionImpl(inner1, this.manager()));
    }

    public DetectorDefinition getSiteDetector(
        String resourceGroupName, String siteName, String diagnosticCategory, String detectorName) {
        DetectorDefinitionInner inner =
            this.serviceClient().getSiteDetector(resourceGroupName, siteName, diagnosticCategory, detectorName);
        if (inner != null) {
            return new DetectorDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DetectorDefinition> getSiteDetectorWithResponse(
        String resourceGroupName, String siteName, String diagnosticCategory, String detectorName, Context context) {
        Response<DetectorDefinitionInner> inner =
            this
                .serviceClient()
                .getSiteDetectorWithResponse(resourceGroupName, siteName, diagnosticCategory, detectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DetectorDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticDetectorResponse executeSiteDetector(
        String resourceGroupName, String siteName, String detectorName, String diagnosticCategory) {
        DiagnosticDetectorResponseInner inner =
            this.serviceClient().executeSiteDetector(resourceGroupName, siteName, detectorName, diagnosticCategory);
        if (inner != null) {
            return new DiagnosticDetectorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticDetectorResponse> executeSiteDetectorWithResponse(
        String resourceGroupName,
        String siteName,
        String detectorName,
        String diagnosticCategory,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context) {
        Response<DiagnosticDetectorResponseInner> inner =
            this
                .serviceClient()
                .executeSiteDetectorWithResponse(
                    resourceGroupName,
                    siteName,
                    detectorName,
                    diagnosticCategory,
                    startTime,
                    endTime,
                    timeGrain,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticDetectorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DetectorResponse> listSiteDetectorResponsesSlot(
        String resourceGroupName, String siteName, String slot) {
        PagedIterable<DetectorResponseInner> inner =
            this.serviceClient().listSiteDetectorResponsesSlot(resourceGroupName, siteName, slot);
        return inner.mapPage(inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<DetectorResponse> listSiteDetectorResponsesSlot(
        String resourceGroupName, String siteName, String slot, Context context) {
        PagedIterable<DetectorResponseInner> inner =
            this.serviceClient().listSiteDetectorResponsesSlot(resourceGroupName, siteName, slot, context);
        return inner.mapPage(inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public DetectorResponse getSiteDetectorResponseSlot(
        String resourceGroupName, String siteName, String detectorName, String slot) {
        DetectorResponseInner inner =
            this.serviceClient().getSiteDetectorResponseSlot(resourceGroupName, siteName, detectorName, slot);
        if (inner != null) {
            return new DetectorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DetectorResponse> getSiteDetectorResponseSlotWithResponse(
        String resourceGroupName,
        String siteName,
        String detectorName,
        String slot,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context) {
        Response<DetectorResponseInner> inner =
            this
                .serviceClient()
                .getSiteDetectorResponseSlotWithResponse(
                    resourceGroupName, siteName, detectorName, slot, startTime, endTime, timeGrain, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DetectorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DiagnosticCategory> listSiteDiagnosticCategoriesSlot(
        String resourceGroupName, String siteName, String slot) {
        PagedIterable<DiagnosticCategoryInner> inner =
            this.serviceClient().listSiteDiagnosticCategoriesSlot(resourceGroupName, siteName, slot);
        return inner.mapPage(inner1 -> new DiagnosticCategoryImpl(inner1, this.manager()));
    }

    public PagedIterable<DiagnosticCategory> listSiteDiagnosticCategoriesSlot(
        String resourceGroupName, String siteName, String slot, Context context) {
        PagedIterable<DiagnosticCategoryInner> inner =
            this.serviceClient().listSiteDiagnosticCategoriesSlot(resourceGroupName, siteName, slot, context);
        return inner.mapPage(inner1 -> new DiagnosticCategoryImpl(inner1, this.manager()));
    }

    public DiagnosticCategory getSiteDiagnosticCategorySlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String slot) {
        DiagnosticCategoryInner inner =
            this.serviceClient().getSiteDiagnosticCategorySlot(resourceGroupName, siteName, diagnosticCategory, slot);
        if (inner != null) {
            return new DiagnosticCategoryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticCategory> getSiteDiagnosticCategorySlotWithResponse(
        String resourceGroupName, String siteName, String diagnosticCategory, String slot, Context context) {
        Response<DiagnosticCategoryInner> inner =
            this
                .serviceClient()
                .getSiteDiagnosticCategorySlotWithResponse(
                    resourceGroupName, siteName, diagnosticCategory, slot, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticCategoryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AnalysisDefinition> listSiteAnalysesSlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String slot) {
        PagedIterable<AnalysisDefinitionInner> inner =
            this.serviceClient().listSiteAnalysesSlot(resourceGroupName, siteName, diagnosticCategory, slot);
        return inner.mapPage(inner1 -> new AnalysisDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<AnalysisDefinition> listSiteAnalysesSlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String slot, Context context) {
        PagedIterable<AnalysisDefinitionInner> inner =
            this.serviceClient().listSiteAnalysesSlot(resourceGroupName, siteName, diagnosticCategory, slot, context);
        return inner.mapPage(inner1 -> new AnalysisDefinitionImpl(inner1, this.manager()));
    }

    public AnalysisDefinition getSiteAnalysisSlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String analysisName, String slot) {
        AnalysisDefinitionInner inner =
            this
                .serviceClient()
                .getSiteAnalysisSlot(resourceGroupName, siteName, diagnosticCategory, analysisName, slot);
        if (inner != null) {
            return new AnalysisDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AnalysisDefinition> getSiteAnalysisSlotWithResponse(
        String resourceGroupName,
        String siteName,
        String diagnosticCategory,
        String analysisName,
        String slot,
        Context context) {
        Response<AnalysisDefinitionInner> inner =
            this
                .serviceClient()
                .getSiteAnalysisSlotWithResponse(
                    resourceGroupName, siteName, diagnosticCategory, analysisName, slot, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AnalysisDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticAnalysis executeSiteAnalysisSlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String analysisName, String slot) {
        DiagnosticAnalysisInner inner =
            this
                .serviceClient()
                .executeSiteAnalysisSlot(resourceGroupName, siteName, diagnosticCategory, analysisName, slot);
        if (inner != null) {
            return new DiagnosticAnalysisImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticAnalysis> executeSiteAnalysisSlotWithResponse(
        String resourceGroupName,
        String siteName,
        String diagnosticCategory,
        String analysisName,
        String slot,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context) {
        Response<DiagnosticAnalysisInner> inner =
            this
                .serviceClient()
                .executeSiteAnalysisSlotWithResponse(
                    resourceGroupName,
                    siteName,
                    diagnosticCategory,
                    analysisName,
                    slot,
                    startTime,
                    endTime,
                    timeGrain,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticAnalysisImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DetectorDefinition> listSiteDetectorsSlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String slot) {
        PagedIterable<DetectorDefinitionInner> inner =
            this.serviceClient().listSiteDetectorsSlot(resourceGroupName, siteName, diagnosticCategory, slot);
        return inner.mapPage(inner1 -> new DetectorDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<DetectorDefinition> listSiteDetectorsSlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String slot, Context context) {
        PagedIterable<DetectorDefinitionInner> inner =
            this.serviceClient().listSiteDetectorsSlot(resourceGroupName, siteName, diagnosticCategory, slot, context);
        return inner.mapPage(inner1 -> new DetectorDefinitionImpl(inner1, this.manager()));
    }

    public DetectorDefinition getSiteDetectorSlot(
        String resourceGroupName, String siteName, String diagnosticCategory, String detectorName, String slot) {
        DetectorDefinitionInner inner =
            this
                .serviceClient()
                .getSiteDetectorSlot(resourceGroupName, siteName, diagnosticCategory, detectorName, slot);
        if (inner != null) {
            return new DetectorDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DetectorDefinition> getSiteDetectorSlotWithResponse(
        String resourceGroupName,
        String siteName,
        String diagnosticCategory,
        String detectorName,
        String slot,
        Context context) {
        Response<DetectorDefinitionInner> inner =
            this
                .serviceClient()
                .getSiteDetectorSlotWithResponse(
                    resourceGroupName, siteName, diagnosticCategory, detectorName, slot, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DetectorDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticDetectorResponse executeSiteDetectorSlot(
        String resourceGroupName, String siteName, String detectorName, String diagnosticCategory, String slot) {
        DiagnosticDetectorResponseInner inner =
            this
                .serviceClient()
                .executeSiteDetectorSlot(resourceGroupName, siteName, detectorName, diagnosticCategory, slot);
        if (inner != null) {
            return new DiagnosticDetectorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticDetectorResponse> executeSiteDetectorSlotWithResponse(
        String resourceGroupName,
        String siteName,
        String detectorName,
        String diagnosticCategory,
        String slot,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context) {
        Response<DiagnosticDetectorResponseInner> inner =
            this
                .serviceClient()
                .executeSiteDetectorSlotWithResponse(
                    resourceGroupName,
                    siteName,
                    detectorName,
                    diagnosticCategory,
                    slot,
                    startTime,
                    endTime,
                    timeGrain,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticDetectorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DiagnosticsClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
