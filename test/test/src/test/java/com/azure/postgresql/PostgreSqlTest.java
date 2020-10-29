package com.azure.postgresql;

import com.azure.Base;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.postgresql.generated.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.generated.models.Database;
import com.azure.resourcemanager.postgresql.generated.models.Server;
import com.azure.resourcemanager.postgresql.generated.models.ServerPropertiesForDefaultCreate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class PostgreSqlTest extends Base {
    @Test
    public void testPostgreSql() {
        String serverName = randomString("server", 16);
        String dbName = randomString("sql", 16);
        String username = "testuser";
        String pasword = randomString("Pa5$", 16);
        PostgreSqlManager postgreSqlManager = PostgreSqlManager
                .configure()
                .withHttpClient(client)
                .authenticate(credential, profile);

        Server server = postgreSqlManager.servers().define(serverName)
                .withRegion(region)
                .withExistingResourceGroup(rgName)
                .withProperties(
                        new ServerPropertiesForDefaultCreate()
                                .withAdministratorLogin(username)
                                .withAdministratorLoginPassword(pasword)
                )
                .create();

        Assertions.assertNotNull(server.id());
        Assertions.assertNotNull(postgreSqlManager.servers().getByResourceGroup(rgName, serverName));

        server.update()
                .withTags(Map.of("tag1", "value1"))
                .apply();

        Assertions.assertEquals("value1", server.tags().get("tag1"));

        Database database = postgreSqlManager.databases().define(dbName)
                .withExistingServer(rgName, serverName)
                .create();

        Assertions.assertNotNull(database.id());
        Assertions.assertNotNull(postgreSqlManager.databases().get(rgName, serverName, dbName));

        postgreSqlManager.servers().delete(rgName, serverName);
        Assertions.assertThrows(ManagementException.class, () -> postgreSqlManager.servers().getByResourceGroup(rgName, serverName));
        Assertions.assertThrows(ManagementException.class, () -> postgreSqlManager.databases().get(rgName, serverName, dbName));
    }
}
