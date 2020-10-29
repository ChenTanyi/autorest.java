package com.azure.mysql;

import com.azure.Base;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.mysql.generated.MySqlManager;
import com.azure.resourcemanager.mysql.generated.models.Database;
import com.azure.resourcemanager.mysql.generated.models.Server;
import com.azure.resourcemanager.mysql.generated.models.ServerPropertiesForDefaultCreate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class MySqlTest extends Base {
    @Test
    public void testMySql() {
        String serverName = randomString("server", 16);
        String dbName = randomString("sql", 16);
        String username = "testuser";
        String pasword = randomString("Pa5$", 16);
        MySqlManager mySqlManager = MySqlManager
                .configure()
                .withHttpClient(client)
                .authenticate(credential, profile);

        Server server = mySqlManager.servers().define(serverName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withProperties(
                        new ServerPropertiesForDefaultCreate()
                            .withAdministratorLogin(username)
                            .withAdministratorLoginPassword(pasword)
                )
                .create();

        Assertions.assertNotNull(server.id());
        Assertions.assertNotNull(mySqlManager.servers().getByResourceGroup(rgName, serverName));

        server.update()
                .withTags(Map.of("tag1", "value1"))
                .apply();

        Assertions.assertEquals("value1", server.tags().get("tag1"));

        Database database = mySqlManager.databases().define(dbName)
                .withExistingServer(rgName, serverName)
                .create();

        Assertions.assertNotNull(database.id());
        Assertions.assertNotNull(mySqlManager.databases().get(rgName, serverName, dbName));

        mySqlManager.servers().delete(rgName, serverName);
        Assertions.assertThrows(ManagementException.class, () -> mySqlManager.servers().getByResourceGroup(rgName, serverName));
        Assertions.assertThrows(ManagementException.class, () -> mySqlManager.databases().get(rgName, serverName, dbName));
    }
}
