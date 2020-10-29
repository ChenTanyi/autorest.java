// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.authorization.generated.fluent.models.DenyAssignmentInner;
import java.util.List;

/** An immutable client-side representation of DenyAssignment. */
@Immutable
public interface DenyAssignment {
    /**
     * Gets the id property: The deny assignment ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The deny assignment name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The deny assignment type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the denyAssignmentName property: The display name of the deny assignment.
     *
     * @return the denyAssignmentName value.
     */
    String denyAssignmentName();

    /**
     * Gets the description property: The description of the deny assignment.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the permissions property: An array of permissions that are denied by the deny assignment.
     *
     * @return the permissions value.
     */
    List<DenyAssignmentPermission> permissions();

    /**
     * Gets the scope property: The deny assignment scope.
     *
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the doNotApplyToChildScopes property: Determines if the deny assignment applies to child scopes. Default
     * value is false.
     *
     * @return the doNotApplyToChildScopes value.
     */
    Boolean doNotApplyToChildScopes();

    /**
     * Gets the principals property: Array of principals to which the deny assignment applies.
     *
     * @return the principals value.
     */
    List<Principal> principals();

    /**
     * Gets the excludePrincipals property: Array of principals to which the deny assignment does not apply.
     *
     * @return the excludePrincipals value.
     */
    List<Principal> excludePrincipals();

    /**
     * Gets the isSystemProtected property: Specifies whether this deny assignment was created by Azure and cannot be
     * edited or deleted.
     *
     * @return the isSystemProtected value.
     */
    Boolean isSystemProtected();

    /**
     * Gets the inner com.azure.resourcemanager.authorization.generated.fluent.models.DenyAssignmentInner object.
     *
     * @return the inner object.
     */
    DenyAssignmentInner innerModel();
}