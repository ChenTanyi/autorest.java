package com.azure.consumption;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.resourcemanager.consumption.generated.ConsumptionManager;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class ConsumptionTests extends Base {

    @Test
    public void testConsumption() {
        ConsumptionManager manager = ConsumptionManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        var result = manager.reservationRecommendations()
                .list("/subscriptions/" + profile.getSubscriptionId()).stream().collect(Collectors.toList());
    }
}
