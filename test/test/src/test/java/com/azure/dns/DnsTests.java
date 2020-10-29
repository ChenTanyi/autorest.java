package com.azure.dns;

import com.azure.Base;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.dns.generated.DnsManager;
import com.azure.resourcemanager.dns.generated.models.Zone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class DnsTests extends Base {

    @Test
    public void testDnsZone() {
        String zoneName = "www.dns"+ randomString("test", 10) + ".com";

        DnsManager dnsManager = DnsManager.configure()
                .withHttpClient(client)
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(credential, profile);

        Map<String, String> tags = new HashMap<>();
        tags.put("key1", "value1");

        // create dns zone
        Zone dnsZone = dnsManager.zones()
                .define(zoneName)
                .withRegion("global")
                .withExistingResourceGroup(rgName)
                .withTags(tags)
                .create();

        Assertions.assertNotNull(dnsZone);
        Assertions.assertNotNull(dnsZone.etag());
        Assertions.assertTrue(dnsZone.tags().containsKey("key1"));
        Assertions.assertEquals("value1", dnsZone.tags().get("key1"));

        String etag = dnsZone.etag();

        try {
            tags.put("key1", "value2");

            // update dns zone with etag
            dnsZone.update()
                    .withIfMatch(etag + "-1")
                    .withTags(tags)
                    .apply();
        } catch (ManagementException e) {
            Assertions.assertEquals(412, e.getResponse().getStatusCode());

            // update dns zone with etag
            dnsZone.update()
                    .withIfMatch(etag)
                    .withTags(tags)
                    .apply();

            Assertions.assertEquals("value2", dnsZone.tags().get("key1"));
        }

        // list dns zones
        boolean foundZone = false;
        for (Zone zone : dnsManager.zones().list()) {
            if (zoneName.equals(zone.name())) {
                foundZone = true;
                break;
            }
        }
        Assertions.assertTrue(foundZone);

        // get zone
        Zone updatedZone = dnsManager.zones().getByResourceGroup(rgName, zoneName);
        Assertions.assertNotNull(updatedZone);
        Assertions.assertFalse(updatedZone.etag().equals(etag));

        // delete zone
        try {
            dnsManager.zones().delete(rgName, zoneName, etag);
        } catch (ManagementException e) {
            Assertions.assertEquals(412, e.getResponse().getStatusCode());

            dnsManager.zones().delete(rgName, zoneName, updatedZone.etag());
        }

        // validate if delete success
        try {
            dnsManager.zones().getByResourceGroup(rgName, zoneName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }
}
