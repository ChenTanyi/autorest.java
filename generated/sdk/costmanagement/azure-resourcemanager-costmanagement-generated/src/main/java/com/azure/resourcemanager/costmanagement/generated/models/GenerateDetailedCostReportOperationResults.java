// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GenerateDetailedCostReportOperationResults. */
public interface GenerateDetailedCostReportOperationResults {
    /**
     * Get the result of the specified operation. This link is provided in the GenerateDetailedCostReport creation
     * request response header.
     *
     * @param operationId The target operation Id.
     * @param scope The scope associated with usage details operations. This includes '/subscriptions/{subscriptionId}/'
     *     for subscription scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account
     *     scope, '/providers/Microsoft.Billing/departments/{departmentId}' for Department scope,
     *     '/providers/Microsoft.Billing/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope. Also,
     *     Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     *     billingAccount scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the specified operation.
     */
    GenerateDetailedCostReportOperationResult get(String operationId, String scope);

    /**
     * Get the result of the specified operation. This link is provided in the GenerateDetailedCostReport creation
     * request response header.
     *
     * @param operationId The target operation Id.
     * @param scope The scope associated with usage details operations. This includes '/subscriptions/{subscriptionId}/'
     *     for subscription scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account
     *     scope, '/providers/Microsoft.Billing/departments/{departmentId}' for Department scope,
     *     '/providers/Microsoft.Billing/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope. Also,
     *     Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     *     billingAccount scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the specified operation.
     */
    Response<GenerateDetailedCostReportOperationResult> getWithResponse(
        String operationId, String scope, Context context);
}
