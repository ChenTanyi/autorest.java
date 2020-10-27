package com.azure.keyvault;

import com.azure.Base;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.models.Sku;
import com.azure.resourcemanager.keyvault.generated.models.SkuFamily;
import com.azure.resourcemanager.keyvault.generated.models.SkuName;
import com.azure.resourcemanager.keyvault.generated.models.Vault;
import com.azure.resourcemanager.keyvault.generated.models.VaultProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class KeyVaultTest extends Base {
    @Test
    public void canCRUDVault() {
        String vaultName = randomString("vault", 16);

        KeyVaultManager keyVaultManager = KeyVaultManager.configure().withHttpClient(client).authenticate(credential, profile);
        Vault vault = keyVaultManager.vaults().define(vaultName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withProperties(
                        new VaultProperties()
                                .withSku(new Sku().withName(SkuName.STANDARD).withFamily(SkuFamily.A))
                                .withTenantId(UUID.fromString(profile.getTenantId()))
                                .withAccessPolicies(new ArrayList<>())
                )
                .create();

        Assertions.assertEquals(SkuName.STANDARD, vault.properties().sku().name());
        Assertions.assertNotNull(keyVaultManager.vaults().getByResourceGroup(rgName, vaultName));

        vault.update()
            .withTags(Map.of("tag1", "value1"))
            .apply();

        Assertions.assertEquals("value1", vault.tags().get("tag1"));

        keyVaultManager.vaults().delete(rgName, vaultName);
        Assertions.assertThrows(ManagementException.class, () -> keyVaultManager.vaults().getByResourceGroup(rgName, vaultName));
    }
}
