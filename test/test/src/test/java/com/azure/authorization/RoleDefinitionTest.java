package com.azure.authorization;

import com.azure.Base;
import com.azure.resourcemanager.authorization.generated.AuthorizationManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoleDefinitionTest extends Base {
    @Test
    public void testRoleDefinition() {
        AuthorizationManager authorizationManager = AuthorizationManager
                .configure()
                .withHttpClient(client)
                .authenticate(credential, profile);

        Assertions.assertTrue(authorizationManager.roleDefinitions().list(String.format("/subscriptions/%s/resourceGroups/%s", profile.getSubscriptionId(), rgName)).stream().count() > 0);
    }
}
