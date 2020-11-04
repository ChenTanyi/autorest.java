package com.azure.policy;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.policy.generated.PolicyManager;
import com.azure.resourcemanager.policy.generated.models.PolicyDefinition;
import com.azure.resourcemanager.policy.generated.models.PolicyType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PolicyTests extends Base {

    @Test
    public void testPolicyDefinition() throws JsonProcessingException {
        String policyDefName = randomString("podef", 15);
        String policyRule = "{\"if\":{\"not\":{\"field\":\"location\",\"in\":[\"northeurope\",\"westeurope\"]}},\"then\":{\"effect\":\"deny\"}}";

        PolicyManager policyManager = PolicyManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        PolicyDefinition policyDefinition = policyManager.policyDefinitions().define(policyDefName)
                .withPolicyType(PolicyType.CUSTOM)
                .withDisplayName("My Policy")
                .withDescription("Test for Java SDK policy")
                .withPolicyRule(new ObjectMapper().readValue(policyRule, Object.class))
                .create();

        Assertions.assertNotNull(policyDefinition);
        Assertions.assertEquals("My Policy", policyDefinition.displayName());
        Assertions.assertEquals("Test for Java SDK policy", policyDefinition.description());

        // list policy definition
        boolean foundPolicyDefinition = false;
        for (PolicyDefinition resource : policyManager.policyDefinitions().list()) {
            if (policyDefName.equals(resource.name())) {
                foundPolicyDefinition = true;
                break;
            }
        }
        Assertions.assertTrue(foundPolicyDefinition);

        // update policy definition
        policyDefinition.update()
                .withDisplayName("My Policy v2")
                .apply();

        // get policy definition
        PolicyDefinition updatedPolicyDefinition = policyManager.policyDefinitions().get(policyDefName);
        Assertions.assertNotNull(updatedPolicyDefinition);
        Assertions.assertEquals("My Policy v2", updatedPolicyDefinition.displayName());

        // delete policy definition
        policyManager.policyDefinitions().delete(policyDefName);

        // validate policy definition
        try {
            policyManager.policyDefinitions().get(policyDefName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
