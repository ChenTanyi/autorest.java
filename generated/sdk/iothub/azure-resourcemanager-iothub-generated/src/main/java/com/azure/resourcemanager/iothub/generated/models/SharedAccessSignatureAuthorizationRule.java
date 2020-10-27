// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.iothub.generated.fluent.models.SharedAccessSignatureAuthorizationRuleInner;

/** An immutable client-side representation of SharedAccessSignatureAuthorizationRule. */
@Immutable
public interface SharedAccessSignatureAuthorizationRule {
    /**
     * Gets the keyName property: The name of the shared access policy.
     *
     * @return the keyName value.
     */
    String keyName();

    /**
     * Gets the primaryKey property: The primary key.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: The secondary key.
     *
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the rights property: The permissions assigned to the shared access policy.
     *
     * @return the rights value.
     */
    AccessRights rights();

    /**
     * Gets the inner
     * com.azure.resourcemanager.iothub.generated.fluent.models.SharedAccessSignatureAuthorizationRuleInner object.
     *
     * @return the inner object.
     */
    SharedAccessSignatureAuthorizationRuleInner innerModel();
}