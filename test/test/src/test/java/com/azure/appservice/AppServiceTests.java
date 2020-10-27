package com.azure.appservice;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigResourceInner;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlan;
import com.azure.resourcemanager.appservice.generated.models.Site;
import com.azure.resourcemanager.appservice.generated.models.SiteConfigResource;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppServiceTests extends Base {

    @Test
    public void testWebapp() {
        String servicePlanName = randomString("plan", 10);
        String webappName = randomString("webapp", 10);

        WebSiteManager appserviceManager = WebSiteManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        AppServicePlan appServicePlan = appserviceManager.appServicePlans().defineServerfarm(servicePlanName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withSku(new SkuDescription().withName("S1").withTier("Standard").withSize("S1"))
                .withReserved(true)
                .create();

        appServicePlan.refresh();

        Assertions.assertNotNull(appserviceManager.appServicePlans().getByResourceGroup(rgName, servicePlanName));

        Site webapp = appserviceManager.webApps().defineSite(webappName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withServerFarmId(appServicePlan.id())
                .withHttpsOnly(true)
                .create();
        Assertions.assertEquals(appServicePlan.id(), webapp.serverFarmId());
        Assertions.assertEquals(true, webapp.reserved());

        SiteConfigResource webAppConfig = appserviceManager.webApps().createOrUpdateConfiguration(rgName, webapp.name(),
                new SiteConfigResourceInner().withLinuxFxVersion("DOCKER|wordpress"));
        Assertions.assertEquals("DOCKER|wordpress", webAppConfig.linuxFxVersion());

        webapp.refresh();
        Assertions.assertEquals(true, webapp.httpsOnly());

        Assertions.assertNotNull(appserviceManager.webApps().getByResourceGroup(rgName, webappName));

        appserviceManager.webApps().delete(rgName, webappName);
        appserviceManager.appServicePlans().delete(rgName, servicePlanName);
        Assertions.assertThrows(ManagementException.class, () -> appserviceManager.webApps().getByResourceGroup(rgName, servicePlanName));
    }
}
