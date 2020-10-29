package com.azure.locks;

import com.azure.Base;
import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.locks.generated.LocksManager;
import com.azure.resourcemanager.locks.generated.models.LockLevel;
import com.azure.resourcemanager.locks.generated.models.ManagementLockObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocksTest extends Base {
    @Test
    public void testLock() {
        String lockName = randomString("lock", 10);
        LocksManager locksManager = LocksManager
                .configure()
                .withHttpClient(client)
                .authenticate(credential, profile);

        ManagementLockObject lock = locksManager.managementLocks().define(lockName)
                .withExistingResourceGroup(rgName)
                .withLevel(LockLevel.CAN_NOT_DELETE)
                .create();

        Assertions.assertEquals(LockLevel.CAN_NOT_DELETE, lock.level());

        Assertions.assertNotNull(locksManager.managementLocks().getByResourceGroup(rgName, lockName));

        Assertions.assertThrows(ManagementException.class, () -> resourceManager.resourceGroups().delete(rgName));

        locksManager.managementLocks().deleteAtResourceGroupLevel(rgName, lockName);
        Assertions.assertThrows(ManagementException.class, () -> locksManager.managementLocks().getByResourceGroup(rgName, lockName));

        resourceManager.resourceGroups().delete(rgName);
    }
}
